package io.appmetrica.analytics.networkquality.impl;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class u {
    public final long a;
    public final long b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final List h;

    public u(long j, long j2, String str, boolean z, boolean z2, int i, int i2, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b == uVar.b && jl40.l(this.c, uVar.c) && this.d == uVar.d && this.e == uVar.e && this.f == uVar.f && this.g == uVar.g && jl40.l(this.h, uVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + oyr.b(this.g, oyr.b(this.f, unr0.e(unr0.e(unr0.b(qv10.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestResult(timestamp=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", ok=");
        sb.append(this.d);
        sb.append(", anyResponse=");
        sb.append(this.e);
        sb.append(", attempts=");
        sb.append(this.f);
        sb.append(", successfulAttempts=");
        sb.append(this.g);
        sb.append(", attemptResults=");
        return unr0.t(sb, this.h, ')');
    }
}
