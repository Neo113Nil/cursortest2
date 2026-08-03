package d6;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements d, e6.c, c {

    /* renamed from: l, reason: collision with root package name */
    public static final t5.c f1701l = new t5.c("proto");

    /* renamed from: g, reason: collision with root package name */
    public final m f1702g;

    /* renamed from: h, reason: collision with root package name */
    public final f6.a f1703h;

    /* renamed from: i, reason: collision with root package name */
    public final f6.a f1704i;

    /* renamed from: j, reason: collision with root package name */
    public final a f1705j;

    /* renamed from: k, reason: collision with root package name */
    public final zb.a f1706k;

    public j(f6.a aVar, f6.a aVar2, a aVar3, m mVar, zb.a aVar4) {
        this.f1702g = mVar;
        this.f1703h = aVar;
        this.f1704i = aVar2;
        this.f1705j = aVar3;
        this.f1706k = aVar4;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, w5.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f7687a, String.valueOf(g6.a.a(iVar.f7689c))));
        byte[] bArr = iVar.f7688b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String j(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f1691a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object k(Cursor cursor, h hVar) {
        try {
            return hVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        m mVar = this.f1702g;
        Objects.requireNonNull(mVar);
        f6.a aVar = this.f1704i;
        long a6 = aVar.a();
        while (true) {
            try {
                return mVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f1705j.f1688c + a6) {
                    throw new e6.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1702g.close();
    }

    public final Object d(h hVar) {
        SQLiteDatabase a6 = a();
        a6.beginTransaction();
        try {
            Object apply = hVar.apply(a6);
            a6.setTransactionSuccessful();
            return apply;
        } finally {
            a6.endTransaction();
        }
    }

    public final ArrayList f(SQLiteDatabase sQLiteDatabase, w5.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long b2 = b(sQLiteDatabase, iVar);
        if (b2 == null) {
            return arrayList;
        }
        k(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b2.toString()}, null, null, null, String.valueOf(i10)), new b6.b(this, (Object) arrayList, iVar, 1));
        return arrayList;
    }

    public final void g(long j3, z5.c cVar, String str) {
        d(new c6.k(str, cVar, j3));
    }

    public final Object i(e6.b bVar) {
        SQLiteDatabase a6 = a();
        f6.a aVar = this.f1704i;
        long a8 = aVar.a();
        while (true) {
            try {
                a6.beginTransaction();
                try {
                    Object a10 = bVar.a();
                    a6.setTransactionSuccessful();
                    return a10;
                } finally {
                    a6.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.a() >= this.f1705j.f1688c + a8) {
                    throw new e6.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
