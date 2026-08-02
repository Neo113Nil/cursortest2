package com.squareup.cash.checks;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public abstract class ConfirmFrontOfCheckEvent {

    public final class CallToActionClick extends ConfirmFrontOfCheckEvent {
        public static final CallToActionClick INSTANCE = new CallToActionClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CallToActionClick);
        }

        public final int hashCode() {
            return -98368114;
        }

        public final String toString() {
            return "CallToActionClick";
        }
    }

    public final class CloseClick extends ConfirmFrontOfCheckEvent {
        public static final CloseClick INSTANCE = new CloseClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClick);
        }

        public final int hashCode() {
            return 2029713467;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public final class ConfirmCheckChange extends ConfirmFrontOfCheckEvent {
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
