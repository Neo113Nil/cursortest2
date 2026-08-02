package com.google.android.libraries.places.internal;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final class zzbme extends zzzl {
    @Override // com.google.android.libraries.places.internal.zzzl
    public final void zza(Object obj, long j, byte b) {
        if (zzbmg.zzb) {
            zzbmg.zzC(obj, j, b);
        } else {
            zzbmg.zzD(obj, j, b);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzzl
    public final boolean zzb(Object obj, long j) {
        return zzbmg.zzb ? zzbmg.zzt(obj, j) : zzbmg.zzu(obj, j);
    }

    @Override // com.google.android.libraries.places.internal.zzzl
    public final void zzc(Object obj, long j, boolean z) {
        if (zzbmg.zzb) {
            zzbmg.zzC(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzbmg.zzD(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzzl
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.zza).getInt(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzzl
    public final void zze(Object obj, long j, float f) {
        ((Unsafe) this.zza).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.libraries.places.internal.zzzl
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.zza).getLong(obj, j));
    }

    @Override // com.google.android.libraries.places.internal.zzzl
    public final void zzg(Object obj, long j, double d) {
        ((Unsafe) this.zza).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
