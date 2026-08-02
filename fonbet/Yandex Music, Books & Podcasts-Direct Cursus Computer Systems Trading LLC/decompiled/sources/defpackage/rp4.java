package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rp4 extends c6w {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final ris r;
    public pp4 s;
    public qp4 t;
    public long u;
    public long v;

    public rp4(op4 op4Var) {
        super(op4Var.a);
        this.l = op4Var.b;
        this.m = op4Var.c;
        this.n = op4Var.d;
        this.o = op4Var.e;
        this.p = op4Var.f;
        this.q = new ArrayList();
        this.r = new ris();
    }

    @Override // defpackage.c6w
    public final void G(sis sisVar) {
        if (this.t != null) {
            return;
        }
        I(sisVar);
    }

    public final void I(sis sisVar) {
        long j;
        long j2;
        long j3;
        ris risVar = this.r;
        sisVar.n(0, risVar);
        long j4 = risVar.p;
        pp4 pp4Var = this.s;
        long j5 = this.m;
        ArrayList arrayList = this.q;
        if (pp4Var == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            j = this.l;
            if (z) {
                long j6 = risVar.l;
                j += j6;
                j2 = j6 + j5;
            } else {
                j2 = j5;
            }
            this.u = j4 + j;
            this.v = j5 != Long.MIN_VALUE ? j4 + j2 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                np4 np4Var = (np4) arrayList.get(i);
                long j7 = this.u;
                long j8 = this.v;
                np4Var.e = j7;
                np4Var.f = j8;
            }
            j3 = j2;
        } else {
            j = this.u - j4;
            j3 = j5 != Long.MIN_VALUE ? this.v - j4 : Long.MIN_VALUE;
        }
        try {
            pp4 pp4Var2 = new pp4(sisVar, j, j3);
            this.s = pp4Var2;
            y(pp4Var2);
        } catch (qp4 e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((np4) arrayList.get(i2)).g = this.t;
            }
        }
    }

    @Override // defpackage.wvh
    public final boolean a(onh onhVar) {
        wvh wvhVar = this.k;
        return wvhVar.f().e.equals(onhVar.e) && wvhVar.a(onhVar);
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j) {
        np4 np4Var = new np4(this.k.n(uvhVar, zi7Var, j), this.n, this.u, this.v);
        this.q.add(np4Var);
        return np4Var;
    }

    @Override // defpackage.fr5, defpackage.wvh
    public final void p() {
        qp4 qp4Var = this.t;
        if (qp4Var != null) {
            throw qp4Var;
        }
        super.p();
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
        ArrayList arrayList = this.q;
        vq1.A(arrayList.remove(wohVar));
        this.k.s(((np4) wohVar).a);
        if (!arrayList.isEmpty() || this.o) {
            return;
        }
        pp4 pp4Var = this.s;
        pp4Var.getClass();
        I(pp4Var.e);
    }

    @Override // defpackage.fr5, defpackage.js2
    public final void z() {
        super.z();
        this.t = null;
        this.s = null;
    }
}
