package com.yandex.plus.core.graphql.fragment;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h1 {
    public final String a;
    public final f1 b;
    public final g1 c;

    public h1(String str, f1 f1Var, g1 g1Var) {
        str.getClass();
        this.a = str;
        this.b = f1Var;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.a, h1Var.a) && Intrinsics.d(this.b, h1Var.b) && Intrinsics.d(this.c, h1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f1 f1Var = this.b;
        int hashCode2 = (hashCode + (f1Var == null ? 0 : f1Var.a.hashCode())) * 31;
        g1 g1Var = this.c;
        return hashCode2 + (g1Var != null ? g1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Value(__typename=" + this.a + ", onGradientColor=" + this.b + ", onHexColor=" + this.c + ')';
    }
}
