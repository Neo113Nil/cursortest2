package ru.yandex.taxi.masstransit.geopayment.checkout;

import android.content.Context;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.teb;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;

/* loaded from: classes6.dex */
public final class a extends pgd {
    public final w030 F;
    public final Context G;
    public final ru.yandex.taxi.masstransit.experiment.e H;
    public final boolean I;
    public final mu5 J;

    public a(w030 w030Var, Context context, ru.yandex.taxi.masstransit.experiment.e eVar) {
        super(0);
        this.F = w030Var;
        this.G = context;
        this.H = eVar;
        this.I = true;
        this.J = new mu5(new teb(17));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new CheckoutExperimentResolveRouter$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return this.I;
    }
}
