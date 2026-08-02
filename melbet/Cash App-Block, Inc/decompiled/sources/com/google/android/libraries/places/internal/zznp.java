package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class zznp {
    public String zza;
    public int zzb;
    public zzns zzc;
    public byte zzd;

    public final zznq zze() {
        String str;
        zzns zznsVar;
        if (this.zzd == 1 && (str = this.zza) != null && (zznsVar = this.zzc) != null) {
            zznq zznqVar = new zznq(str, this.zzb, zznsVar);
            Trace.checkArgument("Package name must not be empty.", !str.isEmpty());
            return zznqVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" packageName");
        }
        if (this.zzd == 0) {
            sb.append(" versionCode");
        }
        if (this.zzc == null) {
            sb.append(" requestSource");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
