package io.appmetrica.analytics.impl;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class W0 {
    public final String a;
    public final String b;
    public final CounterConfigurationReporterType c;
    public final int d;
    public final String e;
    public final String f;

    public W0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i, String str3, String str4) {
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
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w0 = (W0) obj;
        return Intrinsics.d(this.a, w0.a) && Intrinsics.d(this.b, w0.b) && this.c == w0.c && this.d == w0.d && Intrinsics.d(this.e, w0.e) && Intrinsics.d(this.f, w0.f);
    }

    public final int hashCode() {
        int c = k5r.c(f1d.a(this.d, (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e);
        String str = this.f;
        return c + (str == null ? 0 : str.hashCode());
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
        return dfi.i(sb, this.f, ')');
    }
}
