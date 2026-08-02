package io.appmetrica.analytics.impl;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes4.dex */
public final class X0 {
    public final String a;
    public final String b;
    public final CounterConfigurationReporterType c;
    public final int d;
    public final String e;
    public final String f;

    public X0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = counterConfigurationReporterType;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x0 = (X0) obj;
        return jl40.l(this.a, x0.a) && jl40.l(this.b, x0.b) && this.c == x0.c && this.d == x0.d && jl40.l(this.e, x0.e) && jl40.l(this.f, x0.f);
    }

    public final int hashCode() {
        int b = unr0.b(oyr.b(this.d, (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb.append(this.a);
        sb.append(", packageName=");
        sb.append(this.b);
        sb.append(", reporterType=");
        sb.append(this.c);
        sb.append(", processID=");
        sb.append(this.d);
        sb.append(", processSessionID=");
        sb.append(this.e);
        sb.append(", errorEnvironment=");
        return b64.p(sb, this.f, ')');
    }
}
