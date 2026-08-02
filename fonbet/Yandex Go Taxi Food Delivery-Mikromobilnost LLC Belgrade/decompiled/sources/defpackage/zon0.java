package defpackage;

import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersIgnitionDisablingConfirmationButtonName;
import java.util.HashMap;

/* loaded from: classes13.dex */
public final /* synthetic */ class zon0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ qxm0 b;
    public final /* synthetic */ pej c;

    public /* synthetic */ zon0(qxm0 qxm0Var, pej pejVar, int i) {
        this.a = i;
        this.b = qxm0Var;
        this.c = pejVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        pej pejVar = this.c;
        qxm0 qxm0Var = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new zon0(qxm0Var, pejVar, i2);
                ubd.a.getClass();
                ((agd) yfdVar).g = ubd.b;
                return zy11Var;
            default:
                gpn0 gpn0Var = (gpn0) obj;
                if (jl40.l(gpn0Var, fpn0.a)) {
                    qxm0Var.a.a("Scooters.IgnitionDisablingConfirmation.Opened", tse0.p(qxm0Var), 1, new HashMap());
                    return zy11Var;
                }
                if (jl40.l(gpn0Var, dpn0.a)) {
                    pejVar.r(new qu(9));
                    return zy11Var;
                }
                if (!jl40.l(gpn0Var, epn0.a)) {
                    w511.b();
                    return null;
                }
                ScootersAnalytics$ScootersIgnitionDisablingConfirmationButtonName scootersAnalytics$ScootersIgnitionDisablingConfirmationButtonName = ScootersAnalytics$ScootersIgnitionDisablingConfirmationButtonName.Disable;
                HashMap p = tse0.p(qxm0Var);
                p.put("button_name", scootersAnalytics$ScootersIgnitionDisablingConfirmationButtonName.getEventValue());
                qxm0Var.a.a("Scooters.IgnitionDisablingConfirmation.Tapped", p, 1, new HashMap());
                pejVar.r(new vkn0(9));
                return zy11Var;
        }
    }
}
