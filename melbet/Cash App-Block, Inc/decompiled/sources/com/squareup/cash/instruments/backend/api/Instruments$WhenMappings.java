package com.squareup.cash.instruments.backend.api;

import com.squareup.protos.franklin.api.CashInstrumentType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class Instruments$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CashInstrumentType.values().length];
        try {
            iArr[CashInstrumentType.CASH_BALANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
