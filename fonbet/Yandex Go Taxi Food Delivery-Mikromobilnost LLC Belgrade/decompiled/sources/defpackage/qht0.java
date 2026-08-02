package defpackage;

import com.yandex.go.preorder.navigation.n;
import com.yandex.go.taxi.summary.routestops.e;
import kotlin.Pair;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class qht0 implements rft0 {
    public uce0 a;
    public final /* synthetic */ n b;

    public qht0(n nVar) {
        this.b = nVar;
    }

    public static final void a(qht0 qht0Var, String str, bov0 bov0Var, String str2) {
        n nVar = qht0Var.b;
        jsa1 a = nVar.M.a(str);
        if (a == null) {
            nVar.O.a(SelectionOrigin.PREORDER_CONTROLLER, str);
            if (jl40.l(str, TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                ((qcm) nVar.N).a(str2);
            }
            n.V(nVar, bov0Var);
            return;
        }
        a2v a2vVar = null;
        if (a instanceof cy1) {
            nVar.q0.getClass();
            a2vVar = new a2v(null, gg31.a(str));
        }
        qht0Var.d(a, bov0Var, str2, a2vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ihv0 ihv0Var) {
        this.b.Y(new xse0(ihv0Var, null, 0 == true ? 1 : 0, 62));
    }

    public final void c(f4e f4eVar) {
        n nVar = this.b;
        nVar.E((m950) nVar.P.get(), new jz1(f4eVar), new lht0(nVar), hxx.a);
    }

    public final void d(jsa1 jsa1Var, bov0 bov0Var, String str, a2v a2vVar) {
        boolean z = jsa1Var instanceof by1;
        n nVar = this.b;
        if (z) {
            String str2 = ((by1) jsa1Var).a;
            nVar.D((m950) nVar.K.get(), new mhm(str2, str), new mht0(this, bov0Var, nVar, str2));
            return;
        }
        if (jsa1Var instanceof dy1) {
            nVar.j(dpb.a);
            nVar.E((m950) nVar.Q.get(), td50.g, new oht0(this, bov0Var, nVar), hxx.a);
            return;
        }
        if (jsa1Var instanceof cy1) {
            cy1 cy1Var = (cy1) jsa1Var;
            Pair pair = cy1Var.b;
            iv20 iv20Var = pair != null ? new iv20((zzs) pair.getFirst(), (zzs) pair.getSecond(), cy1Var.c, false) : null;
            String str3 = cy1Var.a;
            nVar.D((m950) nVar.L.get(), new nw20(iv20Var, str3, a2vVar), new nht0(this, bov0Var, nVar, str3));
            return;
        }
        if (!(jsa1Var instanceof ey1)) {
            w511.b();
            return;
        }
        if (str != null) {
            nVar.S.a(new qq30(str));
        }
        ey1 ey1Var = (ey1) jsa1Var;
        nVar.D((m950) nVar.R.get(), new iy30(ey1Var.a), new pht0(this, bov0Var, nVar, ey1Var.b));
    }

    public final void e(String str, sls slsVar, tls tlsVar) {
        n nVar = this.b;
        nVar.A((m950) nVar.b0.get(), new mbe0(str, false, slsVar), new h85(5, tlsVar));
    }

    public final void f(boolean z) {
        n nVar = this.b;
        gdl0 gdl0Var = new gdl0(null, nVar.G.g() ? ModalViewOrigin.SUMMARY : ModalViewOrigin.HOME, z, new jht0(nVar, 1));
        odl0 odl0Var = (odl0) nVar.c0.get();
        nVar.A(new vdm(odl0Var.a, odl0Var.b, odl0Var.c, nVar.f0, 1), gdl0Var, sy60.Q2);
    }

    public final void g(boolean z, fcj0 fcj0Var, e eVar) {
        n nVar = this.b;
        nVar.A(new y4c0(fcj0Var, eVar, (dit0) nVar.e0.get(), (i6r) ((tdl0) nVar.d0.get()).a.a.a.get(), 12), new gdl0(null, nVar.G.g() ? ModalViewOrigin.SUMMARY : ModalViewOrigin.HOME, z, new jht0(nVar, 2)), sy60.Q2);
    }

    public final void h(tce0 tce0Var, sls slsVar) {
        m950 m950Var = this.a;
        if (m950Var != null) {
            ((h55) m950Var).i();
        }
        n nVar = this.b;
        uce0 uce0Var = (uce0) nVar.Z.get();
        nVar.A(uce0Var, tce0Var, new cb0(23, slsVar, this));
        this.a = uce0Var;
    }
}
