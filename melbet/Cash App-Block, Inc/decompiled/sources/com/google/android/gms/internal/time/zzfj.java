package com.google.android.gms.internal.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzfj extends zzfm {
    public final zzcw zza;
    public final zzcw zzb;
    public final int[] zzc;
    public final int zzd;

    public zzfj(zzcw zzcwVar, zzcw zzcwVar2) {
        this.zza = zzcwVar;
        this.zzb = zzcwVar2;
        int zza = zzcwVar2.zza();
        if (!(zza <= 28)) {
            a$$ExternalSyntheticBUOutline0.m$3("metadata size too large");
            throw null;
        }
        int[] iArr = new int[zza];
        this.zzc = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < zza) {
            zzdq zzi = zzi(i);
            long j2 = zzi.zze | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (zzi.equals(zzi(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = zzi.zzc ? iArr[i3] | (1 << (i + 4)) : i;
                    i++;
                    j = j2;
                }
            }
            iArr[i2] = i;
            i2++;
            i++;
            j = j2;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final Set zzb() {
        return new zzfh(this, 0);
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final void zzc(zzew zzewVar, zzem zzemVar) {
        for (int i = 0; i < this.zzd; i++) {
            int i2 = this.zzc[i];
            zzdq zzi = zzi(i2 & 31);
            if (zzi.zzc) {
                zzewVar.zzb(zzi, new zzfi(this, zzi, i2), zzemVar);
            } else {
                zzcw zzcwVar = this.zza;
                int zza = zzcwVar.zza();
                if (i2 >= zza) {
                    zzcwVar = this.zzb;
                    i2 -= zza;
                }
                zzewVar.zza(zzi, zzi.zzb.cast(zzcwVar.zzd(i2)), zzemVar);
            }
        }
    }

    public final zzdq zzi(int i) {
        zzcw zzcwVar = this.zza;
        int zza = zzcwVar.zza();
        return i >= zza ? this.zzb.zzb(i - zza) : zzcwVar.zzb(i);
    }
}
