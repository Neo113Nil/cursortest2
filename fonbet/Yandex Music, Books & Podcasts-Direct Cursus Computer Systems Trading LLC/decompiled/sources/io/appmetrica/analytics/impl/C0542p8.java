package io.appmetrica.analytics.impl;

import defpackage.vz1;

/* renamed from: io.appmetrica.analytics.impl.p8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0542p8 {
    public final long a;
    public final int b;

    public C0542p8(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0542p8)) {
            return false;
        }
        C0542p8 c0542p8 = (C0542p8) obj;
        return this.a == c0542p8.a && this.b == c0542p8.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.a);
        sb.append(", exponent=");
        return vz1.r(sb, this.b, ')');
    }
}
