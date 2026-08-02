package ru.yandex.taxi.masstransit.geopayment.linkcard;

import defpackage.gf41;
import defpackage.h55;
import defpackage.t130;
import defpackage.tje;

/* loaded from: classes6.dex */
public final class b extends h55 {
    public final gf41 D;
    public final String E;
    public final t130 F;

    public b(gf41 gf41Var, String str, t130 t130Var) {
        super(null);
        this.D = gf41Var;
        this.E = str;
        this.F = t130Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new MtLinkCardWebViewRouter$onLaunch$1(this, null), 3);
    }
}
