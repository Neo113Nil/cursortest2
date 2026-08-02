package ru.yandex.taxi.favorites.rides.delete_modal;

import android.content.Context;
import defpackage.bhh;
import defpackage.mdh;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w030;
import defpackage.wfd;
import defpackage.wip;

/* loaded from: classes5.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final tt2 H;
    public final wip I;
    public final ru.yandex.taxi.favorites.rides.delete_modal.domain.a J;
    public final mu5 K;

    public c(Context context, w030 w030Var, tt2 tt2Var, wip wipVar, ru.yandex.taxi.favorites.rides.delete_modal.domain.a aVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = tt2Var;
        this.I = wipVar;
        this.J = aVar;
        this.K = new mu5(new bhh(1, this));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.J.b.c.l(null);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        b bVar = new b(this);
        tse o = o();
        this.H.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        tje.N(o, mdhVar, null, new DeleteModalRouterImpl$onLaunch$1(this, null), 2);
        tje.N(o(), mdhVar, null, new DeleteModalRouterImpl$onLaunch$2(this, (String) obj, bVar, null), 2);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
