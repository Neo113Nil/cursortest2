package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes4.dex */
public final class zzcji {
    public static final zzcls zza;
    public static final zzcls zzb;
    public static final zzcls zzc;
    public static final zzcls zzd;
    public static final zzcls zze;
    public final zzcls zzf;
    public final zzcls zzg;
    public final int zzh;

    static {
        zzcls zzclsVar = zzcls.zza;
        zza = zzey.zza(":status");
        zzb = zzey.zza(":method");
        zzc = zzey.zza(":path");
        zzd = zzey.zza(":scheme");
        zze = zzey.zza(":authority");
        zzey.zza(":host");
        zzey.zza(":version");
    }

    public zzcji(zzcls zzclsVar, zzcls zzclsVar2) {
        this.zzf = zzclsVar;
        this.zzg = zzclsVar2;
        this.zzh = zzclsVar2.zzj() + zzclsVar.zzj() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcji) {
            zzcji zzcjiVar = (zzcji) obj;
            if (this.zzf.equals(zzcjiVar.zzf) && this.zzg.equals(zzcjiVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzg.hashCode() + ((this.zzf.hashCode() + 527) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.zzf.zze(), ": ", this.zzg.zze());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzcji(String str, String str2) {
        this(zzey.zza(str), zzey.zza(str2));
        zzcls zzclsVar = zzcls.zza;
    }
}
