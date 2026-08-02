package defpackage;

import android.content.Context;
import com.yandex.go.places.impl.data.repositories.map.a;
import com.yandex.go.route.interactor.b;
import ru.yandex.taxi.persuggest.source.h;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class y4g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ y4g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                return ((c0g) i6rVar).z.i1();
            case 1:
                a aVar = (a) ((c0g) i6rVar).uf.get();
                q5z.h(aVar);
                return aVar;
            case 2:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                c0g c0gVar = d0gVar.b;
                Context context = (Context) c0gVar.U.get();
                w030 w030Var = (w030) c0gVar.o0.get();
                zzf zzfVar = d0gVar.a;
                return new y4c0(new dt20(context, w030Var, (tt2) zzfVar.n.get(), (atd0) c0gVar.Ac.get(), 28), (c2x0) c0gVar.xb.get(), (pwy0) zzfVar.U.get(), (z0j) c0gVar.Re.get(), 0);
            case 3:
                c0g c0gVar2 = ((c0g) i6rVar).A.a.b;
                return p03.l(((lt2) c0gVar2.z.g.get()).j(), new bac0(0, c0gVar2), new bac0(1, (Context) c0gVar2.U.get()));
            case 4:
                rac0 rac0Var = (rac0) ((c0g) i6rVar).bf.get();
                q5z.h(rac0Var);
                return rac0Var;
            case 5:
                mcc0 mcc0Var = (mcc0) ((c0g) i6rVar).z.Jn.get();
                q5z.h(mcc0Var);
                return mcc0Var;
            case 6:
                pcc0 pcc0Var = (pcc0) ((c0g) i6rVar).Ep.get();
                q5z.h(pcc0Var);
                return pcc0Var;
            case 7:
                qcc0 qcc0Var = (qcc0) ((c0g) i6rVar).Dp.get();
                q5z.h(qcc0Var);
                return qcc0Var;
            case 8:
                com.yandex.go.places.searchbar.impl.domain.a aVar2 = (com.yandex.go.places.searchbar.impl.domain.a) ((c0g) i6rVar).A.a.Z3.get();
                q5z.h(aVar2);
                return aVar2;
            case 9:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                return new zsa(26, (qec0) d0gVar2.a4.a, (kec0) d0gVar2.c4.a);
            case 10:
                hfc0 hfc0Var = (hfc0) ((c0g) i6rVar).vf.get();
                q5z.h(hfc0Var);
                return hfc0Var;
            case 11:
                qfc0 qfc0Var = (qfc0) ((c0g) i6rVar).z.Hq.get();
                q5z.h(qfc0Var);
                return qfc0Var;
            case 12:
                d0g d0gVar3 = ((c0g) i6rVar).A.a;
                c0g c0gVar3 = d0gVar3.b;
                gf41 F6 = c0gVar3.F6();
                zzf zzfVar2 = d0gVar3.a;
                return new wfc0(F6, (ru.yandex.taxi.am.token.a) zzfVar2.C3.get(), (fn21) zzfVar2.a0.get(), (ngc0) c0gVar3.Oe.a, (j5z) zzfVar2.f0.get(), new xes0(c0gVar3.w), zzfVar2.b(), (w030) c0gVar3.o0.get());
            case 13:
                com.yandex.go.places.impl.ui.common.map.location.a aVar3 = (com.yandex.go.places.impl.ui.common.map.location.a) ((c0g) i6rVar).zC.get();
                q5z.h(aVar3);
                return aVar3;
            case 14:
                return (vgc0) ((c0g) i6rVar).Pe.get();
            case 15:
                ysd0 ysd0Var = (ysd0) ((c0g) i6rVar).wd.get();
                q5z.h(ysd0Var);
                return ysd0Var;
            case 16:
                atd0 V5 = ((c0g) i6rVar).V5();
                q5z.h(V5);
                return V5;
            case 17:
                b W5 = ((c0g) i6rVar).W5();
                q5z.h(W5);
                return W5;
            case 18:
                rqo rqoVar = (rqo) ((c0g) i6rVar).z.C.get();
                q5z.h(rqoVar);
                return rqoVar;
            case 19:
                return ((c0g) i6rVar).X5();
            case 20:
                zuj0 c = ((c0g) i6rVar).c();
                q5z.h(c);
                return c;
            case 21:
                oep0 a6 = ((c0g) i6rVar).a6();
                q5z.h(a6);
                return a6;
            case 22:
                iaq0 iaq0Var = (iaq0) ((c0g) i6rVar).A.a.V3.get();
                q5z.h(iaq0Var);
                return iaq0Var;
            case 23:
                return ((c0g) i6rVar).d6();
            case 24:
                i iVar = (i) ((c0g) i6rVar).Ac.get();
                q5z.h(iVar);
                return iVar;
            case 25:
                exu0 exu0Var = (exu0) ((c0g) i6rVar).z.T.get();
                q5z.h(exu0Var);
                return exu0Var;
            case 26:
                oxu0 oxu0Var = (oxu0) ((c0g) i6rVar).z.li.get();
                q5z.h(oxu0Var);
                return oxu0Var;
            case 27:
                h hVar = (h) ((c0g) i6rVar).wE.get();
                q5z.h(hVar);
                return hVar;
            case 28:
                uuv0 uuv0Var = (uuv0) ((c0g) i6rVar).A.a.Y3.get();
                q5z.h(uuv0Var);
                return uuv0Var;
            default:
                yz4 yz4Var = (yz4) ((c0g) i6rVar).sf.get();
                q5z.h(yz4Var);
                return yz4Var;
        }
    }
}
