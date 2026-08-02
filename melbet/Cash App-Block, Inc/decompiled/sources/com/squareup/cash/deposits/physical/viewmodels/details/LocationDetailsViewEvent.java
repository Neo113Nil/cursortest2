package com.squareup.cash.deposits.physical.viewmodels.details;

/* loaded from: classes6.dex */
public abstract class LocationDetailsViewEvent {

    public final class BackOrOutsideClick extends LocationDetailsViewEvent {
        public static final BackOrOutsideClick INSTANCE = new BackOrOutsideClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackOrOutsideClick);
        }

        public final int hashCode() {
            return 99825272;
        }

        public final String toString() {
            return "BackOrOutsideClick";
        }
    }

    public final class CopyAddressClick extends LocationDetailsViewEvent {
        public static final CopyAddressClick INSTANCE = new CopyAddressClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CopyAddressClick);
        }

        public final int hashCode() {
            return 652699156;
        }

        public final String toString() {
            return "CopyAddressClick";
        }
    }

    public final class FeeInformationClick extends LocationDetailsViewEvent {
        public static final FeeInformationClick INSTANCE = new FeeInformationClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FeeInformationClick);
        }

        public final int hashCode() {
            return 819685239;
        }

        public final String toString() {
            return "FeeInformationClick";
        }
    }

    public final class PrimaryButtonClick extends LocationDetailsViewEvent {
        public static final PrimaryButtonClick INSTANCE = new PrimaryButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClick);
        }

        public final int hashCode() {
            return -301989025;
        }

        public final String toString() {
            return "PrimaryButtonClick";
        }
    }

    public final class SecondaryButtonClick extends LocationDetailsViewEvent {
        public static final SecondaryButtonClick INSTANCE = new SecondaryButtonClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecondaryButtonClick);
        }

        public final int hashCode() {
            return 994917869;
        }

        public final String toString() {
            return "SecondaryButtonClick";
        }
    }
}
