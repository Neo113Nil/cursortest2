package com.google.android.gms.internal.wearable;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public interface zzh {
    static String zzb(File file, String str, zzk zzkVar) {
        return new File(file, str).getPath();
    }

    default String zza(File file, String str) {
        return zzb(file, str, zzk.zza);
    }
}
