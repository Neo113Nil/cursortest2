package defpackage;

import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.xplat.payment.sdk.Acquirer;
import com.yandex.xplat.payment.sdk.BankName;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.ChallengeMethod;
import com.yandex.xplat.payment.sdk.PaymentMethodType;
import com.yandex.xplat.payment.sdk.PaymentPollingResult;
import com.yandex.xplat.payment.sdk.SbpVerifyGuessStatus;
import com.yandex.xplat.payment.sdk.YBCardType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vme {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;

    static {
        int[] iArr = new int[CardPaymentSystem.values().length];
        try {
            iArr[CardPaymentSystem.AmericanExpress.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardPaymentSystem.DinersClub.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CardPaymentSystem.DiscoverCard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CardPaymentSystem.JCB.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CardPaymentSystem.HUMO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CardPaymentSystem.Maestro.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CardPaymentSystem.MasterCard.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[CardPaymentSystem.MIR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[CardPaymentSystem.UnionPay.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[CardPaymentSystem.Uzcard.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[CardPaymentSystem.VISA.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[CardPaymentSystem.VISA_ELECTRON.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[CardPaymentSystem.UNKNOWN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        a = iArr;
        int[] iArr2 = new int[SbpChallengeInfo.SbpChallengeMethod.values().length];
        try {
            iArr2[SbpChallengeInfo.SbpChallengeMethod.SmsChallenge.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[SbpChallengeInfo.SbpChallengeMethod.RandomAmount.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
        int[] iArr3 = new int[ChallengeMethod.values().length];
        try {
            iArr3[ChallengeMethod.smsChallenge.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[ChallengeMethod.randomAmount.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        c = iArr3;
        int[] iArr4 = new int[SbpVerifyGuessStatus.values().length];
        try {
            iArr4[SbpVerifyGuessStatus.incorrect.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[SbpVerifyGuessStatus.correct.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        d = iArr4;
        int[] iArr5 = new int[YBCardType.values().length];
        try {
            iArr5[YBCardType.YB_PRO_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[YBCardType.YB_CREDIT_LIMIT_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        e = iArr5;
        int[] iArr6 = new int[BankName.values().length];
        try {
            iArr6[BankName.AlfaBank.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr6[BankName.SberBank.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[BankName.Tinkoff.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[BankName.Vtb.ordinal()] = 4;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[BankName.GazpromBank.ordinal()] = 5;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[BankName.BankOfMoscow.ordinal()] = 6;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[BankName.OpenBank.ordinal()] = 7;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr6[BankName.PromsvyazBank.ordinal()] = 8;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr6[BankName.RosBank.ordinal()] = 9;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr6[BankName.Qiwi.ordinal()] = 10;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr6[BankName.CitiBank.ordinal()] = 11;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr6[BankName.UnicreditBank.ordinal()] = 12;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr6[BankName.RaiffeisenBank.ordinal()] = 13;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr6[BankName.UnknownBank.ordinal()] = 14;
        } catch (NoSuchFieldError unused35) {
        }
        f = iArr6;
        int[] iArr7 = new int[PaymentMethodType.values().length];
        try {
            iArr7[PaymentMethodType.Card.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr7[PaymentMethodType.SbpToken.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        g = iArr7;
        int[] iArr8 = new int[Acquirer.values().length];
        try {
            iArr8[Acquirer.kassa.ordinal()] = 1;
        } catch (NoSuchFieldError unused38) {
        }
        h = iArr8;
        int[] iArr9 = new int[PaymentPollingResult.values().length];
        try {
            iArr9[PaymentPollingResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr9[PaymentPollingResult.WAIT_FOR_PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused40) {
        }
        i = iArr9;
    }
}
