package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new zzac(11);
    public final Status zza;
    public final LocationSettingsStates zzb;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.zza = status;
        this.zzb = locationSettingsStates;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 1, this.zza, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.zzb, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
