package com.google.android.gms.internal.time;

import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzde extends zzcw {
    public Object[] zza;
    public int zzb;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.zzb; i++) {
            sb.append(" '");
            sb.append(zzb(i));
            sb.append("': ");
            sb.append(zzd(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.time.zzcw
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.time.zzcw
    public final zzdq zzb(int i) {
        if (i < this.zzb) {
            return (zzdq) this.zza[i + i];
        }
        JWK$$ExternalSyntheticBUOutline0.m2173m();
        return null;
    }

    @Override // com.google.android.gms.internal.time.zzcw
    public final Object zzc(zzdq zzdqVar) {
        int zzh = zzh(zzdqVar);
        if (zzh == -1) {
            return null;
        }
        return zzdqVar.zzb.cast(this.zza[zzh + zzh + 1]);
    }

    @Override // com.google.android.gms.internal.time.zzcw
    public final Object zzd(int i) {
        if (i < this.zzb) {
            return this.zza[i + i + 1];
        }
        JWK$$ExternalSyntheticBUOutline0.m2173m();
        return null;
    }

    public final void zze(zzdq zzdqVar, Object obj) {
        int zzh;
        if (!zzdqVar.zzc && (zzh = zzh(zzdqVar)) != -1) {
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
        objArr2[i3] = zzdqVar;
        objArr2[i3 + 1] = obj;
        this.zzb = i2 + 1;
    }

    public final int zzh(zzdq zzdqVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i + i].equals(zzdqVar)) {
                return i;
            }
        }
        return -1;
    }
}
