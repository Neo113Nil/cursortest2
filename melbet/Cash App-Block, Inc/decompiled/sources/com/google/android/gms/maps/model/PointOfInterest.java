package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.zzac;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new zzac(21);
    public final LatLng latLng;
    public final String name;
    public final String placeId;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.latLng = latLng;
        this.placeId = str;
        this.name = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeParcelable(parcel, 2, this.latLng, i);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.placeId);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.name);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
