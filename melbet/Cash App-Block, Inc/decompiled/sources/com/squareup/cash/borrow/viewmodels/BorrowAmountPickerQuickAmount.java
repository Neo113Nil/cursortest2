package com.squareup.cash.borrow.viewmodels;

import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;

/* loaded from: classes4.dex */
public final class BorrowAmountPickerQuickAmount extends AmountSelectorWidgetModel.Item {
    public final int index;
    public final String label;

    public BorrowAmountPickerQuickAmount(String str, int i) {
        str.getClass();
        this.label = str;
        this.index = i;
    }

    @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
    public final String getLabel() {
        return this.label;
    }
}
