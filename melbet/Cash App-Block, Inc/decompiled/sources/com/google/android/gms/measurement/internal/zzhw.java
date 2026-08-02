package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class zzhw implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzhz zza;
    public final String zzb;

    public zzhw(zzhz zzhzVar, String str) {
        this.zza = zzhzVar;
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        zzgu zzguVar = ((zzic) this.zza.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzd.zzb(th, this.zzb);
    }
}
