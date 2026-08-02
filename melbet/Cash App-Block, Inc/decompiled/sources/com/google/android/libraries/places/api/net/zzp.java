package com.google.android.libraries.places.api.net;

import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzfi;

/* loaded from: classes4.dex */
public final class zzp {
    public Place zza;
    public String zzb;
    public long zzc;
    public com.google.android.gms.tasks.zzb zzd;
    public byte zze;

    public final zzq build() {
        if (this.zze != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("Missing required properties: utcTimeMillis");
            return null;
        }
        Place place = this.zza;
        zzq zzqVar = new zzq(place, this.zzb, this.zzc, this.zzd);
        if (place != null) {
            Trace.checkArgument("Place must have a valid place id.", ((zzfi) place).zzp != null);
        }
        return zzqVar;
    }
}
