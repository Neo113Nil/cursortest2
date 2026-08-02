package com.squareup.cash.discover.promotiondetails.viewmodels;

import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapButton;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PromotionDetailsViewEvent {

    public final class Click implements PromotionDetailsViewEvent {
        public final String actionUrl;
        public final String buttonText;
        public final DetailsPageInteractTapButton.DetailsPageButtonLocation location;

        public Click(String str, String str2, DetailsPageInteractTapButton.DetailsPageButtonLocation detailsPageButtonLocation) {
            str.getClass();
            this.actionUrl = str;
            this.buttonText = str2;
            this.location = detailsPageButtonLocation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Click)) {
                return false;
            }
            Click click = (Click) obj;
            return Intrinsics.areEqual(this.actionUrl, click.actionUrl) && this.buttonText.equals(click.buttonText) && this.location == click.location;
        }

        public final int hashCode() {
            return this.location.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.actionUrl.hashCode() * 31, 31, this.buttonText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Click(actionUrl=", this.actionUrl, ", buttonText=", this.buttonText, ", location=");
            m.append(this.location);
            m.append(")");
            return m.toString();
        }
    }

    public final class Close implements PromotionDetailsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -775046979;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ShareStarted implements PromotionDetailsViewEvent {
        public static final ShareStarted INSTANCE = new ShareStarted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareStarted);
        }

        public final int hashCode() {
            return -1334563523;
        }

        public final String toString() {
            return "ShareStarted";
        }
    }

    public final class ViewedTreehouseContent implements PromotionDetailsViewEvent {
        public static final ViewedTreehouseContent INSTANCE = new ViewedTreehouseContent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ViewedTreehouseContent);
        }

        public final int hashCode() {
            return -1542517290;
        }

        public final String toString() {
            return "ViewedTreehouseContent";
        }
    }
}
