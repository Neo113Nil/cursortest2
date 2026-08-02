package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bko implements Closeable {
    public static final p6b f = new p6b("proto");
    public final zto a;
    public final up4 b;
    public final up4 c;
    public final dd2 d;
    public final szm e;

    public bko(up4 up4Var, up4 up4Var2, dd2 dd2Var, zto ztoVar, szm szmVar) {
        this.a = ztoVar;
        this.b = up4Var;
        this.c = up4Var2;
        this.d = dd2Var;
        this.e = szmVar;
    }

    public static String H(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((qd2) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object I(Cursor cursor, zjo zjoVar) {
        try {
            return zjoVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, de2 de2Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(de2Var.a, String.valueOf(qsm.a(de2Var.c))));
        byte[] bArr = de2Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = query;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            query.close();
        }
    }

    public final Object D(iyr iyrVar) {
        SQLiteDatabase a = a();
        up4 up4Var = this.c;
        long a2 = up4Var.a();
        while (true) {
            try {
                a.beginTransaction();
                try {
                    Object execute = iyrVar.execute();
                    a.setTransactionSuccessful();
                    return execute;
                } finally {
                    a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (up4Var.a() >= this.d.c + a2) {
                    throw new hyr("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase a() {
        zto ztoVar = this.a;
        Objects.requireNonNull(ztoVar);
        up4 up4Var = this.c;
        long a = up4Var.a();
        while (true) {
            try {
                return ztoVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (up4Var.a() >= this.d.c + a) {
                    throw new hyr("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Object g(zjo zjoVar) {
        SQLiteDatabase a = a();
        a.beginTransaction();
        try {
            Object apply = zjoVar.apply(a);
            a.setTransactionSuccessful();
            return apply;
        } finally {
            a.endTransaction();
        }
    }

    public final ArrayList o(SQLiteDatabase sQLiteDatabase, de2 de2Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long b = b(sQLiteDatabase, de2Var);
        if (b == null) {
            return arrayList;
        }
        I(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{b.toString()}, null, null, null, String.valueOf(i)), new u13(17, this, arrayList, de2Var));
        return arrayList;
    }

    public final void z(long j, xqg xqgVar, String str) {
        g(new np6(j, str, xqgVar));
    }
}
