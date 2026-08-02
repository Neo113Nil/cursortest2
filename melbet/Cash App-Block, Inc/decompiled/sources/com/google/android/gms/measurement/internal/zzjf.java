package com.google.android.gms.measurement.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import papa.InteractionResult;

/* loaded from: classes.dex */
public abstract class zzjf extends InteractionResult {
    public boolean zza;

    public zzjf(zzic zzicVar) {
        super(zzicVar);
        ((zzic) this.$$delegate_0).zzD++;
    }

    public abstract boolean zza();

    public final void zzw() {
        if (this.zza) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Not initialized");
    }

    public final void zzx() {
        if (this.zza) {
            a$$ExternalSyntheticBUOutline0.m$1("Can't initialize twice");
        } else {
            if (zza()) {
                return;
            }
            ((zzic) this.$$delegate_0).zzF.incrementAndGet();
            this.zza = true;
        }
    }
}
