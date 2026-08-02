package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b41 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ b41(c41 c41Var, int i) {
        this.a = i;
        this.b = c41Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1498084246, new b41(this.b, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    q5g.k(null, null, ((dq0) oq5Var2.j(eq0.a)).c.a, 0L, null, 0.0f, ild.C(739476698, new b41(this.b, 2), oq5Var2), oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 59);
                } else {
                    oq5Var2.S();
                }
                break;
            default:
                oq5 oq5Var3 = (oq5) hq5Var;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    Object K = oq5Var3.K();
                    if (K == gq5.a) {
                        c41 c41Var = this.b;
                        t requireActivity = c41Var.requireActivity();
                        requireActivity.getClass();
                        g41 g41Var = new g41(requireActivity, (u41) c41Var.m.getValue(), (i41) c41Var.o.getValue(), c41Var.x(), c41Var.x().a(c41Var.k, null));
                        oq5Var3.k0(g41Var);
                        K = g41Var;
                    }
                    qld.a((g41) K, d.c(vci.a, 1.0f), oq5Var3, 48, 0);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
