package com.squareup.cash.blockers.presenters;

import com.squareup.protos.franklin.api.TransferOptionSelectionBlocker;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class SavingsTransferOptionSelectionPresenterKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[TransferOptionSelectionBlocker.AnimationDirection.values().length];
        try {
            iArr[TransferOptionSelectionBlocker.AnimationDirection.FORWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferOptionSelectionBlocker.AnimationDirection.BACKWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
