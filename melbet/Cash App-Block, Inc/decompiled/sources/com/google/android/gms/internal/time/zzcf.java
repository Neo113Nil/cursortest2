package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final class zzcf {
    public final String zza;

    public zzcf(zzcb zzcbVar) {
        this.zza = String.valueOf(zzcbVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcf) {
            return this.zza.equals(((zzcf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
