package defpackage;

import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class z2a0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ExternalErrorTrigger.values().length];
        try {
            iArr[ExternalErrorTrigger.internal_sdk.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ExternalErrorTrigger.mobile_backend.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ExternalErrorTrigger.diehard.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ExternalErrorTrigger.nspk.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ExternalErrorTrigger.passport.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[ExternalErrorKind.values().length];
        try {
            iArr2[ExternalErrorKind.unknown.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ExternalErrorKind.internal_error.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ExternalErrorKind.authorization.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ExternalErrorKind.network.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ExternalErrorKind.card_validation_invalid_argument.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ExternalErrorKind.fail_3ds.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ExternalErrorKind.expired_card.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ExternalErrorKind.invalid_processing_request.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ExternalErrorKind.limit_exceeded.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ExternalErrorKind.not_enough_funds.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ExternalErrorKind.payment_authorization_reject.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ExternalErrorKind.payment_cancelled.ordinal()] = 12;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[ExternalErrorKind.payment_gateway_technical_error.ordinal()] = 13;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[ExternalErrorKind.payment_timeout.ordinal()] = 14;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[ExternalErrorKind.promocode_already_used.ordinal()] = 15;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[ExternalErrorKind.restricted_card.ordinal()] = 16;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[ExternalErrorKind.transaction_not_permitted.ordinal()] = 17;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[ExternalErrorKind.user_cancelled.ordinal()] = 18;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[ExternalErrorKind.apple_pay.ordinal()] = 19;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[ExternalErrorKind.google_pay.ordinal()] = 20;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[ExternalErrorKind.too_many_cards.ordinal()] = 21;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[ExternalErrorKind.no_email.ordinal()] = 22;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[ExternalErrorKind.passport_account_not_authorized.ordinal()] = 23;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[ExternalErrorKind.authorization_expired_token.ordinal()] = 24;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[ExternalErrorKind.failed_challenge_no_tries_left.ordinal()] = 25;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[ExternalErrorKind.failed_challenge_unknown.ordinal()] = 26;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[ExternalErrorKind.need_to_unbind_sbp_token.ordinal()] = 27;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[ExternalErrorKind.sbp_token_duplicate.ordinal()] = 28;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[ExternalErrorKind.undefined_challenge.ordinal()] = 29;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[ExternalErrorKind.warning.ordinal()] = 30;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[ExternalErrorKind.payment_failed_but_new_attempt_allowed.ordinal()] = 31;
        } catch (NoSuchFieldError unused36) {
        }
        b = iArr2;
    }
}
