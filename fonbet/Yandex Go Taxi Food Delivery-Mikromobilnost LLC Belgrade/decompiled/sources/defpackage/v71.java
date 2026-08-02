package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class v71 implements l51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ v71(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    private final void n1() {
    }

    private final void o1(pv0 pv0Var) {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((w71) h55Var).r(new qu(9));
                break;
            case 1:
                break;
            default:
                ((c2n0) h55Var).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.l51
    public final void a1(pv0 pv0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((w71) h55Var).r(new t71(pv0Var, 0));
                break;
            case 1:
                break;
            default:
                c2n0 c2n0Var = (c2n0) h55Var;
                c2n0Var.r(new qu(9));
                ((qq31) c2n0Var.G).invoke(pv0Var);
                break;
        }
    }

    @Override // defpackage.l51
    public final void h(PointType pointType, Address address, pv0 pv0Var) {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((w71) h55Var).r(new u71(pointType, address, pv0Var, 0));
                break;
            case 1:
                ((eks) h55Var).r(new yid(PointType.SOURCE, pv0Var, 1));
                break;
            default:
                c2n0 c2n0Var = (c2n0) h55Var;
                c2n0Var.r(new qu(9));
                ((bz41) c2n0Var.F).invoke(pointType, address, pv0Var);
                break;
        }
    }
}
