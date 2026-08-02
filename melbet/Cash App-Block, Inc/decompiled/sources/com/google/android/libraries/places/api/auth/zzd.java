package com.google.android.libraries.places.api.auth;

/* loaded from: classes4.dex */
public final class zzd {
    public static final zzd zza = new zzd();

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof zzd);
    }

    public final int hashCode() {
        return 385623362 * 1000003;
    }

    public final String toString() {
        int length = String.valueOf(false).length();
        StringBuilder sb = new StringBuilder(length + 47 + "null".length() + 26 + "null".length() + 1);
        sb.append("AppCheckResult{appCheckEnabled=false, appCheckToken=null, appCheckTokenFetchError=null}");
        return sb.toString();
    }
}
