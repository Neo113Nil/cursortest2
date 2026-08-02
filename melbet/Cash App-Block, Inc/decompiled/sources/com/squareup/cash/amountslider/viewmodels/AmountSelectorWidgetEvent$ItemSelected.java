package com.squareup.cash.amountslider.viewmodels;

import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AmountSelectorWidgetEvent$ItemSelected {
    public final AmountSelectorWidgetModel.Item item;

    public AmountSelectorWidgetEvent$ItemSelected(AmountSelectorWidgetModel.Item item) {
        item.getClass();
        this.item = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountSelectorWidgetEvent$ItemSelected) && Intrinsics.areEqual(this.item, ((AmountSelectorWidgetEvent$ItemSelected) obj).item);
    }

    public final int hashCode() {
        return this.item.hashCode();
    }

    public final String toString() {
        return "ItemSelected(item=" + this.item + ")";
    }
}
