package com.google.android.gms.internal.wearable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzn implements zzm {
    private zzn() {
        throw null;
    }

    /* synthetic */ zzn(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.wearable.zzm
    public final ExecutorService zza(int i) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzo(null)));
    }

    @Override // com.google.android.gms.internal.wearable.zzm
    public final ExecutorService zzb(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzo(null));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
