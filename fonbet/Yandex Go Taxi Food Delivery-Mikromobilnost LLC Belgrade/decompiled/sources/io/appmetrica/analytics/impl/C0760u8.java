package io.appmetrica.analytics.impl;

import defpackage.oyr;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0760u8 {
    public final long a;
    public final int b;

    public C0760u8(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0760u8)) {
            return false;
        }
        C0760u8 c0760u8 = (C0760u8) obj;
        return this.a == c0760u8.a && this.b == c0760u8.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.a);
        sb.append(", exponent=");
        return oyr.s(sb, this.b, ')');
    }
}
