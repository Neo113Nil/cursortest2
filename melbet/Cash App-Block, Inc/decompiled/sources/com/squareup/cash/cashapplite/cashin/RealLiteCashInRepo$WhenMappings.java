package com.squareup.cash.cashapplite.cashin;

import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.grantly.api.Channel;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class RealLiteCashInRepo$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Row.RowAction.values().length];
        try {
            Channel.Companion companion = Row.RowAction.Companion;
            iArr[2] = 1;
        } catch (NoSuchFieldError unused) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
