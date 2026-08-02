package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersDetailsSheetViewEvent {

    public abstract class CloseWithError implements OffersDetailsSheetViewEvent {
    }

    public final class DismissSheet implements OffersDetailsSheetViewEvent {
        public static final DismissSheet INSTANCE = new DismissSheet();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissSheet);
        }

        public final int hashCode() {
            return 778922232;
        }

        public final String toString() {
            return "DismissSheet";
        }
    }

    public final class FooterMarkdownClicked implements OffersDetailsSheetViewEvent {
        public final String routeUrl;

        public FooterMarkdownClicked(String str) {
            str.getClass();
            this.routeUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterMarkdownClicked) && Intrinsics.areEqual(this.routeUrl, ((FooterMarkdownClicked) obj).routeUrl);
        }

        public final int hashCode() {
            return this.routeUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterMarkdownClicked(routeUrl=", this.routeUrl, ")");
        }
    }

    public final class LearnMoreClicked implements OffersDetailsSheetViewEvent, OffersAnalyticsViewEvent {
        public final ArrayList analyticsActionEventSpecs;
        public final String routeUrl;

        public LearnMoreClicked(String str, ArrayList arrayList) {
            this.routeUrl = str;
            this.analyticsActionEventSpecs = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LearnMoreClicked)) {
                return false;
            }
            LearnMoreClicked learnMoreClicked = (LearnMoreClicked) obj;
            return this.routeUrl.equals(learnMoreClicked.routeUrl) && this.analyticsActionEventSpecs.equals(learnMoreClicked.analyticsActionEventSpecs);
        }

        @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
        public final List getAnalyticsActionEventSpecs() {
            return this.analyticsActionEventSpecs;
        }

        public final int hashCode() {
            return this.analyticsActionEventSpecs.hashCode() + (this.routeUrl.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.analyticsActionEventSpecs, "LearnMoreClicked(routeUrl=", this.routeUrl, ", analyticsActionEventSpecs=", ")");
        }
    }

    public final class OfferActive implements OffersDetailsSheetViewEvent {
        public static final OfferActive INSTANCE = new OfferActive();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfferActive);
        }

        public final int hashCode() {
            return 1378425887;
        }

        public final String toString() {
            return "OfferActive";
        }
    }

    public interface OfferButtonEvent extends OffersDetailsSheetViewEvent {

        public final class ActionUrl implements OfferButtonEvent, OffersAnalyticsViewEvent {
            public final ArrayList analyticsActionEventSpecs;
            public final String url;

            public ActionUrl(String str, ArrayList arrayList) {
                this.url = str;
                this.analyticsActionEventSpecs = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionUrl)) {
                    return false;
                }
                ActionUrl actionUrl = (ActionUrl) obj;
                return this.url.equals(actionUrl.url) && this.analyticsActionEventSpecs.equals(actionUrl.analyticsActionEventSpecs);
            }

            @Override // com.squareup.cash.offers.viewmodels.viewevents.OffersAnalyticsViewEvent
            public final List getAnalyticsActionEventSpecs() {
                return this.analyticsActionEventSpecs;
            }

            public final int hashCode() {
                return this.analyticsActionEventSpecs.hashCode() + (this.url.hashCode() * 31);
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m(this.analyticsActionEventSpecs, "ActionUrl(url=", this.url, ", analyticsActionEventSpecs=", ")");
            }
        }

        public final class AddOffer implements OfferButtonEvent {
            public final ArrayList analyticsActionEventSpecs;
            public final String boostToken;

            public AddOffer(String str, ArrayList arrayList) {
                str.getClass();
                this.boostToken = str;
                this.analyticsActionEventSpecs = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddOffer)) {
                    return false;
                }
                AddOffer addOffer = (AddOffer) obj;
                return Intrinsics.areEqual(this.boostToken, addOffer.boostToken) && this.analyticsActionEventSpecs.equals(addOffer.analyticsActionEventSpecs);
            }

            public final int hashCode() {
                return this.analyticsActionEventSpecs.hashCode() + (this.boostToken.hashCode() * 31);
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m(this.analyticsActionEventSpecs, "AddOffer(boostToken=", this.boostToken, ", analyticsActionEventSpecs=", ")");
            }
        }

        public final class CashCardAction implements OfferButtonEvent {
            public final List analyticsActionEventSpecs;

            public CashCardAction(List list) {
                list.getClass();
                this.analyticsActionEventSpecs = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashCardAction) && Intrinsics.areEqual(this.analyticsActionEventSpecs, ((CashCardAction) obj).analyticsActionEventSpecs);
            }

            public final int hashCode() {
                return this.analyticsActionEventSpecs.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("CashCardAction(analyticsActionEventSpecs=", ")", this.analyticsActionEventSpecs);
            }
        }

        public final class Close implements OfferButtonEvent {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Close);
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "Close(triggerRefresh=false)";
            }
        }

        public final class RemoveOffer implements OfferButtonEvent {
            public final ArrayList analyticsActionEventSpecs;
            public final String boostToken;

            public RemoveOffer(String str, ArrayList arrayList) {
                str.getClass();
                this.boostToken = str;
                this.analyticsActionEventSpecs = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RemoveOffer)) {
                    return false;
                }
                RemoveOffer removeOffer = (RemoveOffer) obj;
                return Intrinsics.areEqual(this.boostToken, removeOffer.boostToken) && this.analyticsActionEventSpecs.equals(removeOffer.analyticsActionEventSpecs);
            }

            public final int hashCode() {
                return this.analyticsActionEventSpecs.hashCode() + (this.boostToken.hashCode() * 31);
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m(this.analyticsActionEventSpecs, "RemoveOffer(boostToken=", this.boostToken, ", analyticsActionEventSpecs=", ")");
            }
        }

        public final class SwapOffer implements OfferButtonEvent {
            public final ArrayList analyticsActionEventSpecs;
            public final String boostToken;

            public SwapOffer(String str, ArrayList arrayList) {
                str.getClass();
                this.boostToken = str;
                this.analyticsActionEventSpecs = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SwapOffer)) {
                    return false;
                }
                SwapOffer swapOffer = (SwapOffer) obj;
                return Intrinsics.areEqual(this.boostToken, swapOffer.boostToken) && this.analyticsActionEventSpecs.equals(swapOffer.analyticsActionEventSpecs);
            }

            public final int hashCode() {
                return this.analyticsActionEventSpecs.hashCode() + (this.boostToken.hashCode() * 31);
            }

            public final String toString() {
                return NavAction$$ExternalSyntheticOutline0.m(this.analyticsActionEventSpecs, "SwapOffer(boostToken=", this.boostToken, ", analyticsActionEventSpecs=", ")");
            }
        }
    }

    public final class OfferExpired implements OffersDetailsSheetViewEvent {
        public static final OfferExpired INSTANCE = new OfferExpired();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfferExpired);
        }

        public final int hashCode() {
            return -365908692;
        }

        public final String toString() {
            return "OfferExpired";
        }
    }

    public final class TermsClicked implements OffersDetailsSheetViewEvent {
        public final String routeUrl;

        public TermsClicked(String str) {
            str.getClass();
            this.routeUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TermsClicked) && Intrinsics.areEqual(this.routeUrl, ((TermsClicked) obj).routeUrl);
        }

        public final int hashCode() {
            return this.routeUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TermsClicked(routeUrl=", this.routeUrl, ")");
        }
    }
}
