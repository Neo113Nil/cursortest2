package defpackage;

import android.content.Context;
import com.yandex.go.analytics.b;
import com.yandex.go.taxi.tariffs.interactor.h;
import com.yandex.go.yb.data.u;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.delivery.impl.paid_insurance.c;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.delivery.impl.paid_insurance.e;
import ru.yandex.taxi.personalstate.domain.interactor.j;
import ru.yandex.taxi.personalstate.domain.o;
import ru.yandex.taxi.settings.email.a;

/* loaded from: classes5.dex */
public final class s0g implements xvf0 {
    public final /* synthetic */ int a;
    public final h0g b;

    public /* synthetic */ s0g(h0g h0gVar, int i) {
        this.a = i;
        this.b = h0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h0g h0gVar = this.b;
        switch (i) {
            case 0:
                o3i o3iVar = (o3i) h0gVar.x.sp.get();
                q5z.h(o3iVar);
                return o3iVar;
            case 1:
                b bVar = (b) h0gVar.x.i3.get();
                q5z.h(bVar);
                return bVar;
            case 2:
                return (n3h) h0gVar.x.J1.get();
            case 3:
                y5i y5iVar = (y5i) h0gVar.x.Nb.get();
                q5z.h(y5iVar);
                return y5iVar;
            case 4:
                pei peiVar = (pei) h0gVar.y.a.E6.get();
                q5z.h(peiVar);
                return peiVar;
            case 5:
                return new chi(h0gVar.y.a.a.l());
            case 6:
                d0g d0gVar = h0gVar.y.a;
                if9 if9Var = d0gVar.b.Ig;
                zzf zzfVar = d0gVar.a;
                return new e(if9Var, new c((k7x0) zzfVar.M3.get(), (n3h) zzfVar.J1.get(), zzfVar.l(), (d) zzfVar.qp.get(), (ru.yandex.taxi.widget.c) zzfVar.Ze.get()));
            case 7:
                return h0gVar.y.a.d();
            case 8:
                d0g d0gVar2 = h0gVar.y.a;
                return new rpi(d0gVar2.d(), d0gVar2.c());
            case 9:
                d0g d0gVar3 = h0gVar.y.a;
                c0g c0gVar = d0gVar3.b;
                Context context = (Context) c0gVar.U.get();
                zzf zzfVar2 = d0gVar3.a;
                return new spi(new ik0(context, (pav) zzfVar2.p3.get(), (k7x0) zzfVar2.M3.get(), (pdc) zzfVar2.Ye.get(), zzfVar2.x(), dkz.a(), (o3i) zzfVar2.sp.get(), (wiq0) zzfVar2.B2.get(), new bzi0((rqo) zzfVar2.C.get()), new dr7((w030) c0gVar.o0.get(), new j4n((Context) c0gVar.U.get(), (rqo) zzfVar2.C.get(), (n3h) zzfVar2.J1.get(), (lx4) zzfVar2.Y.get(), (pho) zzfVar2.d0.get(), (wiq0) zzfVar2.B2.get(), (uze0) zzfVar2.B2.get()), 3), d0gVar3.d(), d0gVar3.c(), (lx4) zzfVar2.Y.get(), (pwy0) zzfVar2.U.get(), (oep0) c0gVar.T.get(), (pho) zzfVar2.d0.get()));
            case 10:
                return h0gVar.x.m();
            case 11:
                return new e4j((Context) h0gVar.y.a.b.U.get());
            case 12:
                pcm pcmVar = (pcm) h0gVar.x.to.get();
                q5z.h(pcmVar);
                return pcmVar;
            case 13:
                kdm kdmVar = (kdm) h0gVar.x.lq.get();
                q5z.h(kdmVar);
                return kdmVar;
            case 14:
                return h0gVar.y.a.g();
            case 15:
                return new mvm((dqe0) h0gVar.y.a.a.s2.get());
            case 16:
                pvm pvmVar = (pvm) h0gVar.A7.get();
                q5z.h(pvmVar);
                return pvmVar;
            case 17:
                return h0gVar.y.Q1();
            case 18:
                a aVar = (a) h0gVar.x.ck.get();
                q5z.h(aVar);
                return aVar;
            case 19:
                fco fcoVar = (fco) h0gVar.C7.get();
                q5z.h(fcoVar);
                return fcoVar;
            case 20:
                ru.yandex.taxi.sharedpayments.c cVar = (ru.yandex.taxi.sharedpayments.c) h0gVar.y.a.J3.get();
                q5z.h(cVar);
                return cVar;
            case 21:
                zzf zzfVar3 = h0gVar.x;
                return new h((c8r) zzfVar3.il.get(), zzfVar3.o(), (j) zzfVar3.ml.get());
            case 22:
                w6r X = h0gVar.X();
                q5z.h(X);
                return X;
            case 23:
                return new nir(h0gVar.y.o2());
            case 24:
                return h0gVar.N();
            case 25:
                zzf zzfVar4 = h0gVar.y.a.a;
                return new com.yandex.go.yb.domain.b((rqo) zzfVar4.C.get(), (dne0) zzfVar4.d.get(), (u) zzfVar4.V1.get(), (tt2) zzfVar4.n.get());
            case 26:
                m2s m2sVar = (m2s) h0gVar.x.Cq.get();
                q5z.h(m2sVar);
                return m2sVar;
            case 27:
                return new fd(new pj((pho) h0gVar.x.d0.get()));
            case 28:
                g gVar = (g) h0gVar.x.W0.get();
                q5z.h(gVar);
                return gVar;
            default:
                return new dx((o) h0gVar.x.al.get());
        }
    }
}
