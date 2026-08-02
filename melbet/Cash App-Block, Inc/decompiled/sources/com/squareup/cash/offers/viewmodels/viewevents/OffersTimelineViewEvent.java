package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.offers.SheetDismissOrigin;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public interface OffersTimelineViewEvent {

    public final class ActionUrl implements OffersTimelineViewEvent, OffersAnalyticsViewEvent {
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

    public final class CloseTimelineSheet implements OffersTimelineViewEvent {
        public final SheetDismissOrigin sheetDismissOrigin;

        public CloseTimelineSheet(SheetDismissOrigin sheetDismissOrigin) {
            this.sheetDismissOrigin = sheetDismissOrigin;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseTimelineSheet) && this.sheetDismissOrigin == ((CloseTimelineSheet) obj).sheetDismissOrigin;
        }

        public final int hashCode() {
            return this.sheetDismissOrigin.hashCode();
        }

        public final String toString() {
            return "CloseTimelineSheet(sheetDismissOrigin=" + this.sheetDismissOrigin + ")";
        }
    }
}
