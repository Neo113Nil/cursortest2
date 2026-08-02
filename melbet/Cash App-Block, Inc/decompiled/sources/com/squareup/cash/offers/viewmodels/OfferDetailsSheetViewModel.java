package com.squareup.cash.offers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.shared.OffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.shared.OffersLinkViewModel;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class OfferDetailsSheetViewModel {

    public interface FooterSectionViewModel {

        public final class FooterButtons implements FooterSectionViewModel {
            public final OfferFooterButton primaryFooterButton;
            public final OfferFooterButton secondaryFooterButton;

            public FooterButtons(OfferFooterButton offerFooterButton, OfferFooterButton offerFooterButton2) {
                this.secondaryFooterButton = offerFooterButton;
                this.primaryFooterButton = offerFooterButton2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FooterButtons)) {
                    return false;
                }
                FooterButtons footerButtons = (FooterButtons) obj;
                return Intrinsics.areEqual(this.secondaryFooterButton, footerButtons.secondaryFooterButton) && this.primaryFooterButton.equals(footerButtons.primaryFooterButton);
            }

            public final int hashCode() {
                OfferFooterButton offerFooterButton = this.secondaryFooterButton;
                return this.primaryFooterButton.hashCode() + ((offerFooterButton == null ? 0 : offerFooterButton.hashCode()) * 31);
            }

            public final String toString() {
                return "FooterButtons(secondaryFooterButton=" + this.secondaryFooterButton + ", primaryFooterButton=" + this.primaryFooterButton + ")";
            }
        }

        public final class Loading implements FooterSectionViewModel {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -280662799;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public final class MessageText implements FooterSectionViewModel {
            public final String text;

            public MessageText(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MessageText) && Intrinsics.areEqual(this.text, ((MessageText) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MessageText(text=", this.text, ")");
            }
        }
    }

    public final class Loading extends OfferDetailsSheetViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1263297677;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class OfferDetailRow {
        public final FormattedDetailViewModel formattedDetail;
        public final Icon icon;

        public OfferDetailRow(Icon icon, FormattedDetailViewModel formattedDetailViewModel) {
            icon.getClass();
            this.icon = icon;
            this.formattedDetail = formattedDetailViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailRow)) {
                return false;
            }
            OfferDetailRow offerDetailRow = (OfferDetailRow) obj;
            return Intrinsics.areEqual(this.icon, offerDetailRow.icon) && this.formattedDetail.equals(offerDetailRow.formattedDetail);
        }

        public final int hashCode() {
            return this.formattedDetail.hashCode() + (this.icon.hashCode() * 31);
        }

        public final String toString() {
            return "OfferDetailRow(icon=" + this.icon + ", formattedDetail=" + this.formattedDetail + ")";
        }
    }

    public final class OfferDetails extends OfferDetailsSheetViewModel {
        public final OffersAvatarViewModel avatarViewModel;
        public final ArrayList details;
        public final StyledText disclosureMarkdownText;
        public final FooterSectionViewModel footerSection;
        public final OffersAnalyticsEventSpec impressionEventSpec;
        public final boolean isSelected;
        public final FormattedDetailViewModel subtitleDetail;
        public final OffersLinkViewModel subtitleLink;
        public final StyledText termsMarkdownLink;
        public final String title;

        public OfferDetails(OffersAnalyticsEventSpec offersAnalyticsEventSpec, OffersAvatarViewModel offersAvatarViewModel, boolean z, String str, FormattedDetailViewModel formattedDetailViewModel, OffersLinkViewModel offersLinkViewModel, ArrayList arrayList, StyledText styledText, StyledText styledText2, FooterSectionViewModel footerSectionViewModel) {
            this.impressionEventSpec = offersAnalyticsEventSpec;
            this.avatarViewModel = offersAvatarViewModel;
            this.isSelected = z;
            this.title = str;
            this.subtitleDetail = formattedDetailViewModel;
            this.subtitleLink = offersLinkViewModel;
            this.details = arrayList;
            this.disclosureMarkdownText = styledText;
            this.termsMarkdownLink = styledText2;
            this.footerSection = footerSectionViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetails)) {
                return false;
            }
            OfferDetails offerDetails = (OfferDetails) obj;
            return Intrinsics.areEqual(this.impressionEventSpec, offerDetails.impressionEventSpec) && this.avatarViewModel.equals(offerDetails.avatarViewModel) && this.isSelected == offerDetails.isSelected && this.title.equals(offerDetails.title) && Intrinsics.areEqual(this.subtitleDetail, offerDetails.subtitleDetail) && this.subtitleLink.equals(offerDetails.subtitleLink) && this.details.equals(offerDetails.details) && Intrinsics.areEqual(this.disclosureMarkdownText, offerDetails.disclosureMarkdownText) && Intrinsics.areEqual(this.termsMarkdownLink, offerDetails.termsMarkdownLink) && Intrinsics.areEqual(this.footerSection, offerDetails.footerSection);
        }

        public final int hashCode() {
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = this.impressionEventSpec;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatarViewModel.hashCode() + ((offersAnalyticsEventSpec == null ? 0 : offersAnalyticsEventSpec.hashCode()) * 31)) * 31, 31, this.isSelected), 31, this.title);
            FormattedDetailViewModel formattedDetailViewModel = this.subtitleDetail;
            int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.details, (this.subtitleLink.hashCode() + ((m + (formattedDetailViewModel == null ? 0 : formattedDetailViewModel.hashCode())) * 31)) * 31, 31);
            StyledText styledText = this.disclosureMarkdownText;
            int hashCode = (m2 + (styledText == null ? 0 : styledText.hashCode())) * 31;
            StyledText styledText2 = this.termsMarkdownLink;
            int hashCode2 = (hashCode + (styledText2 == null ? 0 : styledText2.hashCode())) * 31;
            FooterSectionViewModel footerSectionViewModel = this.footerSection;
            return hashCode2 + (footerSectionViewModel != null ? footerSectionViewModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OfferDetails(impressionEventSpec=");
            sb.append(this.impressionEventSpec);
            sb.append(", avatarViewModel=");
            sb.append(this.avatarViewModel);
            sb.append(", isSelected=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.isSelected, ", title=", this.title, ", subtitleDetail=");
            sb.append(this.subtitleDetail);
            sb.append(", subtitleLink=");
            sb.append(this.subtitleLink);
            sb.append(", details=");
            sb.append(this.details);
            sb.append(", disclosureMarkdownText=");
            sb.append(this.disclosureMarkdownText);
            sb.append(", termsMarkdownLink=");
            sb.append(this.termsMarkdownLink);
            sb.append(", footerSection=");
            sb.append(this.footerSection);
            sb.append(")");
            return sb.toString();
        }
    }
}
