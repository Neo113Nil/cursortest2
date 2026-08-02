package com.squareup.cash.activity.viewmodels;

import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface ItemAccessory {

    public final class Amount implements ItemAccessory {
        public final String text;
        public final PaymentHistoryData.AmountTreatment treatment;

        public Amount(String str, PaymentHistoryData.AmountTreatment amountTreatment) {
            str.getClass();
            amountTreatment.getClass();
            this.text = str;
            this.treatment = amountTreatment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.areEqual(this.text, amount.text) && this.treatment == amount.treatment;
        }

        public final int hashCode() {
            return this.treatment.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "Amount(text=" + this.text + ", treatment=" + this.treatment + ")";
        }
    }

    public final class Button implements ItemAccessory {
        public final String accessibilityText;
        public final Icons icon;
        public final PaymentHistoryData.InlineButtonProminence prominence;
        public final String text;

        public Button(String str, Icons icons, PaymentHistoryData.InlineButtonProminence inlineButtonProminence, String str2) {
            str.getClass();
            inlineButtonProminence.getClass();
            this.text = str;
            this.icon = icons;
            this.prominence = inlineButtonProminence;
            this.accessibilityText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(this.text, button.text) && this.icon == button.icon && this.prominence == button.prominence && Intrinsics.areEqual(this.accessibilityText, button.accessibilityText);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            Icons icons = this.icon;
            int hashCode2 = (this.prominence.hashCode() + ((hashCode + (icons == null ? 0 : icons.hashCode())) * 31)) * 31;
            String str = this.accessibilityText;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "Button(text=" + this.text + ", icon=" + this.icon + ", prominence=" + this.prominence + ", accessibilityText=" + this.accessibilityText + ")";
        }
    }

    public final class DualAmounts implements ItemAccessory {
        public final Amount primary;
        public final Amount secondary;

        public DualAmounts(Amount amount, Amount amount2) {
            this.primary = amount;
            this.secondary = amount2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DualAmounts)) {
                return false;
            }
            DualAmounts dualAmounts = (DualAmounts) obj;
            return this.primary.equals(dualAmounts.primary) && this.secondary.equals(dualAmounts.secondary);
        }

        public final int hashCode() {
            return this.secondary.hashCode() + (this.primary.hashCode() * 31);
        }

        public final String toString() {
            return "DualAmounts(primary=" + this.primary + ", secondary=" + this.secondary + ")";
        }
    }

    public final class PortraitImage implements ItemAccessory {
        public final String amount;
        public final String fallbackButtonText;
        public final Icons fallbackIcon;
        public final String imageUrl;
        public final ColorModel textColor;

        public PortraitImage(String str, String str2, Icons icons, String str3, ColorModel.Accented accented) {
            this.imageUrl = str;
            this.fallbackButtonText = str2;
            this.fallbackIcon = icons;
            this.amount = str3;
            this.textColor = accented;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PortraitImage)) {
                return false;
            }
            PortraitImage portraitImage = (PortraitImage) obj;
            return this.imageUrl.equals(portraitImage.imageUrl) && Intrinsics.areEqual(this.fallbackButtonText, portraitImage.fallbackButtonText) && this.fallbackIcon == portraitImage.fallbackIcon && this.amount.equals(portraitImage.amount) && Intrinsics.areEqual(this.textColor, portraitImage.textColor);
        }

        public final int hashCode() {
            int hashCode = this.imageUrl.hashCode() * 961;
            String str = this.fallbackButtonText;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.fallbackIcon.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.amount);
            ColorModel colorModel = this.textColor;
            return m + (colorModel != null ? colorModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PortraitImage(imageUrl=", this.imageUrl, ", contentDescription=null, fallbackButtonText=", this.fallbackButtonText, ", fallbackIcon=");
            m.append(this.fallbackIcon);
            m.append(", amount=");
            m.append(this.amount);
            m.append(", textColor=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(m, this.textColor, ")");
        }
    }

    public final class Progress implements ItemAccessory {
        public static final Progress INSTANCE = new Progress();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Progress);
        }

        public final int hashCode() {
            return -440163698;
        }

        public final String toString() {
            return "Progress";
        }
    }
}
