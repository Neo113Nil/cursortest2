package com.squareup.cash.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.protos.common.countries.Country;

/* loaded from: classes6.dex */
public final class SelectedCountry implements Parcelable {
    public static final Parcelable.Creator<SelectedCountry> CREATOR = new P2PListScreen.Creator(2);
    public final Country country;

    public SelectedCountry(Country country) {
        country.getClass();
        this.country = country;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectedCountry) && this.country == ((SelectedCountry) obj).country;
    }

    public final Country getCountry() {
        return this.country;
    }

    public final int hashCode() {
        return this.country.hashCode();
    }

    public final String toString() {
        return "SelectedCountry(country=" + this.country + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.country.name());
    }
}
