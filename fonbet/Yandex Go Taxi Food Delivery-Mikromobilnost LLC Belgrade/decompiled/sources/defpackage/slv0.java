package defpackage;

import com.yandex.go.taxi.tariffs.interactor.a;
import java.util.HashMap;
import ru.yandex.taxi.summary.solid.interactor.u;

/* loaded from: classes6.dex */
public final class slv0 extends ad5 {
    public final flv0 A;
    public final hhs0 B;
    public final tt2 C;
    public final u D;
    public final uos0 E;
    public final wiq0 F;
    public final c4r0 G;
    public final a H;
    public final sls x;
    public final sls y;
    public final p9t0 z;

    public slv0(sls slsVar, sls slsVar2, p9t0 p9t0Var, flv0 flv0Var, hhs0 hhs0Var, tt2 tt2Var, u uVar, uos0 uos0Var, wiq0 wiq0Var, c4r0 c4r0Var, a aVar) {
        super(rlv0.class);
        this.x = slsVar;
        this.y = slsVar2;
        this.z = p9t0Var;
        this.A = flv0Var;
        this.B = hhs0Var;
        this.C = tt2Var;
        this.D = uVar;
        this.E = uos0Var;
        this.F = wiq0Var;
        this.G = c4r0Var;
        this.H = aVar;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        String str = this.A.a;
        mx70 mx70Var = (mx70) this.B.b;
        mx70Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("modal_id", str);
        }
        mx70Var.a.a("OrderInfoCard.Closed", hashMap, 1, new HashMap());
        this.y.invoke();
    }

    public final void Kg() {
        ((mx70) this.B.b).a("do_nothing", this.A.a);
        this.y.invoke();
        ((rlv0) Dg()).dismiss();
    }
}
