package K0;

import android.content.Context;
import android.content.SharedPreferences;
import v0.AbstractC5095a;
import z0.C5214c;

/* loaded from: classes.dex */
public final class g extends AbstractC5095a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1623c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1624d;

    public g(Context context, int i, int i4) {
        super(i, i4);
        this.f1624d = context;
    }

    @Override // v0.AbstractC5095a
    public final void a(C5214c c5214c) {
        switch (this.f1623c) {
            case 0:
                if (this.f41079b >= 10) {
                    c5214c.B(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f1624d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                c5214c.A("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f1624d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j9 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    c5214c.b();
                    try {
                        c5214c.B(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                        c5214c.B(new Object[]{"reschedule_needed", Long.valueOf(j9)});
                        sharedPreferences.edit().clear().apply();
                        c5214c.G();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i4 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    c5214c.b();
                    try {
                        c5214c.B(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        c5214c.B(new Object[]{"next_alarm_manager_id", Integer.valueOf(i4)});
                        sharedPreferences2.edit().clear().apply();
                        c5214c.G();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f1624d = context;
    }
}
