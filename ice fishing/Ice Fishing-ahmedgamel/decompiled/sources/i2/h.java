package i2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import e2.EnumC4475c;
import j2.C4610a;
import j2.InterfaceC4611b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import k2.InterfaceC4642a;
import t7.InterfaceC5045a;

/* loaded from: classes.dex */
public final class h implements InterfaceC4590d, j2.c, InterfaceC4589c {

    /* renamed from: y, reason: collision with root package name */
    public static final Y1.c f38168y = new Y1.c("proto");

    /* renamed from: n, reason: collision with root package name */
    public final j f38169n;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4642a f38170u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC4642a f38171v;

    /* renamed from: w, reason: collision with root package name */
    public final C4587a f38172w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC5045a f38173x;

    public h(InterfaceC4642a interfaceC4642a, InterfaceC4642a interfaceC4642a2, C4587a c4587a, j jVar, InterfaceC5045a interfaceC5045a) {
        this.f38169n = jVar;
        this.f38170u = interfaceC4642a;
        this.f38171v = interfaceC4642a2;
        this.f38172w = c4587a;
        this.f38173x = interfaceC5045a;
    }

    public static Long i(SQLiteDatabase sQLiteDatabase, b2.i iVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f5537a, String.valueOf(l2.a.a(iVar.f5539c))));
        byte[] bArr = iVar.f5538b;
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
            sb.append(((C4588b) it.next()).f38161a);
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
        j jVar = this.f38169n;
        Objects.requireNonNull(jVar);
        InterfaceC4642a interfaceC4642a = this.f38171v;
        long f2 = interfaceC4642a.f();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e9) {
                if (interfaceC4642a.f() >= this.f38172w.f38158c + f2) {
                    throw new C4610a("Timed out while trying to open db.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f38169n.close();
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

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, b2.i iVar, int i) {
        ArrayList arrayList = new ArrayList();
        Long i4 = i(sQLiteDatabase, iVar);
        if (i4 == null) {
            return arrayList;
        }
        p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", com.anythink.core.express.b.a.f18321k}, "context_id = ?", new String[]{i4.toString()}, null, null, null, String.valueOf(i)), new g2.a(this, arrayList, iVar, 1));
        return arrayList;
    }

    public final void l(long j6, EnumC4475c enumC4475c, String str) {
        j(new h2.h(j6, str, enumC4475c));
    }

    public final Object m(InterfaceC4611b interfaceC4611b) {
        SQLiteDatabase b9 = b();
        InterfaceC4642a interfaceC4642a = this.f38171v;
        long f2 = interfaceC4642a.f();
        while (true) {
            try {
                b9.beginTransaction();
                try {
                    Object d9 = interfaceC4611b.d();
                    b9.setTransactionSuccessful();
                    return d9;
                } finally {
                    b9.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e9) {
                if (interfaceC4642a.f() >= this.f38172w.f38158c + f2) {
                    throw new C4610a("Timed out while trying to acquire the lock.", e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
