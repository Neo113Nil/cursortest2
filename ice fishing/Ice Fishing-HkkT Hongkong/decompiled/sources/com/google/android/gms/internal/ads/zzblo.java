package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.0.0 */
/* loaded from: classes2.dex */
final class zzblo extends zzbkp {
    final /* synthetic */ zzblr zza;

    /* synthetic */ zzblo(zzblr zzblrVar, zzbln zzblnVar) {
        this.zza = zzblrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkq
    public final void zze(zzbkg zzbkgVar, String str) {
        com.google.android.gms.ads.formats.zzf zzfVar;
        com.google.android.gms.ads.formats.zzf zzfVar2;
        zzbkh zzf;
        zzblr zzblrVar = this.zza;
        zzfVar = zzblrVar.zzb;
        if (zzfVar == null) {
            return;
        }
        zzfVar2 = zzblrVar.zzb;
        zzf = zzblrVar.zzf(zzbkgVar);
        zzfVar2.zzb(zzf, str);
    }
}
