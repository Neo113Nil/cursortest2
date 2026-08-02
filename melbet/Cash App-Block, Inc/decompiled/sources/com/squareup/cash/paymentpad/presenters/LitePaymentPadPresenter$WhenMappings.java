package com.squareup.cash.paymentpad.presenters;

import com.squareup.protos.common.CurrencyCode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class LitePaymentPadPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CurrencyCode.values().length];
        try {
            iArr[CurrencyCode.USD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CurrencyCode.MXN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
