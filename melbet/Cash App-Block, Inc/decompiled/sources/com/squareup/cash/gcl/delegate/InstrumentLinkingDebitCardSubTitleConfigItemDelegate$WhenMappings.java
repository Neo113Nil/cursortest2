package com.squareup.cash.gcl.delegate;

import com.squareup.protos.franklin.api.Region;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class InstrumentLinkingDebitCardSubTitleConfigItemDelegate$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Region.values().length];
        try {
            iArr[Region.GBR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Region.CAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Region.AUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
