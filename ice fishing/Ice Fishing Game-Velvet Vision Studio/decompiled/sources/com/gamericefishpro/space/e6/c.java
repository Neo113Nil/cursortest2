package com.gamericefishpro.space.e6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.d6.b {
    public static final String[] e = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] i = new String[0];
    public static final Object v;
    public static final Object w;
    public final SQLiteDatabase d;

    static {
        com.gamericefishpro.space.oh.j jVar = com.gamericefishpro.space.oh.j.e;
        v = com.gamericefishpro.space.oh.i.a(jVar, new com.gamericefishpro.space.a5.h(14));
        w = com.gamericefishpro.space.oh.i.a(jVar, new com.gamericefishpro.space.a5.h(15));
    }

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
    }

    @Override // com.gamericefishpro.space.d6.b
    public final void A(Object[] bindArgs) {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    @Override // com.gamericefishpro.space.d6.b
    public final void B() {
        this.d.setTransactionSuccessful();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final void D() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final int I(ContentValues values, Object[] objArr) {
        Intrinsics.checkNotNullParameter("WorkSpec", "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(e[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : values.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = values.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        j statement = m(sb.toString());
        Intrinsics.checkNotNullParameter(statement, "statement");
        int length2 = objArr2.length;
        int i4 = 0;
        while (i4 < length2) {
            Object obj = objArr2[i4];
            i4++;
            if (obj == null) {
                statement.p(i4);
            } else if (obj instanceof byte[]) {
                statement.G(i4, (byte[]) obj);
            } else if (obj instanceof Float) {
                statement.k(((Number) obj).floatValue(), i4);
            } else if (obj instanceof Double) {
                statement.k(((Number) obj).doubleValue(), i4);
            } else if (obj instanceof Long) {
                statement.a(i4, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                statement.a(i4, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                statement.a(i4, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                statement.a(i4, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                statement.i(i4, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i4 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                statement.a(i4, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return statement.e.executeUpdateDelete();
    }

    public final Cursor b(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return f(new com.gamericefishpro.space.d6.a(query));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final void d() {
        this.d.endTransaction();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final void e() {
        this.d.beginTransaction();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final Cursor f(com.gamericefishpro.space.d6.h query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final a aVar = new a(0, query);
        Cursor cursorRawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.gamericefishpro.space.e6.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) aVar.c(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.l(), i, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override // com.gamericefishpro.space.d6.b
    public final void h(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.d.execSQL(sql);
    }

    @Override // com.gamericefishpro.space.d6.b
    public final boolean isOpen() {
        return this.d.isOpen();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final j m(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.d.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new j(sQLiteStatementCompileStatement);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    @Override // com.gamericefishpro.space.d6.b
    public final void q() throws IllegalAccessException, InvocationTargetException {
        ?? r1 = w;
        if (((Method) r1.getValue()) != null) {
            ?? r2 = v;
            if (((Method) r2.getValue()) != null) {
                Method method = (Method) r1.getValue();
                Intrinsics.b(method);
                Method method2 = (Method) r2.getValue();
                Intrinsics.b(method2);
                Object objInvoke = method2.invoke(this.d, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        e();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final boolean r() {
        return this.d.inTransaction();
    }

    @Override // com.gamericefishpro.space.d6.b
    public final boolean v() {
        return this.d.isWriteAheadLoggingEnabled();
    }
}
