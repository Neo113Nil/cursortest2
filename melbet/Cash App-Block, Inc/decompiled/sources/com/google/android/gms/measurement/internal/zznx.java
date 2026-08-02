package com.google.android.gms.measurement.internal;

import androidx.work.impl.WorkLauncherImpl;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zznx implements Runnable {
    public final long zza;
    public final long zzb;
    public final /* synthetic */ WorkLauncherImpl zzc;

    public zznx(WorkLauncherImpl workLauncherImpl, long j, long j2) {
        Objects.requireNonNull(workLauncherImpl);
        this.zzc = workLauncherImpl;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhz zzhzVar = ((zzic) ((zzoc) this.zzc.workTaskExecutor).$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzj(new com.google.android.gms.stats.zza(this, 5));
    }
}
