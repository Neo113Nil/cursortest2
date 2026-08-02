package com.squareup.cash.amountslider.viewmodels;

import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AmountPickerViewEvent$Condensed$ItemSelected extends AmountPickerViewEvent {
    public final AmountSelectorWidgetModel.Item item;

    public AmountPickerViewEvent$Condensed$ItemSelected(AmountSelectorWidgetModel.Item item) {
        item.getClass();
        this.item = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountPickerViewEvent$Condensed$ItemSelected) && Intrinsics.areEqual(this.item, ((AmountPickerViewEvent$Condensed$ItemSelected) obj).item);
    }

    public final int hashCode() {
        return this.item.hashCode();
    }

    public final String toString() {
        return "ItemSelected(item=" + this.item + ")";
    }
}
