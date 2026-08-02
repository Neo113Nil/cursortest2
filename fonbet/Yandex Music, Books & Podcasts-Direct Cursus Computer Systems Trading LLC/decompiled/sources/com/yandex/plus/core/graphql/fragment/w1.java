package com.yandex.plus.core.graphql.fragment;

import defpackage.tlm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w1 {
    public final d2 a;
    public final long b;
    public final y1 c;

    public w1(d2 d2Var, long j, y1 y1Var) {
        this.a = d2Var;
        this.b = j;
        this.c = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return this.a.equals(w1Var.a) && this.b == w1Var.b && Intrinsics.d(this.c, w1Var.c);
    }

    public final int hashCode() {
        int c = tlm.c(this.b, this.a.hashCode() * 31, 31);
        y1 y1Var = this.c;
        return c + (y1Var == null ? 0 : y1Var.hashCode());
    }

    public final String toString() {
        return "Invoice(totalPrice=" + this.a + ", timestamp=" + this.b + ", maxPoints=" + this.c + ')';
    }
}
