package defpackage;

import com.yandex.music.core.ui.compose.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class eyl implements ryc {
    public final /* synthetic */ int a;
    public final /* synthetic */ qzl b;
    public final /* synthetic */ jab c;

    public /* synthetic */ eyl(qzl qzlVar, jab jabVar, int i) {
        this.a = i;
        this.b = qzlVar;
        this.c = jabVar;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.a) {
            case 0:
                thj thjVar = (thj) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                String str = (String) obj4;
                thjVar.getClass();
                str.getClass();
                this.b.c(this.c, thjVar, null, str, booleanValue);
                break;
            case 1:
                thj thjVar2 = (thj) obj2;
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                String str2 = (String) obj4;
                thjVar2.getClass();
                str2.getClass();
                this.b.c(this.c, thjVar2, null, str2, booleanValue2);
                break;
            case 2:
                thj thjVar3 = (thj) obj2;
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                String str3 = (String) obj4;
                thjVar3.getClass();
                str3.getClass();
                this.b.c(this.c, thjVar3, (u0s) obj, str3, booleanValue3);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                avl avlVar = (avl) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                avlVar.getClass();
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).d(intValue) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= (intValue2 & 64) == 0 ? ((oq5) hq5Var).f(avlVar) : ((oq5) hq5Var).h(avlVar) ? 32 : 16;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(i & 1, (i & 147) != 146)) {
                    cvl cvlVar = avlVar.b;
                    boolean f = oq5Var.f(cvlVar) | ((i & 14) == 4);
                    Object K = oq5Var.K();
                    Object obj5 = gq5.a;
                    if (f || K == obj5) {
                        K = t7g.m(bfg.J(cvlVar), intValue);
                        oq5Var.k0(K);
                    }
                    thj thjVar4 = (thj) K;
                    qzl qzlVar = this.b;
                    qzlVar.getClass();
                    thjVar4.getClass();
                    boolean f2 = oq5Var.f(cvlVar);
                    Object K2 = oq5Var.K();
                    jab jabVar = this.c;
                    if (f2 || K2 == obj5) {
                        Object xpdVar = new xpd(cvlVar, new ime(28, qzlVar.h.a(jabVar, null), thjVar4, qzlVar));
                        oq5Var.k0(xpdVar);
                        K2 = xpdVar;
                    }
                    xpd xpdVar2 = (xpd) K2;
                    rab rabVar = avlVar.a;
                    boolean h = oq5Var.h(qzlVar) | oq5Var.h(jabVar) | oq5Var.h(thjVar4);
                    Object K3 = oq5Var.K();
                    if (h || K3 == obj5) {
                        K3 = new myl(qzlVar, jabVar, thjVar4, 1);
                        oq5Var.k0(K3);
                    }
                    yci b = a.b(vci.a, null, 0L, 0.0f, null, (Function2) K3, 15);
                    boolean h2 = oq5Var.h(xpdVar2);
                    Object K4 = oq5Var.K();
                    if (h2 || K4 == obj5) {
                        K4 = new kfa(xpdVar2, 2);
                        oq5Var.k0(K4);
                    }
                    Function0 function0 = (Function0) K4;
                    boolean h3 = oq5Var.h(xpdVar2);
                    Object K5 = oq5Var.K();
                    if (h3 || K5 == obj5) {
                        K5 = new kfa(xpdVar2, 3);
                        oq5Var.k0(K5);
                    }
                    swf.j(0, 8, oq5Var, rabVar, b, function0, (Function0) K5, false);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }
}
