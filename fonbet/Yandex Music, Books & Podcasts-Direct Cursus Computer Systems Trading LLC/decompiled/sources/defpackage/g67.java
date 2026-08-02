package defpackage;

/* loaded from: classes5.dex */
public final class g67 extends li2 {
    public final boolean d;

    public g67(int i, int i2, boolean z, x0 x0Var) {
        super(i, i2, x0Var);
        this.d = z;
    }

    @Override // defpackage.li2, defpackage.xge
    public final s0 m() {
        boolean z = this.d;
        x0 x0Var = this.c;
        int i = this.a;
        int i2 = this.b;
        if (z) {
            return z0.B(i, i2, x0Var.X());
        }
        ki2 ki2Var = new ki2(4, i, i2, new a07(((uu7) ((r5g) x0Var.c)).b()), 2);
        return i != 64 ? ki2Var : new a67(ki2Var);
    }
}
