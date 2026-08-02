package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();
    public final double a;
    public final double b;

    public /* synthetic */ x(int i, double d, double d2) {
        if (3 != (i & 3)) {
            u7g.V(i, 3, v.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Double.compare(this.a, xVar.a) == 0 && Double.compare(this.b, xVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Point2D(x=");
        sb.append(this.a);
        sb.append(", y=");
        return k5r.n(sb, this.b, ')');
    }
}
