package com.squareup.cash.investing.viewmodels.ordertype.autoinvest;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public abstract class InvestingRecurringPurchaseReceiptViewModel {

    public final class Content extends InvestingRecurringPurchaseReceiptViewModel {
        public final ColorModel accentColor;
        public final String cancelButtonLabel;
        public final String nextPurchaseDate;
        public final String nextPurchaseTime;
        public final String purchaseAmount;
        public final String recurringFrequency;
        public final boolean showCancelButtonLabel;
        public final String title;
        public final LinkScanner titleIcon;

        public Content(LinkScanner linkScanner, String str, String str2, String str3, String str4, String str5, String str6, boolean z, ColorModel colorModel) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str6.getClass();
            colorModel.getClass();
            this.titleIcon = linkScanner;
            this.title = str;
            this.purchaseAmount = str2;
            this.recurringFrequency = str3;
            this.nextPurchaseTime = str4;
            this.nextPurchaseDate = str5;
            this.cancelButtonLabel = str6;
            this.showCancelButtonLabel = z;
            this.accentColor = colorModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.titleIcon, content.titleIcon) && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.purchaseAmount, content.purchaseAmount) && Intrinsics.areEqual(this.recurringFrequency, content.recurringFrequency) && this.nextPurchaseTime.equals(content.nextPurchaseTime) && this.nextPurchaseDate.equals(content.nextPurchaseDate) && Intrinsics.areEqual(this.cancelButtonLabel, content.cancelButtonLabel) && this.showCancelButtonLabel == content.showCancelButtonLabel && Intrinsics.areEqual(this.accentColor, content.accentColor);
        }

        public final int hashCode() {
            LinkScanner linkScanner = this.titleIcon;
            return this.accentColor.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((linkScanner == null ? 0 : linkScanner.hashCode()) * 31, 31, this.title), 31, this.purchaseAmount), 31, this.recurringFrequency), 31, this.nextPurchaseTime), 31, this.nextPurchaseDate), 31, this.cancelButtonLabel), 31, this.showCancelButtonLabel);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(titleIcon=");
            sb.append(this.titleIcon);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", purchaseAmount=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.purchaseAmount, ", recurringFrequency=", this.recurringFrequency, ", nextPurchaseTime=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.nextPurchaseTime, ", nextPurchaseDate=", this.nextPurchaseDate, ", cancelButtonLabel=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.cancelButtonLabel, ", showCancelButtonLabel=", this.showCancelButtonLabel, ", accentColor=");
            return SVG$Unit$EnumUnboxingLocalUtility.m(sb, this.accentColor, ")");
        }
    }

    public final class Loading extends InvestingRecurringPurchaseReceiptViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -693233981;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
