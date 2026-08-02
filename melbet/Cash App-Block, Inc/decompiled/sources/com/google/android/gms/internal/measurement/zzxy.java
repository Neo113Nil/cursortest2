package com.google.android.gms.internal.measurement;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzxy extends zzjx {
    public Object[] zza;
    public int zzb;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.zzb; i++) {
            sb.append(" '");
            sb.append(zzb(i));
            sb.append("': ");
            sb.append(zzc(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final zzyl zzb(int i) {
        if (i < this.zzb) {
            return (zzyl) this.zza[i + i];
        }
        JWK$$ExternalSyntheticBUOutline0.m2173m();
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzc(int i) {
        if (i < this.zzb) {
            return this.zza[i + i + 1];
        }
        JWK$$ExternalSyntheticBUOutline0.m2173m();
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzjx
    public final Object zzd(zzyl zzylVar) {
        int zzh = zzh(zzylVar);
        if (zzh == -1) {
            return null;
        }
        return zzylVar.zzb.cast(this.zza[zzh + zzh + 1]);
    }

    public final void zze(zzyl zzylVar, Object obj) {
        int zzh;
        if (!zzylVar.zzc && (zzh = zzh(zzylVar)) != -1) {
            zzky.zza(obj, "metadata value");
            this.zza[zzh + zzh + 1] = obj;
            return;
        }
        int i = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i + i > length) {
            this.zza = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + i2;
        objArr2[i3] = zzylVar;
        zzky.zza(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.zzb++;
    }

    public final int zzh(zzyl zzylVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i + i].equals(zzylVar)) {
                return i;
            }
        }
        return -1;
    }
}
