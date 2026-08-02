package com.squareup.cash.amountchooser.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class AmountSelectorOption extends AmountSelectorWidgetModel.Item {
    public final Lazy accessibilityLabel$delegate = LazyKt.lazy(new yf$$ExternalSyntheticLambda2(this, 28));
    public final String label;

    public final class CustomAmountSelectorOption extends AmountSelectorOption {
        public final AmountSelectorWidgetModel.Item.Icon icon;
        public final boolean isSelected;

        public CustomAmountSelectorOption(boolean z) {
            super("...");
            this.isSelected = z;
            this.icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CustomAmountSelectorOption) && this.isSelected == ((CustomAmountSelectorOption) obj).isSelected;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final AmountSelectorWidgetModel.Item.Icon getIcon() {
            return this.icon;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isSelected);
        }

        @Override // com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption, com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final boolean isSelected() {
            return this.isSelected;
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("CustomAmountSelectorOption(isSelected=", ")", this.isSelected);
        }
    }

    public final class PreSetAmountSelectorOption extends AmountSelectorOption {
        public final Money amount;
        public final boolean isSelected;
        public final String label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreSetAmountSelectorOption(Money money, String str, boolean z) {
            super(str);
            str.getClass();
            this.label = str;
            this.isSelected = z;
            this.amount = money;
        }

        public static PreSetAmountSelectorOption copy$default(PreSetAmountSelectorOption preSetAmountSelectorOption, boolean z) {
            String str = preSetAmountSelectorOption.label;
            Money money = preSetAmountSelectorOption.amount;
            str.getClass();
            money.getClass();
            return new PreSetAmountSelectorOption(money, str, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreSetAmountSelectorOption)) {
                return false;
            }
            PreSetAmountSelectorOption preSetAmountSelectorOption = (PreSetAmountSelectorOption) obj;
            return Intrinsics.areEqual(this.label, preSetAmountSelectorOption.label) && this.isSelected == preSetAmountSelectorOption.isSelected && Intrinsics.areEqual(this.amount, preSetAmountSelectorOption.amount);
        }

        @Override // com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption, com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getLabel() {
            return this.label;
        }

        public final int hashCode() {
            return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.isSelected);
        }

        @Override // com.squareup.cash.amountchooser.viewmodels.AmountSelectorOption, com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final boolean isSelected() {
            return this.isSelected;
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("PreSetAmountSelectorOption(label=", this.label, ", isSelected=", ", amount=", this.isSelected);
            m1540m.append(this.amount);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public AmountSelectorOption(String str) {
        this.label = str;
    }

    @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
    public final String getAccessibilityLabel() {
        return (String) this.accessibilityLabel$delegate.getValue();
    }

    @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
    public String getLabel() {
        return this.label;
    }

    @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
    public abstract boolean isSelected();
}
