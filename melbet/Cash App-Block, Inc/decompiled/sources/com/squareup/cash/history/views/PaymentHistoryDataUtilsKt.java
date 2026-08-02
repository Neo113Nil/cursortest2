package com.squareup.cash.history.views;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import kotlin.Metadata;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;", "", "titleResId", "(Lcom/squareup/protos/franklin/ui/PaymentHistoryData$Icon;)I", "subtitleResId", "views-only"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentHistoryDataUtilsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentHistoryData.Icon.values().length];
            try {
                iArr[PaymentHistoryData.Icon.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentHistoryData.Icon.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentHistoryData.Icon.ALERT_PROMINENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentHistoryData.Icon.SHIELD_CHECKMARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentHistoryData.Icon.PAY_WITH_CASH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentHistoryData.Icon.QR_CODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentHistoryData.Icon.IN_PROGRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentHistoryData.Icon.NOTICE_PROMINENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentHistoryData.Icon.BLOCKED_PROMINENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentHistoryData.Icon.NOTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentHistoryData.Icon.CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PaymentHistoryData.Icon.ONLINE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PaymentHistoryData.Icon.NO_SYMBOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PaymentHistoryData.Icon.ALERT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PaymentHistoryData.Icon.RETURNED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PaymentHistoryData.Icon.RECURRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PaymentHistoryData.Icon.DIRECT_DEPOSIT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PaymentHistoryData.Icon.DIRECT_DEBIT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PaymentHistoryData.Icon.SHIELD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PaymentHistoryData.Icon.INVESTING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[PaymentHistoryData.Icon.CLOCK.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[PaymentHistoryData.Icon.DOUBLE_CHEVRON.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[PaymentHistoryData.Icon.TRANSFER.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[PaymentHistoryData.Icon.GROUP.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[PaymentHistoryData.Icon.NOTICE.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[PaymentHistoryData.Icon.PAYMENT_PLAN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[PaymentHistoryData.Icon.REINVESTMENT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int subtitleResId(PaymentHistoryData.Icon icon) {
        if (icon == null) {
            return 0;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[icon.ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
            case 9:
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m$1(icon, "Unexpected icon: ");
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
        }
        return 0;
    }

    public static final int titleResId(PaymentHistoryData.Icon icon) {
        if (icon == null) {
            return 0;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[icon.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                String str = "Icon " + icon + " not expected for a title";
                Timber.Forest.e(str, new Object[0], new IllegalArgumentException(str));
                break;
        }
        return 0;
    }
}
