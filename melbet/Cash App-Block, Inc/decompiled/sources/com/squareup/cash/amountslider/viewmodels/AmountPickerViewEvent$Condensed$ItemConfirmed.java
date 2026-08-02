package com.squareup.cash.amountslider.viewmodels;

import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AmountPickerViewEvent$Condensed$ItemConfirmed extends AmountPickerViewEvent {
    public final AmountSelectorWidgetModel.Item item;

    public AmountPickerViewEvent$Condensed$ItemConfirmed(AmountSelectorWidgetModel.Item item) {
        this.item = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountPickerViewEvent$Condensed$ItemConfirmed) && Intrinsics.areEqual(this.item, ((AmountPickerViewEvent$Condensed$ItemConfirmed) obj).item);
    }

    public final int hashCode() {
        AmountSelectorWidgetModel.Item item = this.item;
        if (item == null) {
            return 0;
        }
        return item.hashCode();
    }

    public final String toString() {
        return "ItemConfirmed(item=" + this.item + ")";
    }
}
