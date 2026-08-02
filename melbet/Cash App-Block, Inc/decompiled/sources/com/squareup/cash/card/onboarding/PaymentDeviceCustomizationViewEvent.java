package com.squareup.cash.card.onboarding;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PaymentDeviceCustomizationViewEvent {

    public final class Close implements PaymentDeviceCustomizationViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1351466719;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CloseProductDetailsPage implements PaymentDeviceCustomizationViewEvent {
        public static final CloseProductDetailsPage INSTANCE = new CloseProductDetailsPage();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseProductDetailsPage);
        }

        public final int hashCode() {
            return 1538518659;
        }

        public final String toString() {
            return "CloseProductDetailsPage";
        }
    }

    public final class DeviceOptionSelected implements PaymentDeviceCustomizationViewEvent {
        public final String paymentDeviceId;

        public DeviceOptionSelected(String str) {
            str.getClass();
            this.paymentDeviceId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceOptionSelected) && Intrinsics.areEqual(this.paymentDeviceId, ((DeviceOptionSelected) obj).paymentDeviceId);
        }

        public final int hashCode() {
            return this.paymentDeviceId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceOptionSelected(paymentDeviceId=", this.paymentDeviceId, ")");
        }
    }

    public final class PersonalizeCard implements PaymentDeviceCustomizationViewEvent {
        public final String paymentDeviceId;

        public PersonalizeCard(String str) {
            str.getClass();
            this.paymentDeviceId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PersonalizeCard) && Intrinsics.areEqual(this.paymentDeviceId, ((PersonalizeCard) obj).paymentDeviceId);
        }

        public final int hashCode() {
            return this.paymentDeviceId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PersonalizeCard(paymentDeviceId=", this.paymentDeviceId, ")");
        }
    }

    public final class ProductDetailsPageShown implements PaymentDeviceCustomizationViewEvent {
        public final String paymentDeviceId;

        public ProductDetailsPageShown(String str) {
            str.getClass();
            this.paymentDeviceId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProductDetailsPageShown) && Intrinsics.areEqual(this.paymentDeviceId, ((ProductDetailsPageShown) obj).paymentDeviceId);
        }

        public final int hashCode() {
            return this.paymentDeviceId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProductDetailsPageShown(paymentDeviceId=", this.paymentDeviceId, ")");
        }
    }

    public final class SectionViewed implements PaymentDeviceCustomizationViewEvent {
        public final String paymentDeviceId;
        public final String sectionType;

        public SectionViewed(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.paymentDeviceId = str;
            this.sectionType = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionViewed)) {
                return false;
            }
            SectionViewed sectionViewed = (SectionViewed) obj;
            return Intrinsics.areEqual(this.paymentDeviceId, sectionViewed.paymentDeviceId) && Intrinsics.areEqual(this.sectionType, sectionViewed.sectionType);
        }

        public final int hashCode() {
            return this.sectionType.hashCode() + (this.paymentDeviceId.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("SectionViewed(paymentDeviceId=", this.paymentDeviceId, ", sectionType=", this.sectionType, ")");
        }
    }

    public final class TapProductDetailsPageButton implements PaymentDeviceCustomizationViewEvent {
        public final CtaAction ctaAction;
        public final String paymentDeviceId;

        public TapProductDetailsPageButton(String str, CtaAction ctaAction) {
            str.getClass();
            ctaAction.getClass();
            this.paymentDeviceId = str;
            this.ctaAction = ctaAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapProductDetailsPageButton)) {
                return false;
            }
            TapProductDetailsPageButton tapProductDetailsPageButton = (TapProductDetailsPageButton) obj;
            return Intrinsics.areEqual(this.paymentDeviceId, tapProductDetailsPageButton.paymentDeviceId) && Intrinsics.areEqual(this.ctaAction, tapProductDetailsPageButton.ctaAction);
        }

        public final int hashCode() {
            return this.ctaAction.hashCode() + (this.paymentDeviceId.hashCode() * 31);
        }

        public final String toString() {
            return "TapProductDetailsPageButton(paymentDeviceId=" + this.paymentDeviceId + ", ctaAction=" + this.ctaAction + ")";
        }
    }

    public final class TapProductDetailsPageLink implements PaymentDeviceCustomizationViewEvent {
        public final String url;

        public TapProductDetailsPageLink(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TapProductDetailsPageLink) && Intrinsics.areEqual(this.url, ((TapProductDetailsPageLink) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TapProductDetailsPageLink(url=", this.url, ")");
        }
    }
}
