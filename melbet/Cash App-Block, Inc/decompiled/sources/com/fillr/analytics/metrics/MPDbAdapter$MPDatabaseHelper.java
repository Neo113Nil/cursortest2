package com.fillr.analytics.metrics;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;

/* loaded from: classes4.dex */
public final class MPDbAdapter$MPDatabaseHelper extends SQLiteOpenHelper {
    public final FAConfig mConfig;
    public final File mDatabaseFile;

    public MPDbAdapter$MPDatabaseHelper(Context context) {
        super(context, "fillranalytics", (SQLiteDatabase.CursorFactory) null, 4);
        this.mDatabaseFile = context.getDatabasePath("fillranalytics");
        this.mConfig = FAConfig.getInstance(context);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE people (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON people (created_at);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS people");
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE TABLE people (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON events (created_at);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS time_idx ON people (created_at);");
    }
}
