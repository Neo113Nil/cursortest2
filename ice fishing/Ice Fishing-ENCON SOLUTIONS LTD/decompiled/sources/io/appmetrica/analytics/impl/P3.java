package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class P3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4899a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4900b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f4901c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4902d;

    /* renamed from: e, reason: collision with root package name */
    public final CounterConfigurationReporterType f4903e;

    public P3(String str, String str2, Integer num, String str3, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f4899a = str;
        this.f4900b = str2;
        this.f4901c = num;
        this.f4902d = str3;
        this.f4903e = counterConfigurationReporterType;
    }

    public static P3 a(H3 h3) {
        return new P3(h3.f4459b.getApiKey(), h3.f4458a.f4214a.getAsString("PROCESS_CFG_PACKAGE_NAME"), h3.f4458a.f4214a.getAsInteger("PROCESS_CFG_PROCESS_ID"), h3.f4458a.f4214a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), h3.f4459b.getReporterType());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P3.class != obj.getClass()) {
            return false;
        }
        P3 p3 = (P3) obj;
        String str = this.f4899a;
        if (str == null ? p3.f4899a != null : !str.equals(p3.f4899a)) {
            return false;
        }
        if (!this.f4900b.equals(p3.f4900b)) {
            return false;
        }
        Integer num = this.f4901c;
        if (num == null ? p3.f4901c != null : !num.equals(p3.f4901c)) {
            return false;
        }
        String str2 = this.f4902d;
        if (str2 == null ? p3.f4902d == null : str2.equals(p3.f4902d)) {
            return this.f4903e == p3.f4903e;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4899a;
        int e2 = C1.a.e(this.f4900b, (str != null ? str.hashCode() : 0) * 31, 31);
        Integer num = this.f4901c;
        int hashCode = (e2 + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f4902d;
        return this.f4903e.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientDescription{mApiKey='" + this.f4899a + "', mPackageName='" + this.f4900b + "', mProcessID=" + this.f4901c + ", mProcessSessionID='" + this.f4902d + "', mReporterType=" + this.f4903e + '}';
    }
}
