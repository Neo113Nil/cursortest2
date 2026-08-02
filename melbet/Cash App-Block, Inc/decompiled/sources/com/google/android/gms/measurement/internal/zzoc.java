package com.google.android.gms.measurement.internal;

import android.os.Looper;
import androidx.work.impl.WorkLauncherImpl;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.internal.base.zao;

/* loaded from: classes.dex */
public final class zzoc extends zzg {
    public final MemoryCacheService zza;
    public final zzoa zzb;
    public final WorkLauncherImpl zzc;
    public zao zzd;
    public boolean zze;

    public zzoc(zzic zzicVar) {
        super(zzicVar);
        this.zze = true;
        this.zza = new MemoryCacheService(this, 29);
        this.zzb = new zzoa(this);
        this.zzc = new WorkLauncherImpl(this);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzn$1() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new zao(Looper.getMainLooper(), 3);
        }
    }
}
