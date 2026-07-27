package K0;

import android.content.Context;
import android.content.SharedPreferences;
import v0.AbstractC5103a;
import z0.C5247c;

/* loaded from: classes.dex */
public final class g extends AbstractC5103a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1514c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1515d;

    public g(Context context, int i, int i6) {
        super(i, i6);
        this.f1515d = context;
    }

    @Override // v0.AbstractC5103a
    public final void a(C5247c c5247c) {
        switch (this.f1514c) {
            case 0:
                if (this.f41356b >= 10) {
                    c5247c.B(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f1515d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c5247c.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f1515d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j9 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c5247c.b();
                    try {
                        c5247c.B(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                        c5247c.B(new Object[]{"reschedule_needed", Long.valueOf(j9)});
                        sharedPreferences.edit().clear().apply();
                        c5247c.G();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i6 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c5247c.b();
                    try {
                        c5247c.B(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        c5247c.B(new Object[]{"next_alarm_manager_id", Integer.valueOf(i6)});
                        sharedPreferences2.edit().clear().apply();
                        c5247c.G();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f1515d = context;
    }
}
