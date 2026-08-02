package com.squareup.cash.payments.viewmodels;

import com.squareup.protos.franklin.api.CashInstrumentType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class RecurringDisabledInstrumentKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CashInstrumentType.values().length];
        try {
            iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashInstrumentType.GOOGLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
