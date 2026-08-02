package defpackage;

/* loaded from: classes.dex */
public final class zme extends vwg {
    @Override // defpackage.twg
    public final int C0(v2e v2eVar) {
        zwg zwgVar = this.l.l.G.q;
        zwgVar.getClass();
        npf npfVar = zwgVar.s;
        if (!zwgVar.k) {
            qpf qpfVar = zwgVar.f;
            if (qpfVar.d == ipf.b) {
                npfVar.f = true;
                if (npfVar.b) {
                    qpfVar.f = true;
                    qpfVar.g = true;
                }
            } else {
                npfVar.g = true;
            }
        }
        zme zmeVar = zwgVar.D().Y;
        if (zmeVar != null) {
            zmeVar.h = true;
        }
        zwgVar.r();
        zme zmeVar2 = zwgVar.D().Y;
        if (zmeVar2 != null) {
            zmeVar2.h = false;
        }
        Integer num = (Integer) npfVar.i.get(v2eVar);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.q.i(intValue, v2eVar);
        return intValue;
    }

    @Override // defpackage.ffh
    public final int G(int i) {
        aqd t = this.l.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.c((f8j) mpfVar.F.d, mpfVar.m(), i);
    }

    @Override // defpackage.ffh
    public final int J(int i) {
        aqd t = this.l.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.a((f8j) mpfVar.F.d, mpfVar.m(), i);
    }

    @Override // defpackage.ffh
    public final ksk M(long j) {
        z0(j);
        f8j f8jVar = this.l;
        eqi y = f8jVar.l.y();
        Object[] objArr = y.a;
        int i = y.c;
        for (int i2 = 0; i2 < i; i2++) {
            zwg zwgVar = ((mpf) objArr[i2]).G.q;
            zwgVar.getClass();
            zwgVar.j = kpf.c;
        }
        mpf mpfVar = f8jVar.l;
        vwg.P0(this, mpfVar.w.b(this, mpfVar.m(), j));
        return this;
    }

    @Override // defpackage.vwg
    public final void Q0() {
        zwg zwgVar = this.l.l.G.q;
        zwgVar.getClass();
        zwgVar.I0();
    }

    @Override // defpackage.ffh
    public final int a(int i) {
        aqd t = this.l.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.d((f8j) mpfVar.F.d, mpfVar.m(), i);
    }

    @Override // defpackage.ffh
    public final int z(int i) {
        aqd t = this.l.l.t();
        kfh i2 = t.i();
        mpf mpfVar = (mpf) t.b;
        return i2.e((f8j) mpfVar.F.d, mpfVar.m(), i);
    }
}
