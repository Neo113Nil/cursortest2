package defpackage;

import android.content.Context;
import com.yandex.go.chargers.offer.ui.compose.ui.e;
import com.yandex.go.chargers.surge.domain.ChargersScreenWithSurge;

/* loaded from: classes12.dex */
public final class u7a extends pgd {
    public final Context F;
    public final w030 G;
    public final vxf H;
    public final iwa I;
    public final uxf J;
    public final vn9 K;
    public final xma L;
    public final rea0 M;
    public final awa N;
    public final r9a O;
    public final yvf0 P;
    public final yvf0 Q;
    public final yvf0 R;
    public final yvf0 S;
    public final yvf0 T;
    public final yvf0 U;
    public final qaa V;
    public final kaa W;
    public final c29 Z;
    public e a0;
    public final mu5 b0;

    public u7a(Context context, w030 w030Var, vxf vxfVar, iwa iwaVar, uxf uxfVar, vn9 vn9Var, xma xmaVar, rea0 rea0Var, awa awaVar, r9a r9aVar, uxf uxfVar2, uxf uxfVar3, uxf uxfVar4, uxf uxfVar5, uxf uxfVar6, uxf uxfVar7, qaa qaaVar, kaa kaaVar, tla tlaVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = vxfVar;
        this.I = iwaVar;
        this.J = uxfVar;
        this.K = vn9Var;
        this.L = xmaVar;
        this.M = rea0Var;
        this.N = awaVar;
        this.O = r9aVar;
        this.P = uxfVar2;
        this.Q = uxfVar3;
        this.R = uxfVar4;
        this.S = uxfVar5;
        this.T = uxfVar6;
        this.U = uxfVar7;
        this.V = qaaVar;
        this.W = kaaVar;
        this.Z = new c29(9, this);
        this.b0 = new mu5(new cs8(13, this, tlaVar));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        this.K.d();
        this.I.a(ChargersScreenWithSurge.OFFER);
        super.G((s7a) obj);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((s7a) obj);
        e eVar = this.a0;
        if (eVar != null) {
            eVar.c.g.a();
        }
        this.K.a();
        iwa iwaVar = this.I;
        iwaVar.a.l(null);
        iwaVar.a(null);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.b0;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final String R() {
        return "chargers_offer_card";
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return true;
    }
}
