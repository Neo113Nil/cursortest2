package com.yandex.plus.core.graphql.type;

import defpackage.f1d;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 {
    public final BigDecimal a;
    public final Object b;

    public f0(BigDecimal bigDecimal, Object obj) {
        bigDecimal.getClass();
        obj.getClass();
        this.a = bigDecimal;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.a, f0Var.a) && Intrinsics.d(this.b, f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PriceISO4217Input(amount=");
        sb.append(this.a);
        sb.append(", currency=");
        return f1d.j(sb, this.b, ')');
    }
}
