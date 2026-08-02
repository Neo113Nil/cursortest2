package defpackage;

import com.yandex.go.superapp.impl.interactor.d;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.passport.sloth.ui.dependencies.m;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.superapp.address.f;

/* loaded from: classes14.dex */
public final class vzf {
    public final c a;
    public final m b;
    public final com.yandex.go.superapp.impl.interactor.c c;
    public final tse d;
    public final y3p e;
    public final h1p f;
    public final f g;
    public final rvq0 h;
    public final xvf0 i = dhs0.a(gw4.a);

    public vzf(m mVar, h1p h1pVar, c cVar, tse tseVar, f fVar, y3p y3pVar, com.yandex.go.superapp.impl.interactor.c cVar2, rvq0 rvq0Var) {
        this.a = cVar;
        this.b = mVar;
        this.c = cVar2;
        this.d = tseVar;
        this.e = y3pVar;
        this.f = h1pVar;
        this.g = fVar;
        this.h = rvq0Var;
    }

    public final g1p a() {
        m mVar = this.b;
        kb20 kb20Var = (kb20) mVar.h;
        q5z.h(kb20Var);
        wnt wntVar = (wnt) mVar.i;
        q5z.h(wntVar);
        d dVar = new d(kb20Var, wntVar, this.c, (fw4) this.i.get());
        tt2 tt2Var = (tt2) mVar.d;
        q5z.h(tt2Var);
        return new g1p(this.a, dVar, this.d, tt2Var);
    }

    public final com.yandex.go.superapp.impl.presenter_delegate.d b() {
        m mVar = this.b;
        sm40 sm40Var = (sm40) mVar.e;
        q5z.h(sm40Var);
        g gVar = (g) mVar.f;
        q5z.h(gVar);
        tt2 tt2Var = (tt2) mVar.d;
        q5z.h(tt2Var);
        return new com.yandex.go.superapp.impl.presenter_delegate.d(sm40Var, gVar, tt2Var, this.a, this.f);
    }
}
