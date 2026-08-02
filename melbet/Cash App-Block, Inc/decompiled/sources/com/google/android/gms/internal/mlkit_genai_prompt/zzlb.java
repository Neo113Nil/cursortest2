package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzlb extends zzkq {
    public final /* synthetic */ zzlc zza;
    public final Callable zzb;

    public zzlb(zzlc zzlcVar, Callable callable) {
        this.zza = zzlcVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final Object zza() {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final void zzd(Throwable th) {
        this.zza.zzm(th);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final void zze(Object obj) {
        this.zza.zzl(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
