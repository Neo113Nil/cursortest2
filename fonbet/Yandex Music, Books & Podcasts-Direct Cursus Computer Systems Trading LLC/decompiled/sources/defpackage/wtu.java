package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class wtu implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ eii b;
    public final /* synthetic */ ltu c;
    public final /* synthetic */ wn5 d;
    public final /* synthetic */ ab0 e;

    public /* synthetic */ wtu(eii eiiVar, ltu ltuVar, wn5 wn5Var, ab0 ab0Var, int i) {
        this.b = eiiVar;
        this.c = ltuVar;
        this.d = wn5Var;
        this.e = ab0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ltu ltuVar = this.c;
                boolean booleanValue = ((Boolean) bcx.x(ltuVar.t, hq5Var, 0).getValue()).booleanValue();
                ywf.k(this.e, this.d, ild.C(-714973817, new cii(this.b), hq5Var), ltuVar, booleanValue, hq5Var, 384);
            default:
                num.getClass();
                uwf.e(this.b, this.c, this.d, this.e, hq5Var, rvf.R(385));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wtu(ltu ltuVar, ab0 ab0Var, wn5 wn5Var, eii eiiVar) {
        this.c = ltuVar;
        this.e = ab0Var;
        this.d = wn5Var;
        this.b = eiiVar;
    }
}
