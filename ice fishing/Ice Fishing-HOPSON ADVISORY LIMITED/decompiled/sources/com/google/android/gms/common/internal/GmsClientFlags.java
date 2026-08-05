package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class GmsClientFlags {
    private static volatile boolean zza = true;

    private GmsClientFlags() {
    }

    public static boolean isBindServiceOptimizationEnabled(String str) {
        return zza;
    }
}
