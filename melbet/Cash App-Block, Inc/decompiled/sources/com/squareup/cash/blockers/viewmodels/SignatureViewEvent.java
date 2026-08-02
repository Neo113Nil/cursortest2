package com.squareup.cash.blockers.viewmodels;

import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.knotapi.knot.utilities.Constants;

/* loaded from: classes4.dex */
public abstract class SignatureViewEvent {

    public final class Back extends SignatureViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 280192540;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class Submit extends SignatureViewEvent {
        public final MaterialButton$$ExternalSyntheticLambda3 signatureProvider;

        public Submit(MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3) {
            this.signatureProvider = materialButton$$ExternalSyntheticLambda3;
        }
    }
}
