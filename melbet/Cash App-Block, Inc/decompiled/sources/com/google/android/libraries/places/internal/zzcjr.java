package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcjr {
    public final zzcjr[] zza;
    public final int zzb;
    public final int zzc;

    public zzcjr(int i, int i2) {
        this.zza = null;
        this.zzb = i;
        int i3 = i2 & 7;
        this.zzc = i3 == 0 ? 8 : i3;
    }

    public zzcjr() {
        this.zza = new zzcjr[256];
        this.zzb = 0;
        this.zzc = 0;
    }
}
