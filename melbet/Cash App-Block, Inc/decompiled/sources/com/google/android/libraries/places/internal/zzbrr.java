package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbrr {
    public final List zza;
    public final zzbor zzb;
    public final Object zzc;

    public /* synthetic */ zzbrr(List list, zzbor zzborVar, Object obj) {
        Trace.checkNotNull(list, "addresses");
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        Trace.checkNotNull(zzborVar, "attributes");
        this.zzb = zzborVar;
        this.zzc = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbrr)) {
            return false;
        }
        zzbrr zzbrrVar = (zzbrr) obj;
        return Objects.equals(this.zza, zzbrrVar.zza) && Objects.equals(this.zzb, zzbrrVar.zzb) && Objects.equals(this.zzc, zzbrrVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza, "addresses");
        stringHelper.add(this.zzb, "attributes");
        stringHelper.add(this.zzc, "loadBalancingPolicyConfig");
        return stringHelper.toString();
    }
}
