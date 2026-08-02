package io.appmetrica.analytics.networkquality.impl;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.Map;

/* loaded from: classes9.dex */
public final class t {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public t(String str, String str2, Map map, String str3, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = z;
        this.l = z2;
        this.m = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return jl40.l(this.a, tVar.a) && jl40.l(this.b, tVar.b) && jl40.l(this.c, tVar.c) && jl40.l(this.d, tVar.d) && this.e == tVar.e && this.f == tVar.f && this.g == tVar.g && this.h == tVar.h && this.i == tVar.i && this.j == tVar.j && this.k == tVar.k && this.l == tVar.l && this.m == tVar.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + unr0.e(unr0.e(oyr.b(this.j, oyr.b(this.i, oyr.b(this.h, oyr.b(this.g, oyr.b(this.f, oyr.b(this.e, unr0.b(unr0.d(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31), 31), 31), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestConfig(url=");
        sb.append(this.a);
        sb.append(", method=");
        sb.append(this.b);
        sb.append(", headers=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", delay=");
        sb.append(this.e);
        sb.append(", retryCount=");
        sb.append(this.f);
        sb.append(", retryBaseDelay=");
        sb.append(this.g);
        sb.append(", retryJitter=");
        sb.append(this.h);
        sb.append(", connectTimeoutSeconds=");
        sb.append(this.i);
        sb.append(", attemptTimeoutSeconds=");
        sb.append(this.j);
        sb.append(", retryOnSuccess=");
        sb.append(this.k);
        sb.append(", collectNetworkMetrics=");
        sb.append(this.l);
        sb.append(", networkMetricsFailureOnly=");
        return unr0.u(sb, this.m, ')');
    }
}
