package com.squareup.cash.family.familyhub.viewmodels;

/* loaded from: classes6.dex */
public interface SponsorLedInviteViewEvent {

    public final class CtaClicked implements SponsorLedInviteViewEvent {
        public static final CtaClicked INSTANCE = new CtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClicked);
        }

        public final int hashCode() {
            return 721210292;
        }

        public final String toString() {
            return "CtaClicked";
        }
    }

    public final class TapBack implements SponsorLedInviteViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -1278183283;
        }

        public final String toString() {
            return "TapBack";
        }
    }
}
