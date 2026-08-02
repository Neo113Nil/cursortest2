package defpackage;

/* loaded from: classes4.dex */
public class zvf extends m3 {
    public int w;

    public zvf(c2 c2Var) {
        super(c2Var, false);
        this.w = -1;
    }

    public final int A() {
        if (this.w < 0) {
            int i = 0;
            for (a2 a2Var : this.a) {
                i += a2Var.toASN1Primitive().t().p(true);
            }
            this.w = i;
        }
        return this.w;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.M(49, z);
        vvf u = ryhVar.u();
        a2[] a2VarArr = this.a;
        int length = a2VarArr.length;
        int i = 0;
        if (this.w >= 0 || length > 16) {
            ryhVar.G(A());
            while (i < length) {
                u.N(a2VarArr[i].toASN1Primitive());
                i++;
            }
            return;
        }
        b3[] b3VarArr = new b3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            b3 t = a2VarArr[i3].toASN1Primitive().t();
            b3VarArr[i3] = t;
            i2 += t.p(true);
        }
        this.w = i2;
        ryhVar.G(i2);
        while (i < length) {
            u.N(b3VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(A(), z);
    }

    @Override // defpackage.m3, defpackage.b3
    public final b3 t() {
        return this;
    }

    public zvf() {
        this.w = -1;
    }

    public zvf(a2[] a2VarArr) {
        super(false, a2VarArr);
        this.w = -1;
    }
}
