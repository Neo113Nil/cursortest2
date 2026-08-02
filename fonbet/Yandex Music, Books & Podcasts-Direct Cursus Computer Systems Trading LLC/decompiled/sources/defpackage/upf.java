package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class upf implements dnr {
    public xof a = xof.b;
    public float b;
    public float c;
    public final /* synthetic */ zpf d;

    public upf(zpf zpfVar) {
        this.d = zpfVar;
    }

    @Override // defpackage.fxe
    public final boolean F() {
        ipf ipfVar = this.d.a.G.d;
        return ipfVar == ipf.d || ipfVar == ipf.b;
    }

    @Override // defpackage.mfh
    public final lfh W(int i, int i2, Map map, Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            sme.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new tpf(i, i2, map, this, this.d, function1);
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.b;
    }

    @Override // defpackage.fxe
    public final xof getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.dnr
    public final List i(Object obj, Function2 function2) {
        zpf zpfVar = this.d;
        zpfVar.d();
        mpf mpfVar = zpfVar.a;
        ipf ipfVar = mpfVar.G.d;
        ipf ipfVar2 = ipf.a;
        if (ipfVar != ipfVar2 && ipfVar != ipf.c && ipfVar != ipf.b && ipfVar != ipf.d) {
            sme.b("subcompose can only be used inside the measure or layout blocks");
        }
        tpi tpiVar = zpfVar.g;
        Object g = tpiVar.g(obj);
        if (g == null) {
            g = (mpf) zpfVar.j.k(obj);
            if (g != null) {
                if (zpfVar.o <= 0) {
                    sme.b("Check failed.");
                }
                zpfVar.o--;
            } else {
                g = zpfVar.j(obj);
                if (g == null) {
                    int i = zpfVar.d;
                    mpf mpfVar2 = new mpf(2);
                    mpfVar.q = true;
                    mpfVar.A(i, mpfVar2);
                    mpfVar.q = false;
                    g = mpfVar2;
                }
            }
            tpiVar.m(obj, g);
        }
        mpf mpfVar3 = (mpf) g;
        if (CollectionsKt.S(mpfVar.p(), zpfVar.d) != mpfVar3) {
            int k = ((eqi) ((epi) mpfVar.p()).b).k(mpfVar3);
            if (k < zpfVar.d) {
                sme.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = zpfVar.d;
            if (i2 != k) {
                mpfVar.q = true;
                mpfVar.K(k, i2, 1);
                mpfVar.q = false;
            }
        }
        zpfVar.d++;
        zpfVar.h(mpfVar3, obj, function2);
        return (ipfVar == ipfVar2 || ipfVar == ipf.c) ? mpfVar3.n() : mpfVar3.m();
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.c;
    }
}
