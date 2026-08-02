package com.datadog.android.core.internal.time;

/* loaded from: classes4.dex */
public enum DatadogNtpEndpoint {
    NTP_0("0.datadog.pool.ntp.org"),
    NTP_1("1.datadog.pool.ntp.org"),
    NTP_2("2.datadog.pool.ntp.org"),
    NTP_3("3.datadog.pool.ntp.org");

    public final String host;

    DatadogNtpEndpoint(String str) {
        this.host = str;
    }
}
