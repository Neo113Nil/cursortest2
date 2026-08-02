package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zze implements Callable {
    public static final /* synthetic */ zze zza = new zze();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzn zznVar = new zzn("internal.platform", 4);
        zznVar.zze.put("getVersion", new zzn("getVersion", 3));
        return zznVar;
    }
}
