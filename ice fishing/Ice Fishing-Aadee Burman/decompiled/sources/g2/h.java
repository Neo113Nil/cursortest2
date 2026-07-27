package g2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c2.EnumC0536c;
import e2.C4461a;
import h2.C4562a;
import h2.InterfaceC4563b;
import i2.InterfaceC4581a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import t7.InterfaceC5044a;

/* loaded from: classes.dex */
public final class h implements InterfaceC4527d, h2.c, InterfaceC4526c {

    /* renamed from: y, reason: collision with root package name */
    public static final W1.c f37641y = new W1.c("proto");

    /* renamed from: n, reason: collision with root package name */
    public final j f37642n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4581a f37643u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4581a f37644v;

    /* renamed from: w, reason: collision with root package name */
    public final C4524a f37645w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5044a f37646x;

    public h(InterfaceC4581a interfaceC4581a, InterfaceC4581a interfaceC4581a2, C4524a c4524a, j jVar, InterfaceC5044a interfaceC5044a) {
        this.f37642n = jVar;
        this.f37643u = interfaceC4581a;
        this.f37644v = interfaceC4581a2;
        this.f37645w = c4524a;
        this.f37646x = interfaceC5044a;
    }

    public static Long i(SQLiteDatabase sQLiteDatabase, Z1.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f4148a, String.valueOf(j2.a.a(iVar.f4150c))));
        byte[] bArr = iVar.f4149b;
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

    public static String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C4525b) it.next()).f37634a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object p(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase b() {
        j jVar = this.f37642n;
        Objects.requireNonNull(jVar);
        InterfaceC4581a interfaceC4581a = this.f37644v;
        long g4 = interfaceC4581a.g();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e9) {
                if (interfaceC4581a.g() >= this.f37645w.f37631c + g4) {
                    throw new C4562a("Timed out while trying to open db.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37642n.close();
    }

    public final Object j(f fVar) {
        SQLiteDatabase b9 = b();
        b9.beginTransaction();
        try {
            Object apply = fVar.apply(b9);
            b9.setTransactionSuccessful();
            return apply;
        } finally {
            b9.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, Z1.i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long i6 = i(sQLiteDatabase, iVar);
        if (i6 == null) {
            return arrayList;
        }
        p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", com.anythink.core.express.b.a.f17534k}, "context_id = ?", new String[]{i6.toString()}, null, null, null, String.valueOf(i)), new C4461a(this, arrayList, iVar, 1));
        return arrayList;
    }

    public final void l(long j6, EnumC0536c enumC0536c, String str) {
        j(new f2.h(j6, str, enumC0536c));
    }

    public final Object m(InterfaceC4563b interfaceC4563b) {
        SQLiteDatabase b9 = b();
        InterfaceC4581a interfaceC4581a = this.f37644v;
        long g4 = interfaceC4581a.g();
        while (true) {
            try {
                b9.beginTransaction();
                try {
                    Object c9 = interfaceC4563b.c();
                    b9.setTransactionSuccessful();
                    return c9;
                } finally {
                    b9.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e9) {
                if (interfaceC4581a.g() >= this.f37645w.f37631c + g4) {
                    throw new C4562a("Timed out while trying to acquire the lock.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
