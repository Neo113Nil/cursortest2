package z0;

import B2.C0280n;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5260c implements Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f42107v = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f42108w = new String[0];

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteDatabase f42109n;

    /* renamed from: u, reason: collision with root package name */
    public final List f42110u;

    public C5260c(SQLiteDatabase sQLiteDatabase) {
        this.f42109n = sQLiteDatabase;
        this.f42110u = sQLiteDatabase.getAttachedDbs();
    }

    public final void A(String sql) {
        kotlin.jvm.internal.h.e(sql, "sql");
        this.f42109n.execSQL(sql);
    }

    public final void B(Object[] objArr) {
        this.f42109n.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean C() {
        return this.f42109n.inTransaction();
    }

    public final boolean D() {
        SQLiteDatabase sQLiteDatabase = this.f42109n;
        kotlin.jvm.internal.h.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor E(String query) {
        kotlin.jvm.internal.h.e(query, "query");
        return F(new C0280n(query, 3));
    }

    public final Cursor F(y0.d dVar) {
        final C5259b c5259b = new C5259b(dVar);
        Cursor rawQueryWithFactory = this.f42109n.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: z0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) C5259b.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.b(), f42108w, null);
        kotlin.jvm.internal.h.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void G() {
        this.f42109n.setTransactionSuccessful();
    }

    public final void b() {
        this.f42109n.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42109n.close();
    }

    public final void j() {
        this.f42109n.beginTransactionNonExclusive();
    }

    public final C5266i k(String str) {
        SQLiteStatement compileStatement = this.f42109n.compileStatement(str);
        kotlin.jvm.internal.h.d(compileStatement, "delegate.compileStatement(sql)");
        return new C5266i(compileStatement);
    }

    public final void z() {
        this.f42109n.endTransaction();
    }
}
