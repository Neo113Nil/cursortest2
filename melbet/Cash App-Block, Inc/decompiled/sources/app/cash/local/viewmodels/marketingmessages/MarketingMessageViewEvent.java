package app.cash.local.viewmodels.marketingmessages;

/* loaded from: classes3.dex */
public interface MarketingMessageViewEvent {

    public final class CtaOnClick implements MarketingMessageViewEvent {
        public static final CtaOnClick INSTANCE = new CtaOnClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaOnClick);
        }

        public final int hashCode() {
            return -1160360995;
        }

        public final String toString() {
            return "CtaOnClick";
        }
    }

    public final class DismissOnClick implements MarketingMessageViewEvent {
        public static final DismissOnClick INSTANCE = new DismissOnClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissOnClick);
        }

        public final int hashCode() {
            return -1134932957;
        }

        public final String toString() {
            return "DismissOnClick";
        }
    }

    public final class OfferSheetOpened implements MarketingMessageViewEvent {
        public static final OfferSheetOpened INSTANCE = new OfferSheetOpened();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfferSheetOpened);
        }

        public final int hashCode() {
            return -172053296;
        }

        public final String toString() {
            return "OfferSheetOpened";
        }
    }

    public final class TermsOnClick implements MarketingMessageViewEvent {
        public static final TermsOnClick INSTANCE = new TermsOnClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TermsOnClick);
        }

        public final int hashCode() {
            return 1145358214;
        }

        public final String toString() {
            return "TermsOnClick";
        }
    }
}
