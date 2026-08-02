package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.FluentFuture;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzqe {
    public final Context zza;
    public final Supplier zzb;
    public final Supplier zzc;
    public final Supplier zzd;
    public volatile int zze = 0;
    public final CopyOnWriteArrayList zzf = new CopyOnWriteArrayList();
    public final Object zzg = new Object();
    public volatile FluentFuture.TrustedFuture zzh = null;

    public zzqe(Context context, Supplier supplier, Supplier supplier2, Supplier supplier3) {
        this.zza = context;
        this.zzb = supplier;
        this.zzc = supplier2;
        this.zzd = supplier3;
    }
}
