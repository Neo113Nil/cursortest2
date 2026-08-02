package com.google.android.gms.internal.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzh(2);
    public final Long zza;
    public final String zzb;
    public final int zzc;

    public zzk(int i, Long l, String str) {
        this.zza = l;
        Objects.requireNonNull(str);
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzk)) {
            return false;
        }
        zzk zzkVar = (zzk) obj;
        return this.zzc == zzkVar.zzc && Objects.equals(this.zza, zzkVar.zza) && Objects.equals(this.zzb, zzkVar.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, Integer.valueOf(this.zzc));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalState{basicPhysicalTickerErrorRateMicrosPerSecond=");
        sb.append(this.zza);
        sb.append(", timeSignalIntentAction='");
        sb.append(this.zzb);
        sb.append(", clockErrorConfidence=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.zzc, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeLongObject(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.zza(parcel, 3, 4);
        parcel.writeInt(this.zzc);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
