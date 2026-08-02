package ru.yandex.taxi.favorites.address.impl;

import android.content.Context;
import defpackage.iep;
import defpackage.kdp;
import defpackage.m950;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.sep;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import defpackage.ydp;

/* loaded from: classes5.dex */
public final class b extends pgd implements m950 {
    public final Context F;
    public final w030 G;
    public final ru.yandex.taxi.favorites.address.impl.ui.b H;
    public final kdp I;
    public final a J;
    public final p1b K;

    public b(Context context, w030 w030Var, ru.yandex.taxi.favorites.address.impl.ui.b bVar, kdp kdpVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = bVar;
        this.I = kdpVar;
        this.J = new a(this);
        this.K = new p1b(bVar, new iep(this, 0));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.H.d(new sep((ydp) obj), o(), this.J);
        tje.N(o(), null, null, new FavoriteAddressRouterImpl$onLaunch$1(this, null), 3);
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
