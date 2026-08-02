package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qh5 {
    public final wh5 a;
    public final boolean b;
    public final Long c;
    public final Long d;

    public qh5(wh5 wh5Var, boolean z, Long l, Long l2) {
        this.a = wh5Var;
        this.b = z;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh5)) {
            return false;
        }
        qh5 qh5Var = (qh5) obj;
        return this.a == qh5Var.a && this.b == qh5Var.b && Intrinsics.d(this.c, qh5Var.c) && Intrinsics.d(this.d, qh5Var.d);
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int hashCode = (e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "Meta(uiType=" + this.a + ", hasTabDot=" + this.b + ", showAfter=" + this.c + ", showBefore=" + this.d + ")";
    }
}
