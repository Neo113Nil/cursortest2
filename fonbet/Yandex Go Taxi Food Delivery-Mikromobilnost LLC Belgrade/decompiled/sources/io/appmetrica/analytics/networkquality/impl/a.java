package io.appmetrica.analytics.networkquality.impl;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes9.dex */
public final class a {
    public final long a;
    public final long b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final c g;

    public a(long j, long j2, String str, int i, String str2, String str3, c cVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && jl40.l(this.c, aVar.c) && this.d == aVar.d && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, unr0.b(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.g;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AttemptResult(timestamp=" + this.a + ", duration=" + this.b + ", status=" + this.c + ", httpCode=" + this.d + ", url=" + this.e + ", error=" + this.f + ", networkMetrics=" + this.g + ')';
    }
}
