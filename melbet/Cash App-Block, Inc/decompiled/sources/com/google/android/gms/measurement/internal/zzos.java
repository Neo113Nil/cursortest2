package com.google.android.gms.measurement.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class zzos extends zzol {
    public boolean zza;

    public zzos(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzg.zzs++;
    }

    public final void zzay() {
        if (this.zza) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Not initialized");
    }

    public final void zzaz() {
        if (this.zza) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't initialize twice");
            return;
        }
        zzbc();
        this.zzg.zzt++;
        this.zza = true;
    }

    public abstract void zzbc();
}
