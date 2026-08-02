package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzh(3);
    public final zzg zza;
    public final zzg zzb;
    public final zzg zzc;
    public final zzg zzd;

    public zzm(zzg zzgVar, zzg zzgVar2, zzg zzgVar3, zzg zzgVar4) {
        if (zzgVar3.zza == 0 && zzgVar3.zzb == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("deltaClock == 0");
            throw null;
        }
        if (zzgVar4.zza < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("deltaClockError must not be negative");
            throw null;
        }
        Objects.requireNonNull(zzgVar);
        this.zza = zzgVar;
        Objects.requireNonNull(zzgVar2);
        this.zzb = zzgVar2;
        this.zzc = zzgVar3;
        this.zzd = zzgVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzm.class == obj.getClass()) {
            zzm zzmVar = (zzm) obj;
            if (this.zza.equals(zzmVar.zza) && this.zzb.equals(zzmVar.zzb) && this.zzc.equals(zzmVar.zzc) && this.zzd.equals(zzmVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ParcelableClockAdjustmentPeriod{beginRelativePhysical=", valueOf, ", durationPhysical=", valueOf2, ", deltaClock="), String.valueOf(this.zzc), ", deltaClockError=", String.valueOf(this.zzd), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 4, this.zzd, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
