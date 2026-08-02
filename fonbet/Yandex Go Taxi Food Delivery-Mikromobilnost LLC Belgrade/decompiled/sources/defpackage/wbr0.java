package defpackage;

import com.yandex.go.geosharing.controller.e;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.HashMap;
import ru.yandex.taxi.am.b0;
import ru.yandex.taxi.utils.b;

/* loaded from: classes13.dex */
public final class wbr0 extends ad5 {
    public final fk10 A;
    public final ik10 B;
    public final hk10 C;
    public final q6r0 D;
    public final r7r0 E;
    public final q7r0 F;
    public final v7j0 G;
    public final b H;
    public final d1t I;
    public final x2r0 J;
    public final x2r0 K;
    public final as21 L;
    public final qqt0 M;
    public final aba0 N;
    public final yaa0 O;
    public final kt00 P;
    public final q3g0 Q;
    public final rkv R;
    public final b0 S;
    public final xdr0 T;
    public final jer0 U;
    public final boolean V;
    public final sw2 x;
    public final kj10 y;
    public final in10 z;

    public wbr0(sw2 sw2Var, kj10 kj10Var, in10 in10Var, fk10 fk10Var, ik10 ik10Var, hk10 hk10Var, q6r0 q6r0Var, r7r0 r7r0Var, q7r0 q7r0Var, v7j0 v7j0Var, b bVar, d1t d1tVar, x2r0 x2r0Var, x2r0 x2r0Var2, as21 as21Var, qqt0 qqt0Var, aba0 aba0Var, yaa0 yaa0Var, kt00 kt00Var, q3g0 q3g0Var, rkv rkvVar, b0 b0Var, xdr0 xdr0Var, jer0 jer0Var) {
        super(dbr0.class);
        this.x = sw2Var;
        this.y = kj10Var;
        this.z = in10Var;
        this.A = fk10Var;
        this.B = ik10Var;
        this.C = hk10Var;
        this.D = q6r0Var;
        this.E = r7r0Var;
        this.F = q7r0Var;
        this.G = v7j0Var;
        this.H = bVar;
        this.I = d1tVar;
        this.J = x2r0Var;
        this.K = x2r0Var2;
        this.L = as21Var;
        this.M = qqt0Var;
        this.N = aba0Var;
        this.O = yaa0Var;
        this.P = kt00Var;
        this.Q = q3g0Var;
        this.R = rkvVar;
        this.S = b0Var;
        this.T = xdr0Var;
        this.U = jer0Var;
        qqt0Var.b.getClass();
        this.V = qqt0Var.c;
    }

    public final void Kg(boolean z) {
        b bVar = this.H;
        bVar.m.u(bVar.g, z);
        ((e) this.I).g(z);
        this.U.c(z);
        Boolean valueOf = Boolean.valueOf(z);
        q7r0 q7r0Var = this.F;
        q7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(BackendConfig.Restrictions.ENABLED, valueOf);
        q7r0Var.a.a("SettingsDidSwitchUserLiveLocation", hashMap, 1, new HashMap());
    }
}
