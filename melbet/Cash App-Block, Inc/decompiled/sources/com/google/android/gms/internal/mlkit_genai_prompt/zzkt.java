package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzkt implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzjy zzb;

    public /* synthetic */ zzkt(Executor executor, zzjy zzjyVar) {
        this.zza = executor;
        this.zzb = zzjyVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzm(e);
        }
    }
}
