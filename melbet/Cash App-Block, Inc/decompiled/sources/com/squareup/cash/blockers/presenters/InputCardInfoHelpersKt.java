package com.squareup.cash.blockers.presenters;

import com.squareup.cash.cdf.InstrumentLinkFlowEntryPoint;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.scenarios.CardBlockerSupplement;

/* loaded from: classes4.dex */
public abstract class InputCardInfoHelpersKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ClientScenario.values().length];
            try {
                iArr[ClientScenario.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientScenario.RETURNING_CUSTOMER_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClientScenario.PAYMENT_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClientScenario.PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClientScenario.TRANSFER_FUNDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClientScenario.EXCHANGE_EQUITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ClientScenario.EXCHANGE_CURRENCY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardBlockerSupplement.LinkedCardInputVariant.values().length];
            try {
                iArr2[CardBlockerSupplement.LinkedCardInputVariant.MANUAL_ENTRY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CardBlockerSupplement.LinkedCardInputVariant.MANUAL_ENTRY_WITH_SCAN_OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CardBlockerSupplement.LinkedCardInputVariant.SCAN_FIRST.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CardBlockerSupplement.LinkedCardInputVariant.SCAN_FIRST_MULTI_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CardBlockerSupplement.LinkedCardInputVariant.LEGACY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[CashInstrumentType.values().length];
            try {
                iArr3[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CashInstrumentType.CREDIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final InstrumentLinkFlowEntryPoint toCdfEntryPoint(ClientScenario clientScenario) {
        clientScenario.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()]) {
            case 1:
            case 2:
                return InstrumentLinkFlowEntryPoint.ONBOARDING;
            case 3:
                return InstrumentLinkFlowEntryPoint.PAYMENT;
            case 4:
                return InstrumentLinkFlowEntryPoint.PROFILE;
            case 5:
                return InstrumentLinkFlowEntryPoint.TRANSFER_FUNDS;
            case 6:
                return InstrumentLinkFlowEntryPoint.EXCHANGE_EQUITY;
            case 7:
                return InstrumentLinkFlowEntryPoint.EXCHANGE_CURRENCY;
            default:
                return null;
        }
    }
}
