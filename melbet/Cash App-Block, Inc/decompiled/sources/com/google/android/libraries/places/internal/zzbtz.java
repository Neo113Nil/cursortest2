package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbtz {
    public final zzbtx zza;
    public final Object zzb;

    public zzbtz(zzbtx zzbtxVar, Object obj) {
        this.zza = zzbtxVar;
        this.zzb = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbtz) {
            zzbtz zzbtzVar = (zzbtz) obj;
            if (zzc() == zzbtzVar.zzc()) {
                return zzc() ? Objects.equals(this.zzb, zzbtzVar.zzb) : this.zza == zzbtzVar.zza;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        zzbtx zzbtxVar = this.zza;
        if (zzbtxVar == null) {
            stringHelper.add(this.zzb, "value");
        } else {
            stringHelper.add(zzbtxVar, BreadcrumbHelper.Category.ERROR);
        }
        return stringHelper.toString();
    }

    public final boolean zzc() {
        return this.zza == null;
    }
}
