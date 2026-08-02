package ru.yandex.taxi.main.map.autofs;

import com.yandex.go.scooters.domain.p;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.ir3;
import defpackage.jqr;
import defpackage.mth;
import defpackage.n20;
import defpackage.yw60;

/* loaded from: classes9.dex */
public final class g implements yw60 {
    public final ir3 a;
    public final n20 b;
    public final p c;
    public ike d;

    public g(ir3 ir3Var, n20 n20Var, p pVar) {
        this.a = ir3Var;
        this.b = n20Var;
        this.c = pVar;
    }

    @Override // defpackage.yw60
    public final void e() {
        ike ikeVar = this.d;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        ike b = bvf0.b();
        this.d = b;
        kotlinx.coroutines.flow.e.H(b, new jqr(new mth(kotlinx.coroutines.flow.e.t(new f(((com.yandex.go.taxi.order.provider.a) this.b).a())), 4), new AutoFsSessionExternalEventsBridge$onAppCreated$2(this, null), 3));
        kotlinx.coroutines.flow.e.H(b, new jqr(this.c.d, new AutoFsSessionExternalEventsBridge$onAppCreated$3(this, null), 3));
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AutoFsSessionExternalEventsBridge";
    }

    @Override // defpackage.yw60
    public final void l() {
        ike ikeVar = this.d;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.d = null;
    }
}
