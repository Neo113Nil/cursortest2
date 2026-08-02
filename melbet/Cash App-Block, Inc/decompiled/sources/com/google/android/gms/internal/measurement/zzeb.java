package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class zzeb implements ThreadFactory {
    public final ThreadFactory zza = Executors.defaultThreadFactory();

    public zzeb(zzez zzezVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zza.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
