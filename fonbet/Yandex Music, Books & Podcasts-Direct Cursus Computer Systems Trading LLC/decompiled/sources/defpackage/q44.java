package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q44 {
    public final f24 a;
    public final Long b;
    public final Long c;

    public q44(f24 f24Var, Long l, Long l2) {
        f24Var.getClass();
        this.a = f24Var;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q44)) {
            return false;
        }
        q44 q44Var = (q44) obj;
        return this.a == q44Var.a && Intrinsics.d(this.b, q44Var.b) && Intrinsics.d(this.c, q44Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "CarouselSectionWithOrderMeta(type=" + this.a + ", actionTimestamp=" + this.b + ", pinTimestamp=" + this.c + ")";
    }
}
