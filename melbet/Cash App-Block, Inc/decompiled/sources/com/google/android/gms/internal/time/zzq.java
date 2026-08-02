package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzh(5);
    public final zzg zza;
    public final zzi zzb;
    public final zzo zzc;
    public final List zzd;
    public final List zze;

    public zzq(zzg zzgVar, zzi zziVar, zzo zzoVar, ArrayList arrayList, ArrayList arrayList2) {
        Objects.requireNonNull(zzgVar);
        this.zza = zzgVar;
        Objects.requireNonNull(zziVar);
        this.zzb = zziVar;
        Objects.requireNonNull(zzoVar);
        this.zzc = zzoVar;
        Objects.requireNonNull(arrayList);
        this.zzd = arrayList;
        Objects.requireNonNull(arrayList2);
        this.zze = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.zza.equals(zzqVar.zza) && this.zzb.equals(zzqVar.zzb) && this.zzc.equals(zzqVar.zzc) && this.zzd.equals(zzqVar.zzd) && this.zze.equals(zzqVar.zze);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        String valueOf5 = String.valueOf(this.zze);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TimeSignalResult{estimatedError=", valueOf, ", currentTime=", valueOf2, ", acquisitionTicks=");
        Boxes$$ExternalSyntheticOutline1.m(m, valueOf3, ", pastUnixEpochClockAdjustments=", valueOf4, ", futureUnixEpochClockAdjustments=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, valueOf5, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 3, this.zzc, i);
        MooncakeHeaderViewKt.writeTypedList(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeTypedList(parcel, 5, this.zze);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
