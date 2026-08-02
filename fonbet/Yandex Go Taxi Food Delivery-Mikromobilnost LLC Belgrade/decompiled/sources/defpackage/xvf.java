package defpackage;

/* loaded from: classes4.dex */
public class xvf extends i3 {
    public int c;

    public xvf() {
        this.c = -1;
    }

    @Override // defpackage.i3
    public final s1 C() {
        return new pvf(bd4.A(u()));
    }

    @Override // defpackage.i3
    public final opf E() {
        return new opf(this, 1);
    }

    @Override // defpackage.i3
    public final w2 F() {
        return new dqf(hd4.y(x()));
    }

    @Override // defpackage.i3
    public final m3 G() {
        return new zvf(this.a);
    }

    public final int I() {
        if (this.c < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].toASN1Primitive().t().p(true);
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.M(48, z);
        vvf u = ryhVar.u();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            ryhVar.G(I());
            while (i < length) {
                u.N(this.a[i].toASN1Primitive());
                i++;
            }
            return;
        }
        b3[] b3VarArr = new b3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            b3 t = this.a[i3].toASN1Primitive().t();
            b3VarArr[i3] = t;
            i2 += t.p(true);
        }
        this.c = i2;
        ryhVar.G(i2);
        while (i < length) {
            u.N(b3VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(I(), z);
    }

    @Override // defpackage.i3, defpackage.b3
    public final b3 t() {
        return this;
    }

    public xvf(c2 c2Var) {
        super(c2Var);
        this.c = -1;
    }
}
