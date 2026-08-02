package com.google.android.gms.internal.mlkit_genai_prompt;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzju extends zzkq {
    public final /* synthetic */ zzjw zza;
    public final Executor zza$1;
    public final /* synthetic */ zzjw zzb;
    public final zzfr zzc;

    public zzju(zzjw zzjwVar, zzfr zzfrVar, Executor executor) {
        this.zza = zzjwVar;
        this.zzb = zzjwVar;
        this.zza$1 = executor;
        this.zzc = zzfrVar;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final /* bridge */ /* synthetic */ Object zza() {
        zzfr zzfrVar = this.zzc;
        return ((zzer) zzki.zzi((ListenableFuture) zzfrVar.zza)).zzc(zzki.zzi((zzjj) zzfrVar.zzb));
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final void zzd(Throwable th) {
        zzjw zzjwVar = this.zzb;
        zzjwVar.zza = null;
        if (th instanceof ExecutionException) {
            zzjwVar.zzm(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzjwVar.cancel(false);
        } else {
            zzjwVar.zzm(th);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final void zze(Object obj) {
        this.zzb.zza = null;
        this.zza.zzn((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzkq
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
