package com.squareup.cash.payments.presenters;

import com.squareup.protos.franklin.common.Orientation;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class QuickPayDetailsPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.CASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.BILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
