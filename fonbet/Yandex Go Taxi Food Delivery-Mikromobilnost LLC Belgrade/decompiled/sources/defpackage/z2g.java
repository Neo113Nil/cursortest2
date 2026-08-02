package defpackage;

import android.content.Context;
import com.yandex.go.flex.common.descriptors.action.GoReloadLabeledSectionsActionDescriptorFactoryImpl;
import com.yandex.go.flex.common.utils.a;
import com.yandex.go.flex.main_screen.presentation.feed.e;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.superapp.order.multi.old.provider.g;
import ru.yandex.taxi.superapp.knownOrder.u;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes.dex */
public final class z2g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ z2g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                ((c0g) i6rVar).getClass();
                return new GoReloadLabeledSectionsActionDescriptorFactoryImpl();
            case 1:
                return new rav(new vit(19, ((c0g) i6rVar).A.a.b.a2()));
            case 2:
                pav w2 = ((c0g) i6rVar).w2();
                q5z.h(w2);
                return w2;
            case 3:
                return new a((tt2) ((c0g) i6rVar).A.a.a.n.get());
            case 4:
                k6x k6xVar = (k6x) ((c0g) i6rVar).A.a.O2.get();
                q5z.h(k6xVar);
                return k6xVar;
            case 5:
                u uVar = (u) ((c0g) i6rVar).z.nl.get();
                q5z.h(uVar);
                return uVar;
            case 6:
                umx umxVar = (umx) ((c0g) i6rVar).z.p.get();
                q5z.h(umxVar);
                return umxVar;
            case 7:
                nsx nsxVar = (nsx) ((c0g) i6rVar).A.a.Z2.get();
                q5z.h(nsxVar);
                return nsxVar;
            case 8:
                x8z x8zVar = (x8z) ((c0g) i6rVar).Kb.get();
                q5z.h(x8zVar);
                return x8zVar;
            case 9:
                n nVar = (n) ((c0g) i6rVar).z.Q2.get();
                q5z.h(nVar);
                return nVar;
            case 10:
                p800 p800Var = (p800) ((c0g) i6rVar).A.a.f3.get();
                q5z.h(p800Var);
                return p800Var;
            case 11:
                c900 c900Var = (c900) ((c0g) i6rVar).z.Up.get();
                q5z.h(c900Var);
                return c900Var;
            case 12:
                e eVar = (e) ((c0g) i6rVar).Ps.get();
                q5z.h(eVar);
                return eVar;
            case 13:
                dd00 dd00Var = (dd00) ((c0g) i6rVar).Mr.get();
                q5z.h(dd00Var);
                return dd00Var;
            case 14:
                ls20 ls20Var = (ls20) ((c0g) i6rVar).z.pq.get();
                q5z.h(ls20Var);
                return ls20Var;
            case 15:
                i130 G = ((c0g) i6rVar).G();
                q5z.h(G);
                return G;
            case 16:
                g gVar = (g) ((c0g) i6rVar).z.e6.get();
                q5z.h(gVar);
                return gVar;
            case 17:
                jp50 jp50Var = (jp50) ((c0g) i6rVar).Ar.get();
                q5z.h(jp50Var);
                return jp50Var;
            case 18:
                cp60 cp60Var = (cp60) ((c0g) i6rVar).z.s7.get();
                q5z.h(cp60Var);
                return cp60Var;
            case 19:
                com.yandex.go.lifecycle.processor.e eVar2 = (com.yandex.go.lifecycle.processor.e) ((c0g) i6rVar).vz.get();
                q5z.h(eVar2);
                return eVar2;
            case 20:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                zzf zzfVar = d0gVar.a;
                tt2 tt2Var = (tt2) zzfVar.n.get();
                zzf zzfVar2 = d0gVar.a;
                return new ofa0(tt2Var, new py51((com.yandex.go.yb.data.e) zzfVar2.U1.get(), (qy51) zzfVar2.qq.get()), (gv51) d0gVar.e3.get(), (ly90) zzfVar.rq.get());
            case 21:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                return new wla0((sla0) d0gVar2.l3.a, new kjz(21, (Context) d0gVar2.b.U.get(), (bma0) d0gVar2.m3.a));
            case 22:
                return ((c0g) i6rVar).z.i1();
            case 23:
                return ((c0g) i6rVar).Q5();
            case 24:
                return (c) ((c0g) i6rVar).Wg.get();
            case 25:
                zzf zzfVar3 = ((c0g) i6rVar).z;
                return new dhe0(zzfVar3.i1(), (n) zzfVar3.Q2.get());
            case 26:
                return new qc20((m8f0) ((c0g) i6rVar).A.a.a.w.get());
            case 27:
                hof0 hof0Var = (hof0) ((c0g) i6rVar).z.fk.get();
                q5z.h(hof0Var);
                return hof0Var;
            case 28:
                elr elrVar = (elr) ((c0g) i6rVar).Mq.get();
                q5z.h(elrVar);
                return elrVar;
            default:
                zuj0 N2 = ((c0g) i6rVar).N2();
                q5z.h(N2);
                return N2;
        }
    }
}
