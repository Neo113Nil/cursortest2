package i4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import dd.w;
import java.io.Closeable;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f3171h = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f3172i = new String[0];

    /* renamed from: g, reason: collision with root package name */
    public final SQLiteDatabase f3173g;

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f3173g = sQLiteDatabase;
    }

    public final void a() {
        this.f3173g.beginTransaction();
    }

    public final void b() {
        this.f3173g.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3173g.close();
    }

    public final i d(String str) {
        SQLiteStatement compileStatement = this.f3173g.compileStatement(str);
        j.d(compileStatement, "delegate.compileStatement(sql)");
        return new i(compileStatement);
    }

    public final void f() {
        this.f3173g.endTransaction();
    }

    public final void g(String str) {
        j.e(str, "sql");
        this.f3173g.execSQL(str);
    }

    public final void i(Object[] objArr) {
        this.f3173g.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean j() {
        return this.f3173g.inTransaction();
    }

    public final boolean k() {
        SQLiteDatabase sQLiteDatabase = this.f3173g;
        j.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor l(h4.f fVar) {
        final b bVar = new b(0, fVar);
        Cursor rawQueryWithFactory = this.f3173g.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: i4.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) b.this.d(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fVar.d(), f3172i, null);
        j.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final Cursor m(String str) {
        j.e(str, "query");
        return l(new w(str));
    }

    public final void o() {
        this.f3173g.setTransactionSuccessful();
    }
}
