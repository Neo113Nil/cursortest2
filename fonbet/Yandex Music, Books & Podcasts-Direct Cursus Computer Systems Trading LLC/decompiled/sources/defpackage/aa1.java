package defpackage;

import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class aa1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xbb b;

    public /* synthetic */ aa1(xbb xbbVar, int i) {
        this.a = i;
        this.b = xbbVar;
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
                i4w.c(this.b, null, hq5Var, 8);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                irf.y(this.b.a, qo6.d, d.m(vci.a, 80), false, false, null, null, null, hq5Var2, 432, 248);
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                bg3.a(null, null, false, ild.C(27233761, new u2(12, this.b), hq5Var3), hq5Var3, 3072, 7);
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                xv.o(this.b, null, hq5Var4, 8);
            default:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                irf.y(this.b.a, qo6.b, d.m(vci.a, 80), false, false, null, null, o5g.F(hq5Var5), hq5Var5, 432, 120);
        }
        return Unit.a;
    }
}
