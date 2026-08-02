package com.google.android.datatransport.cct.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AutoValue_LogEvent extends LogEvent {
    public final ComplianceData complianceData;
    public final Integer eventCode;
    public final long eventTimeMs;
    public final long eventUptimeMs;
    public final NetworkConnectionInfo networkConnectionInfo;
    public final byte[] sourceExtension;
    public final String sourceExtensionJsonProto3;
    public final long timezoneOffsetSeconds;

    public AutoValue_LogEvent(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo) {
        this.eventTimeMs = j;
        this.eventCode = num;
        this.complianceData = complianceData;
        this.eventUptimeMs = j2;
        this.sourceExtension = bArr;
        this.sourceExtensionJsonProto3 = str;
        this.timezoneOffsetSeconds = j3;
        this.networkConnectionInfo = networkConnectionInfo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogEvent) {
            LogEvent logEvent = (LogEvent) obj;
            AutoValue_LogEvent autoValue_LogEvent = (AutoValue_LogEvent) logEvent;
            if (this.eventTimeMs == autoValue_LogEvent.eventTimeMs) {
                Integer num = autoValue_LogEvent.eventCode;
                Integer num2 = this.eventCode;
                if (num2 != null ? num2.equals(num) : num == null) {
                    ComplianceData complianceData = autoValue_LogEvent.complianceData;
                    ComplianceData complianceData2 = this.complianceData;
                    if (complianceData2 != null ? complianceData2.equals(complianceData) : complianceData == null) {
                        if (this.eventUptimeMs == autoValue_LogEvent.eventUptimeMs) {
                            if (Arrays.equals(this.sourceExtension, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).sourceExtension : autoValue_LogEvent.sourceExtension)) {
                                String str = autoValue_LogEvent.sourceExtensionJsonProto3;
                                String str2 = this.sourceExtensionJsonProto3;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.timezoneOffsetSeconds == autoValue_LogEvent.timezoneOffsetSeconds) {
                                        NetworkConnectionInfo networkConnectionInfo = autoValue_LogEvent.networkConnectionInfo;
                                        NetworkConnectionInfo networkConnectionInfo2 = this.networkConnectionInfo;
                                        if (networkConnectionInfo2 != null ? networkConnectionInfo2.equals(networkConnectionInfo) : networkConnectionInfo == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.eventTimeMs;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.eventCode;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.complianceData;
        int hashCode2 = (hashCode ^ (complianceData == null ? 0 : complianceData.hashCode())) * 1000003;
        long j2 = this.eventUptimeMs;
        int hashCode3 = (((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.sourceExtension)) * 1000003;
        String str = this.sourceExtensionJsonProto3;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.timezoneOffsetSeconds;
        int i2 = (hashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.networkConnectionInfo;
        return i2 ^ (networkConnectionInfo != null ? networkConnectionInfo.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.eventTimeMs + ", eventCode=" + this.eventCode + ", complianceData=" + this.complianceData + ", eventUptimeMs=" + this.eventUptimeMs + ", sourceExtension=" + Arrays.toString(this.sourceExtension) + ", sourceExtensionJsonProto3=" + this.sourceExtensionJsonProto3 + ", timezoneOffsetSeconds=" + this.timezoneOffsetSeconds + ", networkConnectionInfo=" + this.networkConnectionInfo + "}";
    }
}
