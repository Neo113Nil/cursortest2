package com.yandex.passport.data.network;

import defpackage.k5r;

/* loaded from: classes4.dex */
public final class t0 {
    public final double a;
    public final double b;

    public t0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Double.compare(this.a, t0Var.a) == 0 && Double.compare(this.b, t0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Gps(lat=");
        sb.append(this.a);
        sb.append(", lon=");
        return k5r.n(sb, this.b, ')');
    }
}
