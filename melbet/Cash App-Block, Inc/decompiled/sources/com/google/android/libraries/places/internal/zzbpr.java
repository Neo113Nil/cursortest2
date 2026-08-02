package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzbpr {
    public final zzbpq zza;
    public final zzbtx zzb;

    public zzbpr(zzbpq zzbpqVar, zzbtx zzbtxVar) {
        this.zza = zzbpqVar;
        Trace.checkNotNull(zzbtxVar, "status is null");
        this.zzb = zzbtxVar;
    }

    public static zzbpr zza(zzbpq zzbpqVar) {
        Trace.checkArgument("state is TRANSIENT_ERROR. Use forError() instead", zzbpqVar != zzbpq.zzc);
        return new zzbpr(zzbpqVar, zzbtx.zza);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbpr)) {
            return false;
        }
        zzbpr zzbprVar = (zzbpr) obj;
        return this.zza.equals(zzbprVar.zza) && this.zzb.equals(zzbprVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        zzbtx zzbtxVar = this.zzb;
        boolean zzj = zzbtxVar.zzj();
        zzbpq zzbpqVar = this.zza;
        if (zzj) {
            return zzbpqVar.toString();
        }
        String valueOf = String.valueOf(zzbpqVar);
        String valueOf2 = String.valueOf(zzbtxVar);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 1 + valueOf2.length() + 1), valueOf, "(", valueOf2, ")");
    }
}
