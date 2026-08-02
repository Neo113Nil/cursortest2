package com.squareup.cash.savings.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class AmountSelectorViewModel extends AmountSelectorWidgetModel.Item {

    public final class Amount extends AmountSelectorViewModel {
        public final Money amount;
        public final boolean isSelected;
        public final String label;

        public Amount(Money money, String str, boolean z) {
            str.getClass();
            money.getClass();
            this.label = str;
            this.isSelected = z;
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amount)) {
                return false;
            }
            Amount amount = (Amount) obj;
            return Intrinsics.areEqual(this.label, amount.label) && this.isSelected == amount.isSelected && Intrinsics.areEqual(this.amount, amount.amount);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getLabel() {
            return this.label;
        }

        public final int hashCode() {
            return this.amount.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.isSelected);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final boolean isSelected() {
            return this.isSelected;
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Amount(label=", this.label, ", isSelected=", ", amount=", this.isSelected);
            m1540m.append(this.amount);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public final class CustomAmount extends AmountSelectorViewModel {
        public final String accessibilityLabel;
        public final String label;

        public CustomAmount(String str, String str2) {
            AmountSelectorWidgetModel.Item.Icon icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
            str.getClass();
            this.label = str;
            this.accessibilityLabel = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomAmount)) {
                return false;
            }
            CustomAmount customAmount = (CustomAmount) obj;
            if (!Intrinsics.areEqual(this.label, customAmount.label)) {
                return false;
            }
            AmountSelectorWidgetModel.Item.Icon icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
            return Intrinsics.areEqual(this.accessibilityLabel, customAmount.accessibilityLabel);
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getAccessibilityLabel() {
            return this.accessibilityLabel;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final AmountSelectorWidgetModel.Item.Icon getIcon() {
            return AmountSelectorWidgetModel.Item.Icon.PENDING;
        }

        @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
        public final String getLabel() {
            return this.label;
        }

        public final int hashCode() {
            int hashCode = (AmountSelectorWidgetModel.Item.Icon.PENDING.hashCode() + (this.label.hashCode() * 31)) * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            AmountSelectorWidgetModel.Item.Icon icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
            StringBuilder sb = new StringBuilder("CustomAmount(label=");
            sb.append(this.label);
            sb.append(", icon=");
            sb.append(icon);
            sb.append(", accessibilityLabel=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessibilityLabel, ")");
        }
    }
}
