package com.squareup.cash.investing.components;

import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class InvestingTileHeaderViewKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[InvestingHomeViewModel.InvestingHomeRow.Header.HeaderDescriptionColor.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            InvestingHomeViewModel.InvestingHomeRow.Header.HeaderDescriptionColor headerDescriptionColor = InvestingHomeViewModel.InvestingHomeRow.Header.HeaderDescriptionColor.Secondary;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction headerAction = InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction.CHANGE_SORTING_ORDER;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
