package com.google.android.gms.internal.wearable;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzay extends zzba {
    public static zzbf zza(Callable callable, Executor executor) {
        zzbo zzboVar = new zzbo(callable);
        executor.execute(zzboVar);
        return zzboVar;
    }
}
