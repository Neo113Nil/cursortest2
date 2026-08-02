package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes4.dex */
public abstract class zzc {
    public static StrictMode.VmPolicy.Builder zza(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
