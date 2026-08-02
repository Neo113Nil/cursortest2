package defpackage;

import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.navigation.screen.c;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes5.dex */
public final class ucg implements xvf0 {
    public final /* synthetic */ int a;
    public final h0g b;

    public /* synthetic */ ucg(h0g h0gVar, int i) {
        this.a = i;
        this.b = h0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h0g h0gVar = this.b;
        switch (i) {
            case 0:
                i130 G = h0gVar.G();
                q5z.h(G);
                return G;
            case 1:
                oep0 n = h0gVar.n();
                q5z.h(n);
                return n;
            case 2:
                c0g c0gVar = h0gVar.y;
                return new da0(23, (i130) c0gVar.g0.get(), new tjt0(c0gVar), (y9y0) h0gVar.x.rm.get());
            default:
                zzf zzfVar = h0gVar.x;
                kip kipVar = new kip((rqo) zzfVar.C.get(), 5);
                c cVar = (c) zzfVar.Bc.get();
                j jVar = (j) h0gVar.L0.get();
                com.yandex.go.route.interactor.c A1 = zzfVar.A1();
                uy41 M1 = h0gVar.M1();
                ou7 a = h0gVar.a();
                ru.yandex.taxi.preorder.source.data.c cVar2 = (ru.yandex.taxi.preorder.source.data.c) h0gVar.N0.get();
                d6l0 d6l0Var = (d6l0) h0gVar.y2.get();
                c9l0 j = h0gVar.j();
                biv0 biv0Var = (biv0) h0gVar.M.get();
                kjt0 kjt0Var = (kjt0) h0gVar.J5.get();
                r rVar = (r) h0gVar.t0.get();
                xvw xvwVar = (xvw) h0gVar.v4.get();
                e eVar = (e) h0gVar.h0.get();
                c0g c0gVar2 = h0gVar.y;
                return new e6g(kipVar, cVar, jVar, A1, M1, a, cVar2, d6l0Var, j, biv0Var, kjt0Var, rVar, xvwVar, eVar, new bwx0((i130) c0gVar2.g0.get()), h0gVar.L1(), (yit0) h0gVar.P0.get(), (uet0) h0gVar.Q0.get(), (xit0) h0gVar.X1.get(), h0gVar.I1(), (ah00) c0gVar2.Vb.get(), h0gVar.H1(), (f0l0) h0gVar.N2.get());
        }
    }
}
