package com.squareup.cash.deviceintegrity;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceIntegrity$Result {
    public final String cause;
    public final IntegrityErrorType errorType;
    public final Integer integrityCheckStatusCode;
    public final Integer playIntegrityErrorCode;
    public final long startEventTimeMillis;
    public final String token;
    public final int totalRetries;

    public DeviceIntegrity$Result(String str, Integer num, Integer num2, long j, int i, IntegrityErrorType integrityErrorType, String str2) {
        this.token = str;
        this.integrityCheckStatusCode = num;
        this.playIntegrityErrorCode = num2;
        this.startEventTimeMillis = j;
        this.totalRetries = i;
        this.errorType = integrityErrorType;
        this.cause = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceIntegrity$Result)) {
            return false;
        }
        DeviceIntegrity$Result deviceIntegrity$Result = (DeviceIntegrity$Result) obj;
        return Intrinsics.areEqual(this.token, deviceIntegrity$Result.token) && Intrinsics.areEqual(this.integrityCheckStatusCode, deviceIntegrity$Result.integrityCheckStatusCode) && Intrinsics.areEqual(this.playIntegrityErrorCode, deviceIntegrity$Result.playIntegrityErrorCode) && this.startEventTimeMillis == deviceIntegrity$Result.startEventTimeMillis && this.totalRetries == deviceIntegrity$Result.totalRetries && this.errorType == deviceIntegrity$Result.errorType && Intrinsics.areEqual(this.cause, deviceIntegrity$Result.cause);
    }

    public final int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        Integer num = this.integrityCheckStatusCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.playIntegrityErrorCode;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.totalRetries, Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.startEventTimeMillis), 31);
        IntegrityErrorType integrityErrorType = this.errorType;
        int hashCode3 = (m + (integrityErrorType == null ? 0 : integrityErrorType.hashCode())) * 31;
        String str2 = this.cause;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.integrityCheckStatusCode, "Result(token=", this.token, ", playServicesStatusCode=null, integrityCheckStatusCode=", ", playIntegrityErrorCode=");
        m.append(this.playIntegrityErrorCode);
        m.append(", startEventTimeMillis=");
        m.append(this.startEventTimeMillis);
        m.append(", totalRetries=");
        m.append(this.totalRetries);
        m.append(", errorType=");
        m.append(this.errorType);
        return Recorder$$ExternalSyntheticOutline2.m(m, ", cause=", this.cause, ")");
    }
}
