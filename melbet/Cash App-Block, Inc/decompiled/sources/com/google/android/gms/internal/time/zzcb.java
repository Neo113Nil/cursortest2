package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final class zzcb {
    public final String zza;

    public zzcb(String str) {
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcb) {
            return this.zza.equals(((zzcb) obj).zza);
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
