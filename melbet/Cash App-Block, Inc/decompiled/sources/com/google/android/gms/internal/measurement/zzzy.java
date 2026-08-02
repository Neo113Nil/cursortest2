package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzzy extends zzaaa {
    public final zzjx zza;
    public final zzjx zzb;
    public final int[] zzc;
    public final int zzd;

    public zzzy(zzjx zzjxVar, zzjx zzjxVar2) {
        this.zza = zzjxVar;
        this.zzb = zzjxVar2;
        int zza = zzjxVar2.zza();
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
            zzyl zzi = zzi(i);
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

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void zza(zzzm zzzmVar, zzzc zzzcVar) {
        for (int i = 0; i < this.zzd; i++) {
            int i2 = this.zzc[i];
            zzyl zzi = zzi(i2 & 31);
            if (zzi.zzc) {
                zzzmVar.zzb(zzi, new com.google.android.gms.internal.time.zzfi(this, zzi, i2), zzzcVar);
            } else {
                zzjx zzjxVar = this.zza;
                int zza = zzjxVar.zza();
                if (i2 >= zza) {
                    zzjxVar = this.zzb;
                    i2 -= zza;
                }
                zzzmVar.zza(zzi, zzi.zzb.cast(zzjxVar.zzc(i2)), zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set zzc() {
        return new com.google.android.gms.internal.time.zzfh(this, 3);
    }

    public final zzyl zzi(int i) {
        zzjx zzjxVar = this.zza;
        int zza = zzjxVar.zza();
        return i >= zza ? this.zzb.zzb(i - zza) : zzjxVar.zzb(i);
    }
}
