package defpackage;

/* loaded from: classes9.dex */
public class wvf extends h3 {
    public int c;

    public wvf() {
        this.c = -1;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.c0(48, z);
        uvf K = g191Var.K();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            g191Var.W(z());
            while (i < length) {
                K.d0(this.a[i].toASN1Primitive());
                i++;
            }
            return;
        }
        a3[] a3VarArr = new a3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            a3 o = this.a[i3].toASN1Primitive().o();
            a3VarArr[i3] = o;
            i2 += o.k(true);
        }
        this.c = i2;
        g191Var.W(i2);
        while (i < length) {
            K.d0(a3VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(z(), z);
    }

    @Override // defpackage.h3, defpackage.a3
    public final a3 o() {
        return this;
    }

    @Override // defpackage.h3
    public final r1 u() {
        return new ovf(ad4.q(p()));
    }

    @Override // defpackage.h3
    public final v2 x() {
        return new cqf(gd4.q(q()));
    }

    @Override // defpackage.h3
    public final l3 y() {
        return new yvf(false, this.a);
    }

    public final int z() {
        if (this.c < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].toASN1Primitive().o().k(true);
            }
            this.c = i;
        }
        return this.c;
    }

    public wvf(b2 b2Var) {
        super(b2Var);
        this.c = -1;
    }
}
