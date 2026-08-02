package defpackage;

import com.yandex.div.core.expression.variables.a;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.exploration.ExplorationState;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.main.SuperAppOpenServiceActionType;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.flex.c;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.x;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import com.yandex.go.superapp.discovery.map.impl.ui.model.v2.SuperAppDiscoveryMapFlexContainerState;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes14.dex */
public final class wyv0 extends ad5 {
    public final l7s0 A;
    public final a B;
    public final oep0 C;
    public final yvf0 D;
    public final euv0 E;
    public final c F;
    public final bac0 G;
    public final huv0 H;
    public final ptv0 I;
    public final com.yandex.go.superapp.discovery.map.impl.domain.interactors.c J;
    public final k0b0 K;
    public final zuv0 L;
    public final btv0 M;
    public final p2t N;
    public final e5s0 O;
    public final abw0 P;
    public final Set Q;
    public final tuv0 R;
    public final dzv0 S;
    public final com.yandex.go.superapp.discovery.map.impl.domain.interactors.a T;
    public final u6w0 U;
    public final x V;
    public final ah00 W;
    public final y3u0 Z;
    public final zh00 a0;
    public final i9c0 b0;
    public final com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.change_current_address.a c0;
    public final i d0;
    public final p e0;
    public final wuo f0;
    public final pwy0 g0;
    public final avv0 h0;
    public final ytj i0;
    public c9c0 j0;
    public pzt0 k0;
    public SuperAppDiscoveryMapFlexContainerState l0;
    public ExplorationState m0;
    public boolean n0;
    public czv0 o0;
    public SuperAppOpenServiceActionType p0;
    public boolean q0;
    public boolean r0;
    public fto s0;
    public qto t0;
    public final i3y u0;
    public final i3y v0;
    public final jtv0 x;
    public final uh00 y;
    public final kuv0 z;

