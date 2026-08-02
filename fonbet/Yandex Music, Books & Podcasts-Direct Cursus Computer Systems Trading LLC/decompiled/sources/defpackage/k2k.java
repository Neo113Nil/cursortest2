package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k2k {
    public final lb9 a;
    public final eb9 b;

    public k2k(lb9 lb9Var, eb9 eb9Var) {
        this.a = lb9Var;
        this.b = eb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2k)) {
            return false;
        }
        k2k k2kVar = (k2k) obj;
        return Intrinsics.d(this.a, k2kVar.a) && this.b.equals(k2kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IndicatorData(indicator=" + this.a + ", pagerDiv=" + this.b + ')';
    }
}
