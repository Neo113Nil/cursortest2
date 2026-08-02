package com.squareup.cash.blockers.actions.viewevents;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public abstract class BlockerActionDialogActionViewEvent {

    public final class Back extends BlockerActionDialogActionViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return 1690113714;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class PrimaryButton extends BlockerActionDialogActionViewEvent {
        public static final PrimaryButton INSTANCE = new PrimaryButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButton);
        }

        public final int hashCode() {
            return -1495344535;
        }

        public final String toString() {
            return "PrimaryButton";
        }
    }

    public final class SecondaryButton extends BlockerActionDialogActionViewEvent {
        public static final SecondaryButton INSTANCE = new SecondaryButton();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButton);
        }

        public final int hashCode() {
            return -1108340965;
        }

        public final String toString() {
            return "SecondaryButton";
        }
    }
}
