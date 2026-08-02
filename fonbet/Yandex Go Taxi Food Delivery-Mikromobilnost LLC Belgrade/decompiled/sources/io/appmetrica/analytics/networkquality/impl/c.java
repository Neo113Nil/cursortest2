package io.appmetrica.analytics.networkquality.impl;

import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes9.dex */
public final class c {
    public final Long a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final long f;
    public final boolean g;
    public final String h;

    public c(Long l, Long l2, Long l3, Long l4, Long l5, long j, boolean z, String str) {
        this.a = l;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = l5;
        this.f = j;
        this.g = z;
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g && jl40.l(this.h, cVar.h);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.c;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.d;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.e;
        int e = unr0.e(qv10.c((hashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkMetrics(dnsLookup=");
        sb.append(this.a);
        sb.append(", tcpConnect=");
        sb.append(this.b);
        sb.append(", tlsHandshake=");
        sb.append(this.c);
        sb.append(", timeToFirstByte=");
        sb.append(this.d);
        sb.append(", response=");
        sb.append(this.e);
        sb.append(", total=");
        sb.append(this.f);
        sb.append(", connectionReused=");
        sb.append(this.g);
        sb.append(", protocol=");
        return b64.p(sb, this.h, ')');
    }
}
