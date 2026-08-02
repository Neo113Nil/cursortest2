package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbsz {
    public final zzbtx zza;
    public final Object zzb;

    public zzbsz(zzbtx zzbtxVar) {
        this.zzb = null;
        Trace.checkNotNull(zzbtxVar, "status");
        this.zza = zzbtxVar;
        Trace.checkArgument("cannot use OK status: %s", zzbtxVar, !zzbtxVar.zzj());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbsz.class == obj.getClass()) {
            zzbsz zzbszVar = (zzbsz) obj;
            if (this.zza == zzbszVar.zza && Objects.equals(this.zzb, zzbszVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj != null) {
            Response stringHelper = Ascii.toStringHelper(this);
            stringHelper.add(obj, "config");
            return stringHelper.toString();
        }
        Response stringHelper2 = Ascii.toStringHelper(this);
        stringHelper2.add(this.zza, BreadcrumbHelper.Category.ERROR);
        return stringHelper2.toString();
    }

    public zzbsz(Object obj) {
        this.zzb = obj;
        this.zza = null;
    }
}
