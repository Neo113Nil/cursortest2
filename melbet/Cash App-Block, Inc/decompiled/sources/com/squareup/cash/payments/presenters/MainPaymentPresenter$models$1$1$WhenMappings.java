package com.squareup.cash.payments.presenters;

import com.squareup.protos.franklin.common.Orientation;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class MainPaymentPresenter$models$1$1$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.BILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.CASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
