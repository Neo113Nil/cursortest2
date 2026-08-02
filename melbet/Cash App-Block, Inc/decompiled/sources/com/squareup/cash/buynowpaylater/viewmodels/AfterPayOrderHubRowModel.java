package com.squareup.cash.buynowpaylater.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AfterPayOrderHubRowModel {

    public final class HeaderModel extends AfterPayOrderHubRowModel {
        public final InfoTileCardViewModel infoTileCard;
        public final TextWithIcon subtitle;
        public final TextModel title;
        public final TextWithIcon totalOwedDetail;
        public final TextModel totalOwedTitle;

        public HeaderModel(TextModel textModel, TextWithIcon textWithIcon, TextModel textModel2, TextWithIcon textWithIcon2, InfoTileCardViewModel infoTileCardViewModel) {
            this.title = textModel;
            this.subtitle = textWithIcon;
            this.totalOwedTitle = textModel2;
            this.totalOwedDetail = textWithIcon2;
            this.infoTileCard = infoTileCardViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderModel)) {
                return false;
            }
            HeaderModel headerModel = (HeaderModel) obj;
            return this.title.equals(headerModel.title) && Intrinsics.areEqual(this.subtitle, headerModel.subtitle) && Intrinsics.areEqual(this.totalOwedTitle, headerModel.totalOwedTitle) && Intrinsics.areEqual(this.totalOwedDetail, headerModel.totalOwedDetail) && Intrinsics.areEqual(this.infoTileCard, headerModel.infoTileCard);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextWithIcon textWithIcon = this.subtitle;
            int hashCode2 = (hashCode + (textWithIcon == null ? 0 : textWithIcon.hashCode())) * 31;
            TextModel textModel = this.totalOwedTitle;
            int hashCode3 = (hashCode2 + (textModel == null ? 0 : textModel.hashCode())) * 31;
            TextWithIcon textWithIcon2 = this.totalOwedDetail;
            int hashCode4 = (hashCode3 + (textWithIcon2 == null ? 0 : textWithIcon2.hashCode())) * 31;
            InfoTileCardViewModel infoTileCardViewModel = this.infoTileCard;
            return hashCode4 + (infoTileCardViewModel != null ? infoTileCardViewModel.hashCode() : 0);
        }

        public final String toString() {
            return "HeaderModel(title=" + this.title + ", subtitle=" + this.subtitle + ", totalOwedTitle=" + this.totalOwedTitle + ", totalOwedDetail=" + this.totalOwedDetail + ", infoTileCard=" + this.infoTileCard + ")";
        }
    }

    public final class PaymentRowModel extends AfterPayOrderHubRowModel {
        public final ActionButton actionButton;
        public final Avatar avatar;
        public final String id;
        public final TextWithIcon infoIcon;
        public final TextModel rightAlignedText;
        public final String rowActionUrl;
        public final TextModel subtitle;
        public final TextModel title;

        public PaymentRowModel(String str, Avatar avatar, TextModel textModel, TextModel textModel2, String str2, ActionButton actionButton, TextModel textModel3, TextWithIcon textWithIcon) {
            str.getClass();
            this.id = str;
            this.avatar = avatar;
            this.title = textModel;
            this.subtitle = textModel2;
            this.rowActionUrl = str2;
            this.actionButton = actionButton;
            this.rightAlignedText = textModel3;
            this.infoIcon = textWithIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentRowModel)) {
                return false;
            }
            PaymentRowModel paymentRowModel = (PaymentRowModel) obj;
            return Intrinsics.areEqual(this.id, paymentRowModel.id) && this.avatar.equals(paymentRowModel.avatar) && this.title.equals(paymentRowModel.title) && Intrinsics.areEqual(this.subtitle, paymentRowModel.subtitle) && Intrinsics.areEqual(this.rowActionUrl, paymentRowModel.rowActionUrl) && Intrinsics.areEqual(this.actionButton, paymentRowModel.actionButton) && Intrinsics.areEqual(this.rightAlignedText, paymentRowModel.rightAlignedText) && Intrinsics.areEqual(this.infoIcon, paymentRowModel.infoIcon);
        }

        public final int hashCode() {
            int hashCode = (this.title.hashCode() + ((this.avatar.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
            TextModel textModel = this.subtitle;
            int hashCode2 = (hashCode + (textModel == null ? 0 : textModel.hashCode())) * 31;
            String str = this.rowActionUrl;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ActionButton actionButton = this.actionButton;
            int hashCode4 = (hashCode3 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            TextModel textModel2 = this.rightAlignedText;
            int hashCode5 = (hashCode4 + (textModel2 == null ? 0 : textModel2.hashCode())) * 31;
            TextWithIcon textWithIcon = this.infoIcon;
            return hashCode5 + (textWithIcon != null ? textWithIcon.hashCode() : 0);
        }

        public final String toString() {
            return "PaymentRowModel(id=" + this.id + ", avatar=" + this.avatar + ", title=" + this.title + ", subtitle=" + this.subtitle + ", rowActionUrl=" + this.rowActionUrl + ", actionButton=" + this.actionButton + ", rightAlignedText=" + this.rightAlignedText + ", infoIcon=" + this.infoIcon + ")";
        }
    }

    public final class SectionHeaderModel extends AfterPayOrderHubRowModel {
        public final TextModel title;

        public SectionHeaderModel(TextModel textModel) {
            this.title = textModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SectionHeaderModel) && this.title.equals(((SectionHeaderModel) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return "SectionHeaderModel(title=" + this.title + ")";
        }
    }
}
