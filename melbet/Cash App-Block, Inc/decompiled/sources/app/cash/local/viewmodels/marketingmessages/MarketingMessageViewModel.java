package app.cash.local.viewmodels.marketingmessages;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MarketingMessageViewModel {
    public final LocalColor backgroundColor;
    public final LocalColor foregroundColor;
    public final LocalImage image;
    public final LocalImage logo;
    public final String logoFallbackLetter;
    public final String messageText;
    public final OfferPreview offer;
    public final String username;

    public final class OfferPreview {
        public final DiscountOffer discountOffer;
        public final LocalImage icon;
        public final boolean isRedeemed;
        public final SheetDetails sheet;
        public final String title;
        public final String validity;

        public final class DiscountOffer {
            public final String newAmount;
            public final String originalAmount;

            public DiscountOffer(String str, String str2) {
                str2.getClass();
                this.originalAmount = str;
                this.newAmount = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DiscountOffer)) {
                    return false;
                }
                DiscountOffer discountOffer = (DiscountOffer) obj;
                return this.originalAmount.equals(discountOffer.originalAmount) && Intrinsics.areEqual(this.newAmount, discountOffer.newAmount);
            }

            public final int hashCode() {
                return this.newAmount.hashCode() + (this.originalAmount.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("DiscountOffer(originalAmount=", this.originalAmount, ", newAmount=", this.newAmount, ")");
            }
        }

        public final class SheetDetails {
            public final String discountDescription;
            public final String eligibleItems;
            public final String redemptionInstructions;
            public final String subtitle;
            public final String termsText;
            public final String title;
            public final String validThroughText;

            public SheetDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                str.getClass();
                this.title = str;
                this.subtitle = str2;
                this.eligibleItems = str3;
                this.validThroughText = str4;
                this.redemptionInstructions = str5;
                this.termsText = str6;
                this.discountDescription = str7;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SheetDetails)) {
                    return false;
                }
                SheetDetails sheetDetails = (SheetDetails) obj;
                return Intrinsics.areEqual(this.title, sheetDetails.title) && this.subtitle.equals(sheetDetails.subtitle) && Intrinsics.areEqual(this.eligibleItems, sheetDetails.eligibleItems) && Intrinsics.areEqual(this.validThroughText, sheetDetails.validThroughText) && Intrinsics.areEqual(this.redemptionInstructions, sheetDetails.redemptionInstructions) && Intrinsics.areEqual(this.termsText, sheetDetails.termsText) && Intrinsics.areEqual(this.discountDescription, sheetDetails.discountDescription);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
                String str = this.eligibleItems;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.validThroughText;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.redemptionInstructions;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.termsText;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.discountDescription;
                return hashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SheetDetails(title=", this.title, ", subtitle=", this.subtitle, ", eligibleItems=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.eligibleItems, ", validThroughText=", this.validThroughText, ", redemptionInstructions=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.redemptionInstructions, ", termsText=", this.termsText, ", discountDescription=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.discountDescription, ")");
            }
        }

        public OfferPreview(LocalImage localImage, String str, DiscountOffer discountOffer, String str2, SheetDetails sheetDetails, boolean z) {
            str.getClass();
            str2.getClass();
            this.icon = localImage;
            this.title = str;
            this.discountOffer = discountOffer;
            this.validity = str2;
            this.sheet = sheetDetails;
            this.isRedeemed = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferPreview)) {
                return false;
            }
            OfferPreview offerPreview = (OfferPreview) obj;
            return Intrinsics.areEqual(this.icon, offerPreview.icon) && Intrinsics.areEqual(this.title, offerPreview.title) && Intrinsics.areEqual(this.discountOffer, offerPreview.discountOffer) && Intrinsics.areEqual(this.validity, offerPreview.validity) && this.sheet.equals(offerPreview.sheet) && this.isRedeemed == offerPreview.isRedeemed;
        }

        public final int hashCode() {
            LocalImage localImage = this.icon;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.title);
            DiscountOffer discountOffer = this.discountOffer;
            return Boolean.hashCode(this.isRedeemed) + ((this.sheet.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (discountOffer != null ? discountOffer.hashCode() : 0)) * 31, 31, this.validity)) * 31);
        }

        public final String toString() {
            return "OfferPreview(icon=" + this.icon + ", title=" + this.title + ", discountOffer=" + this.discountOffer + ", validity=" + this.validity + ", sheet=" + this.sheet + ", isRedeemed=" + this.isRedeemed + ")";
        }
    }

    public MarketingMessageViewModel(LocalImage localImage, String str, String str2, LocalColor localColor, LocalColor localColor2, LocalImage localImage2, OfferPreview offerPreview) {
        Character ch;
        str.getClass();
        localColor.getClass();
        localColor2.getClass();
        this.image = localImage;
        this.username = str;
        this.messageText = str2;
        this.backgroundColor = localColor;
        this.foregroundColor = localColor2;
        this.logo = localImage2;
        this.offer = offerPreview;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                ch = null;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt != '$') {
                ch = Character.valueOf(charAt);
                break;
            }
            i++;
        }
        String valueOf = ch != null ? String.valueOf(ch.charValue()) : null;
        String upperCase = (valueOf == null ? "" : valueOf).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.logoFallbackLetter = upperCase;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingMessageViewModel)) {
            return false;
        }
        MarketingMessageViewModel marketingMessageViewModel = (MarketingMessageViewModel) obj;
        return Intrinsics.areEqual(this.image, marketingMessageViewModel.image) && Intrinsics.areEqual(this.username, marketingMessageViewModel.username) && Intrinsics.areEqual(this.messageText, marketingMessageViewModel.messageText) && Intrinsics.areEqual(this.backgroundColor, marketingMessageViewModel.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, marketingMessageViewModel.foregroundColor) && Intrinsics.areEqual(this.logo, marketingMessageViewModel.logo) && Intrinsics.areEqual(this.offer, marketingMessageViewModel.offer);
    }

    public final int hashCode() {
        LocalImage localImage = this.image;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.username);
        String str = this.messageText;
        int hashCode = (this.foregroundColor.hashCode() + ((this.backgroundColor.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        LocalImage localImage2 = this.logo;
        int hashCode2 = (hashCode + (localImage2 == null ? 0 : localImage2.hashCode())) * 31;
        OfferPreview offerPreview = this.offer;
        return hashCode2 + (offerPreview != null ? offerPreview.hashCode() : 0);
    }

    public final String toString() {
        return "MarketingMessageViewModel(image=" + this.image + ", username=" + this.username + ", messageText=" + this.messageText + ", backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", logo=" + this.logo + ", offer=" + this.offer + ")";
    }
}
