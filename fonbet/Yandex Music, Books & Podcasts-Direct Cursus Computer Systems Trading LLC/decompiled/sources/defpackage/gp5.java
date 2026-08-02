package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class gp5 implements ryc {
    public final /* synthetic */ int a;

    public /* synthetic */ gp5(int i) {
        this.a = i;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.a) {
            case 0:
                ges gesVar = (ges) obj;
                yci yciVar = (yci) obj2;
                hq5 hq5Var = (hq5) obj3;
                int intValue = ((Integer) obj4).intValue();
                gesVar.getClass();
                yciVar.getClass();
                if ((intValue & 6) == 0) {
                    i = (((oq5) hq5Var).f(gesVar) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((oq5) hq5Var).f(yciVar) ? 32 : 16;
                }
                if ((i & 147) == 146) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                ivf.l(true, yciVar, gesVar, hq5Var, (i & 112) | 6 | ((i << 6) & 896), 0);
            default:
                ((Integer) obj2).getClass();
                hq5 hq5Var2 = (hq5) obj3;
                ((Integer) obj4).getClass();
                ((b3k) obj).getClass();
                vum.b(d.x(d.c(vci.a, 1.0f), b2c.f, 2), ((dq0) ((oq5) hq5Var2).j(eq0.a)).d.a, 0.0f, 0L, 0, hq5Var2, 0, 28);
                break;
        }
        return Unit.a;
    }
}
