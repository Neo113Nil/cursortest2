package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p14 {
    public final Object a;
    public final Object b;
    public final Object c;

    public p14(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p14)) {
            return false;
        }
        p14 p14Var = (p14) obj;
        return Intrinsics.d(this.a, p14Var.a) && Intrinsics.d(this.b, p14Var.b) && Intrinsics.d(this.c, p14Var.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "CarouselContent(left=" + this.a + ", center=" + this.b + ", right=" + this.c + ")";
    }
}
