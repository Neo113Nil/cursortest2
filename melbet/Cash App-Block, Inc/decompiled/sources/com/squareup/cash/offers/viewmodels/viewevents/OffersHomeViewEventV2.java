package com.squareup.cash.offers.viewmodels.viewevents;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface OffersHomeViewEventV2 {

    public final class BackClicked implements OffersHomeViewEventV2 {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return -2120164649;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class GreenStatusClicked implements OffersHomeViewEventV2 {
        public final String offerId;

        public GreenStatusClicked(String str) {
            this.offerId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GreenStatusClicked) && this.offerId.equals(((GreenStatusClicked) obj).offerId);
        }

        public final int hashCode() {
            return this.offerId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GreenStatusClicked(offerId=", this.offerId, ")");
        }
    }

    public final class OfferAdded implements OffersHomeViewEventV2 {
        public final boolean isCAP;
        public final String offerId;

        public OfferAdded(String str, boolean z) {
            this.offerId = str;
            this.isCAP = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferAdded)) {
                return false;
            }
            OfferAdded offerAdded = (OfferAdded) obj;
            return this.offerId.equals(offerAdded.offerId) && this.isCAP == offerAdded.isCAP;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isCAP) + (this.offerId.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("OfferAdded(offerId=", this.offerId, ", isCAP=", ")", this.isCAP);
        }
    }

    public final class OfferClicked implements OffersHomeViewEventV2 {
        public final String offerId;

        public OfferClicked(String str) {
            this.offerId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferClicked) && this.offerId.equals(((OfferClicked) obj).offerId);
        }

        public final int hashCode() {
            return this.offerId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfferClicked(offerId=", this.offerId, ")");
        }
    }

    public final class OfferRemoved implements OffersHomeViewEventV2 {
        public final String offerId;

        public OfferRemoved(String str) {
            this.offerId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OfferRemoved) && this.offerId.equals(((OfferRemoved) obj).offerId);
        }

        public final int hashCode() {
            return this.offerId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfferRemoved(offerId=", this.offerId, ")");
        }
    }

    public final class OfferViewed implements OffersHomeViewEventV2 {
        public final String offerId;
        public final int rowIndex;
        public final String sectionId;
        public final int sectionRowIndex;

        public OfferViewed(String str, int i, int i2, String str2) {
            this.offerId = str;
            this.sectionId = str2;
            this.sectionRowIndex = i;
            this.rowIndex = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferViewed)) {
                return false;
            }
            OfferViewed offerViewed = (OfferViewed) obj;
            return this.offerId.equals(offerViewed.offerId) && this.sectionId.equals(offerViewed.sectionId) && this.sectionRowIndex == offerViewed.sectionRowIndex && this.rowIndex == offerViewed.rowIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.rowIndex) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sectionRowIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.offerId.hashCode() * 31, 31, this.sectionId), 31);
        }

        public final String toString() {
            return Recorder$$ExternalSyntheticOutline1.m(this.sectionRowIndex, this.rowIndex, ", rowIndex=", ")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OfferViewed(offerId=", this.offerId, ", sectionId=", this.sectionId, ", sectionRowIndex="));
        }
    }

    public final class UrlClicked implements OffersHomeViewEventV2 {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UrlClicked);
        }

        public final int hashCode() {
            return 1103917665;
        }

        public final String toString() {
            return "UrlClicked(url=https://cash.app/help/6484-cash-app-pay)";
        }
    }
}
