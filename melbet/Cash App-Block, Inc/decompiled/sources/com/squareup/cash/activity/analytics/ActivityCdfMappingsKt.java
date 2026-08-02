package com.squareup.cash.activity.analytics;

import com.squareup.cash.cdf.PaymentOrientation;
import com.squareup.cash.cdf.PaymentRole;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.PaymentHistoryButton;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.RetroEligibilityStatus;
import com.squareup.protos.franklin.ui.TransactionType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class ActivityCdfMappingsKt {

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[Role.values().length];
            try {
                iArr[Role.DO_NOT_USE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Role.SENDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Role.RECIPIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Orientation.values().length];
            try {
                iArr2[Orientation.CASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Orientation.BILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentState.values().length];
            try {
                iArr3[PaymentState.PAYMENT_NOT_KNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[PaymentState.SCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[PaymentState.WAITING_ON_SENDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[PaymentState.WAITING_ON_RECIPIENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[PaymentState.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[PaymentState.COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[PaymentState.WAITING_ON_RISK.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[PaymentState.RECIPIENT_EMAIL_BOUNCED.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[PaymentState.RECIPIENT_REJECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[PaymentState.SENDER_CANCELED.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[PaymentState.EXPIRED.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[PaymentState.BLOCKED_BY_RISK.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[PaymentState.FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[PaymentState.WAITING_ON_EXTERNAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TransactionType.values().length];
            try {
                iArr4[TransactionType.SAVINGS_INTEREST.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[TransactionType.SAVINGS_INTEREST_ESTIMATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[TransactionType.CASH_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[TransactionType.CASH_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[PaymentHistoryButton.UrlType.values().length];
            try {
                iArr5[PaymentHistoryButton.UrlType.BLOCK_EXPLORER.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[PaymentHistoryButton.UrlType.RECEIPT_UPSELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[RetroEligibilityStatus.values().length];
            try {
                iArr6[RetroEligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[RetroEligibilityStatus.INELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[RetroEligibilityStatus.CONVERTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public static final PaymentOrientation toCdfPaymentOrientation(Orientation orientation) {
        int i = WhenMappings.$EnumSwitchMapping$1[orientation.ordinal()];
        if (i == 1) {
            return PaymentOrientation.CASH;
        }
        if (i == 2) {
            return PaymentOrientation.BILL;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final PaymentRole toCdfPaymentRole(Role role) {
        int i = WhenMappings.$EnumSwitchMapping$0[role.ordinal()];
        if (i == 1) {
            return PaymentRole.DO_NOT_USE;
        }
        if (i == 2) {
            return PaymentRole.SENDER;
        }
        if (i == 3) {
            return PaymentRole.RECIPIENT;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final com.squareup.cash.cdf.PaymentState toCdfPaymentState(PaymentState paymentState) {
        switch (WhenMappings.$EnumSwitchMapping$2[paymentState.ordinal()]) {
            case 1:
                return com.squareup.cash.cdf.PaymentState.PAYMENT_NOT_KNOWN;
            case 2:
                return com.squareup.cash.cdf.PaymentState.SCHEDULED;
            case 3:
                return com.squareup.cash.cdf.PaymentState.WAITING_ON_SENDER;
            case 4:
                return com.squareup.cash.cdf.PaymentState.WAITING_ON_RECIPIENT;
            case 5:
                return com.squareup.cash.cdf.PaymentState.PROCESSING;
            case 6:
                return com.squareup.cash.cdf.PaymentState.COMPLETE;
            case 7:
                return com.squareup.cash.cdf.PaymentState.WAITING_ON_RISK;
            case 8:
                return com.squareup.cash.cdf.PaymentState.RECIPIENT_EMAIL_BOUNCED;
            case 9:
                return com.squareup.cash.cdf.PaymentState.RECIPIENT_REJECTED;
            case 10:
                return com.squareup.cash.cdf.PaymentState.SENDER_CANCELED;
            case 11:
                return com.squareup.cash.cdf.PaymentState.EXPIRED;
            case 12:
                return com.squareup.cash.cdf.PaymentState.BLOCKED_BY_RISK;
            case 13:
                return com.squareup.cash.cdf.PaymentState.FAILED;
            case 14:
                return com.squareup.cash.cdf.PaymentState.WAITING_ON_EXTERNAL;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
