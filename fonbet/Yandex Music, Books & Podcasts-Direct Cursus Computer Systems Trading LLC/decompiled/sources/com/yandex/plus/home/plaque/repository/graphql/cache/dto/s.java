package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();
    public final double a;
    public final double b;

    public /* synthetic */ s(int i, double d, double d2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, q.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Double.compare(this.a, sVar.a) == 0 && Double.compare(this.b, sVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointDto(x=");
        sb.append(this.a);
        sb.append(", y=");
        return k5r.n(sb, this.b, ')');
    }

    public s(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
