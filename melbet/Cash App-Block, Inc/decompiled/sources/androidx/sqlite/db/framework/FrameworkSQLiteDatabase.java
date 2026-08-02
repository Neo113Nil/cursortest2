package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.util.BackHandlerKt;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {
    public static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Lazy beginTransactionMethod$delegate;
    public static final Lazy getThreadSessionMethod$delegate;
    public final SQLiteDatabase delegate;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        getThreadSessionMethod$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new InvalidationTracker$$ExternalSyntheticLambda0(25));
        beginTransactionMethod$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new InvalidationTracker$$ExternalSyntheticLambda0(26));
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.delegate = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransaction() {
        this.delegate.beginTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionNonExclusive() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void beginTransactionReadOnly() {
        Lazy lazy = beginTransactionMethod$delegate;
        if (((Method) lazy.getValue()) != null) {
            Lazy lazy2 = getThreadSessionMethod$delegate;
            if (((Method) lazy2.getValue()) != null) {
                Method method = (Method) lazy.getValue();
                method.getClass();
                Method method2 = (Method) lazy2.getValue();
                method2.getClass();
                Object invoke = method2.invoke(this.delegate, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                    return;
                }
            }
        }
        beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final SupportSQLiteStatement compileStatement(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.delegate.compileStatement(str);
        compileStatement.getClass();
        return new FrameworkSQLiteStatement(compileStatement);
    }

    public final boolean enableWriteAheadLogging() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void endTransaction() {
        this.delegate.endTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str) {
        this.delegate.execSQL(str);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean inTransaction() {
        return this.delegate.inTransaction();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean isWriteAheadLoggingEnabled() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        supportSQLiteQuery.getClass();
        final MoneyUiFactory$$ExternalSyntheticLambda0 moneyUiFactory$$ExternalSyntheticLambda0 = new MoneyUiFactory$$ExternalSyntheticLambda0(supportSQLiteQuery, 2);
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda2
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) MoneyUiFactory$$ExternalSyntheticLambda0.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.getSql(), EMPTY_STRING_ARRAY, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void setTransactionSuccessful() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final int update(ContentValues contentValues, Object[] objArr) {
        int i = 0;
        if (contentValues.size() == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(CONFLICT_VALUES[3]);
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
        SupportSQLiteStatement compileStatement = compileStatement(sb.toString());
        BackHandlerKt.bind(compileStatement, objArr2);
        return ((FrameworkSQLiteStatement) compileStatement).delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final boolean yieldIfContendedSafely() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final void execSQL(String str, Object[] objArr) {
        this.delegate.execSQL(str, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(String str) {
        return query(new CallResult(str));
    }

    @Override // androidx.sqlite.db.SupportSQLiteDatabase
    public final Cursor query(final SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        supportSQLiteQuery.getClass();
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$$ExternalSyntheticLambda0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                sQLiteQuery.getClass();
                SupportSQLiteQuery.this.bindTo(new FrameworkSQLiteProgram(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.getSql(), EMPTY_STRING_ARRAY, null, cancellationSignal);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }
}
