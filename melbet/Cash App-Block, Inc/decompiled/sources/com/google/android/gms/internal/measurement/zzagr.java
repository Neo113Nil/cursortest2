package com.google.android.gms.internal.measurement;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;

/* loaded from: classes.dex */
public abstract class zzagr {
    public static final zzod zzb;
    public static volatile String zzc;
    public static final zzxs zzd;

    static {
        zzox zzoxVar = zzox.zza$1;
        int i = ImmutableSet.$r8$clinit;
        zzon zzonVar = new zzon(zzoxVar, true, RegularImmutableSet.EMPTY);
        zzpi zzpiVar = new zzpi();
        zzpiVar.zza = zzonVar;
        zzd = new zzxs(zzpiVar);
        zzb = new zzod("__phenotype_server_token", zzpiVar, "");
        zzc = null;
    }

    public static String zza() {
        return (String) zzb.get();
    }
}
