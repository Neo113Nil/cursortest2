package com.squareup.cash.deviceintegrity;

import com.squareup.cash.cdf.deviceattestation.PlayIntegrityAttestationType;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public final class RealDeviceIntegrity {
    public final RealDeviceIntegrityAnalyticsTracker analyticsTracker;
    public final AndroidClock clock;
    public final CoroutineContext ioContext;
    public final PlayIntegrityClient playIntegrityClient;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayIntegrityAttestation.AttestationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AsyncTimeout.Companion companion = PlayIntegrityAttestation.AttestationType.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[IntegrityErrorType.values().length];
            try {
                iArr2[6] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IntegrityErrorType integrityErrorType = IntegrityErrorType.INTEGRITY_EXCEPTION;
                iArr2[5] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public RealDeviceIntegrity(RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker, AndroidClock androidClock, PlayIntegrityClient playIntegrityClient, CoroutineContext coroutineContext) {
        this.analyticsTracker = realDeviceIntegrityAnalyticsTracker;
        this.clock = androidClock;
        this.playIntegrityClient = playIntegrityClient;
        this.ioContext = coroutineContext;
    }

    public static final boolean access$shouldRetry(RealDeviceIntegrity realDeviceIntegrity, Integer num, IntegrityErrorType integrityErrorType) {
        int i = integrityErrorType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[integrityErrorType.ordinal()];
        if (i != 1) {
            return i != 2 ? CollectionsKt.contains(RetryableErrorCodesKt.retryableErrorCodes, num) : CollectionsKt.contains(RetryableErrorCodesKt.retryableStandardErrorCodes, num);
        }
        return true;
    }

    public final DeviceIntegrity$Result buildFailureResult(String str, long j, IntegrityErrorType integrityErrorType, int i, PlayIntegrityAttestation.AttestationType attestationType, Integer num, Integer num2, String str2) {
        DeviceIntegrity$Result deviceIntegrity$Result = new DeviceIntegrity$Result(null, num, num2, j, i, integrityErrorType, str2);
        int ordinal = attestationType.ordinal();
        RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker = this.analyticsTracker;
        if (ordinal == 0) {
            str.getClass();
            RealDeviceIntegrityAnalyticsTracker.trackDeviceAttestationAttestFailPlayIntegrity$default(realDeviceIntegrityAnalyticsTracker, str, null, deviceIntegrity$Result, PlayIntegrityAttestationType.CLASSIC, 2);
            return deviceIntegrity$Result;
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        str.getClass();
        RealDeviceIntegrityAnalyticsTracker.trackDeviceAttestationAttestFailPlayIntegrity$default(realDeviceIntegrityAnalyticsTracker, null, str, deviceIntegrity$Result, PlayIntegrityAttestationType.STANDARD, 1);
        return deviceIntegrity$Result;
    }
}
