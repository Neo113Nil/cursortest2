package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pwo extends xci implements epf, ofp {
    public two o;
    public boolean p;

    @Override // defpackage.epf
    public final int E(twg twgVar, ffh ffhVar, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return ffhVar.a(i);
    }

    @Override // defpackage.epf
    public final int M(twg twgVar, ffh ffhVar, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return ffhVar.G(i);
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        wfp.w(jfpVar);
        cwo cwoVar = new cwo(new owo(this, 0), new owo(this, 1), false);
        if (this.p) {
            wfp.y(jfpVar, cwoVar);
        } else {
            wfp.m(jfpVar, cwoVar);
        }
    }

    @Override // defpackage.epf
    public final int b(twg twgVar, ffh ffhVar, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return ffhVar.J(i);
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        kg5.p(j, this.p ? bxj.a : bxj.b);
        ksk M = ffhVar.M(ga6.b(j, 0, this.p ? ga6.i(j) : Integer.MAX_VALUE, 0, this.p ? Integer.MAX_VALUE : ga6.h(j), 5));
        int i = M.a;
        int i2 = ga6.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = M.b;
        int h = ga6.h(j);
        if (i3 > h) {
            i3 = h;
        }
        int i4 = M.b - i3;
        int i5 = M.a - i;
        if (!this.p) {
            i4 = i5;
        }
        two twoVar = this.o;
        u6k u6kVar = twoVar.d;
        u6k u6kVar2 = twoVar.a;
        u6kVar.i(i4);
        b2r G = wyf.G();
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            if (u6kVar2.h() > i4) {
                u6kVar2.i(i4);
            }
            wyf.b0(G, Q, e);
            this.o.b.i(this.p ? i3 : i);
            return mfh.m0(mfhVar, i, i3, new vk8(this, i4, M, 3));
        } catch (Throwable th) {
            wyf.b0(G, Q, e);
            throw th;
        }
    }

    @Override // defpackage.epf
    public final int p0(twg twgVar, ffh ffhVar, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return ffhVar.z(i);
    }
}
