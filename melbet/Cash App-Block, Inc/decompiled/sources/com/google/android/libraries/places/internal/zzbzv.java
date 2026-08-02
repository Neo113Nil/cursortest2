package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzv implements Runnable {
    public final /* synthetic */ zzbwf zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzcah zzc;

    public zzbzv(zzcah zzcahVar, zzbwf zzbwfVar, boolean z) {
        this.zza = zzbwfVar;
        this.zzb = z;
        this.zzc = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzt.zza(this.zza, this.zzb);
    }
}
