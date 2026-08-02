package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class zzxx {
    public static final zzxv zzf;
    public static final zzxv zzh;
    public static final zzyl zza = new zzyl("cause", Throwable.class, false, false);
    public static final zzyl zzb = new zzyl("ratelimit_count", Integer.class, false, false);
    public static final zzyl zzc = new zzyl("sampling_count", Integer.class, false, false);
    public static final zzyl zzd = new zzyl("ratelimit_period", zzxm.class, false, false);
    public static final zzyl zze = new zzyl("skipped", Integer.class, false, false);
    public static final zzyl zzg = new zzyl("forced", Boolean.class, false, false);
    public static final zzyl zzi = new zzyl("stack_size", zzyv.class, false, false);

    static {
        boolean z = true;
        zzf = new zzxv("group_by", Object.class, z, z, 0);
        zzh = new zzxv("tags", zzabe.class, false, z, 1);
    }
}
