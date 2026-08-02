package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzflb implements zzgej {
    final /* synthetic */ zzfkr zza;
    final /* synthetic */ zzfld zzb;

    zzflb(zzfld zzfldVar, zzfkr zzfkrVar) {
        this.zza = zzfkrVar;
        this.zzb = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th) {
        zzflf zzflfVar;
        zzflfVar = this.zzb.zza.zzd;
        zzflfVar.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
        zzflf zzflfVar;
        zzflfVar = this.zzb.zza.zzd;
        zzflfVar.zzd(this.zza);
    }
}
