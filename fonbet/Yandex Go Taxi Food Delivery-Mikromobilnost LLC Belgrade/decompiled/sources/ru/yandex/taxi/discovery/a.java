package ru.yandex.taxi.discovery;

import defpackage.ah00;
import defpackage.jyx;
import defpackage.ney;
import defpackage.owj;
import defpackage.pzt0;
import defpackage.qc5;
import defpackage.rwj;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ywj;
import kotlinx.coroutines.flow.n;

/* loaded from: classes5.dex */
public final class a extends qc5 {
    public final ah00 A;
    public final jyx B;
    public final ru.yandex.taxi.multiorder.e C;
    public final ywj D;
    public final owj E;
    public pzt0 F;

    public a(ney neyVar, ah00 ah00Var, jyx jyxVar, ru.yandex.taxi.multiorder.e eVar, ywj ywjVar) {
        super(rwj.class, neyVar);
        this.A = ah00Var;
        this.B = jyxVar;
        this.C = eVar;
        this.D = ywjVar;
        this.E = new owj();
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.B.a.remove(this.E);
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        ywj ywjVar = this.D;
        tje.N(Kg(), null, null, new DiscoveryPresenter$listenLocation$$inlined$safeCollectIn$1(new n(((ru.yandex.taxi.preorder.source.userposition.e) ywjVar.b).n(), new DiscoveryPresenter$listenLocation$1(this, null)), null, this), 3);
        tje.N(Kg(), null, null, new DiscoveryPresenter$listenAzimuth$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new f(new d((tpr) ywjVar.a.l.getValue()))), null, this), 3);
        tje.N(Kg(), null, null, new DiscoveryPresenter$listenActiveOrdersCount$$inlined$safeCollectIn$1(this.C.a(), null, this), 3);
    }

    public final void Mg(rwj rwjVar) {
        Bg(rwjVar);
        this.B.a.add(this.E);
    }

    public final void Ng() {
        pzt0 pzt0Var = this.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.F = tje.N(Jg(), null, null, new DiscoveryPresenter$onGeoTap$1(this, null), 3);
    }
}
