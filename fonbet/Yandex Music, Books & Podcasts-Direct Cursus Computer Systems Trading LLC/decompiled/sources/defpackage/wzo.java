package defpackage;

import androidx.compose.foundation.layout.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class wzo implements pyc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ g06 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wzo(g06 g06Var, boolean z) {
        this.b = g06Var;
        this.c = z;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pw5 pw5Var = (pw5) obj;
        hq5 hq5Var = (hq5) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                pw5Var.getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    boolean z = this.c;
                    g06 g06Var = this.b;
                    if (!z) {
                        oq5Var.Z(2110356725);
                        g0g.a(g06Var, oq5Var, 0);
                        oq5Var.p(false);
                        break;
                    } else {
                        oq5Var.Z(2107606405);
                        oq5Var.p(false);
                        pw5 pw5Var2 = (pw5) g06Var.a;
                        qwp.k(pw5Var2.d, pw5Var2.e, pw5Var2.f, (String) g06Var.d, null, 0.0f, oq5Var, 0);
                    }
                } else {
                    oq5Var.S();
                }
                break;
            default:
                pw5Var.getClass();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                    g0g.p(this.b, this.c, a.q(vci.a, 4, 0.0f, 0.0f, 0.0f, 14), oq5Var2, 384);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wzo(boolean z, g06 g06Var) {
        this.c = z;
        this.b = g06Var;
    }
}
