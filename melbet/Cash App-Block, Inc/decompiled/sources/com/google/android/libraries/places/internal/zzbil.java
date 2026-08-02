package com.google.android.libraries.places.internal;

import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzbil extends zzbik {
    public final byte[] zzb;

    public zzbil(byte[] bArr) {
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final zzbik zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzn = zzbim.zzn(0, i2, bArr.length);
        return zzn == 0 ? zzbim.zza : new zzbii(bArr, 0, zzn);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final void zzd(int i, byte[] bArr) {
        System.arraycopy(this.zzb, 0, bArr, 0, i);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final void zze(zzbiv zzbivVar) {
        byte[] bArr = this.zzb;
        zzbivVar.zza(0, bArr.length, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final boolean zzf(zzbim zzbimVar) {
        boolean z = zzbimVar instanceof zzbil;
        byte[] bArr = this.zzb;
        if (z) {
            return Arrays.equals(bArr, ((zzbil) zzbimVar).zzb);
        }
        boolean z2 = zzbimVar instanceof zzbii;
        if (!z2) {
            return zzbimVar.zzf(this);
        }
        zzbii zzbiiVar = (zzbii) zzbimVar;
        int i = zzbiiVar.zzd;
        int length = bArr.length;
        if (length > i) {
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(length).length() + 18 + String.valueOf(length).length(), length);
            return false;
        }
        if (length > i) {
            TransportImpl$$ExternalSyntheticLambda0.m(String.valueOf(length).length() + 27 + String.valueOf(i).length(), "Ran off end of other: 0, ", ", ", length, i);
            return false;
        }
        if (z) {
            return zzbim.zzo(0, bArr, 0, ((zzbil) zzbimVar).zzb, length);
        }
        if (!z2) {
            return zzbimVar.zzc(0, length).equals(zzc(0, length));
        }
        return zzbim.zzo(0, bArr, zzbiiVar.zzc, zzbiiVar.zzb, length);
    }

    @Override // com.google.android.libraries.places.internal.zzbim
    public final int zzg(int i, int i2) {
        return zzbkc.zzc(i, 0, i2, this.zzb);
    }
}
