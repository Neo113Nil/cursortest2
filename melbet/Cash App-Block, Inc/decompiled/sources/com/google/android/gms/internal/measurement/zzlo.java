package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class zzlo implements ThreadFactory {
    public static final /* synthetic */ zzlo zza = new zzlo();

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        Object obj = zzlk.zzb;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
