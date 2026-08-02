package com.squareup.cash.onboarding.backend;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OnboardableCountries {
    public final Set countries;

    public OnboardableCountries(Set set) {
        set.getClass();
        this.countries = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardableCountries) && Intrinsics.areEqual(this.countries, ((OnboardableCountries) obj).countries);
    }

    public final int hashCode() {
        return this.countries.hashCode();
    }

    public final String toString() {
        return "OnboardableCountries(countries=" + this.countries + ")";
    }
}
