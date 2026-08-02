package com.squareup.cash.afterpayapplet.views.search;

import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class AfterpayAppletUpsellCardViewKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ButtonProminence.values().length];
        try {
            iArr[ButtonProminence.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonProminence.PROMINENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonProminence.SUBTLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
