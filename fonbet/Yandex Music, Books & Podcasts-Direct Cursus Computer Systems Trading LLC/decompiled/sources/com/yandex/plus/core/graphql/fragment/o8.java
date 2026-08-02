package com.yandex.plus.core.graphql.fragment;

import defpackage.dfi;

/* loaded from: classes4.dex */
public final class o8 {
    public final double a;
    public final String b;

    public o8(double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return Double.compare(this.a, o8Var.a) == 0 && this.b.equals(o8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HexColorFragment(a=");
        sb.append(this.a);
        sb.append(", hex=");
        return dfi.i(sb, this.b, ')');
    }
}