    public wyv0(jtv0 jtv0Var, uh00 uh00Var, kuv0 kuv0Var, l7s0 l7s0Var, a aVar, oep0 oep0Var, yvf0 yvf0Var, euv0 euv0Var, c cVar, bac0 bac0Var, huv0 huv0Var, ptv0 ptv0Var, com.yandex.go.superapp.discovery.map.impl.domain.interactors.c cVar2, k0b0 k0b0Var, zuv0 zuv0Var, btv0 btv0Var, p2t p2tVar, e5s0 e5s0Var, abw0 abw0Var, Set set, tuv0 tuv0Var, dzv0 dzv0Var, com.yandex.go.superapp.discovery.map.impl.domain.interactors.a aVar2, u6w0 u6w0Var, x xVar, ah00 ah00Var, y3u0 y3u0Var, zh00 zh00Var, i9c0 i9c0Var, com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.change_current_address.a aVar3, i iVar, p pVar, wuo wuoVar, pwy0 pwy0Var, avv0 avv0Var, ytj ytjVar) {
        super(qyv0.class);
        this.x = jtv0Var;
        this.y = uh00Var;
        this.z = kuv0Var;
        this.A = l7s0Var;
        this.B = aVar;
        this.C = oep0Var;
        this.D = yvf0Var;
        this.E = euv0Var;
        this.F = cVar;
        this.G = bac0Var;
        this.H = huv0Var;
        this.I = ptv0Var;
        this.J = cVar2;
        this.K = k0b0Var;
        this.L = zuv0Var;
        this.M = btv0Var;
        this.N = p2tVar;
        this.O = e5s0Var;
        this.P = abw0Var;
        this.Q = set;
        this.R = tuv0Var;
        this.S = dzv0Var;
        this.T = aVar2;
        this.U = u6w0Var;
        this.V = xVar;
        this.W = ah00Var;
        this.Z = y3u0Var;
        this.a0 = zh00Var;
        this.b0 = i9c0Var;
        this.c0 = aVar3;
        this.d0 = iVar;
        this.e0 = pVar;
        this.f0 = wuoVar;
        this.g0 = pwy0Var;
        this.h0 = avv0Var;
        this.i0 = ytjVar;
        this.l0 = SuperAppDiscoveryMapFlexContainerState.NONE;
        final int i = 0;
        this.m0 = new ExplorationState(0);
        this.o0 = azv0.a;
        this.p0 = com.yandex.go.superapp.discovery.map.impl.domain.interactors.a.h;
        sls slsVar = new sls(this) { // from class: ryv0
            public final /* synthetic */ wyv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                rbh rbhVar;
                rbh rbhVar2;
                int i2 = i;
                wyv0 wyv0Var = this.b;
                switch (i2) {
                    case 0:
                        jtv0 jtv0Var2 = wyv0Var.x;
                        String str = null;
                        String str2 = (jtv0Var2 == null || (rbhVar2 = jtv0Var2.h) == null) ? null : rbhVar2.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (jtv0Var2 != null && (rbhVar = jtv0Var2.h) != null) {
                            str = rbhVar.c;
                        }
                        return new x7c0(str2, str);
                    default:
                        zh00 zh00Var2 = wyv0Var.a0;
                        uh00 uh00Var2 = wyv0Var.y;
                        ho9 ho9Var = zh00Var2.a;
                        return new com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.c(uh00Var2, (qvv) ho9Var.a.get(), (ai00) ho9Var.b.get(), (ah00) ho9Var.c.get(), (vh00) ho9Var.d.get());
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u0 = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.v0 = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ryv0
            public final /* synthetic */ wyv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                rbh rbhVar;
                rbh rbhVar2;
                int i22 = i2;
                wyv0 wyv0Var = this.b;
                switch (i22) {
                    case 0:
                        jtv0 jtv0Var2 = wyv0Var.x;
                        String str = null;
                        String str2 = (jtv0Var2 == null || (rbhVar2 = jtv0Var2.h) == null) ? null : rbhVar2.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (jtv0Var2 != null && (rbhVar = jtv0Var2.h) != null) {
                            str = rbhVar.c;
                        }
                        return new x7c0(str2, str);
                    default:
                        zh00 zh00Var2 = wyv0Var.a0;
                        uh00 uh00Var2 = wyv0Var.y;
                        ho9 ho9Var = zh00Var2.a;
                        return new com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.c(uh00Var2, (qvv) ho9Var.a.get(), (ai00) ho9Var.b.get(), (ah00) ho9Var.c.get(), (vh00) ho9Var.d.get());
                }
            }
        });
    }

    public static final void Kg(wyv0 wyv0Var) {
        ((qyv0) wyv0Var.Dg()).render(wyv0Var.Lg());
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        ywl S;
        ptv0 ptv0Var;
        String str;
        Mg().b(uso.a);
        super.Cg();
        ((gh00) this.W).I(false);
        pzt0 pzt0Var = this.k0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.k0 = null;
        c9c0 c9c0Var = this.j0;
        if (c9c0Var != null && (S = c9c0Var.S()) != null && (str = (ptv0Var = this.I).a) != null) {
            ptv0Var.b = new axj0(S, str);
        }
        c9c0 c9c0Var2 = this.j0;
        if (c9c0Var2 != null) {
            c9c0Var2.i();
        }
        this.j0 = null;
    }

    @Override // defpackage.zc5
    public final void Gg() {
        ((qyv0) Dg()).c(this.K.b());
    }

    public final hzv0 Lg() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean l = jl40.l(this.o0, zyv0.a);
        boolean z4 = this.o0 instanceof bzv0;
        SuperAppDiscoveryMapFlexContainerState superAppDiscoveryMapFlexContainerState = this.l0;
        boolean z5 = true;
        boolean z6 = superAppDiscoveryMapFlexContainerState == SuperAppDiscoveryMapFlexContainerState.ERROR;
        boolean z7 = this.p0 == com.yandex.go.superapp.discovery.map.impl.domain.interactors.a.h;
        if (!z6 && !z4) {
            ExplorationState explorationState = this.m0;
            if (!l ? !(explorationState.b || explorationState.c) : !explorationState.b) {
                z = false;
                z2 = true;
                if (l && z5) {
                    z3 = z;
                    z = z2;
                } else {
                    z3 = z;
                }
                boolean z8 = z3;
                boolean z9 = !l;
                if (l || !z7) {
                    z8 = z2;
                }
                return new hzv0(superAppDiscoveryMapFlexContainerState, z5, z, l, z9, z8, z6, this.q0, this.s0, this.t0);
            }
        }
        z = false;
        z2 = true;
        z5 = false;
        if (l) {
        }
        z3 = z;
        boolean z82 = z3;
        boolean z92 = !l;
        if (l) {
        }
        z82 = z2;
        return new hzv0(superAppDiscoveryMapFlexContainerState, z5, z, l, z92, z82, z6, this.q0, this.s0, this.t0);
    }

    public final com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.c Mg() {
        return (com.yandex.go.superapp.discovery.map.impl.domain.interactors.exploration.c) this.v0.getValue();
    }
}
