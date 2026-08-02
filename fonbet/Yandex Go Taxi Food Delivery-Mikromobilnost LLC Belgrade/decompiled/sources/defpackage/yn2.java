package defpackage;

import com.yandex.xplat.payment.sdk.ApiMethodNameForAnalytics;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class yn2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ApiMethodNameForAnalytics.values().length];
        try {
            iArr[ApiMethodNameForAnalytics.PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.CARD_BIND_WITHOUT_VERIFY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.CARD_BIND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.BIND_SBP_TOKEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.VERIFY_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.SELECT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.SELECT_AND_PAY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.BIND_GOOGLE_PAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.BIND_GOOGLE_TOKEN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.BIND_APPLE_PAY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.APPLE_PAY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.FINISH_PAYMENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.FAILED_PAYMENT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.CONTINUE_PAYMENT.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.UPDATE_SELECT_BUTTON.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.UPDATE_SELECT_OPTIONS.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.DISMISS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.APPLY_CVV_AND_PAY.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.IPAYMENT.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.TRANSPORT_CARDS.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.RTP.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.DISPATCH_REMOTE_ACTION.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[ApiMethodNameForAnalytics.CARD_ADDITIONAL_VERIFY.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        a = iArr;
    }
}
