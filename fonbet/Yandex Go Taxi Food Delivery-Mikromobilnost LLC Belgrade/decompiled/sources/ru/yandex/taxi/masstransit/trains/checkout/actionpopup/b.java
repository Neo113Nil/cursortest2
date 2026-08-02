package ru.yandex.taxi.masstransit.trains.checkout.actionpopup;

import android.content.Context;
import defpackage.c7s0;
import defpackage.mu5;
import defpackage.p940;
import defpackage.pgd;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.x240;
import defpackage.y3g;

/* loaded from: classes6.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final d H;
    public final c I;
    public final y3g J;
    public final p940 K;
    public final mu5 L;

    public b(Context context, w030 w030Var, d dVar, c cVar, y3g y3gVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = dVar;
        this.I = cVar;
        this.J = y3gVar;
        this.K = new p940(this);
        this.L = new mu5(new x240(6, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        c7s0 c7s0Var = (c7s0) obj;
        super.G(c7s0Var);
        tje.N(o(), null, null, new MtTrainActionPopupModalRouter$onAttach$1(this, c7s0Var, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.L;
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
