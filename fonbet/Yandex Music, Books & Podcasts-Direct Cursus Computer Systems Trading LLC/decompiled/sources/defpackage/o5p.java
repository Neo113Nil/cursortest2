package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class o5p implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6p b;
    public final /* synthetic */ u0q c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ j6i h;
    public final /* synthetic */ tmb i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ Function0 k;

    public /* synthetic */ o5p(l6p l6pVar, u0q u0qVar, float f, boolean z, Function1 function1, Function1 function12, j6i j6iVar, tmb tmbVar, Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = l6pVar;
        this.c = u0qVar;
        this.d = f;
        this.e = z;
        this.f = function1;
        this.g = function12;
        this.h = j6iVar;
        this.i = tmbVar;
        this.j = function0;
        this.k = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pm0.a(null, ild.C(1793737354, new o5p(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, 1), oq5Var), oq5Var, 48, 1);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                boolean z = false;
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    l6p l6pVar = this.b;
                    if ((l6pVar instanceof k6p) || ((l6pVar instanceof h6p) && ((h6p) l6pVar).g)) {
                        z = true;
                    }
                    Object[] objArr = {Boolean.valueOf(z)};
                    apo apoVar = fvf.w;
                    Object K = oq5Var2.K();
                    Object obj3 = gq5.a;
                    if (K == obj3) {
                        K = new e5o(18);
                        oq5Var2.k0(K);
                    }
                    fvf fvfVar = (fvf) o2g.g0(objArr, apoVar, (Function0) K, oq5Var2, 3072, 4);
                    Object obj4 = this.c;
                    boolean h = oq5Var2.h(obj4) | oq5Var2.f(fvfVar);
                    Object K2 = oq5Var2.K();
                    if (h || K2 == obj3) {
                        K2 = new s1n(obj4, fvfVar, (Continuation) null, 29);
                        oq5Var2.k0(K2);
                    }
                    gld.w(oq5Var2, obj4, (Function2) K2);
                    wn5 C = ild.C(936355541, new t2n(l6pVar, fvfVar, this.f), oq5Var2);
                    Function1 function1 = this.g;
                    j6i j6iVar = this.h;
                    tmb tmbVar = this.i;
                    Function0 function0 = this.j;
                    float f = this.d;
                    p5p.a(C, ild.C(348893270, new mz4(l6pVar, function1, j6iVar, tmbVar, function0, f, this.k), oq5Var2), f, this.e, vci.a, oq5Var2, 54);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
