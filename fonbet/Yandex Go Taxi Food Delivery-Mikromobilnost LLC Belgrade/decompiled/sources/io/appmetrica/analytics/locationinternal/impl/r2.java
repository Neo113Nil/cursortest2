package io.appmetrica.analytics.locationinternal.impl;

import defpackage.oyr;

/* loaded from: classes9.dex */
public final class r2 {
    public final long a;
    public final int b;

    public r2(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r2.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.a == r2Var.a && this.b == r2Var.b;
    }

    public final int hashCode() {
        return (Long.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThrottlingConfigItem(refreshPeriod=");
        sb.append(this.a);
        sb.append(", refreshEventCount=");
        return oyr.s(sb, this.b, ')');
    }
}
