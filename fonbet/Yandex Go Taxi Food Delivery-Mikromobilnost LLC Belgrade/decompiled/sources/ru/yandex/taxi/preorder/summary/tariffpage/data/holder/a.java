package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.tariffcard.interactor.d0;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.aox0;
import defpackage.box0;
import defpackage.czo0;
import defpackage.e100;
import defpackage.fd60;
import defpackage.gvz0;
import defpackage.ha2;
import defpackage.hbp0;
import defpackage.hhs0;
import defpackage.mth;
import defpackage.qhx0;
import defpackage.qr31;
import defpackage.rhx0;
import defpackage.shx0;
import defpackage.t47;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tw60;
import defpackage.uyj;
import defpackage.vu30;
import defpackage.znx0;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.summary.requirements.list.interactors.l0;
import ru.yandex.taxi.summary.requirements.list.recycler.i;

/* loaded from: classes14.dex */
public final class a {
    public final tt2 a;
    public final tw60 b;
    public final hbp0 c = new hbp0(new czo0(14), "", null);
    public qhx0 d;

    public a(tt2 tt2Var, tw60 tw60Var) {
        this.a = tt2Var;
        this.b = tw60Var;
    }

    public final void a(qhx0 qhx0Var) {
        this.d = qhx0Var;
        hbp0 hbp0Var = this.c;
        hbp0Var.a();
        tw60 tw60Var = this.b;
        tpr b = tw60Var.e.b();
        tpr t = kotlinx.coroutines.flow.e.t(((k) tw60Var.a).j.b());
        mth a = tw60Var.d.a();
        m0 a2 = tw60Var.f.a(b);
        hhs0 hhs0Var = tw60Var.h;
        ha2 m = kotlinx.coroutines.flow.e.m(t, a, a2, new d0(((l0) hhs0Var.b).a(), hhs0Var), new OldTariffCardRequirementsDelegate$requirementsItemsFlow$1$1(tw60Var, null));
        this.a.getClass();
        tje.N(hbp0Var, null, null, new OldTariffCardRequirementsDelegate$listenRequirements$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(m, uyj.a), null, this), 3);
    }

    public final qhx0 b() {
        tw60 tw60Var = this.b;
        e100 e100Var = tw60Var.c;
        i iVar = tw60Var.g;
        znx0 a = ((box0) ((aox0) e100Var.w)).a(new qr31(new FrameLayout((Context) e100Var.b), new gvz0()));
        return ((shx0) ((rhx0) e100Var.c)).a(new vu30(12), new fd60(15), a, iVar.c(), new t47(2, iVar));
    }
}
