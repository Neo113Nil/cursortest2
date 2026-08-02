package com.google.android.gms.common;

/* loaded from: classes4.dex */
public class zzy {
    public static final zzy zze = new zzy(true, null, null);
    public final boolean zza;
    public final String zzb;
    public final Throwable zzc;

    public zzy(boolean z, String str, Exception exc) {
        this.zza = z;
        this.zzb = str;
        this.zzc = exc;
    }

    public static zzy zzc(String str) {
        return new zzy(false, str, null);
    }

    public static zzy zzd(Exception exc, String str) {
        return new zzy(false, str, exc);
    }

    public String zza() {
        return this.zzb;
    }
}
