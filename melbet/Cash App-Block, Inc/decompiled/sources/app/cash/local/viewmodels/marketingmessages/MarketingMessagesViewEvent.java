package app.cash.local.viewmodels.marketingmessages;

import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.MarketingMessageData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface MarketingMessagesViewEvent {

    public final class BackClicked implements MarketingMessagesViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 785882751;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class BrandProfileClicked implements MarketingMessagesViewEvent {
        public final BrandSpot brandSpot;

        public BrandProfileClicked(BrandSpot brandSpot) {
            brandSpot.getClass();
            this.brandSpot = brandSpot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BrandProfileClicked) && Intrinsics.areEqual(this.brandSpot, ((BrandProfileClicked) obj).brandSpot);
        }

        public final int hashCode() {
            return this.brandSpot.hashCode();
        }

        public final String toString() {
            return "BrandProfileClicked(brandSpot=" + this.brandSpot + ")";
        }
    }

    public final class FilterSelected implements MarketingMessagesViewEvent {
        public final MessageFilter filter;

        public FilterSelected(MessageFilter messageFilter) {
            this.filter = messageFilter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FilterSelected) && this.filter == ((FilterSelected) obj).filter;
        }

        public final int hashCode() {
            return this.filter.hashCode();
        }

        public final String toString() {
            return "FilterSelected(filter=" + this.filter + ")";
        }
    }

    public final class MessageClicked implements MarketingMessagesViewEvent {
        public final MarketingMessageData marketingMessage;

        public MessageClicked(MarketingMessageData marketingMessageData) {
            this.marketingMessage = marketingMessageData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MessageClicked) && this.marketingMessage.equals(((MessageClicked) obj).marketingMessage);
        }

        public final int hashCode() {
            return this.marketingMessage.hashCode();
        }

        public final String toString() {
            return "MessageClicked(marketingMessage=" + this.marketingMessage + ")";
        }
    }
}
