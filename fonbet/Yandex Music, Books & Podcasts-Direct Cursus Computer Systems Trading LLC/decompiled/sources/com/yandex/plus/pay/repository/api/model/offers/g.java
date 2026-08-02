package com.yandex.plus.pay.repository.api.model.offers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {
    public final i1 a;
    public final i1 b;

    public g(i1 i1Var, i1 i1Var2) {
        this.a = i1Var;
        this.b = i1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.a, gVar.a) && Intrinsics.d(this.b, gVar.b);
    }

    public final int hashCode() {
        i1 i1Var = this.a;
        int hashCode = (i1Var == null ? 0 : i1Var.hashCode()) * 31;
        i1 i1Var2 = this.b;
        return hashCode + (i1Var2 != null ? i1Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ButtonAsset(badgeText=" + this.a + ", subtitleText=" + this.b + ')';
    }
}
