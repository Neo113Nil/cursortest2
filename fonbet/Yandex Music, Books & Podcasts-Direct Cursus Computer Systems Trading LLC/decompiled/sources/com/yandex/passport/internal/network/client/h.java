package com.yandex.passport.internal.network.client;

import defpackage.wvs;
import defpackage.xy0;

/* loaded from: classes4.dex */
public final class h {
    public final xy0 a;
    public final xy0 b;

    public h(xy0 xy0Var, xy0 xy0Var2) {
        this.a = xy0Var;
        this.b = xy0Var2;
    }

    public final g a(com.yandex.passport.common.core.b bVar) {
        g gVar = (g) this.a.get(bVar);
        if (gVar != null) {
            return gVar;
        }
        wvs.p("You must specify one of the possible passport environments");
        return null;
    }

    public final j b(com.yandex.passport.common.core.b bVar) {
        j jVar = (j) this.b.get(bVar);
        if (jVar != null) {
            return jVar;
        }
        wvs.p("You must specify one of the possible passport environments");
        return null;
    }
}
