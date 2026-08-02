package ru.yandex.taxi.share_favorites.experiments;

import defpackage.ha2;
import defpackage.jbh;
import defpackage.oep0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.s0t;
import defpackage.v0t;
import defpackage.yvf0;
import ru.yandex.taxi.e;

/* loaded from: classes6.dex */
public final class c {
    public final oep0 a;
    public final com.yandex.go.navigation.screen.c b;
    public final s0t c;
    public final e d;
    public final yvf0 e;
    public final qqo f;

    public c(rqo rqoVar, oep0 oep0Var, com.yandex.go.navigation.screen.c cVar, s0t s0tVar, e eVar, yvf0 yvf0Var) {
        this.a = oep0Var;
        this.b = cVar;
        this.c = s0tVar;
        this.d = eVar;
        this.e = yvf0Var;
        v0t.Companion.getClass();
        this.f = ((jbh) rqoVar).c(v0t.i);
    }

    public final ha2 a() {
        return kotlinx.coroutines.flow.e.n(new b(this.f.a(), this), this.d.c(), this.b.c(), new GeoSharingBubbleFactory$sharingBubbleModelFlow$1(this, null));
    }
}
