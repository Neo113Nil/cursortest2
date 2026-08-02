package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class z0 extends s0 implements xge {
    public final int a;
    public final int b;
    public final int c;
    public final d0 d;

    public z0(int i, int i2, int i3, d0 d0Var) {
        if (d0Var == null) {
            jj4.j("'obj' cannot be null");
            throw null;
        }
        if (i2 == 0 || (i2 & 192) != i2) {
            xq0.x(k5r.i(i2, "invalid tag class: "));
            throw null;
        }
        this.a = d0Var instanceof c0 ? 1 : i;
        this.b = i2;
        this.c = i3;
        this.d = d0Var;
    }

    public static z0 B(int i, int i2, e0 e0Var) {
        int i3;
        ki2 ki2Var;
        if (e0Var.c == 1) {
            i3 = i;
            ki2Var = new ki2(3, i3, i2, e0Var.g(0), 2);
        } else {
            i3 = i;
            ki2Var = new ki2(4, i, i2, d67.a(e0Var), 2);
        }
        return i3 != 64 ? ki2Var : new a67(ki2Var);
    }

    @Override // defpackage.s0
    public s0 A() {
        return new ki2(this.a, this.b, this.c, this.d, 2);
    }

    public final boolean D() {
        int i = this.a;
        return i == 1 || i == 3;
    }

    public abstract v0 E(s0 s0Var);

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return (((this.b * 7919) ^ this.c) ^ (D() ? 15 : 240)) ^ this.d.n().hashCode();
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (!(s0Var instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) s0Var;
        if (this.c != z0Var.c || this.b != z0Var.b) {
            return false;
        }
        if (this.a != z0Var.a && D() != z0Var.D()) {
            return false;
        }
        s0 n = this.d.n();
        s0 n2 = z0Var.d.n();
        if (n == n2) {
            return true;
        }
        if (D()) {
            return n.t(n2);
        }
        try {
            return Arrays.equals(r(), z0Var.r());
        } catch (IOException unused) {
            return false;
        }
    }

    public final String toString() {
        return h4a.w(this.b, this.c) + this.d;
    }

    @Override // defpackage.s0
    public s0 z() {
        return new ki2(this.a, this.b, this.c, this.d, 1);
    }

    @Override // defpackage.xge
    public final s0 m() {
        return this;
    }
}
