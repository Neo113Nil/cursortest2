package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rpf implements dnr, mfh {
    public final /* synthetic */ upf a;
    public final /* synthetic */ zpf b;

    public rpf(zpf zpfVar) {
        this.b = zpfVar;
        this.a = zpfVar.h;
    }

    @Override // defpackage.jx7
    public final long B0(long j) {
        return this.a.B0(j);
    }

    @Override // defpackage.fxe
    public final boolean F() {
        return this.a.F();
    }

    @Override // defpackage.jx7
    public final int L(float f) {
        return this.a.L(f);
    }

    @Override // defpackage.jx7
    public final float N(long j) {
        return this.a.N(j);
    }

    @Override // defpackage.mfh
    public final lfh W(int i, int i2, Map map, Function1 function1) {
        return this.a.W(i, i2, map, function1);
    }

    @Override // defpackage.jx7
    public final float c0(int i) {
        return this.a.c0(i);
    }

    @Override // defpackage.jx7
    public final float d0(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.a.b;
    }

    @Override // defpackage.fxe
    public final xof getLayoutDirection() {
        return this.a.a;
    }

    @Override // defpackage.dnr
    public final List i(Object obj, Function2 function2) {
        zpf zpfVar = this.b;
        mpf mpfVar = zpfVar.a;
        mpf mpfVar2 = (mpf) zpfVar.g.g(obj);
        if (mpfVar2 != null && ((eqi) ((epi) mpfVar.p()).b).k(mpfVar2) < zpfVar.d) {
            return mpfVar2.n();
        }
        tpi tpiVar = zpfVar.j;
        eqi eqiVar = zpfVar.m;
        if (eqiVar.c < zpfVar.e) {
            sme.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = eqiVar.c;
        int i2 = zpfVar.e;
        if (i == i2) {
            eqiVar.d(obj);
        } else {
            Object[] objArr = eqiVar.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        zpfVar.e++;
        if (!tpiVar.b(obj)) {
            zpfVar.l.m(obj, zpfVar.g(obj, function2));
            if (mpfVar.G.d == ipf.c) {
                mpfVar.S(true);
            } else {
                mpf.T(mpfVar, true, 6);
            }
        }
        mpf mpfVar3 = (mpf) tpiVar.g(obj);
        if (mpfVar3 == null) {
            return c5b.a;
        }
        List C0 = mpfVar3.G.p.C0();
        int size = C0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((jfh) ((epi) C0).get(i3)).f.b = true;
        }
        return C0;
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.a.c;
    }

    @Override // defpackage.jx7
    public final long l(float f) {
        return this.a.l(f);
    }

    @Override // defpackage.jx7
    public final long m(long j) {
        return this.a.m(j);
    }

    @Override // defpackage.jx7
    public final float n0(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.jx7
    public final float p(long j) {
        return this.a.p(j);
    }

    @Override // defpackage.jx7
    public final int s0(long j) {
        return this.a.s0(j);
    }

    @Override // defpackage.jx7
    public final long w(float f) {
        return this.a.w(f);
    }

    @Override // defpackage.mfh
    public final lfh w0(int i, int i2, Map map, Function1 function1) {
        return this.a.W(i, i2, map, function1);
    }
}
