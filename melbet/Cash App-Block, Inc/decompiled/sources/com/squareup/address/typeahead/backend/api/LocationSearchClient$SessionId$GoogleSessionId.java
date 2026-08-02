package com.squareup.address.typeahead.backend.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.zzdi;
import com.google.android.play.core.review.zzb;

/* loaded from: classes4.dex */
public final class LocationSearchClient$SessionId$GoogleSessionId implements Parcelable {
    public static final Parcelable.Creator<LocationSearchClient$SessionId$GoogleSessionId> CREATOR = new zzb(17);
    public final zzdi token;

    public LocationSearchClient$SessionId$GoogleSessionId(zzdi zzdiVar) {
        zzdiVar.getClass();
        this.token = zzdiVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.token, i);
    }
}
