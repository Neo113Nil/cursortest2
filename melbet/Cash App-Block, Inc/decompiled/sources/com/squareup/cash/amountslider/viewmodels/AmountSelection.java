package com.squareup.cash.amountslider.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class AmountSelection extends AmountSelectorWidgetModel.Item {

    /* loaded from: classes6.dex */
    public interface HasAmount {
        AmountSelection copyAsSelected();

        long getAmount();
    }

    public final class TradeAll extends AmountSelection implements HasAmount {
        public final long amount;
        public final String buttonText;
        public final boolean isSelected;
        public final String shareUnits;

        public TradeAll(long j, String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.amount = j;
            this.buttonText = str;
            this.shareUnits = str2;
            this.isSelected = z;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection.HasAmount
        public final AmountSelection copyAsSelected() {
            String str = this.buttonText;
            str.getClass();
            String str2 = this.shareUnits;
            str2.getClass();
            return new TradeAll(this.amount, str, str2, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TradeAll)) {
                return false;
            }
            TradeAll tradeAll = (TradeAll) obj;
            return this.amount == tradeAll.amount && Intrinsics.areEqual(this.buttonText, tradeAll.buttonText) && Intrinsics.areEqual(this.shareUnits, tradeAll.shareUnits) && this.isSelected == tradeAll.isSelected;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection.HasAmount
        public final long getAmount() {
            return this.amount;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection
        public final String getButtonText() {
            return this.buttonText;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSelected) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.amount) * 31, 31, this.buttonText), 31, this.shareUnits);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final boolean isSelected() {
            return this.isSelected;
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("TradeAll(amount=", this.amount, ", buttonText=", this.buttonText);
            m.append(", shareUnits=");
            m.append(this.shareUnits);
            m.append(", isSelected=");
            m.append(this.isSelected);
            m.append(")");
            return m.toString();
        }
    }

    public final class TradeCustomize extends AmountSelection {
        public final String accessibilityLabel;
        public final String buttonText;
        public final AmountSelectorWidgetModel.Item.Icon icon;

        public TradeCustomize(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.buttonText = str;
            this.accessibilityLabel = str2;
            this.icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TradeCustomize)) {
                return false;
            }
            TradeCustomize tradeCustomize = (TradeCustomize) obj;
            return Intrinsics.areEqual(this.buttonText, tradeCustomize.buttonText) && Intrinsics.areEqual(this.accessibilityLabel, tradeCustomize.accessibilityLabel);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getAccessibilityHint() {
            return null;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection, com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getAccessibilityLabel() {
            return this.accessibilityLabel;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection
        public final String getButtonText() {
            return this.buttonText;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final AmountSelectorWidgetModel.Item.Icon getIcon() {
            return this.icon;
        }

        public final int hashCode() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.buttonText.hashCode() * 31, 31, this.accessibilityLabel);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TradeCustomize(buttonText=", this.buttonText, ", accessibilityLabel=", this.accessibilityLabel, ", accessibilityHint=null)");
        }
    }

    @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
    public String getAccessibilityLabel() {
        return getButtonText();
    }

    public abstract String getButtonText();

    @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
    public final String getLabel() {
        return getButtonText();
    }

    public final class TradeSome extends AmountSelection implements HasAmount {
        public final long amount;
        public final String buttonText;
        public final boolean isEnabled;
        public final boolean isSelected;

        public TradeSome(long j, String str, boolean z, boolean z2) {
            str.getClass();
            this.amount = j;
            this.buttonText = str;
            this.isSelected = z;
            this.isEnabled = z2;
        }

        public static TradeSome copy$default(TradeSome tradeSome, int i) {
            long j = tradeSome.amount;
            String str = tradeSome.buttonText;
            boolean z = (i & 4) != 0 ? tradeSome.isSelected : true;
            boolean z2 = (i & 8) != 0 ? tradeSome.isEnabled : false;
            str.getClass();
            return new TradeSome(j, str, z, z2);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection.HasAmount
        public final AmountSelection copyAsSelected() {
            return copy$default(this, 11);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TradeSome)) {
                return false;
            }
            TradeSome tradeSome = (TradeSome) obj;
            return this.amount == tradeSome.amount && Intrinsics.areEqual(this.buttonText, tradeSome.buttonText) && this.isSelected == tradeSome.isSelected && this.isEnabled == tradeSome.isEnabled;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection.HasAmount
        public final long getAmount() {
            return this.amount;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelection
        public final String getButtonText() {
            return this.buttonText;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.amount) * 31, 31, this.buttonText), 31, this.isSelected);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final boolean isEnabled() {
            return this.isEnabled;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final boolean isSelected() {
            return this.isSelected;
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("TradeSome(amount=", this.amount, ", buttonText=", this.buttonText);
            m.append(", isSelected=");
            m.append(this.isSelected);
            m.append(", isEnabled=");
            m.append(this.isEnabled);
            m.append(")");
            return m.toString();
        }

        public /* synthetic */ TradeSome(long j, String str) {
            this(j, str, false, true);
        }
    }
}
