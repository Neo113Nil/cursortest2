package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import coil3.memory.RealStrongMemoryCache;
import com.fillr.featuretoggle.UnleashContext;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
public final class zzak {
    public final Context zza;
    public final RealStrongMemoryCache zzb;
    public final UnleashContext zzc;
    public final Executor zzd;

    public zzak(Context context, ThreadPoolExecutor threadPoolExecutor, UnleashContext unleashContext, RealStrongMemoryCache realStrongMemoryCache) {
        this.zza = context;
        this.zzb = realStrongMemoryCache;
        this.zzc = unleashContext;
        this.zzd = threadPoolExecutor;
    }
}
