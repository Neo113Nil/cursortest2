package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbro {
    public static final zzbro zza = new zzbro(null, zzbtx.zza, false);
    public final zzbrs zzb;
    public final zzbtx zzd;
    public final boolean zze;

    public zzbro(zzbrs zzbrsVar, zzbtx zzbtxVar, boolean z) {
        this.zzb = zzbrsVar;
        Trace.checkNotNull(zzbtxVar, "status");
        this.zzd = zzbtxVar;
        this.zze = z;
    }

    public static zzbro zzb(zzbtx zzbtxVar) {
        Trace.checkArgument("error status shouldn't be OK", !zzbtxVar.zzj());
        return new zzbro(null, zzbtxVar, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbro)) {
            return false;
        }
        zzbro zzbroVar = (zzbro) obj;
        return Objects.equals(this.zzb, zzbroVar.zzb) && this.zzd == zzbroVar.zzd && this.zze == zzbroVar.zze;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzd, null, Boolean.valueOf(this.zze));
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zzb, "subchannel");
        stringHelper.add((Object) null, "streamTracerFactory");
        stringHelper.add(this.zzd, "status");
        stringHelper.add("drop", this.zze);
        stringHelper.add((Object) null, "authority-override");
        return stringHelper.toString();
    }
}
