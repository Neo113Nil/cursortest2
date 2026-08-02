package ru.yandex.taxi.masstransit.trains.checkout.tariff;

import android.content.Context;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.qh40;
import defpackage.sh40;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.x240;

/* loaded from: classes6.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final d H;
    public final a I;
    public final qh40 J;
    public final mu5 K;

    public c(Context context, w030 w030Var, d dVar, a aVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = dVar;
        this.I = aVar;
        this.J = new qh40(this);
        this.K = new mu5(new x240(10, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        sh40 sh40Var = (sh40) obj;
        super.G(sh40Var);
        tje.N(o(), null, null, new MtTrainTariffModalRouter$onAttach$1(this, sh40Var, null), 3);
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
