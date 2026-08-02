package ru.yandex.taxi.polling;

import defpackage.d8;
import defpackage.g9z;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.sbc;
import ru.yandex.taxi.analytics.n;

/* loaded from: classes9.dex */
public final class a {
    public final c a;
    public final e b;
    public final po21 c;
    public final g9z d;
    public final n e;
    public final i3y f = kotlin.a.a(new sbc(0, this));
    public pzt0 g;

    public a(c cVar, e eVar, po21 po21Var, g9z g9zVar, n nVar) {
        this.a = cVar;
        this.b = eVar;
        this.c = po21Var;
        this.d = g9zVar;
        this.e = nVar;
    }

    public final void a() {
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 e = hbp0.e((hbp0) this.f.getValue(), null, null, new CollectWarmupLocationsInteractor$internalStartCollectLocations$1(this, null), 3);
        e.w(new d8(11, this));
        this.e.f.set(false);
        this.g = e;
    }
}
