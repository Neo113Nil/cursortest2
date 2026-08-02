package z0;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import java.util.List;
import y0.InterfaceC5199d;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5214c implements Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f42196v = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f42197w = new String[0];

    /* renamed from: n, reason: collision with root package name */
    public final SQLiteDatabase f42198n;

    /* renamed from: u, reason: collision with root package name */
    public final List f42199u;

    public C5214c(SQLiteDatabase sQLiteDatabase) {
        this.f42198n = sQLiteDatabase;
        this.f42199u = sQLiteDatabase.getAttachedDbs();
    }

    public final void A(String sql) {
        kotlin.jvm.internal.h.e(sql, "sql");
        this.f42198n.execSQL(sql);
    }

    public final void B(Object[] objArr) {
        this.f42198n.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean C() {
        return this.f42198n.inTransaction();
    }

    public final boolean D() {
        SQLiteDatabase sQLiteDatabase = this.f42198n;
        kotlin.jvm.internal.h.e(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final Cursor E(String query) {
        kotlin.jvm.internal.h.e(query, "query");
        return F(new F2.b(query, 5));
    }

    public final Cursor F(InterfaceC5199d interfaceC5199d) {
        final C5213b c5213b = new C5213b(interfaceC5199d);
        Cursor rawQueryWithFactory = this.f42198n.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: z0.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) C5213b.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC5199d.b(), f42197w, null);
        kotlin.jvm.internal.h.d(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void G() {
        this.f42198n.setTransactionSuccessful();
    }

    public final void b() {
        this.f42198n.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f42198n.close();
    }

    public final void j() {
        this.f42198n.beginTransactionNonExclusive();
    }

    public final C5220i k(String str) {
        SQLiteStatement compileStatement = this.f42198n.compileStatement(str);
        kotlin.jvm.internal.h.d(compileStatement, "delegate.compileStatement(sql)");
        return new C5220i(compileStatement);
    }

    public final void z() {
        this.f42198n.endTransaction();
    }
}
