package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzeb implements Cloneable, zzfn {
    public zzeh zza;
    public final zzeh zzb;

    public zzeb(zzeh zzehVar) {
        this.zzb = zzehVar;
        if (zzehVar.zzY()) {
            a$$ExternalSyntheticBUOutline0.m$3("Default instance must be immutable.");
            throw null;
        }
        this.zza = (zzeh) zzehVar.zzg(4, null);
    }

    public final Object clone() {
        zzeb zzebVar = (zzeb) this.zzb.zzg(5, null);
        zzebVar.zza = zzi();
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn
    public final boolean zzad() {
        return zzeh.zzX(this.zza, false);
    }

    public final zzeh zzh() {
        zzeh zzi = zzi();
        if (zzeh.zzX(zzi, true)) {
            return zzi;
        }
        throw new zzgr();
    }

    public zzeh zzi() {
        boolean zzY = this.zza.zzY();
        zzeh zzehVar = this.zza;
        if (!zzY) {
            return zzehVar;
        }
        zzehVar.getClass();
        zzfu.zzb.zzb(zzehVar.getClass()).zzf(zzehVar);
        zzehVar.zzU();
        return this.zza;
    }

    public /* bridge */ zzcq zzk() {
        return zzi();
    }

    public final void zzm() {
        if (this.zza.zzY()) {
            return;
        }
        zzn();
    }

    public void zzn() {
        zzeh zzehVar = (zzeh) this.zzb.zzg(4, null);
        zzfu.zzb.zzb(zzehVar.getClass()).zzg(zzehVar, this.zza);
        this.zza = zzehVar;
    }
}
