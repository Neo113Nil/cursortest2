package com.squareup.cash.passkeys.backend;

import com.squareup.cash.cdf.passkey.PasskeyCreateResultFailed;
import com.squareup.cash.integration.analytics.Analytics;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class RealPasskeyAnalytics {
    public final Analytics analytics;

    public RealPasskeyAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    public final void trackCreatePasskeyFailed(PasskeyAnalytics$CreateFailureType passkeyAnalytics$CreateFailureType, String str, Integer num) {
        PasskeyCreateResultFailed.CreateErrorType createErrorType;
        switch (passkeyAnalytics$CreateFailureType.ordinal()) {
            case 0:
                createErrorType = PasskeyCreateResultFailed.CreateErrorType.AUTH_START_FAILED;
                break;
            case 1:
                createErrorType = PasskeyCreateResultFailed.CreateErrorType.AUTH_START_INVALID;
                break;
            case 2:
                createErrorType = PasskeyCreateResultFailed.CreateErrorType.DEVICE_CREDENTIAL_DUPLICATE;
                break;
            case 3:
                createErrorType = PasskeyCreateResultFailed.CreateErrorType.DEVICE_CREDENTIAL_FAILED;
                break;
            case 4:
                createErrorType = PasskeyCreateResultFailed.CreateErrorType.OTHER;
                break;
            case 5:
                createErrorType = PasskeyCreateResultFailed.CreateErrorType.AUTH_FINISH_FAILED;
                break;
            case 6:
                createErrorType = PasskeyCreateResultFailed.CreateErrorType.OTHER;
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
        this.analytics.track(new PasskeyCreateResultFailed(createErrorType, num, str), null);
    }
}
