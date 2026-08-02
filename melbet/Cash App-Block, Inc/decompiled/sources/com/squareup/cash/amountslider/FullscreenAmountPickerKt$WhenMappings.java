package com.squareup.cash.amountslider;

import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class FullscreenAmountPickerKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AmountPickerViewModel.Loading.AnimationDirection.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            AmountPickerViewModel.Loading.AnimationDirection animationDirection = AmountPickerViewModel.Loading.AnimationDirection.FORWARD;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[AmountPickerViewModel.Ready.CloseAction.values().length];
        try {
            iArr2[1] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            AmountPickerViewModel.Ready.CloseAction closeAction = AmountPickerViewModel.Ready.CloseAction.Back;
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
