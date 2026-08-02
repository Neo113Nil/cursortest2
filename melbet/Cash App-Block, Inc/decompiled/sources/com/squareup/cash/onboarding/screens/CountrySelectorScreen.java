package com.squareup.cash.onboarding.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.nearby.viewmodels.ListSection;
import com.squareup.protos.common.countries.Country;

/* loaded from: classes.dex */
public final class CountrySelectorScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<CountrySelectorScreen> CREATOR = new ListSection.Creator(29);
    public final Country selectedCountry;

    public CountrySelectorScreen(Country country) {
        this.selectedCountry = country;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CountrySelectorScreen) && this.selectedCountry == ((CountrySelectorScreen) obj).selectedCountry;
    }

    public final int hashCode() {
        Country country = this.selectedCountry;
        if (country == null) {
            return 0;
        }
        return country.hashCode();
    }

    public final String toString() {
        return "CountrySelectorScreen(selectedCountry=" + this.selectedCountry + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Country country = this.selectedCountry;
        if (country == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(country.name());
        }
    }
}
