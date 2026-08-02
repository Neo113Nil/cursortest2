package com.squareup.cash.activity.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.ReceiptSection;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ReceiptViewEvent {

    public final class AvatarClicked implements ReceiptViewEvent {
        public static final AvatarClicked INSTANCE = new AvatarClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AvatarClicked);
        }

        public final int hashCode() {
            return 161202767;
        }

        public final String toString() {
            return "AvatarClicked";
        }
    }

    public final class ButtonClicked implements ReceiptViewEvent {
        public final PaymentHistoryButton button;

        public ButtonClicked(PaymentHistoryButton paymentHistoryButton) {
            paymentHistoryButton.getClass();
            this.button = paymentHistoryButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonClicked) && Intrinsics.areEqual(this.button, ((ButtonClicked) obj).button);
        }

        public final int hashCode() {
            return this.button.hashCode();
        }

        public final String toString() {
            return "ButtonClicked(button=" + this.button + ")";
        }
    }

    public final class Close implements ReceiptViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -2083647303;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class OpenMap implements ReceiptViewEvent {
        public final String address;

        public OpenMap(String str) {
            str.getClass();
            this.address = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMap) && Intrinsics.areEqual(this.address, ((OpenMap) obj).address);
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenMap(address=", this.address, ")");
        }
    }

    public final class OpenTimelineDetailsOverlay implements ReceiptViewEvent {
        public final ReceiptSection.TimelineEntry.EventDetailsOverlay details;

        public OpenTimelineDetailsOverlay(ReceiptSection.TimelineEntry.EventDetailsOverlay eventDetailsOverlay) {
            this.details = eventDetailsOverlay;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTimelineDetailsOverlay) && Intrinsics.areEqual(this.details, ((OpenTimelineDetailsOverlay) obj).details);
        }

        public final int hashCode() {
            ReceiptSection.TimelineEntry.EventDetailsOverlay eventDetailsOverlay = this.details;
            if (eventDetailsOverlay == null) {
                return 0;
            }
            return eventDetailsOverlay.hashCode();
        }

        public final String toString() {
            return "OpenTimelineDetailsOverlay(details=" + this.details + ")";
        }
    }

    public final class OpenUrl implements ReceiptViewEvent {
        public final String url;

        public OpenUrl(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && Intrinsics.areEqual(this.url, ((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    public final class ReactionSelected implements ReceiptViewEvent {
        public final String reaction;

        public ReactionSelected(String str) {
            str.getClass();
            this.reaction = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReactionSelected) && Intrinsics.areEqual(this.reaction, ((ReactionSelected) obj).reaction);
        }

        public final int hashCode() {
            return this.reaction.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReactionSelected(reaction=", this.reaction, ")");
        }
    }

    public final class ReactionSelectorDismissed implements ReceiptViewEvent {
        public static final ReactionSelectorDismissed INSTANCE = new ReactionSelectorDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReactionSelectorDismissed);
        }

        public final int hashCode() {
            return -1124433758;
        }

        public final String toString() {
            return "ReactionSelectorDismissed";
        }
    }

    public final class Refresh implements ReceiptViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return -711386788;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class UpsellClicked implements ReceiptViewEvent {
        public final ReceiptSection.Upsell upsell;

        public UpsellClicked(ReceiptSection.Upsell upsell) {
            upsell.getClass();
            this.upsell = upsell;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpsellClicked) && Intrinsics.areEqual(this.upsell, ((UpsellClicked) obj).upsell);
        }

        public final int hashCode() {
            return this.upsell.hashCode();
        }

        public final String toString() {
            return "UpsellClicked(upsell=" + this.upsell + ")";
        }
    }

    public final class UpsellViewed implements ReceiptViewEvent {
        public final ReceiptSection.Upsell upsell;

        public UpsellViewed(ReceiptSection.Upsell upsell) {
            upsell.getClass();
            this.upsell = upsell;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpsellViewed) && Intrinsics.areEqual(this.upsell, ((UpsellViewed) obj).upsell);
        }

        public final int hashCode() {
            return this.upsell.hashCode();
        }

        public final String toString() {
            return "UpsellViewed(upsell=" + this.upsell + ")";
        }
    }
}
