package com.google.android.gms.internal.measurement;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;

/* loaded from: classes.dex */
public final class zzon {
    public final Function zza;
    public final boolean zzb;
    public final ImmutableSet zzc;
    public volatile String zzd = null;

    public zzon(Function function, boolean z, ImmutableSet immutableSet) {
        this.zza = function;
        this.zzb = z;
        this.zzc = immutableSet;
    }
}
