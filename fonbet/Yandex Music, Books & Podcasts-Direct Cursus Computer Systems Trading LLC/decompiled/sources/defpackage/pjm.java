package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class pjm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjm b;

    public /* synthetic */ pjm(rjm rjmVar, int i) {
        this.a = i;
        this.b = rjmVar;
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
                g0g.h(this.b, null, hq5Var, 0);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                irf.y(this.b.a, qo6.b, d.m(vci.a, 80), false, false, new d43(d85.b(d85.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), 24), null, o5g.F(hq5Var2), hq5Var2, 432, 88);
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                bg3.a(null, null, false, ild.C(650197141, new tik(7, this.b), hq5Var3), hq5Var3, 3072, 7);
            default:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                String str = this.b.d;
                ges i = nu0.i();
                oq5 oq5Var5 = (oq5) hq5Var4;
                long j = ((dq0) oq5Var5.j(eq0.a)).b.b;
                yci d = d.d(vci.a, 1.0f);
                boolean f = oq5Var5.f(str);
                Object K = oq5Var5.K();
                if (f || K == gq5.a) {
                    K = new q1h(str, 20);
                    oq5Var5.k0(K);
                }
                xv7.j(str, a.a(nfp.b(d, false, (Function1) K), "pre_save_bottom_sheet_dialog_header_subtitle"), j, 0L, 0L, 0, 0L, 2, false, 1, 0, null, i, oq5Var5, 0, 3120, 55288);
                break;
        }
        return Unit.a;
    }
}
