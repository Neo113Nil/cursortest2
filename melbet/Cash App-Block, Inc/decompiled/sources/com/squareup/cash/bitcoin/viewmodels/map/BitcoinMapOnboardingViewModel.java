package com.squareup.cash.bitcoin.viewmodels.map;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public interface BitcoinMapOnboardingViewModel {

    public final class Loaded implements BitcoinMapOnboardingViewModel {
        public final boolean canPayUsingLightning;

        public Loaded(boolean z) {
            this.canPayUsingLightning = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.canPayUsingLightning == ((Loaded) obj).canPayUsingLightning;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.canPayUsingLightning);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Loaded(canPayUsingLightning=", ")", this.canPayUsingLightning);
        }
    }

    public final class Loading implements BitcoinMapOnboardingViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1364013770;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
