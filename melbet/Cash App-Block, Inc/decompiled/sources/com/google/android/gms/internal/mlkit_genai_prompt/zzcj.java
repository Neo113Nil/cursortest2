package com.google.android.gms.internal.mlkit_genai_prompt;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzcj implements Executor {
    public static final zzcj zza = new zzcj();
    public final Handler zzb = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zzb.post(runnable);
    }
}
