package com.anythink.basead.exoplayer.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class PlatformScheduler implements c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9507b = "PlatformScheduler";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9508c = "service_action";

    /* renamed from: d, reason: collision with root package name */
    private static final String f9509d = "service_package";

    /* renamed from: e, reason: collision with root package name */
    private static final String f9510e = "requirements";

    /* renamed from: f, reason: collision with root package name */
    private final int f9511f;

    /* renamed from: g, reason: collision with root package name */
    private final ComponentName f9512g;

    /* renamed from: h, reason: collision with root package name */
    private final JobScheduler f9513h;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            if (!new a(extras.getInt(PlatformScheduler.f9510e)).a(this)) {
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString(PlatformScheduler.f9508c);
            af.a((Context) this, new Intent(string).setPackage(extras.getString(PlatformScheduler.f9509d)));
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    private PlatformScheduler(Context context, int i) {
        this.f9511f = i;
        this.f9512g = new ComponentName(context, (Class<?>) PlatformSchedulerService.class);
        this.f9513h = (JobScheduler) context.getSystemService("jobscheduler");
    }

    private static void b() {
    }

    private static /* synthetic */ void c() {
    }

    @Override // com.anythink.basead.exoplayer.scheduler.c
    public final boolean a(a aVar, String str, String str2) {
        int i;
        JobInfo.Builder builder = new JobInfo.Builder(this.f9511f, this.f9512g);
        int a9 = aVar.a();
        if (a9 == 0) {
            i = 0;
        } else if (a9 != 1) {
            i = 2;
            if (a9 != 2) {
                i = 3;
                if (a9 != 3) {
                    i = 4;
                    if (a9 != 4) {
                        throw new UnsupportedOperationException();
                    }
                    if (af.f9132a < 26) {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f9132a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i = 1;
        }
        builder.setRequiredNetworkType(i);
        builder.setRequiresDeviceIdle(aVar.c());
        builder.setRequiresCharging(aVar.b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f9508c, str2);
        persistableBundle.putString(f9509d, str);
        persistableBundle.putInt(f9510e, aVar.d());
        builder.setExtras(persistableBundle);
        return this.f9513h.schedule(builder.build()) == 1;
    }

    @Override // com.anythink.basead.exoplayer.scheduler.c
    public final boolean a() {
        this.f9513h.cancel(this.f9511f);
        return true;
    }

    private static JobInfo a(int i, ComponentName componentName, a aVar, String str, String str2) {
        int i4;
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        int a9 = aVar.a();
        if (a9 == 0) {
            i4 = 0;
        } else if (a9 != 1) {
            i4 = 2;
            if (a9 != 2) {
                i4 = 3;
                if (a9 != 3) {
                    i4 = 4;
                    if (a9 == 4) {
                        if (af.f9132a < 26) {
                            throw new UnsupportedOperationException();
                        }
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f9132a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i4 = 1;
        }
        builder.setRequiredNetworkType(i4);
        builder.setRequiresDeviceIdle(aVar.c());
        builder.setRequiresCharging(aVar.b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f9508c, str);
        persistableBundle.putString(f9509d, str2);
        persistableBundle.putInt(f9510e, aVar.d());
        builder.setExtras(persistableBundle);
        return builder.build();
    }
}
