package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbtd {
    public final zzbtz zza;
    public final zzbor zzb;
    public final zzbsz zzc;

    public zzbtd(zzbtz zzbtzVar, zzbor zzborVar, zzbsz zzbszVar) {
        this.zza = zzbtzVar;
        Trace.checkNotNull(zzborVar, "attributes");
        this.zzb = zzborVar;
        this.zzc = zzbszVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbtd)) {
            return false;
        }
        zzbtd zzbtdVar = (zzbtd) obj;
        return Objects.equals(this.zza, zzbtdVar.zza) && Objects.equals(this.zzb, zzbtdVar.zzb) && Objects.equals(this.zzc, zzbtdVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza.toString(), "addressesOrError");
        stringHelper.add(this.zzb, "attributes");
        stringHelper.add(this.zzc, "serviceConfigOrError");
        return stringHelper.toString();
    }
}
