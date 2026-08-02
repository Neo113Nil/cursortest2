package com.yandex.plus.pay.repository.api.model.offers;

import defpackage.vz1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 {
    public final String a;
    public final n0 b;
    public final int c;

    public j1(String str, n0 n0Var, int i) {
        str.getClass();
        this.a = str;
        this.b = n0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.d(this.a, j1Var.a) && this.b.equals(j1Var.b) && this.c == j1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Plan(period=");
        sb.append(this.a);
        sb.append(", price=");
        sb.append(this.b);
        sb.append(", quantity=");
        return vz1.r(sb, this.c, ')');
    }
}
