package com.squareup.cash.borrow.viewmodels;

import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.lending.LoanRepaymentSelectionData;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class BorrowHomeOverlayViewModelKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[LoanRepaymentSelectionData.Choice.Icon.values().length];
        try {
            KeyScope.Companion companion = LoanRepaymentSelectionData.Choice.Icon.Companion;
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
