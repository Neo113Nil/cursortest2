package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.text.TextUtils;
import com.yandex.messaging.sqlite.SupportSQLiteDatabaseTransaction$1;
import java.lang.reflect.Method;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes.dex */
public final class ufs implements hkw0 {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final i3y w;
    public static final i3y x;
    public final SQLiteDatabase a;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        w = a.b(lazyThreadSafetyMode, new j8s(15));
        x = a.b(lazyThreadSafetyMode, new j8s(16));
    }

    public ufs(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.hkw0
    public final boolean A() {
        return this.a.inTransaction();
    }

    @Override // defpackage.hkw0
    public final void E() {
        this.a.disableWriteAheadLogging();
    }

    @Override // defpackage.hkw0
    public final void N() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.hkw0
    public final void R1(Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // defpackage.hkw0
    public final Cursor U0(nkw0 nkw0Var) {
        final sfs sfsVar = new sfs(0, nkw0Var);
        return this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: tfs
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) sfs.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, nkw0Var.c(), c, null);
    }

    @Override // defpackage.hkw0
    public final Cursor W1(String str) {
        return U0(new cjx(str, 2));
    }

    @Override // defpackage.hkw0
    public final void Y(SupportSQLiteDatabaseTransaction$1 supportSQLiteDatabaseTransaction$1) {
        this.a.beginTransactionWithListenerNonExclusive(supportSQLiteDatabaseTransaction$1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.hkw0
    public final zfs g(String str) {
        return new zfs(this.a.compileStatement(str));
    }

    @Override // defpackage.hkw0
    public final String getPath() {
        return this.a.getPath();
    }

    @Override // defpackage.hkw0
    public final void i() {
        this.a.beginTransaction();
    }

    @Override // defpackage.hkw0
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.hkw0
    public final boolean j2() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.hkw0
    public final boolean k1() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // defpackage.hkw0
    public final int o2(ContentValues contentValues, Object[] objArr) {
        int i = 0;
        if (contentValues.size() == 0) {
            ny61.g("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[3]);
        sb.append("WorkSpec SET ");
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        zfs g = g(sb.toString());
        eja1.f(g, objArr2);
        return g.b.executeUpdateDelete();
    }

    @Override // defpackage.hkw0
    public final void r(String str) {
        this.a.execSQL(str);
    }

    @Override // defpackage.hkw0
    public final void s() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.hkw0
    public final void s0() {
        i3y i3yVar = x;
        if (((Method) i3yVar.getValue()) != null) {
            i3y i3yVar2 = w;
            if (((Method) i3yVar2.getValue()) != null) {
                Method method = (Method) i3yVar.getValue();
                Object invoke = ((Method) i3yVar2.getValue()).invoke(this.a, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    ny61.r("Required value was null.");
                    return;
                }
            }
        }
        i();
    }

    @Override // defpackage.hkw0
    public final void t() {
        this.a.endTransaction();
    }
}
