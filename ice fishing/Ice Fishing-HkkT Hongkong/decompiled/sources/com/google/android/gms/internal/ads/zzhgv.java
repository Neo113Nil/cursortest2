package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public abstract class zzhgv {
    public static zzhgv zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzhgq(cls.getSimpleName()) : new zzhgs(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
