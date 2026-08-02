package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e71 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g71 b;

    public /* synthetic */ e71(g71 g71Var, int i) {
        this.a = i;
        this.b = g71Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                g71 g71Var = this.b;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(-249675358, new e71(g71Var, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                g71 g71Var2 = this.b;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    q5g.k(null, null, ((dq0) oq5Var2.j(eq0.a)).c.a, 0L, null, 0.0f, ild.C(-1008282906, new e71(g71Var2, 2), oq5Var2), oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 59);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                g71 g71Var3 = this.b;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object K = oq5Var3.K();
                    if (K == gq5.a) {
                        b81 b81Var = g71Var3.A().a;
                        u51 u51Var = g71Var3.A().b;
                        znk znkVar = g71Var3.j;
                        w61 w61Var = (w61) g71Var3.l.getValue();
                        jfu viewModelStore = g71Var3.getViewModelStore();
                        viewModelStore.getClass();
                        kxi d = g71Var3.d();
                        l18 l18Var = l18.b;
                        bdt I = hag.I(g0l.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        s71 s71Var = new s71(b81Var, u51Var, znkVar, w61Var, viewModelStore, d, (g0l) qdcVar.C(I));
                        oq5Var3.k0(s71Var);
                        K = s71Var;
                    }
                    weo.a((s71) K, ghh.C(zs4.g(oq5Var3), ogp.A(oq5Var3)), oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
