package defpackage;

import android.content.Context;
import com.yandex.go.analytics.b;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import com.yandex.go.taxi.tariffs.interactor.v;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.preorder.tollroad.TollRoadModalView;
import ru.yandex.taxi.preorder.tollroad.compose.interactor.a;
import ru.yandex.taxi.preorder.tollroad.compose.interactor.d;
import ru.yandex.taxi.preorder.tollroad.o;

/* loaded from: classes6.dex */
public final class uqz0 implements y880 {
    public final kcz0 a;
    public final s6k0 b;
    public final e c;
    public final yit0 d;
    public final ppz0 e;
    public final opz0 f;
    public final biv0 g;
    public final moz0 h;

    public uqz0(kcz0 kcz0Var, s6k0 s6k0Var, e eVar, yit0 yit0Var, ppz0 ppz0Var, opz0 opz0Var, biv0 biv0Var, moz0 moz0Var) {
        this.a = kcz0Var;
        this.b = s6k0Var;
        this.c = eVar;
        this.d = yit0Var;
        this.e = ppz0Var;
        this.f = opz0Var;
        this.g = biv0Var;
        this.h = moz0Var;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        fqz0 a = this.e.a();
        moz0 moz0Var = this.h;
        moz0Var.getClass();
        rmy0 rmy0Var = new rmy0(13, moz0Var, a);
        b bVar = moz0Var.a;
        bVar.getClass();
        ((w3j0) rmy0Var.invoke(new vug(bVar, "TollRoad.tollRoadDialogShowState"))).m();
        if (!(a instanceof wpz0)) {
            x880Var.n();
            return;
        }
        boolean e = this.f.e();
        e eVar = this.c;
        tqz0 tqz0Var = new tqz0(x880Var, this, eVar.a.a());
        if (e) {
            s6k0 s6k0Var = this.b;
            itc itcVar = (itc) s6k0Var.a;
            itcVar.getClass();
            q4g q4gVar = new q4g(itcVar, tqz0Var);
            Context context = (Context) itcVar.a;
            q5z.h(context);
            i130 i130Var = (i130) itcVar.b;
            q5z.h(i130Var);
            ru.yandex.taxi.preorder.tollroad.data.e eVar2 = (ru.yandex.taxi.preorder.tollroad.data.e) itcVar.c;
            q5z.h(eVar2);
            kdd0 kdd0Var = new kdd0(eVar2, q4gVar.q(), (xtk0) ((xvf0) q4gVar.x).get(), tqz0Var);
            tt2 tt2Var = (tt2) itcVar.i;
            q5z.h(tt2Var);
            o r = q4gVar.r();
            ru.yandex.taxi.orderbutton.toll_roads.interactors.b bVar2 = (ru.yandex.taxi.orderbutton.toll_roads.interactors.b) itcVar.l;
            q5z.h(bVar2);
            teh q = q4gVar.q();
            zuj0 zuj0Var = (zuj0) itcVar.g;
            q5z.h(zuj0Var);
            d dVar = new d(tt2Var, r, bVar2, q, zuj0Var);
            o r2 = q4gVar.r();
            teh q2 = q4gVar.q();
            v vVar = (v) itcVar.m;
            q5z.h(vVar);
            a aVar = new a(r2, q2, vVar, (xtk0) ((xvf0) q4gVar.x).get());
            ebg ebgVar = (ebg) q4gVar.y;
            nqz0 nqz0Var = (nqz0) itcVar.p;
            q5z.h(nqz0Var);
            ru.yandex.taxi.preorder.tollroad.compose.navigation.b bVar3 = new ru.yandex.taxi.preorder.tollroad.compose.navigation.b(context, i130Var, kdd0Var, dVar, aVar, ebgVar, nqz0Var);
            ((i130) s6k0Var.b).a().a();
            oep0.b((oep0) s6k0Var.c, bVar3);
        } else {
            kcz0 kcz0Var = this.a;
            itc itcVar2 = (itc) kcz0Var.a;
            itcVar2.getClass();
            wwf wwfVar = new wwf();
            wwfVar.a = itcVar2;
            wwfVar.b = dhs0.a(new w7y0(new ebg(itcVar2, 4), 29));
            wwfVar.c = new ebg(itcVar2, 5);
            Context context2 = (Context) itcVar2.a;
            q5z.h(context2);
            ru.yandex.taxi.preorder.tollroad.data.e eVar3 = (ru.yandex.taxi.preorder.tollroad.data.e) itcVar2.c;
            q5z.h(eVar3);
            o k = wwfVar.k();
            ptx ptxVar = (ptx) itcVar2.j;
            q5z.h(ptxVar);
            pho phoVar = (pho) itcVar2.r;
            q5z.h(phoVar);
            teh tehVar = new teh(eVar3, k, ptxVar, new x770(phoVar));
            o k2 = wwfVar.k();
            ru.yandex.taxi.orderbutton.toll_roads.interactors.b bVar4 = (ru.yandex.taxi.orderbutton.toll_roads.interactors.b) itcVar2.l;
            q5z.h(bVar4);
            v vVar2 = (v) itcVar2.m;
            q5z.h(vVar2);
            qpz0 qpz0Var = new qpz0(tehVar, tqz0Var, k2, bVar4, vVar2);
            a3v a3vVar = (a3v) itcVar2.k;
            q5z.h(a3vVar);
            TollRoadModalView tollRoadModalView = new TollRoadModalView(context2, qpz0Var, a3vVar);
            w030 a2 = ((i130) kcz0Var.b).a();
            a2.a();
            a2.k(tollRoadModalView, 2.0f, true);
        }
        eVar.h(SourcePointMode.TOLL_ROAD_SELECTOR, true, false);
        this.d.a(MapPositionAction.DEFAULT);
    }
}
