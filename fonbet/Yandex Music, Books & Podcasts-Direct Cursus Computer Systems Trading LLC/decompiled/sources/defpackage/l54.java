package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l54 {
    public final ya0 a;
    public final oe6 b;
    public final fk0 c;
    public final fk0 d;

    public l54(ya0 ya0Var, oe6 oe6Var, fk0 fk0Var, fk0 fk0Var2) {
        ya0Var.getClass();
        oe6Var.getClass();
        this.a = ya0Var;
        this.b = oe6Var;
        this.c = fk0Var;
        this.d = fk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l54)) {
            return false;
        }
        l54 l54Var = (l54) obj;
        return Intrinsics.d(this.a, l54Var.a) && Intrinsics.d(this.b, l54Var.b) && Intrinsics.d(this.c, l54Var.c) && Intrinsics.d(this.d, l54Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CarouselState(anchoredDraggableState=" + this.a + ", contentWithItems=" + this.b + ", leftOffset=" + this.c + ", rightOffset=" + this.d + ")";
    }

    public /* synthetic */ l54(ya0 ya0Var, oe6 oe6Var) {
        this(ya0Var, oe6Var, vq2.a(0.0f), vq2.a(0.0f));
    }
}
