package ru.yandex.taxi.preorder.tollroad.compose.interactor;

import defpackage.jqr;
import defpackage.o400;
import defpackage.sjh;
import defpackage.teh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.preorder.tollroad.l;
import ru.yandex.taxi.preorder.tollroad.o;

/* loaded from: classes6.dex */
public final class d implements yt11 {
    public final o a;
    public final teh b;
    public final zuj0 c;
    public final tpr d;

    public d(tt2 tt2Var, o oVar, ru.yandex.taxi.orderbutton.toll_roads.interactors.b bVar, teh tehVar, zuj0 zuj0Var) {
        this.a = oVar;
        this.b = tehVar;
        this.c = zuj0Var;
        tpr h = oVar.h();
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        tpr F = e.F(h, o400.a);
        this.d = e.F(e.t(e.n(new l(oVar.d.a(), oVar), new jqr(F, new RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$1(this, null), 3), bVar.b(new c(F, this)), new RoadsPaneUiStateInteractor$getRoadPaneUiStateFlow$2(this, null))), uyj.a);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.d;
    }
}
