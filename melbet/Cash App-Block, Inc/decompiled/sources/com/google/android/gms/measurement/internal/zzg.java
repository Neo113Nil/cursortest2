package com.google.android.gms.measurement.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class zzg extends zzf {
    public boolean zza;

    public zzg(zzic zzicVar) {
        super(zzicVar);
        ((zzic) this.$$delegate_0).zzD++;
    }

    public final void zzb$1() {
        if (this.zza) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Not initialized");
    }

    public final void zzc() {
        if (this.zza) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't initialize twice");
        } else {
            if (zze()) {
                return;
            }
            ((zzic) this.$$delegate_0).zzF.incrementAndGet();
            this.zza = true;
        }
    }

    public abstract boolean zze();
}
