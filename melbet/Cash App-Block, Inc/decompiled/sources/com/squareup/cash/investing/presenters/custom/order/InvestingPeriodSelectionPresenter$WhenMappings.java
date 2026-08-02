package com.squareup.cash.investing.presenters.custom.order;

import com.squareup.protos.franklin.investing.resources.OrderSide;
import com.squareup.protos.invest.ui.ClientDriven;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class InvestingPeriodSelectionPresenter$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[OrderSide.values().length];
        try {
            ClientDriven.Companion companion = OrderSide.Companion;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
