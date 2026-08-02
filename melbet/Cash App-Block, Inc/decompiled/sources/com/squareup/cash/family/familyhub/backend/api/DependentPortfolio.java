package com.squareup.cash.family.familyhub.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes6.dex */
public interface DependentPortfolio {

    public final class FailedToLoad implements DependentPortfolio {
        public static final FailedToLoad INSTANCE = new FailedToLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FailedToLoad);
        }

        public final int hashCode() {
            return -75001792;
        }

        public final String toString() {
            return "FailedToLoad";
        }
    }

    public final class Loaded implements DependentPortfolio {
        public final List investmentHoldings;

        public Loaded(List list) {
            this.investmentHoldings = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.investmentHoldings.equals(((Loaded) obj).investmentHoldings);
        }

        public final int hashCode() {
            return this.investmentHoldings.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(investmentHoldings=", ")", this.investmentHoldings);
        }
    }

    public final class Loading implements DependentPortfolio {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1809564762;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
