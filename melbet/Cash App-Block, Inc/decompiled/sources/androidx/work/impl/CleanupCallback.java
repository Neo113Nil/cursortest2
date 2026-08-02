package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.SystemClock;

/* loaded from: classes.dex */
public final class CleanupCallback extends RoomDatabase.Callback {
    public final SystemClock clock;

    public CleanupCallback(SystemClock systemClock) {
        systemClock.getClass();
        this.clock = systemClock;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        supportSQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.clock.getClass();
            sb.append(System.currentTimeMillis() - 86400000);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            supportSQLiteDatabase.execSQL(sb.toString());
            supportSQLiteDatabase.setTransactionSuccessful();
        } finally {
            supportSQLiteDatabase.endTransaction();
        }
    }
}
