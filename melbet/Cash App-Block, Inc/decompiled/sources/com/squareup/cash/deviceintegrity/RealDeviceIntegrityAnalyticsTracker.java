package com.squareup.cash.deviceintegrity;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.api.ApiResult;
import com.squareup.cash.cdf.deviceattestation.API;
import com.squareup.cash.cdf.deviceattestation.CashAPI;
import com.squareup.cash.cdf.deviceattestation.DeviceAttestationAttestFailCashAPI;
import com.squareup.cash.cdf.deviceattestation.DeviceAttestationAttestFailPlayIntegrity;
import com.squareup.cash.cdf.deviceattestation.DeviceAttestationAttestStart;
import com.squareup.cash.cdf.deviceattestation.DeviceAttestationAttestSucceed;
import com.squareup.cash.cdf.deviceattestation.EntryPoint;
import com.squareup.cash.cdf.deviceattestation.PlayIntegrityAttestationType;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class RealDeviceIntegrityAnalyticsTracker {
    public final Analytics analytics;
    public final AndroidClock clock;
    public final ForcedLazyKt$forcedLazy$1 deviceId;

    public RealDeviceIntegrityAnalyticsTracker(Analytics analytics, AndroidClock androidClock, ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1) {
        this.analytics = analytics;
        this.clock = androidClock;
        this.deviceId = forcedLazyKt$forcedLazy$1;
    }

    public static void trackAttestationAttestFailCashAPI$default(RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker, String str, String str2, ApiResult.Failure failure, DeviceIntegrity$Result deviceIntegrity$Result, PlayIntegrityAttestationType playIntegrityAttestationType, int i) {
        CashAPI cashAPI;
        String m;
        CashAPI cashAPI2;
        DeviceIntegrityAnalyticsTracker$CashApi deviceIntegrityAnalyticsTracker$CashApi = DeviceIntegrityAnalyticsTracker$CashApi.VALIDATE_ATTESTATION;
        String str3 = (i & 1) != 0 ? null : str;
        String str4 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            deviceIntegrityAnalyticsTracker$CashApi = null;
        }
        Analytics analytics = realDeviceIntegrityAnalyticsTracker.analytics;
        String str5 = (String) realDeviceIntegrityAnalyticsTracker.deviceId.$$delegate_0.getValue();
        API api = API.PLAY_INTEGRITY;
        if (deviceIntegrityAnalyticsTracker$CashApi != null) {
            int ordinal = deviceIntegrityAnalyticsTracker$CashApi.ordinal();
            if (ordinal == 0) {
                cashAPI2 = CashAPI.VERIFY_DEVICE;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                cashAPI2 = CashAPI.VALIDATE_ATTESTATION;
            }
            cashAPI = cashAPI2;
        } else {
            cashAPI = null;
        }
        if (failure instanceof ApiResult.Failure.NetworkFailure) {
            m = "NetworkFailure";
        } else {
            if (!(failure instanceof ApiResult.Failure.HttpFailure)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) failure).code, "HttpFailure: ");
        }
        analytics.track(new DeviceAttestationAttestFailCashAPI(str3, str4, str5, cashAPI, m, Long.valueOf(realDeviceIntegrityAnalyticsTracker.clock.millis() - deviceIntegrity$Result.startEventTimeMillis), Integer.valueOf(deviceIntegrity$Result.totalRetries), playIntegrityAttestationType), null);
    }

    public static void trackAttestationStarted$default(RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker, String str, String str2, DeviceIntegrity$EntryPoint deviceIntegrity$EntryPoint, String str3, PlayIntegrityAttestationType playIntegrityAttestationType, int i) {
        String str4;
        PlayIntegrityAttestationType playIntegrityAttestationType2;
        String str5;
        EntryPoint entryPoint;
        EntryPoint entryPoint2;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        Analytics analytics = realDeviceIntegrityAnalyticsTracker.analytics;
        String str6 = (String) realDeviceIntegrityAnalyticsTracker.deviceId.$$delegate_0.getValue();
        API api = API.PLAY_INTEGRITY;
        if (deviceIntegrity$EntryPoint != null) {
            int ordinal = deviceIntegrity$EntryPoint.ordinal();
            if (ordinal == 0) {
                entryPoint2 = EntryPoint.INITIATE_SESSION;
            } else if (ordinal == 1) {
                entryPoint2 = EntryPoint.REFRESH_SESSION;
            } else if (ordinal == 2) {
                entryPoint2 = EntryPoint.PUSH_NOTIFICATION;
            } else if (ordinal == 3) {
                entryPoint2 = EntryPoint.PERSONA_DIDV;
            } else if (ordinal == 4) {
                entryPoint2 = EntryPoint.TTP;
            } else {
                if (ordinal != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                entryPoint2 = EntryPoint.TTP;
            }
            String str7 = str3;
            entryPoint = entryPoint2;
            str4 = str6;
            playIntegrityAttestationType2 = playIntegrityAttestationType;
            str5 = str7;
        } else {
            str4 = str6;
            playIntegrityAttestationType2 = playIntegrityAttestationType;
            str5 = str3;
            entryPoint = null;
        }
        analytics.track(new DeviceAttestationAttestStart(str, str2, str4, entryPoint, str5, playIntegrityAttestationType2), null);
    }

    public static void trackDeviceAttestationAttestFailPlayIntegrity$default(RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker, String str, String str2, DeviceIntegrity$Result deviceIntegrity$Result, PlayIntegrityAttestationType playIntegrityAttestationType, int i) {
        String str3 = (i & 1) != 0 ? null : str;
        String str4 = (i & 2) != 0 ? null : str2;
        Analytics analytics = realDeviceIntegrityAnalyticsTracker.analytics;
        String str5 = (String) realDeviceIntegrityAnalyticsTracker.deviceId.$$delegate_0.getValue();
        API api = API.PLAY_INTEGRITY;
        IntegrityErrorType integrityErrorType = deviceIntegrity$Result.errorType;
        String obj = integrityErrorType != null ? integrityErrorType.toString() : null;
        String str6 = deviceIntegrity$Result.cause;
        analytics.track(new DeviceAttestationAttestFailPlayIntegrity(str3, str4, str5, Recorder$$ExternalSyntheticOutline2.m$1(obj, str6 != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(" (cause: ", str6, ")") : ""), deviceIntegrity$Result.integrityCheckStatusCode, deviceIntegrity$Result.playIntegrityErrorCode, Long.valueOf(realDeviceIntegrityAnalyticsTracker.clock.millis() - deviceIntegrity$Result.startEventTimeMillis), Integer.valueOf(deviceIntegrity$Result.totalRetries), playIntegrityAttestationType), null);
    }

    public static void trackDeviceAttestationAttestSucceeded$default(RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker, String str, String str2, DeviceIntegrity$Result deviceIntegrity$Result, PlayIntegrityAttestationType playIntegrityAttestationType, int i) {
        String str3 = (i & 1) != 0 ? null : str;
        String str4 = (i & 2) != 0 ? null : str2;
        Analytics analytics = realDeviceIntegrityAnalyticsTracker.analytics;
        String str5 = (String) realDeviceIntegrityAnalyticsTracker.deviceId.$$delegate_0.getValue();
        API api = API.PLAY_INTEGRITY;
        analytics.track(new DeviceAttestationAttestSucceed(str3, str4, str5, Long.valueOf(realDeviceIntegrityAnalyticsTracker.clock.millis() - deviceIntegrity$Result.startEventTimeMillis), Integer.valueOf(deviceIntegrity$Result.totalRetries), playIntegrityAttestationType), null);
    }
}
