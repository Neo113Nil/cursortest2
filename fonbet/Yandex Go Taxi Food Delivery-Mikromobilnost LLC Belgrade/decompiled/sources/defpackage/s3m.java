package defpackage;

import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationStatus;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class s3m {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PaymentMethodVerificationStatus.values().length];
        try {
            iArr[PaymentMethodVerificationStatus.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.REQUIRED_3DS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.RECEIVED_3DS_STATUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.SUCCESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.FAILURE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.CVN_EXPECTED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.AMOUNT_EXPECTED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.SMS_CODE_EXPECTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.OTP_EXPECTED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PaymentMethodVerificationStatus.QR_EXPECTED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        a = iArr;
    }
}
