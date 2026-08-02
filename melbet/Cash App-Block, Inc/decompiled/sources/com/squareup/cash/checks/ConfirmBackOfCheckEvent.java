package com.squareup.cash.checks;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class ConfirmBackOfCheckEvent {

    public final class CallToActionClick extends ConfirmBackOfCheckEvent {
        public static final CallToActionClick INSTANCE = new CallToActionClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CallToActionClick);
        }

        public final int hashCode() {
            return -83477302;
        }

        public final String toString() {
            return "CallToActionClick";
        }
    }

    public final class CloseClick extends ConfirmBackOfCheckEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return -1245369217;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class ConfirmCheckChange extends ConfirmBackOfCheckEvent {
        public final boolean isChecked;

        public ConfirmCheckChange(boolean z) {
            this.isChecked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmCheckChange) && this.isChecked == ((ConfirmCheckChange) obj).isChecked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ConfirmCheckChange(isChecked=", ")", this.isChecked);
        }
    }
}
