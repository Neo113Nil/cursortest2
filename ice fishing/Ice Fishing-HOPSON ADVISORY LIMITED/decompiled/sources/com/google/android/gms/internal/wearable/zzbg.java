package com.google.android.gms.internal.wearable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public interface zzbg extends ExecutorService {
    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzbf submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    zzbf submit(Runnable runnable, Object obj);

    @Override // java.util.concurrent.ExecutorService, com.google.android.gms.internal.wearable.zzbg
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    zzbf submit(Callable callable);
}
