package com.gamericefishpro.space.p6;

import android.app.job.JobParameters;
import android.net.Network;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}
