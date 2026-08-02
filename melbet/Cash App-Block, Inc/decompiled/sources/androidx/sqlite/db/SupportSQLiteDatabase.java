package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    void beginTransactionReadOnly();

    SupportSQLiteStatement compileStatement(String str);

    void endTransaction();

    void execSQL(String str);

    void execSQL(String str, Object[] objArr);

    boolean inTransaction();

    boolean isOpen();

    boolean isWriteAheadLoggingEnabled();

    Cursor query(SupportSQLiteQuery supportSQLiteQuery);

    Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    Cursor query(String str);

    void setTransactionSuccessful();

    int update(ContentValues contentValues, Object[] objArr);

    boolean yieldIfContendedSafely();
}
