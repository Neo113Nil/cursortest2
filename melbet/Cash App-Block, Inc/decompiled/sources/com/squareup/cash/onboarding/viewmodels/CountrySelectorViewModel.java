package com.squareup.cash.onboarding.viewmodels;

import com.squareup.protos.common.countries.Country;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CountrySelectorViewModel {
    public final List countries;
    public final Country selectedCountry;

    public CountrySelectorViewModel(List list, Country country) {
        list.getClass();
        this.countries = list;
        this.selectedCountry = country;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountrySelectorViewModel)) {
            return false;
        }
        CountrySelectorViewModel countrySelectorViewModel = (CountrySelectorViewModel) obj;
        return Intrinsics.areEqual(this.countries, countrySelectorViewModel.countries) && this.selectedCountry == countrySelectorViewModel.selectedCountry;
    }

    public final int hashCode() {
        int hashCode = this.countries.hashCode() * 31;
        Country country = this.selectedCountry;
        return hashCode + (country == null ? 0 : country.hashCode());
    }

    public final String toString() {
        return "CountrySelectorViewModel(countries=" + this.countries + ", selectedCountry=" + this.selectedCountry + ")";
    }
}
