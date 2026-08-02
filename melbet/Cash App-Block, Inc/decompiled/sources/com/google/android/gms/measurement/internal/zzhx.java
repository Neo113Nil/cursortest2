package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class zzhx extends FutureTask implements Comparable {
    public final boolean zza;
    public final /* synthetic */ zzhz zzb;
    public final long zzc;
    public final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhx(zzhz zzhzVar, Callable callable, boolean z) {
        super(callable);
        this.zzb = zzhzVar;
        long andIncrement = zzhz.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzgu zzguVar = ((zzic) zzhzVar.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzhx zzhxVar = (zzhx) obj;
        boolean z = zzhxVar.zza;
        boolean z2 = this.zza;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = zzhxVar.zzc;
        long j2 = this.zzc;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        zzgu zzguVar = ((zzic) this.zzb.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zze.zzb(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        zzgu zzguVar = ((zzic) this.zzb.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzd.zzb(th, this.zzd);
        if ((th instanceof zzhv) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhx(zzhz zzhzVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.zzb = zzhzVar;
        long andIncrement = zzhz.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzgu zzguVar = ((zzic) zzhzVar.$$delegate_0).zzi;
            zzic.zzP(zzguVar);
            zzguVar.zzd.zza("Tasks index overflow");
        }
    }
}
