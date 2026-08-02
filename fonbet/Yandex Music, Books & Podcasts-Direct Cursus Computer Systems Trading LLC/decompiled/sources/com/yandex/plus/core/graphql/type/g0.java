package com.yandex.plus.core.graphql.type;

import defpackage.q7g;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 {
    public final Object a;
    public final f0 b;
    public final q7g c;

    public g0(String str, f0 f0Var, q7g q7gVar) {
        str.getClass();
        this.a = str;
        this.b = f0Var;
        this.c = q7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.a, g0Var.a) && this.b.equals(g0Var.b) && this.c.equals(g0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PurchasePlanInput(commonPeriodDuration=" + this.a + ", commonPrice=" + this.b + ", quantity=" + this.c + ')';
    }
}
