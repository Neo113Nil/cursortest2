package com.yandex.plus.core.graphql.fragment;

import defpackage.f1d;
import defpackage.vz1;

/* loaded from: classes4.dex */
public final class hg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public hg(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        return this.a == hgVar.a && this.b == hgVar.b && this.c == hgVar.c && this.d == hgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f1d.a(this.c, f1d.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueIndent(indentLeft=");
        sb.append(this.a);
        sb.append(", indentRight=");
        sb.append(this.b);
        sb.append(", indentTop=");
        sb.append(this.c);
        sb.append(", indentBottom=");
        return vz1.r(sb, this.d, ')');
    }
}
