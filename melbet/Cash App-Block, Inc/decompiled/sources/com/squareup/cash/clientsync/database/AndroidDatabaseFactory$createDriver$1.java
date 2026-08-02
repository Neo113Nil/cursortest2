package com.squareup.cash.clientsync.database;

import android.database.sqlite.SQLiteDiskIOException;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;

/* loaded from: classes.dex */
public final class AndroidDatabaseFactory$createDriver$1 extends AndroidSqliteDriver.Callback {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onOpen(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        try {
            frameworkSQLiteDatabase.enableWriteAheadLogging();
        } catch (SQLiteDiskIOException unused) {
        }
    }
}
