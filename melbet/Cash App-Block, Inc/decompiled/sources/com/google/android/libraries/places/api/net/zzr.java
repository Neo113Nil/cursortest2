package com.google.android.libraries.places.api.net;

/* loaded from: classes4.dex */
public final class zzr {
    public final Boolean zza;

    public zzr(Boolean bool) {
        this.zza = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzr)) {
            return false;
        }
        Boolean bool = ((zzr) obj).zza;
        Boolean bool2 = this.zza;
        return bool2 == null ? bool == null : bool2.equals(bool);
    }

    public final int hashCode() {
        Boolean bool = this.zza;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(bool).length() + 23);
        sb.append("IsOpenResponse{isOpen=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }
}
