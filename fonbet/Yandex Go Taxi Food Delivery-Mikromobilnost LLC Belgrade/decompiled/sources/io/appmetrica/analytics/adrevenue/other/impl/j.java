package io.appmetrica.analytics.adrevenue.other.impl;

import defpackage.unr0;

/* loaded from: classes9.dex */
public final class j {
    public final boolean a;
    public final boolean b;

    public j(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceSideAdRevenueOtherConfig(enabled=");
        sb.append(this.a);
        sb.append(", includeSource=");
        return unr0.u(sb, this.b, ')');
    }
}
