package com.google.android.gms.common.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzn {
    public final String zza;
    public final String zzb;
    public final boolean zze;

    public zzn(String str, String str2, boolean z) {
        zzae.checkNotEmpty(str);
        this.zza = str;
        zzae.checkNotEmpty(str2);
        this.zzb = str2;
        this.zze = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return zzae.equal(this.zza, zznVar.zza) && zzae.equal(this.zzb, zznVar.zzb) && zzae.equal(null, null) && this.zze == zznVar.zze && zzae.equal(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, 4225, Boolean.valueOf(this.zze), null});
    }

    public final String toString() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        zzae.checkNotNull(null);
        throw null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
