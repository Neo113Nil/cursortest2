package io.requery.android.database.sqlite;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import defpackage.hu3;
import io.requery.android.database.CursorWindow;

/* loaded from: classes5.dex */
public final class SQLiteQuery extends SQLiteProgram {
    private final hu3 mCancellationSignal;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, hu3 hu3Var) {
        super(sQLiteDatabase, str, objArr, hu3Var);
        this.mCancellationSignal = hu3Var;
    }

    public int fillWindow(CursorWindow cursorWindow, int i, int i2, boolean z) {
        acquireReference();
        try {
            try {
                cursorWindow.acquireReference();
            } catch (Throwable th) {
                releaseReference();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
        } catch (SQLiteDatabaseCorruptException e) {
            e = e;
        } catch (SQLiteException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            cursorWindow.releaseReference();
            throw th4;
        }
        try {
            int executeForCursorWindow = getSession().executeForCursorWindow(getSql(), getBindArgs(), cursorWindow, i, i2, z, getConnectionFlags(), this.mCancellationSignal);
            cursorWindow.releaseReference();
            releaseReference();
            return executeForCursorWindow;
        } catch (SQLiteDatabaseCorruptException e3) {
            e = e3;
            SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
            onCorruption();
            throw sQLiteDatabaseCorruptException;
        } catch (SQLiteException e4) {
            e = e4;
            SQLiteException sQLiteException = e;
            Log.e("SQLiteQuery", "exception: " + sQLiteException.getMessage() + "; query: " + getSql());
            throw sQLiteException;
        }
    }

    public String toString() {
        return "SQLiteQuery: " + getSql();
    }
}
