package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class eu7 {
    public final cu7 a;
    public final du7 b;

    public eu7(cu7 cu7Var, du7 du7Var) {
        cu7Var.getClass();
        du7Var.getClass();
        this.a = cu7Var;
        this.b = du7Var;
        int i = du7Var.a;
        int i2 = du7Var.b;
        if (Intrinsics.e(i, -1) < 0) {
            su4.s(2, null, hrg.q("The current position (", ran.a(i), ") shouldn't be less than -1. -1 is the special value for an empty queue."), null);
        }
        if (Intrinsics.e(i, i2) > 0) {
            su4.s(2, null, hrg.s("The current position (", ran.a(i), ") shouldn't be greater than the live position (", ran.a(i2), ")"), null);
        }
        int size = cu7Var.a.getElements().size();
        if (Intrinsics.e(i2, size) <= 0) {
            return;
        }
        su4.s(2, null, "The live position (" + ran.a(i2) + ") shouldn't be greater than the fixed queue size (" + size + "). But can be equal to it in state of waiting for the future elements.", null);
    }

    public static eu7 a(eu7 eu7Var, cu7 cu7Var, du7 du7Var, int i) {
        if ((i & 1) != 0) {
            cu7Var = eu7Var.a;
        }
        if ((i & 2) != 0) {
            du7Var = eu7Var.b;
        }
        eu7Var.getClass();
        cu7Var.getClass();
        du7Var.getClass();
        return new eu7(cu7Var, du7Var);
    }

    public final mwk b() {
        return this.a.d(c());
    }

    public final int c() {
        int i = this.b.a;
        if (f()) {
            return i;
        }
        rj7.g(hrg.q("Queue does not contain current element (position = ", ran.a(i), ")"));
        return 0;
    }

    public final int d() {
        int i = this.b.a;
        int i2 = i + 1;
        if (this.a.f(i + 1)) {
            return i2;
        }
        rj7.g(hrg.q("Queue does not contain next element (position = ", ran.a(i2), ")"));
        return 0;
    }

    public final int e() {
        int i = this.b.a - 1;
        if (g()) {
            return i;
        }
        rj7.g(hrg.q("Queue does not contain previous element (position = ", ran.a(i), ")"));
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu7)) {
            return false;
        }
        eu7 eu7Var = (eu7) obj;
        return Intrinsics.d(this.a, eu7Var.a) && Intrinsics.d(this.b, eu7Var.b);
    }

    public final boolean f() {
        return this.a.f(this.b.a);
    }

    public final boolean g() {
        return this.a.f(this.b.a - 1);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultWaveQueuePointer(waveQueue=" + this.a + ", position=" + this.b + ")";
    }
}
