package ru.yandex.taxi.preorder.source.userposition;

import defpackage.a2f0;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes9.dex */
public final class f implements a2f0 {
    public final e a;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.a2f0
    public final void c() {
        e eVar = this.a;
        pzt0 pzt0Var = eVar.k;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            eVar.k = tje.N(eVar.b.a, null, null, new UserLocationInteractorImpl$init$1(null, eVar), 3);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "UserLocationStarter";
    }
}
