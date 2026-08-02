package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardOpenReason;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.order.ChargersOrderRouterImpl$launchFinishOrder$$inlined$collectIn$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class qda extends h55 {
    public final uo21 D;
    public final yvf0 E;
    public final yvf0 F;
    public final yvf0 G;
    public final yvf0 H;
    public final e I;
    public final rx4 J;

    public qda(uo21 uo21Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, e eVar, rx4 rx4Var) {
        super(null);
        this.D = uo21Var;
        this.E = yvf0Var;
        this.F = yvf0Var2;
        this.G = yvf0Var3;
        this.H = yvf0Var4;
        this.I = eVar;
        this.J = rx4Var;
    }

    public static final void P(qda qdaVar) {
        ArrayList a = e.a(((rl9) kotlinx.coroutines.flow.e.d(qdaVar.I.d).a.getValue()).a);
        if (a.size() >= 2) {
            qdaVar.Q(a);
        } else {
            qdaVar.r(new qu(9));
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        rca rcaVar = ((ada) obj).a;
        this.D.detach();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        Object obj2;
        rca rcaVar = ((ada) obj).a;
        this.D.attach();
        boolean equals = rcaVar.equals(oca.a);
        int i = 9;
        e eVar = this.I;
        if (equals) {
            List list = ((rl9) kotlinx.coroutines.flow.e.d(eVar.d).a.getValue()).a;
            int size = list.size();
            if (size == 0) {
                whb1.c(null, new IllegalStateException("Tried to start ChargersOrderRouter when there aren't any active orders"));
                r(new qu(i));
                return;
            } else if (size != 1) {
                Q(list);
                return;
            } else {
                R((taa) a.P(list));
                return;
            }
        }
        if (rcaVar instanceof pca) {
            S(((pca) rcaVar).a);
            return;
        }
        if (!(rcaVar instanceof qca)) {
            w511.b();
            return;
        }
        qca qcaVar = (qca) rcaVar;
        String str = qcaVar.a;
        Iterator it = ((rl9) kotlinx.coroutines.flow.e.d(eVar.d).a.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (jl40.l(((taa) obj2).a(), str)) {
                    break;
                }
            }
        }
        taa taaVar = (taa) obj2;
        if (!(taaVar instanceof z8y)) {
            whb1.c(null, new IllegalArgumentException(oyr.p("Order with orderId `", str, "` is not in LeasingChargersOrder state")));
            r(new qu(i));
            return;
        }
        tje.N(o(), null, null, new ChargersOrderRouterImpl$launchFinishOrder$$inlined$collectIn$1(kotlinx.coroutines.flow.e.d(eVar.d), null, this, qcaVar), 3);
        A((m950) this.F.get(), new g1a(qcaVar.b, ((z8y) taaVar).a), new oda(this));
    }

    public final void Q(List list) {
        m950 m950Var = (m950) this.G.get();
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((taa) it.next()).a());
        }
        A(m950Var, new p4a(arrayList), new lda(this));
    }

    public final void R(taa taaVar) {
        if ((taaVar instanceof r8f) || (taaVar instanceof krj0) || (taaVar instanceof qko)) {
            String a = taaVar.a();
            A((m950) this.J.get(), new gda(a), new pda(this, a));
            return;
        }
        if (taaVar instanceof z8y) {
            A((m950) this.H.get(), new qk9(((z8y) taaVar).a, ChargersAnalytics$ChargersActiveOrderCardOpenReason.SuperappMain), new mda(this));
        } else if (taaVar instanceof d18) {
            T(((d18) taaVar).b);
        } else if (taaVar instanceof nar) {
            r(new qu(9));
        } else {
            w511.b();
        }
    }

    public final void S(String str) {
        Object obj;
        Iterator it = ((rl9) kotlinx.coroutines.flow.e.d(this.I.d).a.getValue()).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((taa) obj).a(), str)) {
                    break;
                }
            }
        }
        taa taaVar = (taa) obj;
        if (taaVar != null) {
            R(taaVar);
        } else {
            whb1.c(null, new IllegalArgumentException(oyr.p("No order with orderId `", str, "`")));
            r(new qu(9));
        }
    }

    public final void T(cy9 cy9Var) {
        A((m950) this.E.get(), new ly9(cy9Var), new nda(this));
    }
}
