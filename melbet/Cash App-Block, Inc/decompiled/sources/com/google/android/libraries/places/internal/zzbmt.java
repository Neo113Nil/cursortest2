package com.google.android.libraries.places.internal;

import androidx.camera.core.impl.utils.Exif;

/* loaded from: classes4.dex */
public abstract class zzbmt {
    public static final Exif.AnonymousClass1 zzb;

    static {
        zzblw zzf = zzblx.zzf();
        zzf.zza(-62135596800L);
        zzf.zzb$1(0);
        zzblw zzf2 = zzblx.zzf();
        zzf2.zza(253402300799L);
        zzf2.zzb$1(999999999);
        zzblw zzf3 = zzblx.zzf();
        zzf3.zza(0L);
        zzf3.zzb$1(0);
        zzb = new Exif.AnonymousClass1(11);
        try {
            Class.forName("java.time.Instant").getMethod("now", null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("java.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }
}
