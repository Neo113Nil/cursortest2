package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes7.dex */
public abstract class PersonalInfoConfirmationDialogEvent {

    public final class Confirm extends PersonalInfoConfirmationDialogEvent {
        public static final Confirm INSTANCE = new Confirm();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Confirm);
        }

        public final int hashCode() {
            return -2083149574;
        }

        public final String toString() {
            return "Confirm";
        }
    }

    public final class ReviewLater extends PersonalInfoConfirmationDialogEvent {
        public static final ReviewLater INSTANCE = new ReviewLater();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReviewLater);
        }

        public final int hashCode() {
            return 438290254;
        }

        public final String toString() {
            return "ReviewLater";
        }
    }
}
