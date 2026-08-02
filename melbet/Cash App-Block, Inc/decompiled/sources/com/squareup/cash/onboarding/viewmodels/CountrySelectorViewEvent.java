package com.squareup.cash.onboarding.viewmodels;

import com.squareup.protos.common.countries.Country;

/* loaded from: classes6.dex */
public abstract class CountrySelectorViewEvent {

    public final class Dismissed extends CountrySelectorViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -844484615;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    public final class Selected extends CountrySelectorViewEvent {
        public final Country country;

        public Selected(Country country) {
            this.country = country;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Selected) && this.country == ((Selected) obj).country;
        }

        public final int hashCode() {
            return this.country.hashCode();
        }

        public final String toString() {
            return "Selected(country=" + this.country + ")";
        }
    }
}
