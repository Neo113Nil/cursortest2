package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersDetailsSheetViewEventV2 {

    public final class AddOffers implements OffersDetailsSheetViewEventV2 {
        public final String boostToken;

        public AddOffers(String str) {
            this.boostToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddOffers) && this.boostToken.equals(((AddOffers) obj).boostToken);
        }

        public final int hashCode() {
            return this.boostToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddOffers(boostToken=", this.boostToken, ")");
        }
    }

    public final class AppLinkClicked implements OffersDetailsSheetViewEventV2 {
        public final String packageName;
        public final String url;

        public AppLinkClicked(String str, String str2) {
            this.url = str;
            this.packageName = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppLinkClicked)) {
                return false;
            }
            AppLinkClicked appLinkClicked = (AppLinkClicked) obj;
            return this.url.equals(appLinkClicked.url) && this.packageName.equals(appLinkClicked.packageName);
        }

        public final int hashCode() {
            return this.packageName.hashCode() + (this.url.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("AppLinkClicked(url=", this.url, ", packageName=", this.packageName, ")");
        }
    }

    public final class OpenBenefitsScreen implements OffersDetailsSheetViewEventV2 {
        public static final OpenBenefitsScreen INSTANCE = new OpenBenefitsScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenBenefitsScreen);
        }

        public final int hashCode() {
            return -452984935;
        }

        public final String toString() {
            return "OpenBenefitsScreen";
        }
    }

    public final class OpenGreenStatusUpsell implements OffersDetailsSheetViewEventV2 {
        public static final OpenGreenStatusUpsell INSTANCE = new OpenGreenStatusUpsell();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenGreenStatusUpsell);
        }

        public final int hashCode() {
            return -61010255;
        }

        public final String toString() {
            return "OpenGreenStatusUpsell";
        }
    }

    public final class OpenOffersTimeline implements OffersDetailsSheetViewEventV2 {
        public static final OpenOffersTimeline INSTANCE = new OpenOffersTimeline();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenOffersTimeline);
        }

        public final int hashCode() {
            return 1806324809;
        }

        public final String toString() {
            return "OpenOffersTimeline";
        }
    }

    public final class RemoveOffers implements OffersDetailsSheetViewEventV2 {
        public final String boostToken;

        public RemoveOffers(String str) {
            this.boostToken = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveOffers) && this.boostToken.equals(((RemoveOffers) obj).boostToken);
        }

        public final int hashCode() {
            return this.boostToken.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoveOffers(boostToken=", this.boostToken, ")");
        }
    }

    public final class SheetDismissed implements OffersDetailsSheetViewEventV2 {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return 1984443889;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }

    public final class UrlClicked implements OffersDetailsSheetViewEventV2 {
        public final String url;

        public UrlClicked(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UrlClicked) && Intrinsics.areEqual(this.url, ((UrlClicked) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UrlClicked(url=", this.url, ")");
        }
    }
}
