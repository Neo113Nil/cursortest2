package defpackage;

import com.yandex.xplat.payment.sdk.BankListType;
import com.yandex.xplat.payment.sdk.BankOpenKindForAnalytics;
import com.yandex.xplat.payment.sdk.ButtonNameForAnalytics;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import com.yandex.xplat.payment.sdk.NspkMembersSource;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.yandex.xplat.payment.sdk.Scenario;
import com.yandex.xplat.payment.sdk.ServiceStatusForAnalytics;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import com.yandex.xplat.payment.sdk.WebViewTagForAnalytics;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class rv90 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;
    public static final /* synthetic */ int[] g;
    public static final /* synthetic */ int[] h;
    public static final /* synthetic */ int[] i;
    public static final /* synthetic */ int[] j;

    static {
        int[] iArr = new int[ServiceStatusForAnalytics.values().length];
        try {
            iArr[ServiceStatusForAnalytics.success.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServiceStatusForAnalytics.failed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServiceStatusForAnalytics.canceled.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServiceStatusForAnalytics.dismissed.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[DivCardForAnalytics.values().length];
        try {
            iArr2[DivCardForAnalytics.SELECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[DivCardForAnalytics.CVV.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[DivCardForAnalytics.BANK_SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[DivCardForAnalytics.EXIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[DivCardForAnalytics.SBP_LICENSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[DivCardForAnalytics.BANK_SEARCH_FIELD.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[DivCardForAnalytics.SBP_CHALLENGER.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[DivCardForAnalytics.BIND_CARD.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[DivCardForAnalytics.METHOD_SELECT.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[DivCardForAnalytics.RESULT.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[DivCardForAnalytics.I_PAYMENT_SCREEN.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
        int[] iArr3 = new int[PaymentOptionNameForAnalytics.values().length];
        try {
            iArr3[PaymentOptionNameForAnalytics.EXISTING_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.NEW_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.YB.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.SBP.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.NEW_SBP_TOKEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.SBP_TOKEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.CASH.ordinal()] = 7;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.APPLE_PAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[PaymentOptionNameForAnalytics.GOOGLE_PAY.ordinal()] = 9;
        } catch (NoSuchFieldError unused24) {
        }
        c = iArr3;
        int[] iArr4 = new int[TextFieldNameForAnalytics.values().length];
        try {
            iArr4[TextFieldNameForAnalytics.CARD_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[TextFieldNameForAnalytics.EXPIRATION_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[TextFieldNameForAnalytics.CVN.ordinal()] = 3;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[TextFieldNameForAnalytics.EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[TextFieldNameForAnalytics.SCANNER.ordinal()] = 5;
        } catch (NoSuchFieldError unused29) {
        }
        d = iArr4;
        int[] iArr5 = new int[ButtonNameForAnalytics.values().length];
        try {
            iArr5[ButtonNameForAnalytics.CLOSE_SCANNER_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr5[ButtonNameForAnalytics.SCANNER_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused31) {
        }
        e = iArr5;
        int[] iArr6 = new int[Scenario.values().length];
        try {
            iArr6[Scenario.NEW_CARD_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr6[Scenario.CARD_BIND.ordinal()] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        f = iArr6;
        int[] iArr7 = new int[WebViewTagForAnalytics.values().length];
        try {
            iArr7[WebViewTagForAnalytics.FORM_3DS.ordinal()] = 1;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr7[WebViewTagForAnalytics.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused35) {
        }
        g = iArr7;
        int[] iArr8 = new int[NspkMembersSource.values().length];
        try {
            iArr8[NspkMembersSource.qr.ordinal()] = 1;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr8[NspkMembersSource.sub.ordinal()] = 2;
        } catch (NoSuchFieldError unused37) {
        }
        h = iArr8;
        int[] iArr9 = new int[BankListType.values().length];
        try {
            iArr9[BankListType.INSTALLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr9[BankListType.OTHER.ordinal()] = 2;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr9[BankListType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused40) {
        }
        i = iArr9;
        int[] iArr10 = new int[BankOpenKindForAnalytics.values().length];
        try {
            iArr10[BankOpenKindForAnalytics.DOMAIN_LINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr10[BankOpenKindForAnalytics.DEEP_LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused42) {
        }
        int[] iArr11 = new int[PsdkScreen.values().length];
        try {
            iArr11[PsdkScreen.BIND.ordinal()] = 1;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr11[PsdkScreen.DK_BIND.ordinal()] = 2;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr11[PsdkScreen.SELECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr11[PsdkScreen.DK_SELECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr11[PsdkScreen.PRESELECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr11[PsdkScreen.DK_PRESELECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr11[PsdkScreen.SELECT_BANK.ordinal()] = 7;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr11[PsdkScreen.DK_SELECT_BANK.ordinal()] = 8;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr11[PsdkScreen.LEGAL_AGREEMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr11[PsdkScreen.DK_LEGAL_AGREEMENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr11[PsdkScreen.CVV.ordinal()] = 11;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr11[PsdkScreen.WEBVIEW.ordinal()] = 12;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr11[PsdkScreen.SMS_CHALLENGE.ordinal()] = 13;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr11[PsdkScreen.DK_SMS_CHALLENGE.ordinal()] = 14;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr11[PsdkScreen.RANDOM_AMT_CHALLENGE.ordinal()] = 15;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr11[PsdkScreen.DK_RANDOM_AMT_CHALLENGE.ordinal()] = 16;
        } catch (NoSuchFieldError unused58) {
        }
        j = iArr11;
    }
}
