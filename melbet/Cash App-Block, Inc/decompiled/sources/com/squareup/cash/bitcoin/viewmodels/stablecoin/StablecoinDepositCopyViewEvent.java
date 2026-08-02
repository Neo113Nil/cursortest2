package com.squareup.cash.bitcoin.viewmodels.stablecoin;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface StablecoinDepositCopyViewEvent {

    public final class Back implements StablecoinDepositCopyViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 652548162;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Copy implements StablecoinDepositCopyViewEvent {
        public static final Copy INSTANCE = new Copy();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Copy);
        }

        public final int hashCode() {
            return 652591824;
        }

        public final String toString() {
            return "Copy";
        }
    }
}
