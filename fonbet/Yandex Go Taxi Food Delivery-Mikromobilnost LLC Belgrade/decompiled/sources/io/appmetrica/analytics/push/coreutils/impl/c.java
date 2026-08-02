package io.appmetrica.analytics.push.coreutils.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.service.PushServiceCommandLauncher;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class c implements PushServiceCommandLauncher {
    public final Context a;
    public final JobScheduler b;
    public final AtomicInteger c;

    public c(Context context, JobScheduler jobScheduler) {
        this.c = new AtomicInteger(27118000);
        this.a = context;
        this.b = jobScheduler;
    }

    public final int a() {
        return this.c.getAndUpdate(new k());
    }

    @Override // io.appmetrica.analytics.push.coreutils.internal.service.PushServiceCommandLauncher
    public final void launchService(Bundle bundle) {
        CoreUtils.accessSystemServiceSafely(new b(new JobInfo.Builder(a(), new ComponentName(this.a.getPackageName(), "io.appmetrica.analytics.push.internal.service.PushJobService")).setTransientExtras(bundle).setOverrideDeadline(10L).build(), bundle), this.b, "launching PushJobServiceController command", "JobScheduler");
    }

    public static /* synthetic */ int a(int i) {
        int i2 = i + 1;
        if (i2 > 27119000) {
            return 27118000;
        }
        return i2;
    }

    public c(Context context) {
        this(context, (JobScheduler) context.getSystemService("jobscheduler"));
    }
}
