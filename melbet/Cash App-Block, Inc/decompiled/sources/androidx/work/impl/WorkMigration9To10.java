package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes.dex */
public final class WorkMigration9To10 extends Migration {
    public final /* synthetic */ int $r8$classId = 0;
    public final Context context;

    public WorkMigration9To10(Context context) {
        super(9, 10);
        this.context = context;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        int i = this.$r8$classId;
        Context context = this.context;
        supportSQLiteDatabase.getClass();
        switch (i) {
            case 0:
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    supportSQLiteDatabase.beginTransaction();
                    try {
                        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        supportSQLiteDatabase.setTransactionSuccessful();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    supportSQLiteDatabase.beginTransaction();
                    try {
                        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        supportSQLiteDatabase.setTransactionSuccessful();
                        return;
                    } finally {
                    }
                }
                return;
            default:
                if (this.endVersion >= 10) {
                    supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
        }
    }

    public WorkMigration9To10(Context context, int i, int i2) {
        super(i, i2);
        this.context = context;
    }
}
