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
    private static final String f8721b = "PlatformScheduler";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8722c = "service_action";

    /* renamed from: d, reason: collision with root package name */
    private static final String f8723d = "service_package";

    /* renamed from: e, reason: collision with root package name */
    private static final String f8724e = "requirements";

    /* renamed from: f, reason: collision with root package name */
    private final int f8725f;

    /* renamed from: g, reason: collision with root package name */
    private final ComponentName f8726g;

    /* renamed from: h, reason: collision with root package name */
    private final JobScheduler f8727h;

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            if (!new a(extras.getInt(PlatformScheduler.f8724e)).a(this)) {
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString(PlatformScheduler.f8722c);
            af.a((Context) this, new Intent(string).setPackage(extras.getString(PlatformScheduler.f8723d)));
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    private PlatformScheduler(Context context, int i) {
        this.f8725f = i;
        this.f8726g = new ComponentName(context, (Class<?>) PlatformSchedulerService.class);
        this.f8727h = (JobScheduler) context.getSystemService("jobscheduler");
    }

    private static void b() {
    }

    private static /* synthetic */ void c() {
    }

    @Override // com.anythink.basead.exoplayer.scheduler.c
    public final boolean a(a aVar, String str, String str2) {
        int i;
        JobInfo.Builder builder = new JobInfo.Builder(this.f8725f, this.f8726g);
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
                    if (af.f8346a < 26) {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f8346a < 24) {
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
        persistableBundle.putString(f8722c, str2);
        persistableBundle.putString(f8723d, str);
        persistableBundle.putInt(f8724e, aVar.d());
        builder.setExtras(persistableBundle);
        return this.f8727h.schedule(builder.build()) == 1;
    }

    @Override // com.anythink.basead.exoplayer.scheduler.c
    public final boolean a() {
        this.f8727h.cancel(this.f8725f);
        return true;
    }

    private static JobInfo a(int i, ComponentName componentName, a aVar, String str, String str2) {
        int i6;
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        int a9 = aVar.a();
        if (a9 == 0) {
            i6 = 0;
        } else if (a9 != 1) {
            i6 = 2;
            if (a9 != 2) {
                i6 = 3;
                if (a9 != 3) {
                    i6 = 4;
                    if (a9 == 4) {
                        if (af.f8346a < 26) {
                            throw new UnsupportedOperationException();
                        }
                    } else {
                        throw new UnsupportedOperationException();
                    }
                } else if (af.f8346a < 24) {
                    throw new UnsupportedOperationException();
                }
            }
        } else {
            i6 = 1;
        }
        builder.setRequiredNetworkType(i6);
        builder.setRequiresDeviceIdle(aVar.c());
        builder.setRequiresCharging(aVar.b());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f8722c, str);
        persistableBundle.putString(f8723d, str2);
        persistableBundle.putInt(f8724e, aVar.d());
        builder.setExtras(persistableBundle);
        return builder.build();
    }
}
