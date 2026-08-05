package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zze extends zzj {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zze() {
    }

    public final zzj zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.zzj
    public final zzj zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.zzj
    final zzj zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.zzj
    public final zzj zze(int i) {
        this.zzd = 1;
        return this;
    }

    @Override // com.google.android.gms.internal.wearable.zzj
    public final zzk zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzf(this.zza, false, this.zzc, null, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
