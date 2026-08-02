package com.squareup.cash.db;

import android.database.sqlite.SQLiteDiskIOException;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import kotlin.jvm.internal.Reflection;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashAppDatabaseCallback extends SupportSQLiteOpenHelper.Callback {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onCreate(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        try {
            AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver(frameworkSQLiteDatabase, 0);
            Reflection.factory.getOrCreateKotlinClass(CashAppDatabaseImpl.class);
            androidSqliteDriver.execute(null, "CREATE TABLE analytics_message(\n  message_uuid TEXT NOT NULL PRIMARY KEY,\n  recorded_at INTEGER NOT NULL,\n  payload BLOB NOT NULL\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE placeholder(\n  id INTEGER PRIMARY KEY\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE session (\n  app_token TEXT,\n  account_token TEXT,\n  target_account_token TEXT,\n  session_token TEXT,\n  session_status INTEGER,\n  onboarded INTEGER NOT NULL,\n  id INTEGER PRIMARY KEY NOT NULL\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE storage_link (\n  account_token TEXT,\n  id INTEGER PRIMARY KEY NOT NULL,\n  signin_group_id INTEGER NOT NULL,\n  created_at_ms INTEGER NOT NULL\n)", null);
            androidSqliteDriver.execute(null, "CREATE TABLE active_storage_link (\n  id INTEGER PRIMARY KEY NOT NULL,\n  storage_link_id INTEGER,\n  FOREIGN KEY(storage_link_id) REFERENCES storage_link(id) ON DELETE CASCADE\n)", null);
            androidSqliteDriver.execute(null, "CREATE INDEX idx_analyticsMessage_timestamp ON analytics_message (recorded_at)", null);
            androidSqliteDriver.execute(null, "CREATE UNIQUE INDEX idx_storage_link_token ON storage_link(account_token)", null);
            androidSqliteDriver.execute(null, "INSERT OR REPLACE INTO session VALUES (NULL, NULL, NULL, NULL, NULL, 0, 1)", null);
            QueryResult.Companion.getClass();
            QueryResult.Companion companion = QueryResult.Companion.$$INSTANCE;
        } catch (Throwable th) {
            Timber.Forest.e("Failed to create database", new Object[0], th);
            throw th;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onOpen(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        frameworkSQLiteDatabase.delegate.execSQL("PRAGMA foreign_keys = ON;");
        try {
            frameworkSQLiteDatabase.enableWriteAheadLogging();
        } catch (SQLiteDiskIOException unused) {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onUpgrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
        CashAppDatabaseImpl.Schema schema = CashAppDatabaseImpl.Schema.INSTANCE;
        try {
            AndroidSqliteDriver androidSqliteDriver = new AndroidSqliteDriver(frameworkSQLiteDatabase, 0);
            Reflection.factory.getOrCreateKotlinClass(CashAppDatabaseImpl.class);
            schema.migrate(androidSqliteDriver, i, i2, new AfterVersion[0]);
        } catch (Throwable th) {
            Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Failed to upgrade database from ", i, i2, " to "), new Object[0], th);
            throw th;
        }
    }
}
