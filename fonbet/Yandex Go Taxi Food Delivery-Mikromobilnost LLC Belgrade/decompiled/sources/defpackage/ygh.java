package defpackage;

import com.yandex.plus.pay.api.exception.PlusPayGooglePlayErrorKind;
import com.yandex.plus.pay.api.exception.PlusPayPaymentGatewayErrorKind;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ygh {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PlusPayPaymentGatewayErrorKind.values().length];
        try {
            iArr[PlusPayPaymentGatewayErrorKind.PAYMENT_TIMEOUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.BLACKLISTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.EXPIRED_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.USER_CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.RESTRICTED_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.FAIL_3DS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.NOT_ENOUGH_FUNDS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.OPERATION_CANCELLED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.TIMEOUT_NO_SUCCESS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.TRANSACTION_NOT_PERMITTED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.LIMIT_EXCEEDED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.AUTH_REJECT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.INVALID_XRF_TOKEN.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.UNEXPECTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[PlusPayPaymentGatewayErrorKind.UNKNOWN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        a = iArr;
        int[] iArr2 = new int[PlusPayGooglePlayErrorKind.values().length];
        try {
            iArr2[PlusPayGooglePlayErrorKind.CONNECTION_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[PlusPayGooglePlayErrorKind.BILLING_UNAVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[PlusPayGooglePlayErrorKind.PRODUCT_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[PlusPayGooglePlayErrorKind.PURCHASE_UNSPECIFIED_STATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[PlusPayGooglePlayErrorKind.NOT_ENOUGH_FUNDS.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[PlusPayGooglePlayErrorKind.BILLING_INTERNAL_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        b = iArr2;
        int[] iArr3 = new int[PlusPayCompositeOffers.Offer.Vendor.values().length];
        try {
            iArr3[PlusPayCompositeOffers.Offer.Vendor.NATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[PlusPayCompositeOffers.Offer.Vendor.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        c = iArr3;
    }
}
