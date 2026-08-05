package com.google.android.gms.internal.wearable;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
abstract class zzfo {
    final Unsafe zza;

    zzfo(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j, byte b);

    public abstract boolean zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z);

    public abstract float zzd(Object obj, long j);

    public abstract void zze(Object obj, long j, float f);

    public abstract double zzf(Object obj, long j);

    public abstract void zzg(Object obj, long j, double d);
}
