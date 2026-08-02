package com.google.android.gms.internal.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzgd extends zzef {
    public final Level zzb;
    public final Set zzc;
    public final zzew zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgd(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = zzgf.zza;
        zzew zzewVar = zzgf.zzb;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzewVar;
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final void zzb(zzd zzdVar) {
        String str = (String) zzdVar.zzg().zzc(zzeg.zza);
        if (str == null) {
            str = (String) this.zza;
        }
        if (str == null) {
            if (zzdVar.zze == null) {
                a$$ExternalSyntheticBUOutline0.m$1("cannot request log site information prior to postProcess()");
                return;
            }
            str = "<unknown class>";
        }
        zzgf.zzi(zzdVar, zzbz.zza(str), this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final boolean zzc(Level level) {
        return true;
    }
}
