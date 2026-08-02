package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletPurchasesEmbeddedViewEvent {

    public final class FooterLinkTapped implements AfterpayAppletPurchasesEmbeddedViewEvent {
        public final String actionUrl;

        public FooterLinkTapped(String str) {
            str.getClass();
            this.actionUrl = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FooterLinkTapped) && Intrinsics.areEqual(this.actionUrl, ((FooterLinkTapped) obj).actionUrl);
        }

        public final int hashCode() {
            return this.actionUrl.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FooterLinkTapped(actionUrl=", this.actionUrl, ")");
        }
    }

    public final class Refresh implements AfterpayAppletPurchasesEmbeddedViewEvent {
        public static final Refresh INSTANCE = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 2071453267;
        }

        public final String toString() {
            return "Refresh";
        }
    }

    public final class SeeAllCompletedPurchases implements AfterpayAppletPurchasesEmbeddedViewEvent {
        public static final SeeAllCompletedPurchases INSTANCE = new SeeAllCompletedPurchases();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeAllCompletedPurchases);
        }

        public final int hashCode() {
            return 63357437;
        }

        public final String toString() {
            return "SeeAllCompletedPurchases";
        }
    }

    public final class SeeAllUpcomingPurchases implements AfterpayAppletPurchasesEmbeddedViewEvent {
        public static final SeeAllUpcomingPurchases INSTANCE = new SeeAllUpcomingPurchases();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SeeAllUpcomingPurchases);
        }

        public final int hashCode() {
            return -1296780640;
        }

        public final String toString() {
            return "SeeAllUpcomingPurchases";
        }
    }

    public final class TapBack implements AfterpayAppletPurchasesEmbeddedViewEvent {
        public static final TapBack INSTANCE = new TapBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TapBack);
        }

        public final int hashCode() {
            return -555222366;
        }

        public final String toString() {
            return "TapBack";
        }
    }

    public final class TryAgainTapped implements AfterpayAppletPurchasesEmbeddedViewEvent {
        public static final TryAgainTapped INSTANCE = new TryAgainTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TryAgainTapped);
        }

        public final int hashCode() {
            return 433337049;
        }

        public final String toString() {
            return "TryAgainTapped";
        }
    }
}
