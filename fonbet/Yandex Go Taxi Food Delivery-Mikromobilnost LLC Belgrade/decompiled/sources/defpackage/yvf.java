package defpackage;

/* loaded from: classes9.dex */
public class yvf extends l3 {
    public int c;

    public yvf() {
        this.c = -1;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.c0(49, z);
        uvf K = g191Var.K();
        z1[] z1VarArr = this.a;
        int length = z1VarArr.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            g191Var.W(s());
            while (i < length) {
                K.d0(z1VarArr[i].toASN1Primitive());
                i++;
            }
            return;
        }
        a3[] a3VarArr = new a3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            a3 o = z1VarArr[i3].toASN1Primitive().o();
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
        return g191.M(s(), z);
    }

    @Override // defpackage.l3, defpackage.a3
    public final a3 o() {
        return this;
    }

    public final int s() {
        if (this.c < 0) {
            int i = 0;
            for (z1 z1Var : this.a) {
                i += z1Var.toASN1Primitive().o().k(true);
            }
            this.c = i;
        }
        return this.c;
    }

    public yvf(boolean z, z1[] z1VarArr) {
        super(z, z1VarArr);
        this.c = -1;
    }
}
