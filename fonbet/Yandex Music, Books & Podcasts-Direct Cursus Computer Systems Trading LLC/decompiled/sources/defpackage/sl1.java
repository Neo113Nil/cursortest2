package defpackage;

import androidx.compose.foundation.lazy.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class sl1 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ lvf b;

    public /* synthetic */ sl1(lvf lvfVar, int i) {
        this.a = i;
        this.b = lvfVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        a aVar = (a) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                aVar.getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    lvf lvfVar = this.b;
                    if (lvfVar.d() > 0) {
                        oq5Var.Z(-1643186203);
                        boolean z = lvfVar.e().c instanceof mfg;
                        boolean z2 = lvfVar.e().c instanceof lfg;
                        boolean h = oq5Var.h(lvfVar);
                        Object K = oq5Var.K();
                        if (h || K == gq5.a) {
                            K = new ul1(lvfVar, 0);
                            oq5Var.k0(K);
                        }
                        hyf.e(z, z2, (Function0) K, androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3), null, oq5Var, 3072);
                    } else {
                        oq5Var.Z(-1650222955);
                    }
                    oq5Var.p(false);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                aVar.getClass();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                    lvf lvfVar2 = this.b;
                    if (lvfVar2.d() != 0) {
                        oq5Var2.Z(437530708);
                        boolean z3 = lvfVar2.e().c instanceof mfg;
                        boolean z4 = lvfVar2.e().c instanceof lfg;
                        boolean h2 = oq5Var2.h(lvfVar2);
                        Object K2 = oq5Var2.K();
                        if (h2 || K2 == gq5.a) {
                            K2 = new ul1(lvfVar2, 4);
                            oq5Var2.k0(K2);
                        }
                        hyf.e(z3, z4, (Function0) K2, androidx.compose.foundation.layout.a.a(0.0f, 0.0f, 3), null, oq5Var2, 3072);
                    } else {
                        oq5Var2.Z(426806816);
                    }
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
