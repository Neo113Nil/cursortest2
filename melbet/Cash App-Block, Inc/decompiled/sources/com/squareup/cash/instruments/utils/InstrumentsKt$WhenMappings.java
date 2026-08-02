package com.squareup.cash.instruments.utils;

import com.squareup.protos.common.instrument.InstrumentType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class InstrumentsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[InstrumentType.values().length];
        try {
            iArr[InstrumentType.AMERICAN_EXPRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InstrumentType.DISCOVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InstrumentType.DISCOVER_DINERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InstrumentType.JCB.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InstrumentType.MASTER_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InstrumentType.VISA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[InstrumentType.BALANCE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
