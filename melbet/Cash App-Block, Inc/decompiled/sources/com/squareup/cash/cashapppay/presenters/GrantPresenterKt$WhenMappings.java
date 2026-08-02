package com.squareup.cash.cashapppay.presenters;

import com.squareup.protos.franklin.api.PayWithCashAuthorizationBlocker;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class GrantPresenterKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[PayWithCashAuthorizationBlocker.Badge.values().length];
        try {
            iArr[PayWithCashAuthorizationBlocker.Badge.LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PayWithCashAuthorizationBlocker.Badge.AFTERPAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
