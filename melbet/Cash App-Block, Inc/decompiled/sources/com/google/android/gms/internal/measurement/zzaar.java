package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zzaar extends zzaag {
    public final Level zzb;
    public final Set zzc;
    public final zzzm zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaar(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = zzaas.zzb;
        this.zzb = level;
        this.zzc = zzaas.zzb;
        this.zzd = zzaas.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzaag
    public final boolean zzb(Level level) {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzaag
    public final void zzc(zzxq zzxqVar) {
        String str = (String) zzxqVar.zzl().zzd(zzyw.zza);
        if (str == null) {
            str = this.zza;
        }
        if (str == null) {
            zzyc zzycVar = zzxqVar.zze;
            if (zzycVar == null) {
                a$$ExternalSyntheticBUOutline0.m$1("cannot request log site information prior to postProcess()");
                return;
            }
            str = zzycVar.zza();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        zzaas.zzi(zzxqVar, zzjx.zza(str), this.zzb, this.zzc, this.zzd);
    }
}
