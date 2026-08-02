package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k5r;
import defpackage.u7g;
import defpackage.vhp;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class b2 implements i2 {

    @NotNull
    public static final a2 Companion = new a2();
    public final double a;

    public /* synthetic */ b2(int i, double d) {
        if (1 == (i & 1)) {
            this.a = d;
        } else {
            u7g.V(i, 1, z1.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && Double.compare(this.a, ((b2) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return k5r.n(new StringBuilder("DoubleValue(value="), this.a, ')');
    }

    public b2(double d) {
        this.a = d;
    }
}
