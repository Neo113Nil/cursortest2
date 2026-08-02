package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m54 {
    public final nvr a;
    public final pe6 b;
    public final fk0 c;
    public final fk0 d;

    public m54(nvr nvrVar, pe6 pe6Var, fk0 fk0Var, fk0 fk0Var2) {
        pe6Var.getClass();
        this.a = nvrVar;
        this.b = pe6Var;
        this.c = fk0Var;
        this.d = fk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m54)) {
            return false;
        }
        m54 m54Var = (m54) obj;
        return Intrinsics.d(this.a, m54Var.a) && Intrinsics.d(this.b, m54Var.b) && Intrinsics.d(this.c, m54Var.c) && Intrinsics.d(this.d, m54Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CarouselState(swipeableState=" + this.a + ", contentWithItems=" + this.b + ", leftOffset=" + this.c + ", rightOffset=" + this.d + ")";
    }

    public /* synthetic */ m54(nvr nvrVar, pe6 pe6Var) {
        this(nvrVar, pe6Var, vq2.a(0.0f), vq2.a(0.0f));
    }
}
