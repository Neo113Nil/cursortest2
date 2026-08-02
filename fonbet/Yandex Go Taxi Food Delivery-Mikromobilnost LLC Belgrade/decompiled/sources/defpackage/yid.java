package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final /* synthetic */ class yid implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PointType b;
    public final /* synthetic */ pv0 c;

    public /* synthetic */ yid(PointType pointType, pv0 pv0Var, int i) {
        this.a = i;
        this.b = pointType;
        this.c = pv0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Address address;
        int i = this.a;
        PointType pointType = this.b;
        zy11 zy11Var = zy11.a;
        pv0 pv0Var = this.c;
        switch (i) {
            case 0:
                ((isd) obj).x0(pv0Var, pointType);
                break;
            case 1:
                ((isd) obj).x0(pv0Var, pointType);
                break;
            default:
                y4c0 y4c0Var = ((rf50) obj).a;
                qf50 qf50Var = (qf50) y4c0Var.x;
                if (qf50Var != null) {
                    zzs B = (pv0Var == null || (address = pv0Var.a) == null) ? null : address.B();
                    PointType pointType2 = this.b;
                    m41 m41Var = new m41(kyh0.navigator_specify_point_on_map, "navigator", pointType2, Origin.NAVIGATOR, (pv0Var == null || pointType2 != PointType.DESTINATION) ? null : pv0Var, B, true, false, null, null, null, 523776);
                    if (qf50Var.b) {
                        ((uo21) y4c0Var.G).attach();
                    }
                    y4c0Var.E((m950) ((yvf0) y4c0Var.F).get(), m41Var, new kpv(y4c0Var, qf50Var, 2), hxx.a);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
