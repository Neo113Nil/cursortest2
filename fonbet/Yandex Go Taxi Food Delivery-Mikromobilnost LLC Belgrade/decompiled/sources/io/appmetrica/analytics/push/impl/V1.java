package io.appmetrica.analytics.push.impl;

import android.app.job.JobParameters;
import android.os.Bundle;
import io.appmetrica.analytics.push.internal.service.PushJobService;

/* loaded from: classes9.dex */
public final class V1 implements Runnable {
    public final /* synthetic */ D a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ JobParameters c;
    public final /* synthetic */ PushJobService d;

    public V1(PushJobService pushJobService, D d, Bundle bundle, JobParameters jobParameters) {
        this.d = pushJobService;
        this.a = d;
        this.b = bundle;
        this.c = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.d, this.b);
        this.d.jobFinished(this.c, false);
    }
}
