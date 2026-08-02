package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class nva implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qva b;

    public /* synthetic */ nva(qva qvaVar, int i) {
        this.a = i;
        this.b = qvaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                qs5 qs5Var = ywa.a;
                oq5 oq5Var2 = (oq5) hq5Var;
                qva qvaVar = this.b;
                boolean h = oq5Var2.h(qvaVar);
                Object K = oq5Var2.K();
                if (h || K == gq5.a) {
                    dda ddaVar = new dda(0, qvaVar, qva.class, "onAdClick", "onAdClick()V", 0, 18);
                    oq5Var2.k0(ddaVar);
                    K = ddaVar;
                }
                Function0 function0 = (Function0) ((h9f) K);
                function0.getClass();
                jf0.a(new qzm[]{qs5Var.a(new xwa(new swa(nu0.d(), nu0.e(), nu0.i(), nu0.j(), nu0.h(), nu0.i()), new rva(), new lwa(), new ift(function0)))}, qvaVar.y().H(), true, ild.C(1893888879, new nva(qvaVar, 1), oq5Var2), oq5Var2, 3464, 0);
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                cxb.h(this.b.z(), hq5Var2, 8);
        }
        return Unit.a;
    }
}
