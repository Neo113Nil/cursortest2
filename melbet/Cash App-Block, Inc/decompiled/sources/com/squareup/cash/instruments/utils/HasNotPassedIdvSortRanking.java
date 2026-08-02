package com.squareup.cash.instruments.utils;

import com.squareup.cash.instruments.utils.SelectPaymentInstrumentOption;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.NotImplementedError;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class HasNotPassedIdvSortRanking {
    public final /* synthetic */ int $r8$classId;
    public static final HasNotPassedIdvSortRanking INSTANCE$1 = new HasNotPassedIdvSortRanking(1);
    public static final HasNotPassedIdvSortRanking INSTANCE = new HasNotPassedIdvSortRanking(0);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashInstrumentType.CASH_BALANCE.ordinal()] = 2;
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

    public /* synthetic */ HasNotPassedIdvSortRanking(int i) {
        this.$r8$classId = i;
    }

    public final int sortRank(SelectPaymentInstrumentOption selectPaymentInstrumentOption) {
        int i = this.$r8$classId;
        selectPaymentInstrumentOption.getClass();
        switch (i) {
            case 0:
                if (selectPaymentInstrumentOption instanceof SelectPaymentInstrumentOption.ExistingOption) {
                    CashInstrumentType type2 = selectPaymentInstrumentOption.getType();
                    switch (WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
                        case 1:
                            return 1;
                        case 2:
                            return 2;
                        case 3:
                            return 3;
                        case 4:
                            return 4;
                        case 5:
                            return 5;
                        case 6:
                            return 6;
                        case 7:
                            throw new NotImplementedError(null, 1, null);
                        case 8:
                        case 9:
                            Path$$ExternalSyntheticBUOutline0.m$1(type2, "Unexpected instrument type ");
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                    }
                } else {
                    if (selectPaymentInstrumentOption instanceof SelectPaymentInstrumentOption.NewInstrument) {
                        return WhenMappings.$EnumSwitchMapping$0[((SelectPaymentInstrumentOption.NewInstrument) selectPaymentInstrumentOption).f1147type.ordinal()] == 1 ? 7 : 8;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                return 0;
            default:
                if (selectPaymentInstrumentOption instanceof SelectPaymentInstrumentOption.ExistingOption) {
                    CashInstrumentType type3 = selectPaymentInstrumentOption.getType();
                    switch (DefaultInstrumentSortRanking$WhenMappings.$EnumSwitchMapping$0[type3.ordinal()]) {
                        case 1:
                            return 1;
                        case 2:
                            return 2;
                        case 3:
                            return 3;
                        case 4:
                            return 4;
                        case 5:
                            return 5;
                        case 6:
                            return 6;
                        case 7:
                            throw new NotImplementedError(null, 1, null);
                        case 8:
                        case 9:
                            Path$$ExternalSyntheticBUOutline0.m$1(type3, "Unexpected instrument type ");
                            break;
                        default:
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                    }
                } else {
                    if (selectPaymentInstrumentOption instanceof SelectPaymentInstrumentOption.NewInstrument) {
                        return DefaultInstrumentSortRanking$WhenMappings.$EnumSwitchMapping$0[((SelectPaymentInstrumentOption.NewInstrument) selectPaymentInstrumentOption).f1147type.ordinal()] == 2 ? 7 : 8;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
                return 0;
        }
    }
}
