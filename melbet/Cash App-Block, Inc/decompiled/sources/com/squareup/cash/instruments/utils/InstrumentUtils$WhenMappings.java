package com.squareup.cash.instruments.utils;

import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class InstrumentUtils$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    static {
        int[] iArr = new int[CashInstrumentType.values().length];
        try {
            iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CashInstrumentType.LINE_OF_CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CashInstrumentType.GOOGLE_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[InstrumentIcon.IconShape.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            InstrumentIcon.IconShape iconShape = InstrumentIcon.IconShape.CIRCLE;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[InstrumentType.values().length];
        try {
            iArr3[InstrumentType.VISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[InstrumentType.MASTER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[InstrumentType.AMERICAN_EXPRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[InstrumentType.DISCOVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[InstrumentType.DISCOVER_DINERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[InstrumentType.JCB.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
