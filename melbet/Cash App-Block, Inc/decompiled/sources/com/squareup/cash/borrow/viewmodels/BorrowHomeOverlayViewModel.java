package com.squareup.cash.borrow.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BorrowHomeOverlayViewModel {

    public interface BulletinInfo extends BorrowHomeOverlayViewModel {
    }

    public final class InfoModal implements BulletinInfo {
        public final String detailText;
        public final String dismissButtonText;
        public final Image image;
        public final String primaryActionUrl;
        public final String primaryButtonText;
        public final String primaryText;

        public InfoModal(Image image, String str, String str2, String str3, String str4, String str5) {
            str.getClass();
            str3.getClass();
            this.image = image;
            this.primaryText = str;
            this.detailText = str2;
            this.primaryButtonText = str3;
            this.primaryActionUrl = str4;
            this.dismissButtonText = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoModal)) {
                return false;
            }
            InfoModal infoModal = (InfoModal) obj;
            return Intrinsics.areEqual(this.image, infoModal.image) && Intrinsics.areEqual(this.primaryText, infoModal.primaryText) && Intrinsics.areEqual(this.detailText, infoModal.detailText) && Intrinsics.areEqual(this.primaryButtonText, infoModal.primaryButtonText) && Intrinsics.areEqual(this.primaryActionUrl, infoModal.primaryActionUrl) && Intrinsics.areEqual(this.dismissButtonText, infoModal.dismissButtonText);
        }

        public final int hashCode() {
            Image image = this.image;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.primaryText);
            String str = this.detailText;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.primaryButtonText);
            String str2 = this.primaryActionUrl;
            int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dismissButtonText;
            return hashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.image, "InfoModal(image=", ", primaryText=", this.primaryText, ", detailText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.detailText, ", primaryButtonText=", this.primaryButtonText, ", primaryActionUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.primaryActionUrl, ", dismissButtonText=", this.dismissButtonText, ")");
        }
    }

    public final class InfoSheet implements BulletinInfo {
        public final InfoSheetAsset asset;
        public final List bullets;
        public final String detailText;
        public final BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment detailTextAlignment;
        public final String footerText;
        public final Color headerTintColor;
        public final String primaryText;
        public final BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment primaryTextAlignment;
        public final SheetButton sheetButton;
        public final Timeline timeline;

        public interface InfoSheetAsset {

            public final class IconAsset implements InfoSheetAsset {
                public final BorrowAppletBulletinsTile.Data.Bulletin.Icon icon;

                public IconAsset(BorrowAppletBulletinsTile.Data.Bulletin.Icon icon) {
                    icon.getClass();
                    this.icon = icon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof IconAsset) && this.icon == ((IconAsset) obj).icon;
                }

                public final int hashCode() {
                    return this.icon.hashCode();
                }

                public final String toString() {
                    return "IconAsset(icon=" + this.icon + ")";
                }
            }

            public final class ImageAsset implements InfoSheetAsset {
                public final Image image;

                public ImageAsset(Image image) {
                    image.getClass();
                    this.image = image;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ImageAsset) && Intrinsics.areEqual(this.image, ((ImageAsset) obj).image);
                }

                public final int hashCode() {
                    return this.image.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "ImageAsset(image=", ")");
                }
            }
        }

        public InfoSheet(Color color, InfoSheetAsset infoSheetAsset, String str, BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment, String str2, BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment2, List list, Timeline timeline, String str3, SheetButton sheetButton) {
            str.getClass();
            list.getClass();
            this.headerTintColor = color;
            this.asset = infoSheetAsset;
            this.primaryText = str;
            this.primaryTextAlignment = textAlignment;
            this.detailText = str2;
            this.detailTextAlignment = textAlignment2;
            this.bullets = list;
            this.timeline = timeline;
            this.footerText = str3;
            this.sheetButton = sheetButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoSheet)) {
                return false;
            }
            InfoSheet infoSheet = (InfoSheet) obj;
            return Intrinsics.areEqual(this.headerTintColor, infoSheet.headerTintColor) && Intrinsics.areEqual(this.asset, infoSheet.asset) && Intrinsics.areEqual(this.primaryText, infoSheet.primaryText) && this.primaryTextAlignment == infoSheet.primaryTextAlignment && Intrinsics.areEqual(this.detailText, infoSheet.detailText) && this.detailTextAlignment == infoSheet.detailTextAlignment && Intrinsics.areEqual(this.bullets, infoSheet.bullets) && Intrinsics.areEqual(this.timeline, infoSheet.timeline) && Intrinsics.areEqual(this.footerText, infoSheet.footerText) && Intrinsics.areEqual(this.sheetButton, infoSheet.sheetButton);
        }

        public final int hashCode() {
            Color color = this.headerTintColor;
            int hashCode = (color == null ? 0 : color.hashCode()) * 31;
            InfoSheetAsset infoSheetAsset = this.asset;
            int hashCode2 = (this.primaryTextAlignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (infoSheetAsset == null ? 0 : infoSheetAsset.hashCode())) * 31, 31, this.primaryText)) * 31;
            String str = this.detailText;
            int m = Recorder$$ExternalSyntheticOutline2.m((this.detailTextAlignment.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.bullets);
            Timeline timeline = this.timeline;
            int hashCode3 = (m + (timeline == null ? 0 : timeline.hashCode())) * 31;
            String str2 = this.footerText;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            SheetButton sheetButton = this.sheetButton;
            return hashCode4 + (sheetButton != null ? sheetButton.hashCode() : 0);
        }

        public final String toString() {
            return "InfoSheet(headerTintColor=" + this.headerTintColor + ", asset=" + this.asset + ", primaryText=" + this.primaryText + ", primaryTextAlignment=" + this.primaryTextAlignment + ", detailText=" + this.detailText + ", detailTextAlignment=" + this.detailTextAlignment + ", bullets=" + this.bullets + ", timeline=" + this.timeline + ", footerText=" + this.footerText + ", sheetButton=" + this.sheetButton + ")";
        }
    }

    public final class LoanDetails implements RepaymentSheet {
        public final String cdfVariant;
        public final String detailsButtonTitle;
        public final String primaryText;
        public final SheetButton repaymentButton;
        public final List rows;
        public final String secondaryText;
        public final Color secondaryTextTintColor;
        public final Timeline timeline;
        public final String timelineButtonTitle;
        public final String token;

        public LoanDetails(String str, String str2, String str3, Color color, List list, Timeline timeline, String str4, String str5, SheetButton sheetButton, String str6) {
            str2.getClass();
            str3.getClass();
            list.getClass();
            timeline.getClass();
            str4.getClass();
            str5.getClass();
            this.token = str;
            this.primaryText = str2;
            this.secondaryText = str3;
            this.secondaryTextTintColor = color;
            this.rows = list;
            this.timeline = timeline;
            this.timelineButtonTitle = str4;
            this.detailsButtonTitle = str5;
            this.repaymentButton = sheetButton;
            this.cdfVariant = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoanDetails)) {
                return false;
            }
            LoanDetails loanDetails = (LoanDetails) obj;
            return Intrinsics.areEqual(this.token, loanDetails.token) && Intrinsics.areEqual(this.primaryText, loanDetails.primaryText) && Intrinsics.areEqual(this.secondaryText, loanDetails.secondaryText) && Intrinsics.areEqual(this.secondaryTextTintColor, loanDetails.secondaryTextTintColor) && Intrinsics.areEqual(this.rows, loanDetails.rows) && Intrinsics.areEqual(this.timeline, loanDetails.timeline) && Intrinsics.areEqual(this.timelineButtonTitle, loanDetails.timelineButtonTitle) && Intrinsics.areEqual(this.detailsButtonTitle, loanDetails.detailsButtonTitle) && Intrinsics.areEqual(this.repaymentButton, loanDetails.repaymentButton) && Intrinsics.areEqual(this.cdfVariant, loanDetails.cdfVariant);
        }

        public final int hashCode() {
            String str = this.token;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.primaryText), 31, this.secondaryText);
            Color color = this.secondaryTextTintColor;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.timeline.hashCode() + Recorder$$ExternalSyntheticOutline2.m((m + (color == null ? 0 : color.hashCode())) * 31, 31, this.rows)) * 31, 31, this.timelineButtonTitle), 31, this.detailsButtonTitle);
            SheetButton sheetButton = this.repaymentButton;
            int hashCode = (m2 + (sheetButton == null ? 0 : sheetButton.hashCode())) * 31;
            String str2 = this.cdfVariant;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LoanDetails(token=", this.token, ", primaryText=", this.primaryText, ", secondaryText=");
            m.append(this.secondaryText);
            m.append(", secondaryTextTintColor=");
            m.append(this.secondaryTextTintColor);
            m.append(", rows=");
            m.append(this.rows);
            m.append(", timeline=");
            m.append(this.timeline);
            m.append(", timelineButtonTitle=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.timelineButtonTitle, ", detailsButtonTitle=", this.detailsButtonTitle, ", repaymentButton=");
            m.append(this.repaymentButton);
            m.append(", cdfVariant=");
            m.append(this.cdfVariant);
            m.append(")");
            return m.toString();
        }
    }

    public final class LoanRepaymentSelection implements RepaymentSheet {
        public final ArrayList choices;
        public final String title;

        public final class Choice {
            public final String accessoryText;
            public final Icon icon;
            public final String primaryText;
            public final String secondaryText;
            public final SheetButtonAction tapAction;

            public interface Icon {

                public final class Simple implements Icon {
                    public final LoanRepaymentSelectionData.Choice.Icon value;

                    public Simple(LoanRepaymentSelectionData.Choice.Icon icon) {
                        icon.getClass();
                        this.value = icon;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Simple) && this.value == ((Simple) obj).value;
                    }

                    public final int hashCode() {
                        return this.value.hashCode();
                    }

                    public final String toString() {
                        return "Simple(value=" + this.value + ")";
                    }
                }

                public final class Text implements Icon {
                    public final String value;

                    public Text(String str) {
                        str.getClass();
                        this.value = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
                    }

                    public final int hashCode() {
                        return this.value.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(value=", this.value, ")");
                    }
                }
            }

            public Choice(Icon icon, String str, String str2, String str3, SheetButtonAction sheetButtonAction) {
                str.getClass();
                this.icon = icon;
                this.primaryText = str;
                this.secondaryText = str2;
                this.accessoryText = str3;
                this.tapAction = sheetButtonAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Choice)) {
                    return false;
                }
                Choice choice = (Choice) obj;
                return this.icon.equals(choice.icon) && Intrinsics.areEqual(this.primaryText, choice.primaryText) && Intrinsics.areEqual(this.secondaryText, choice.secondaryText) && Intrinsics.areEqual(this.accessoryText, choice.accessoryText) && this.tapAction.equals(choice.tapAction);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.primaryText);
                String str = this.secondaryText;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.accessoryText;
                return this.tapAction.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Choice(icon=");
                sb.append(this.icon);
                sb.append(", primaryText=");
                sb.append(this.primaryText);
                sb.append(", secondaryText=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.secondaryText, ", accessoryText=", this.accessoryText, ", tapAction=");
                sb.append(this.tapAction);
                sb.append(")");
                return sb.toString();
            }
        }

        public LoanRepaymentSelection(String str, ArrayList arrayList) {
            str.getClass();
            this.title = str;
            this.choices = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoanRepaymentSelection)) {
                return false;
            }
            LoanRepaymentSelection loanRepaymentSelection = (LoanRepaymentSelection) obj;
            return Intrinsics.areEqual(this.title, loanRepaymentSelection.title) && this.choices.equals(loanRepaymentSelection.choices);
        }

        public final int hashCode() {
            return this.choices.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.choices, "LoanRepaymentSelection(title=", this.title, ", choices=", ")");
        }
    }

    public interface RepaymentSheet extends BorrowHomeOverlayViewModel {
    }

    public final class SheetButton {
        public final SheetButtonAction action;
        public final String title;

        public SheetButton(SheetButtonAction sheetButtonAction, String str) {
            str.getClass();
            this.title = str;
            this.action = sheetButtonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SheetButton)) {
                return false;
            }
            SheetButton sheetButton = (SheetButton) obj;
            return Intrinsics.areEqual(this.title, sheetButton.title) && this.action.equals(sheetButton.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "SheetButton(title=" + this.title + ", action=" + this.action + ")";
        }
    }
}
