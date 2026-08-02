package com.fillr.browsersdk;

import android.content.Context;
import app.cash.api.ApiResult;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError;
import com.stripe.attestation.AttestationError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public abstract class FillrAuthenticationStore {
    public static final boolean isDeviceAttestationFailure(ApiResult apiResult) {
        String str;
        if (apiResult instanceof ApiResult.Failure.HttpFailure) {
            ApiResult.Failure.HttpFailure httpFailure = (ApiResult.Failure.HttpFailure) apiResult;
            if (httpFailure.code == 400 && (str = httpFailure.errorBody) != null && StringsKt.contains((CharSequence) str, (CharSequence) "Client integrity check failed", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEnabled(Context context) {
        if (context != null) {
            return context.getSharedPreferences("com.fillr.browsersdk", 0).getBoolean("enabled", true);
        }
        return false;
    }

    public static final Throwable toAttestationErrorIfApplicable(Throwable th, ElementsSessionContext.PrefillDetails prefillDetails) {
        String str;
        String str2;
        th.getClass();
        str = "An unknown error occurred";
        if (th instanceof APIException) {
            APIException aPIException = (APIException) th;
            StripeError stripeError = aPIException.stripeError;
            if (Intrinsics.areEqual(stripeError != null ? stripeError.code : null, "link_failed_to_attest_request")) {
                AttestationError.ErrorType errorType = AttestationError.ErrorType.BACKEND_VERDICT_FAILED;
                if (stripeError != null && (str2 = stripeError.message) != null) {
                    str = str2;
                }
                return new FinancialConnectionsAttestationError(errorType, prefillDetails, str, aPIException);
            }
        }
        if (!(th instanceof AttestationError)) {
            return th;
        }
        AttestationError attestationError = (AttestationError) th;
        AttestationError.ErrorType errorType2 = attestationError.errorType;
        String message = th.getMessage();
        return new FinancialConnectionsAttestationError(errorType2, prefillDetails, message != null ? message : "An unknown error occurred", attestationError);
    }
}
