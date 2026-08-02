package defpackage;

import android.content.Context;
import com.yandex.go.multimodal_route.interactors.d;
import com.yandex.go.multimodal_route.interactors.i;
import com.yandex.go.multimodal_route.taxi_feedback.TaxiFeedbackStateRepository;
import com.yandex.go.multimodal_route.taxi_feedback.a;
import com.yandex.go.multimodal_route.ui.detailed_card.g;
import com.yandex.go.multimodal_route.ui.notification.ScooterFinishedPayload;
import com.yandex.go.multimodal_route.ui.transport_route_part.s;
import com.yandex.go.multimodal_route.ui.transport_tracking.f;
import com.yandex.go.route.interactor.b;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class s911 extends pgd {
    public final Context F;
    public final d130 G;
    public final yvf0 H;
    public final a3v I;
    public final zuj0 J;
    public final a K;
    public final yvf0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final bw40 O;
    public final ra00 P;
    public final s Q;
    public final f R;
    public cg30 S;
    public bg30 T;
    public final mu5 U;

    public s911(ru.yandex.taxi.masstransit.detailedroute.ui.f fVar, ma11 ma11Var, ha11 ha11Var, Context context, d130 d130Var, y3g y3gVar, a3v a3vVar, zuj0 zuj0Var, a aVar, b4g b4gVar, y3g y3gVar2, mam0 mam0Var, bw40 bw40Var, ra00 ra00Var) {
        super(0);
        this.F = context;
        this.G = d130Var;
        this.H = y3gVar;
        this.I = a3vVar;
        this.J = zuj0Var;
        this.K = aVar;
        this.L = b4gVar;
        this.M = y3gVar2;
        this.N = mam0Var;
        this.O = bw40Var;
        this.P = ra00Var;
        ke8 ke8Var = ma11Var.a;
        this.Q = new s((com.yandex.go.multimodal_route.repositories.a) ((xvf0) ke8Var.b).get(), (com.yandex.go.multimodal_route.mappers.a) ((xvf0) ke8Var.c).get(), (TaxiFeedbackStateRepository) ((xvf0) ke8Var.d).get(), (d) ((y3g) ke8Var.a).get(), (c) ((xvf0) ke8Var.e).get(), fVar, (uu40) ((y3g) ke8Var.f).get(), (atd0) ((b4g) ke8Var.g).get(), (qt40) ((xvf0) ke8Var.h).get(), (g) ((xvf0) ke8Var.i).get(), (com.yandex.go.multimodal_route.ui.error.a) ((lq40) ke8Var.j).get(), (yu40) ((xvf0) ke8Var.k).get(), (b) ((b4g) ke8Var.l).get(), (wr40) ((y3g) ke8Var.m).get(), (mt40) ((xvf0) ke8Var.n).get(), (tw30) ((y3g) ke8Var.o).get(), (a3l0) ((xvf0) ke8Var.p).get(), (es40) ((xvf0) ke8Var.q).get(), (xdf) ((xvf0) ke8Var.r).get());
        z4m0 z4m0Var = ha11Var.a;
        this.R = new f(fVar, (z711) ((xvf0) z4m0Var.b).get(), (g) ((xvf0) z4m0Var.c).get(), (yu40) ((xvf0) z4m0Var.w).get(), (ah00) ((y3g) z4m0Var.x).get(), (i) ((tgb0) z4m0Var.y).get(), (com.yandex.go.multimodal_route.interactors.a) ((s730) z4m0Var.z).get(), (es40) ((xvf0) z4m0Var.A).get());
        this.U = new mu5(new jl01(22, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        cg30 cg30Var = this.S;
        if (cg30Var != null) {
            cg30Var.i();
        }
        this.S = null;
        this.T = null;
        this.I.a0(this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.I.b8(this);
        eyn0 eyn0Var = this.O.a;
        if (eyn0Var != null) {
            A((rpm0) this.N.get(), new ScooterFinishedPayload(eyn0Var.b), sy60.Q2);
            this.O.a = null;
        }
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.U;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
