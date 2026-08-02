package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.preorder.navigation.c;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes13.dex */
public final class zqe0 implements sy60 {
    public final /* synthetic */ c a;
    public final /* synthetic */ ynv0 b;

    public zqe0(c cVar, ynv0 ynv0Var) {
        this.a = cVar;
        this.b = ynv0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    public final void n1(t0j t0jVar) {
        boolean z = t0jVar instanceof q0j;
        c cVar = this.a;
        if (z) {
            c.c0(cVar, this.b, 27);
            return;
        }
        if (!(t0jVar instanceof r0j)) {
            cVar.U();
            return;
        }
        m950 m950Var = (m950) cVar.I.get();
        r0j r0jVar = (r0j) t0jVar;
        pv0 pv0Var = r0jVar.b;
        Address address = r0jVar.a;
        cVar.D(m950Var, new uzi(pv0Var, RouteSelectorOpenReason.OTHER), new j83(2, cVar));
    }
}
