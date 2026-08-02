package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcig {
    public final zzclo zza;
    public int zzb;
    public int zzc;

    public zzcig(zzclo zzcloVar, int i) {
        this.zza = zzcloVar;
        this.zzb = i;
    }

    public final void zza(int i, int i2, byte[] bArr) {
        this.zza.zzz(i, i2, bArr);
        this.zzb -= i2;
        this.zzc += i2;
    }
}
