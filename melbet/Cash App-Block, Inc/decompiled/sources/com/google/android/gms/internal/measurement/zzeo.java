package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class zzeo implements Runnable {
    public final long zzi;
    public final long zzj;
    public final boolean zzk;
    public final /* synthetic */ zzez zzl;

    public zzeo(zzez zzezVar, boolean z) {
        Objects.requireNonNull(zzezVar);
        this.zzl = zzezVar;
        this.zzi = System.currentTimeMillis();
        this.zzj = SystemClock.elapsedRealtime();
        this.zzk = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzez zzezVar = this.zzl;
        if (zzezVar.zzh) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e) {
            zzezVar.zzW(e, false, this.zzk);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
