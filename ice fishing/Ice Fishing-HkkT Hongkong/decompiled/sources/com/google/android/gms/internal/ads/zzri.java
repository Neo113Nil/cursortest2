package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzri implements zzpy {
    final /* synthetic */ zzrj zza;

    /* synthetic */ zzri(zzrj zzrjVar, zzrh zzrhVar) {
        this.zza = zzrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zza(Exception exc) {
        zzpt zzptVar;
        zzff.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzptVar = this.zza.zzc;
        zzptVar.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpy
    public final void zzb() {
        zzme zzmeVar;
        zzme zzmeVar2;
        zzrj zzrjVar = this.zza;
        zzmeVar = zzrjVar.zzm;
        if (zzmeVar != null) {
            zzmeVar2 = zzrjVar.zzm;
            zzmeVar2.zzb();
        }
    }
}
