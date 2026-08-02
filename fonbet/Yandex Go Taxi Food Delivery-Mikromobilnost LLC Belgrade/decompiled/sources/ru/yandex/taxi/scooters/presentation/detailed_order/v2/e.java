package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import defpackage.chn0;
import defpackage.f4b1;
import defpackage.fgn0;
import defpackage.gei0;
import defpackage.ign0;
import defpackage.m0o0;
import defpackage.ney;
import defpackage.nhn0;
import defpackage.nyn0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qc5;
import defpackage.qr40;
import defpackage.qxm0;
import defpackage.tje;
import defpackage.uto0;
import defpackage.v0o0;
import defpackage.vfn0;
import defpackage.wnj;
import defpackage.x950;
import defpackage.zno0;
import defpackage.zuo0;
import ru.yandex.taxi.scooters.data.k;
import ru.yandex.taxi.scooters.domain.p;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.f;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.g;

/* loaded from: classes6.dex */
public final class e extends qc5 {
    public final qxm0 A;
    public final pwy0 B;
    public final ru.yandex.taxi.multiorder.e C;
    public final p D;
    public final zno0 E;
    public final m0o0 F;
    public final qr40 G;
    public final chn0 H;
    public final uto0 I;
    public final nyn0 J;
    public final g K;
    public final ru.yandex.taxi.scooters.domain.g L;
    public final ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.a M;
    public final ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.c N;
    public final f O;
    public final k P;
    public final vfn0 Q;
    public final v0o0 R;
    public final gei0 S;
    public final ign0 T;
    public final ru.yandex.taxi.scooters.presentation.share_location.data.a U;
    public final fgn0 V;
    public pzt0 W;
    public pzt0 Z;
    public pzt0 a0;
    public zuo0 b0;
    public x950 c0;

    public e(ney neyVar, qxm0 qxm0Var, pwy0 pwy0Var, ru.yandex.taxi.multiorder.e eVar, p pVar, zno0 zno0Var, m0o0 m0o0Var, qr40 qr40Var, chn0 chn0Var, uto0 uto0Var, nyn0 nyn0Var, g gVar, ru.yandex.taxi.scooters.domain.g gVar2, ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.a aVar, ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.c cVar, f fVar, k kVar, vfn0 vfn0Var, v0o0 v0o0Var, gei0 gei0Var, ign0 ign0Var, ru.yandex.taxi.scooters.presentation.share_location.data.a aVar2, fgn0 fgn0Var) {
        super(nhn0.class, neyVar);
        this.A = qxm0Var;
        this.B = pwy0Var;
        this.C = eVar;
        this.D = pVar;
        this.E = zno0Var;
        this.F = m0o0Var;
        this.G = qr40Var;
        this.H = chn0Var;
        this.I = uto0Var;
        this.J = nyn0Var;
        this.K = gVar;
        this.L = gVar2;
        this.M = aVar;
        this.N = cVar;
        this.O = fVar;
        this.P = kVar;
        this.Q = vfn0Var;
        this.R = v0o0Var;
        this.S = gei0Var;
        this.T = ign0Var;
        this.U = aVar2;
        this.V = fgn0Var;
        this.c0 = wnj.a;
    }

    public final void Mg(String str) {
        tje.N(Jg(), null, null, new ScootersDetailedOrderV2Presenter$removeDestination$1(this, str, null), 3);
    }

    public final void Ng(zuo0 zuo0Var) {
        String sessionId = zuo0Var.getSessionId();
        boolean d = f4b1.d(zuo0Var);
        boolean z = this.c0 instanceof wnj;
        m0o0 m0o0Var = this.F;
        if (m0o0Var.a.a(sessionId)) {
            m0o0Var.b.Fg(Boolean.valueOf(!d && z));
        }
    }
}
