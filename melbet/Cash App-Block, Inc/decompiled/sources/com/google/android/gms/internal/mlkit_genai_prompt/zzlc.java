package com.google.android.gms.internal.mlkit_genai_prompt;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes4.dex */
public final class zzlc extends zzjy implements RunnableFuture {
    public volatile zzlb zza;

    public zzlc(Callable callable) {
        this.zza = new zzlb(this, callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzlb zzlbVar = this.zza;
        if (zzlbVar != null) {
            zzlbVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final String zzc() {
        zzlb zzlbVar = this.zza;
        return zzlbVar != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("task=[", zzlbVar.toString(), "]") : super.zzc();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzjc
    public final void zzd() {
        zzlb zzlbVar;
        if (zzo() && (zzlbVar = this.zza) != null) {
            zzlbVar.zzh();
        }
        this.zza = null;
    }
}
