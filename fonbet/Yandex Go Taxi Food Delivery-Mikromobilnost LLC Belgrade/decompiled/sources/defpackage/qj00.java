package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.map.Map;

/* loaded from: classes12.dex */
public final class qj00 implements tmt {
    public final sls a;
    public final /* synthetic */ uj00 b;

    public qj00(uj00 uj00Var, g700 g700Var) {
        this.b = uj00Var;
        this.a = g700Var;
    }

    @Override // defpackage.tmt
    public final void A0(Address address) {
        this.b.r(new pj00(new o8g0(new b8l0(new vhu0(wgu0.a)), address), 1));
    }

    @Override // defpackage.tmt
    public final void H(Address address) {
        this.b.r(new pj00(new o8g0(new b8l0(new uhu0(wgu0.a)), address), 0));
    }

    @Override // defpackage.tmt
    public final void W(Address address) {
        this.b.r(new yd0(address, 17));
    }

    @Override // defpackage.sy60
    public final void a() {
        uj00 uj00Var = this.b;
        Map map = uj00Var.U;
        if (map != null) {
            map.deselectGeoObject();
        }
        uj00Var.L.b(new iez(28), true);
        sls slsVar = this.a;
        if (slsVar != null) {
            slsVar.invoke();
        }
        ((oj00) uj00Var.n()).b.invoke();
    }
}
