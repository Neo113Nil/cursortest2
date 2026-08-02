package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes5.dex */
public interface PersonalInfoSectionViewEvent {

    /* loaded from: classes7.dex */
    public final class AddressClick implements PersonalInfoSectionViewEvent {
        public static final AddressClick INSTANCE = new AddressClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddressClick);
        }

        public final int hashCode() {
            return -1955412739;
        }

        public final String toString() {
            return "AddressClick";
        }
    }

    /* loaded from: classes7.dex */
    public final class BannerCtaClick implements PersonalInfoSectionViewEvent {
        public static final BannerCtaClick INSTANCE = new BannerCtaClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BannerCtaClick);
        }

        public final int hashCode() {
            return -2042386067;
        }

        public final String toString() {
            return "BannerCtaClick";
        }
    }

    /* loaded from: classes7.dex */
    public final class IdentityVerificationClick implements PersonalInfoSectionViewEvent {
        public static final IdentityVerificationClick INSTANCE = new IdentityVerificationClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IdentityVerificationClick);
        }

        public final int hashCode() {
            return 1147928230;
        }

        public final String toString() {
            return "IdentityVerificationClick";
        }
    }

    /* loaded from: classes7.dex */
    public final class ShowLegalNameHelperSection implements PersonalInfoSectionViewEvent {
        public static final ShowLegalNameHelperSection INSTANCE = new ShowLegalNameHelperSection();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowLegalNameHelperSection);
        }

        public final int hashCode() {
            return 1053738873;
        }

        public final String toString() {
            return "ShowLegalNameHelperSection";
        }
    }
}
