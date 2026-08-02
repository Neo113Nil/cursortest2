package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class xya implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ebm b;

    public /* synthetic */ xya(ebm ebmVar, int i) {
        this.a = 2;
        this.b = ebmVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                int intValue = num.intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(837312261, new xya(this.b, 1, (byte) 0), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                int intValue2 = num.intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    saf.l(this.b, oq5Var2, 48);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                num.getClass();
                saf.l(this.b, hq5Var, rvf.R(49));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xya(ebm ebmVar, int i, byte b) {
        this.a = i;
        this.b = ebmVar;
    }
}
