package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcjw {
    public final String zza;
    public final int zzb;
    public final String zzc;

    public zzcjw(zzcjv zzcjvVar) {
        this.zza = zzcjvVar.zzb;
        int i = zzcjvVar.zzc;
        if (i == -1) {
            String str = zzcjvVar.zza;
            i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        }
        this.zzb = i;
        this.zzc = zzcjvVar.toString();
    }

    public static int zzd(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzcjw) && ((zzcjw) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc;
    }
}
