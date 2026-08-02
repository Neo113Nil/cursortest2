package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public final class zvc implements rsr {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final Object d;
    public static final Object e;
    public final SQLiteDatabase a;

    static {
        bwf bwfVar = bwf.b;
        d = btf.a(bwfVar, new htb(11));
        e = btf.a(bwfVar, new htb(12));
    }

    public zvc(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.rsr
    public final void beginTransaction() {
        this.a.beginTransaction();
    }

    @Override // defpackage.rsr
    public final void beginTransactionNonExclusive() {
        this.a.beginTransactionNonExclusive();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [arf, java.lang.Object] */
    @Override // defpackage.rsr
    public final void beginTransactionReadOnly() {
        ?? r1 = e;
        if (((Method) r1.getValue()) != null) {
            ?? r2 = d;
            if (((Method) r2.getValue()) != null) {
                Method method = (Method) r1.getValue();
                method.getClass();
                Method method2 = (Method) r2.getValue();
                method2.getClass();
                Object invoke = method2.invoke(this.a, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    xq0.q("Required value was null.");
                    return;
                }
            }
        }
        beginTransaction();
    }

    @Override // defpackage.rsr
    public final void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.rsr
    public final dtr compileStatement(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.a.compileStatement(str);
        compileStatement.getClass();
        return new iwc(compileStatement);
    }

    @Override // defpackage.rsr
    public final int delete(String str, String str2, Object[] objArr) {
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(str);
        if (str2.length() != 0) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        dtr compileStatement = compileStatement(sb.toString());
        ezf.t(compileStatement, objArr);
        return ((iwc) compileStatement).c.executeUpdateDelete();
    }

    @Override // defpackage.rsr
    public final void disableWriteAheadLogging() {
        this.a.disableWriteAheadLogging();
    }

    @Override // defpackage.rsr
    public final boolean enableWriteAheadLogging() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // defpackage.rsr
    public final void endTransaction() {
        this.a.endTransaction();
    }

    @Override // defpackage.rsr
    public final void execSQL(String str, Object[] objArr) {
        objArr.getClass();
        this.a.execSQL(str, objArr);
    }

    @Override // defpackage.rsr
    public final List getAttachedDbs() {
        return this.a.getAttachedDbs();
    }

    @Override // defpackage.rsr
    public final String getPath() {
        return this.a.getPath();
    }

    @Override // defpackage.rsr
    public final boolean inTransaction() {
        return this.a.inTransaction();
    }

    @Override // defpackage.rsr
    public final long insert(String str, int i, ContentValues contentValues) {
        return this.a.insertWithOnConflict("album_operation", null, contentValues, 4);
    }

    @Override // defpackage.rsr
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.rsr
    public final boolean isWriteAheadLoggingEnabled() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.rsr
    public final Cursor query(xsr xsrVar) {
        final t31 t31Var = new t31(10, xsrVar);
        Cursor rawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: yvc
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) t31.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, xsrVar.o(), c, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // defpackage.rsr
    public final void setMaxSqlCacheSize(int i) {
        this.a.setMaxSqlCacheSize(100);
    }

    @Override // defpackage.rsr
    public final void setTransactionSuccessful() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.rsr
    public final int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues.size() == 0) {
            xq0.x("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[i]);
        sb.append(str);
        sb.append(" SET ");
        int i2 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i2 > 0 ? StringUtils.COMMA : "");
            sb.append(str3);
            objArr2[i2] = contentValues.get(str3);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        dtr compileStatement = compileStatement(sb.toString());
        ezf.t(compileStatement, objArr2);
        return ((iwc) compileStatement).c.executeUpdateDelete();
    }

    @Override // defpackage.rsr
    public final void execSQL(String str) {
        this.a.execSQL(str);
    }

    @Override // defpackage.rsr
    public final Cursor query(String str, Object[] objArr) {
        return query(new atn(str, objArr));
    }

    @Override // defpackage.rsr
    public final Cursor query(String str) {
        str.getClass();
        return query(new atn(str, (Object[]) null));
    }
}
