package com.google.android.libraries.places.api.model;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zzcm {
    public zzeq zza;
    public DayOfWeek zzb;
    public zzes zzc;
    public boolean zzd;
    public byte zze;

    public final zzgk build() {
        DayOfWeek dayOfWeek;
        zzes zzesVar;
        if (this.zze == 1 && (dayOfWeek = this.zzb) != null && (zzesVar = this.zzc) != null) {
            return new zzgk(this.zza, dayOfWeek, zzesVar, this.zzd);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzb == null) {
            sb.append(" day");
        }
        if (this.zzc == null) {
            sb.append(" time");
        }
        if (this.zze == 0) {
            sb.append(" truncated");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
