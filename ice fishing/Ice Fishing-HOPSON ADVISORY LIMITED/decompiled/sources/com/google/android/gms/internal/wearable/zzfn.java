package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzfn extends zzfo {
    zzfn(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.wearable.zzfo
    public final void zza(Object obj, long j, byte b) {
        if (zzfp.zzb) {
            zzfp.zzC(obj, j, b);
        } else {
            zzfp.zzD(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfo
    public final boolean zzb(Object obj, long j) {
        return zzfp.zzb ? zzfp.zzt(obj, j) : zzfp.zzu(obj, j);
    }

    @Override // com.google.android.gms.internal.wearable.zzfo
    public final void zzc(Object obj, long j, boolean z) {
        if (zzfp.zzb) {
            zzfp.zzC(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzfp.zzD(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.wearable.zzfo
    public final float zzd(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.wearable.zzfo
    public final void zze(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.wearable.zzfo
    public final double zzf(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.wearable.zzfo
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
