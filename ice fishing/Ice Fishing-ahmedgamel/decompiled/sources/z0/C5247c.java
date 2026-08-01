package z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5247c implements Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f42225v = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f42226w = new String[0];

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteDatabase f42227n;

    /* renamed from: u, reason: collision with root package name */
    public final List f42228u;

    public C5247c(SQLiteDatabase sQLiteDatabase) {
        this.f42227n = sQLiteDatabase;
        this.f42228u = sQLiteDatabase.getAttachedDbs();
    }

    public final void A(String sql) {
        kotlin.jvm.internal.h.e(sql, "sql");
        this.f42227n.execSQL(sql);
    }

    public final void B(Object[] objArr) {
        this.f42227n.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean C() {
        return this.f42227n.inTransaction();
    }

    public final boolean D() {
        SQLiteDatabase sQLiteDatabase = this.f42227n;
        kotlin.jvm.internal.h.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor E(String query) {
        kotlin.jvm.internal.h.e(query, "query");
        return F(new D2.b(query));
    }

    public final Cursor F(y0.d dVar) {
        final C5246b c5246b = new C5246b(dVar);
        Cursor rawQueryWithFactory = this.f42227n.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: z0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) C5246b.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.b(), f42226w, null);
        kotlin.jvm.internal.h.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void G() {
        this.f42227n.setTransactionSuccessful();
    }

    public final void b() {
        this.f42227n.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42227n.close();
    }

    public final void j() {
        this.f42227n.beginTransactionNonExclusive();
    }

    public final C5253i k(String str) {
        SQLiteStatement compileStatement = this.f42227n.compileStatement(str);
        kotlin.jvm.internal.h.d(compileStatement, "delegate.compileStatement(sql)");
        return new C5253i(compileStatement);
    }

    public final void z() {
        this.f42227n.endTransaction();
    }
}
