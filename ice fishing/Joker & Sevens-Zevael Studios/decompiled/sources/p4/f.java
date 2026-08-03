package p4;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f extends c4.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5475c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f5476d;

    public f(Context context, int i10, int i11) {
        super(i10, i11);
        this.f5476d = context;
    }

    @Override // c4.a
    public final void a(i4.c cVar) {
        switch (this.f5475c) {
            case 0:
                if (this.f1224b >= 10) {
                    cVar.i(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f5476d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                cVar.g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f5476d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j3 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j6 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    cVar.a();
                    try {
                        cVar.i(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j3)});
                        cVar.i(new Object[]{"reschedule_needed", Long.valueOf(j6)});
                        sharedPreferences.edit().clear().apply();
                        cVar.o();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    cVar.a();
                    try {
                        cVar.i(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        cVar.i(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        cVar.o();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public f(Context context) {
        super(9, 10);
        this.f5476d = context;
    }
}
