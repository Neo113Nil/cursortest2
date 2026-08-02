package com.squareup.cash.instruments.utils;

import com.squareup.protos.franklin.api.CashInstrumentType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class DefaultInstrumentSortRanking$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[CashInstrumentType.values().length];
        try {
            iArr[CashInstrumentType.CASH_BALANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CashInstrumentType.LINE_OF_CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CashInstrumentType.GOOGLE_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CashInstrumentType.EBT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CashInstrumentType.STABLECOIN_WALLET.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CashInstrumentType.APPLE_PAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
