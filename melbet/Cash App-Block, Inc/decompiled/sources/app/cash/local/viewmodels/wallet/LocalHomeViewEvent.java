package app.cash.local.viewmodels.wallet;

import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.OrderToken;
import app.cash.local.viewmodels.internal.HasOrderTokenEvent;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalHomeViewEvent {

    public final class ActiveOrderClicked implements LocalHomeViewEvent, HasOrderTokenEvent {
        public final String token;

        public ActiveOrderClicked(String str) {
            str.getClass();
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActiveOrderClicked) && Intrinsics.areEqual(this.token, ((ActiveOrderClicked) obj).token);
        }

        @Override // app.cash.local.viewmodels.internal.HasOrderTokenEvent
        /* renamed from: getToken-_iIA0Uw */
        public final String mo1296getToken_iIA0Uw() {
            return this.token;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ActiveOrderClicked(token=", OrderToken.m1280toStringimpl(this.token), ")");
        }
    }

    public final class AddMenuClicked implements LocalHomeViewEvent {
        public static final AddMenuClicked INSTANCE = new AddMenuClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddMenuClicked);
        }

        public final int hashCode() {
            return -1754234877;
        }

        public final String toString() {
            return "AddMenuClicked";
        }
    }

    public final class AllActiveOrdersClicked implements LocalHomeViewEvent {
        public static final AllActiveOrdersClicked INSTANCE = new AllActiveOrdersClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllActiveOrdersClicked);
        }

        public final int hashCode() {
            return 528469591;
        }

        public final String toString() {
            return "AllActiveOrdersClicked";
        }
    }

    public final class AllMarketingMessagesOnClick implements LocalHomeViewEvent {
        public static final AllMarketingMessagesOnClick INSTANCE = new AllMarketingMessagesOnClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllMarketingMessagesOnClick);
        }

        public final int hashCode() {
            return 1298650012;
        }

        public final String toString() {
            return "AllMarketingMessagesOnClick";
        }
    }

    public final class BrandCollectionAppletViewed implements LocalHomeViewEvent {
        public static final BrandCollectionAppletViewed INSTANCE = new BrandCollectionAppletViewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrandCollectionAppletViewed);
        }

        public final int hashCode() {
            return 1017327879;
        }

        public final String toString() {
            return "BrandCollectionAppletViewed";
        }
    }

    public final class CheckInClicked implements LocalHomeViewEvent {
        public static final CheckInClicked INSTANCE = new CheckInClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckInClicked);
        }

        public final int hashCode() {
            return 1564315830;
        }

        public final String toString() {
            return "CheckInClicked";
        }
    }

    public final class LocalCashClicked implements LocalHomeViewEvent {
        public static final LocalCashClicked INSTANCE = new LocalCashClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LocalCashClicked);
        }

        public final int hashCode() {
            return 1266156453;
        }

        public final String toString() {
            return "LocalCashClicked";
        }
    }

    public final class MapButtonClicked implements LocalHomeViewEvent {
        public static final MapButtonClicked INSTANCE = new MapButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapButtonClicked);
        }

        public final int hashCode() {
            return -568507595;
        }

        public final String toString() {
            return "MapButtonClicked";
        }
    }

    public final class MarketingMessageClicked implements LocalHomeViewEvent {
        public final MarketingMessageData marketingMessage;

        public MarketingMessageClicked(MarketingMessageData marketingMessageData) {
            this.marketingMessage = marketingMessageData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarketingMessageClicked) && this.marketingMessage.equals(((MarketingMessageClicked) obj).marketingMessage);
        }

        public final int hashCode() {
            return this.marketingMessage.hashCode();
        }

        public final String toString() {
            return "MarketingMessageClicked(marketingMessage=" + this.marketingMessage + ")";
        }
    }

    public final class OnboardingCtaClicked implements LocalHomeViewEvent {
        public static final OnboardingCtaClicked INSTANCE = new OnboardingCtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingCtaClicked);
        }

        public final int hashCode() {
            return 158478606;
        }

        public final String toString() {
            return "OnboardingCtaClicked";
        }
    }

    public final class PastOrderClicked implements LocalHomeViewEvent, HasOrderTokenEvent {
        public final String token;

        public PastOrderClicked(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PastOrderClicked) && this.token.equals(((PastOrderClicked) obj).token);
        }

        @Override // app.cash.local.viewmodels.internal.HasOrderTokenEvent
        /* renamed from: getToken-_iIA0Uw */
        public final String mo1296getToken_iIA0Uw() {
            return this.token;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PastOrderClicked(token=", OrderToken.m1280toStringimpl(this.token), ")");
        }
    }

    public final class Refresh implements LocalHomeViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 322647231;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class ReorderClicked implements LocalHomeViewEvent, HasOrderTokenEvent {
        public final String token;

        public ReorderClicked(String str) {
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReorderClicked) && this.token.equals(((ReorderClicked) obj).token);
        }

        @Override // app.cash.local.viewmodels.internal.HasOrderTokenEvent
        /* renamed from: getToken-_iIA0Uw */
        public final String mo1296getToken_iIA0Uw() {
            return this.token;
        }

        public final int hashCode() {
            return this.token.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReorderClicked(token=", OrderToken.m1280toStringimpl(this.token), ")");
        }
    }

    public final class TabToolbarEvent implements LocalHomeViewEvent {
        public final TabToolbarInternalViewEvent event;

        public TabToolbarEvent(TabToolbarInternalViewEvent tabToolbarInternalViewEvent) {
            tabToolbarInternalViewEvent.getClass();
            this.event = tabToolbarInternalViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabToolbarEvent) && Intrinsics.areEqual(this.event, ((TabToolbarEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "TabToolbarEvent(event=" + this.event + ")";
        }
    }

    public final class WalletCardClicked implements LocalHomeViewEvent {
        public final BrandSpot brandSpot;

        public WalletCardClicked(BrandSpot brandSpot) {
            brandSpot.getClass();
            this.brandSpot = brandSpot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WalletCardClicked) && Intrinsics.areEqual(this.brandSpot, ((WalletCardClicked) obj).brandSpot);
        }

        public final int hashCode() {
            return this.brandSpot.hashCode();
        }

        public final String toString() {
            return "WalletCardClicked(brandSpot=" + this.brandSpot + ")";
        }
    }
}
