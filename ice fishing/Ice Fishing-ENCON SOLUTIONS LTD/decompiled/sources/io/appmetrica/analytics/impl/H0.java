package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4452b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f4453c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4454d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4455e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4456f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i2, String str3, String str4) {
        this.f4451a = str;
        this.f4452b = str2;
        this.f4453c = counterConfigurationReporterType;
        this.f4454d = i2;
        this.f4455e = str3;
        this.f4456f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return kotlin.jvm.internal.i.a(this.f4451a, h02.f4451a) && kotlin.jvm.internal.i.a(this.f4452b, h02.f4452b) && this.f4453c == h02.f4453c && this.f4454d == h02.f4454d && kotlin.jvm.internal.i.a(this.f4455e, h02.f4455e) && kotlin.jvm.internal.i.a(this.f4456f, h02.f4456f);
    }

    public final int hashCode() {
        int e2 = C1.a.e(this.f4455e, (Integer.hashCode(this.f4454d) + ((this.f4453c.hashCode() + C1.a.e(this.f4452b, this.f4451a.hashCode() * 31, 31)) * 31)) * 31, 31);
        String str = this.f4456f;
        return e2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f4451a + ", packageName=" + this.f4452b + ", reporterType=" + this.f4453c + ", processID=" + this.f4454d + ", processSessionID=" + this.f4455e + ", errorEnvironment=" + this.f4456f + ')';
    }
}
