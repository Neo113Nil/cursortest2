package com.squareup.cash.merchant.viewmodels;

import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SquareLoyaltyDetailsViewEvent {

    public final class GoBack implements SquareLoyaltyDetailsViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 289740940;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class LoyaltyGenericTreeElementsViewEvent implements SquareLoyaltyDetailsViewEvent {
        public final GenericTreeElementsViewEvent event;

        public LoyaltyGenericTreeElementsViewEvent(GenericTreeElementsViewEvent genericTreeElementsViewEvent) {
            genericTreeElementsViewEvent.getClass();
            this.event = genericTreeElementsViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoyaltyGenericTreeElementsViewEvent) && Intrinsics.areEqual(this.event, ((LoyaltyGenericTreeElementsViewEvent) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "LoyaltyGenericTreeElementsViewEvent(event=" + this.event + ")";
        }
    }

    public final class SquareLoyaltyDetailsPlaceholderAction implements SquareLoyaltyDetailsViewEvent {
        public final AnalyticsEvent analytics;
        public final String url;

        public SquareLoyaltyDetailsPlaceholderAction(String str, AnalyticsEvent analyticsEvent) {
            str.getClass();
            this.url = str;
            this.analytics = analyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SquareLoyaltyDetailsPlaceholderAction)) {
                return false;
            }
            SquareLoyaltyDetailsPlaceholderAction squareLoyaltyDetailsPlaceholderAction = (SquareLoyaltyDetailsPlaceholderAction) obj;
            return Intrinsics.areEqual(this.url, squareLoyaltyDetailsPlaceholderAction.url) && Intrinsics.areEqual(this.analytics, squareLoyaltyDetailsPlaceholderAction.analytics);
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            AnalyticsEvent analyticsEvent = this.analytics;
            return hashCode + (analyticsEvent == null ? 0 : analyticsEvent.hashCode());
        }

        public final String toString() {
            return "SquareLoyaltyDetailsPlaceholderAction(url=" + this.url + ", analytics=" + this.analytics + ")";
        }
    }

    public final class SquareLoyaltyDetailsPlaceholderView implements SquareLoyaltyDetailsViewEvent {
        public final AnalyticsEvent analytics;

        public SquareLoyaltyDetailsPlaceholderView(AnalyticsEvent analyticsEvent) {
            this.analytics = analyticsEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SquareLoyaltyDetailsPlaceholderView) && Intrinsics.areEqual(this.analytics, ((SquareLoyaltyDetailsPlaceholderView) obj).analytics);
        }

        public final int hashCode() {
            AnalyticsEvent analyticsEvent = this.analytics;
            if (analyticsEvent == null) {
                return 0;
            }
            return analyticsEvent.hashCode();
        }

        public final String toString() {
            return "SquareLoyaltyDetailsPlaceholderView(analytics=" + this.analytics + ")";
        }
    }
}
