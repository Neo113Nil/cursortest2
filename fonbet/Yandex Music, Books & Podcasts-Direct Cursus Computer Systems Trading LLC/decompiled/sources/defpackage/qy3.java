package defpackage;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class qy3 implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp7 b;

    public /* synthetic */ qy3(fp7 fp7Var, int i) {
        this.a = i;
        this.b = fp7Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.a) {
            case 0:
                yci yciVar = (yci) obj;
                pyc pycVar = (pyc) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                yciVar.getClass();
                pycVar.getClass();
                if ((intValue & 6) == 0) {
                    i = (((oq5) hq5Var).f(yciVar) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((oq5) hq5Var).h(pycVar) ? 32 : 16;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 147) != 146)) {
                    rvf.a(this.b, yciVar, null, null, 2, 0.0f, null, null, false, null, null, null, null, ild.C(2084487447, new t31(4, pycVar), oq5Var), oq5Var, ((i << 3) & 112) | 24576, 24576, 16364);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                irf.x(this.b, null, (hq5) obj3, 0);
                break;
        }
        return Unit.a;
    }
}
