package com.google.android.libraries.places.internal;

import androidx.room.TransactorKt;

/* loaded from: classes4.dex */
public abstract class zzbqe {
    public static final boolean zza = zzb("GRPC_ENABLE_RFC3986_URIS", false);

    public static boolean zzb(String str, boolean z) {
        String str2 = System.getenv(str);
        if (str2 == null) {
            str2 = System.getProperty(str);
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        return z ? TransactorKt.stringIsNullOrEmpty(str2) || Boolean.parseBoolean(str2) : !TransactorKt.stringIsNullOrEmpty(str2) && Boolean.parseBoolean(str2);
    }
}
