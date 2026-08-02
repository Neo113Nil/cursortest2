package com.squareup.cash.afterpayapplet.views;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.shop.rendering.api.Button;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class AfterpayAppletInfoSheetViewKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Button.Prominence.values().length];
        try {
            TransactionType.Companion companion = Button.Prominence.Companion;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            TransactionType.Companion companion2 = Button.Prominence.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            TransactionType.Companion companion3 = Button.Prominence.Companion;
            iArr[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
