package io.appmetrica.analytics.adrevenue.other.impl;

import defpackage.unr0;

/* loaded from: classes9.dex */
public final class e {
    public final boolean a;
    public final boolean b;

    public e(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSideAdRevenueOtherConfig(enabled=");
        sb.append(this.a);
        sb.append(", includeSource=");
        return unr0.u(sb, this.b, ')');
    }
}
