package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzai {
    public static void zza(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException("invalid filter type");
        }
    }

    public static void zzc(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(zzaj.zza(str, Long.valueOf(j)));
        }
    }

    public static Object zzd(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }
}
