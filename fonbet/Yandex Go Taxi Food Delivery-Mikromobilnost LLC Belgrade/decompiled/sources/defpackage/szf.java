package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.yandex.go.order.external.b;
import com.yandex.go.superapp.impl.delegate.a;
import com.yandex.go.superapp.impl.signals.e;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.domain.o;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.superapp.address.j;

/* loaded from: classes5.dex */
public final class szf implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ szf(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                pdn pdnVar = (pdn) ((c0g) i6rVar).z.mq.get();
                q5z.h(pdnVar);
                return pdnVar;
            case 1:
                return (zzo) ((c0g) i6rVar).Xk.get();
            case 2:
                c0g c0gVar = (c0g) i6rVar;
                zzf zzfVar = c0gVar.z;
                g gVar = (g) zzfVar.e6.get();
                sm40 sm40Var = (sm40) zzfVar.rl.get();
                return new a(new y9w0(gVar, sm40Var), new j((rvf0) c0gVar.zl.get(), (atd0) c0gVar.Ac.get()), new com.yandex.go.superapp.impl.interactor.a((ru.yandex.taxi.experiments.superapp.j) zzfVar.E.get()));
            case 3:
                hgn hgnVar = (hgn) ((c0g) i6rVar).A.a.B2.get();
                q5z.h(hgnVar);
                return hgnVar;
            case 4:
                g0t g0tVar = (g0t) ((c0g) i6rVar).A.a.L2.get();
                q5z.h(g0tVar);
                return g0tVar;
            case 5:
                pav w2 = ((c0g) i6rVar).w2();
                q5z.h(w2);
                return w2;
            case 6:
                c cVar = (c) ((c0g) i6rVar).z.Y0.get();
                q5z.h(cVar);
                return cVar;
            case 7:
                k0w0 k0w0Var = (k0w0) ((c0g) i6rVar).A.a.P2.a;
                q5z.h(k0w0Var);
                return k0w0Var;
            case 8:
                c0g c0gVar2 = ((c0g) i6rVar).A.a.b;
                return new l7s0(new bgn());
            case 9:
                a850 a850Var = (a850) ((c0g) i6rVar).z.C8.get();
                q5z.h(a850Var);
                return a850Var;
            case 10:
                b bVar = (b) ((c0g) i6rVar).z.g4.get();
                q5z.h(bVar);
                return bVar;
            case 11:
                e6w0 e6w0Var = (e6w0) ((c0g) i6rVar).A.a.N2.a;
                q5z.h(e6w0Var);
                return e6w0Var;
            case 12:
                kpe0 kpe0Var = (kpe0) ((c0g) i6rVar).A.a.U2.get();
                q5z.h(kpe0Var);
                return kpe0Var;
            case 13:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                c0g c0gVar3 = d0gVar.b;
                yrv0 yrv0Var = (yrv0) c0gVar3.ml.get();
                zzf zzfVar2 = c0gVar3.z;
                gof0 gof0Var = new gof0((abf0) zzfVar2.ek.get(), (hof0) zzfVar2.fk.get());
                zzf zzfVar3 = d0gVar.a;
                return new gym(new m(yrv0Var, gof0Var, (u1p) zzfVar3.on.get(), (tt2) zzfVar3.n.get(), (sm40) zzfVar3.rl.get(), (g) zzfVar3.e6.get(), (fsv0) d0gVar.J2.get(), (kb20) zzfVar3.k.get(), (wnt) zzfVar3.q.get(), new v8w0((pho) zzfVar3.d0.get())));
            case 14:
                return (hef0) ((c0g) i6rVar).F.get();
            case 15:
                p6j0 p6j0Var = (p6j0) ((c0g) i6rVar).A.a.G2.get();
                q5z.h(p6j0Var);
                return p6j0Var;
            case 16:
                com.yandex.go.superapp.impl.interactor.c cVar2 = (com.yandex.go.superapp.impl.interactor.c) ((c0g) i6rVar).A.a.H2.get();
                q5z.h(cVar2);
                return cVar2;
            case 17:
                d0g d0gVar2 = ((c0g) i6rVar).A.a;
                c0g c0gVar4 = d0gVar2.b;
                Context context = (Context) c0gVar4.U.get();
                zzf zzfVar4 = d0gVar2.a;
                return new ru.yandex.taxi.superapp.m(context, new zch((pav) zzfVar4.p3.get()), new r5f0(), new me0((Context) c0gVar4.U.get(), (byte) 0), (ru.yandex.taxi.activity.g) c0gVar4.F0.get(), (tt2) zzfVar4.n.get());
            case 18:
                c0g c0gVar5 = ((c0g) i6rVar).A.a.b;
                ImmutableSet l = ImmutableSet.l(4, new e(c0gVar5.L0), new agn(c0gVar5.wl, 0), new agn(c0gVar5.wl, 1), new agn(c0gVar5.wl, 2));
                q5z.h(l);
                return l;
            case 19:
                yrv0 yrv0Var2 = (yrv0) ((c0g) i6rVar).ml.get();
                q5z.h(yrv0Var2);
                return yrv0Var2;
            case 20:
                xsv0 xsv0Var = (xsv0) ((c0g) i6rVar).z.Uf.get();
                q5z.h(xsv0Var);
                return xsv0Var;
            case 21:
                c0g c0gVar6 = (c0g) i6rVar;
                Context context2 = (Context) c0gVar6.U.get();
                tse tseVar = (tse) c0gVar6.B.get();
                ru.yandex.taxi.fragment.common.b bVar2 = (ru.yandex.taxi.fragment.common.b) c0gVar6.n8.get();
                zzf zzfVar5 = c0gVar6.z;
                return new com.yandex.go.superapp.web.view.a(context2, tseVar, bVar2, (o3h) zzfVar5.K.get(), (bv41) zzfVar5.Mj.get(), (f) zzfVar5.S.get(), (j5z) zzfVar5.f0.get(), (lg21) zzfVar5.u5.get(), (exu0) zzfVar5.T.get(), (v7j0) c0gVar6.L0.get(), new o7w0((d7u0) c0gVar6.p8.get()));
            case 22:
                d0g d0gVar3 = ((c0g) i6rVar).A.a;
                zzf zzfVar6 = d0gVar3.a;
                return new fcj0((o) zzfVar6.H6.get(), (u) zzfVar6.V1.get(), (tt2) zzfVar6.n.get(), (as51) d0gVar3.C2.get(), new c8w0());
            case 23:
                d0g d0gVar4 = ((c0g) i6rVar).A.a;
                zzf zzfVar7 = d0gVar4.a;
                tt2 tt2Var = (tt2) zzfVar7.n.get();
                ru.yandex.taxi.am.o b = zzfVar7.b();
                c0g c0gVar7 = d0gVar4.b;
                return new y8w0(tt2Var, b, (ru.yandex.taxi.superapp.f) c0gVar7.la.get(), (dne) d0gVar4.z2.a, (u3p) d0gVar4.A2.a, new vr((Context) c0gVar7.U.get(), (char) 0));
            case 24:
                ((c0g) i6rVar).getClass();
                return new t9w0();
            case 25:
                return new jhu0(((c0g) i6rVar).A.a.b.t2());
            case 26:
                x9w0 x9w0Var = (x9w0) ((c0g) i6rVar).A.a.D2.a;
                q5z.h(x9w0Var);
                return x9w0Var;
            case 27:
                return new jhu0(new com.yandex.go.proxyprovision.j((yws) ((c0g) i6rVar).A.a.a.V6.get()));
            case 28:
                return new jhu0((po21) ((c0g) i6rVar).A.a.a.Y1.get());
            default:
                return new wor0(new ru.yandex.taxi.messenger.a(new i120((rqo) ((c0g) i6rVar).A.a.a.C.get())));
        }
    }
}
