package com.google.android.libraries.places.internal;

import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class zzbii extends zzbik {
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzbii(byte[] bArr, int i, int i2) {
        zzbim.zzn(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final byte zza(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final zzbik zzc(int i, int i2) {
        int zzn = zzbim.zzn(i, i2, this.zzd);
        if (zzn == 0) {
            return zzbim.zza;
        }
        return new zzbii(this.zzb, this.zzc + i, zzn);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final void zzd(int i, byte[] bArr) {
        System.arraycopy(this.zzb, this.zzc, bArr, 0, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final void zze(zzbiv zzbivVar) {
        zzbivVar.zza(this.zzc, this.zzd, this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final boolean zzf(zzbim zzbimVar) {
        boolean z = zzbimVar instanceof zzbil;
        if (!z && !(zzbimVar instanceof zzbii)) {
            return zzbimVar.zzf(this);
        }
        int zzb = zzbimVar.zzb();
        int i = this.zzd;
        if (i > zzb) {
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i).length() + 18 + String.valueOf(i).length(), i);
            return false;
        }
        if (i > zzbimVar.zzb()) {
            int zzb2 = zzbimVar.zzb();
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(i).length() + 27 + String.valueOf(zzb2).length(), "Ran off end of other: 0, ", ", ", i, zzb2);
            return false;
        }
        byte[] bArr = this.zzb;
        int i2 = this.zzc;
        if (z) {
            return zzbim.zzo(i2, bArr, 0, ((zzbil) zzbimVar).zzb, i);
        }
        if (!(zzbimVar instanceof zzbii)) {
            return zzbimVar.zzc(0, i).equals(zzc(i2, i + i2));
        }
        zzbii zzbiiVar = (zzbii) zzbimVar;
        return zzbim.zzo(i2, bArr, zzbiiVar.zzc, zzbiiVar.zzb, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final int zzg(int i, int i2) {
        return zzbkc.zzc(i, this.zzc, i2, this.zzb);
    }
}
