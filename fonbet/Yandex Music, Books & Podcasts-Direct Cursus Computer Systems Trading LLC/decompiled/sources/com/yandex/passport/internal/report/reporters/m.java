package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.i4;
import com.yandex.passport.internal.report.m4;
import defpackage.b6e;
import defpackage.u75;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends androidx.core.app.n0 {
    public final com.yandex.passport.internal.features.a b;
    public final com.yandex.passport.internal.core.accounts.e c;
    public com.yandex.passport.internal.properties.l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.features.a aVar, com.yandex.passport.internal.core.accounts.e eVar) {
        super(gVar);
        gVar.getClass();
        aVar.getClass();
        eVar.getClass();
        this.b = aVar;
        this.c = eVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.features.a aVar = this.b;
        return ((Boolean) aVar.e.getValue(aVar, com.yandex.passport.internal.features.a.J[1])).booleanValue();
    }

    public final void u(com.yandex.passport.internal.ui.bouncer.model.p1 p1Var) {
        p1Var.getClass();
        n(i4.d, new com.yandex.passport.internal.report.c(p1Var.a, false), new com.yandex.passport.internal.report.a(p1Var.b), new com.yandex.passport.internal.report.f(20, p1Var.e), new com.yandex.passport.internal.report.f(8, p1Var.g));
    }

    public final void v(com.yandex.passport.internal.ui.bouncer.model.k1 k1Var) {
        k1Var.getClass();
        m4 m4Var = m4.d;
        if (k1Var.equals(com.yandex.passport.internal.ui.bouncer.model.d1.a) || k1Var.equals(com.yandex.passport.internal.ui.bouncer.model.g1.a) || k1Var.equals(com.yandex.passport.internal.ui.bouncer.model.i1.a) || (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.h1) || (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.e1)) {
            n(m4Var, new com.yandex.passport.internal.report.a(k1Var));
            return;
        }
        if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.f1) {
            n(m4Var, new com.yandex.passport.internal.report.a(k1Var), new ff(((com.yandex.passport.internal.ui.bouncer.model.f1) k1Var).a));
        } else if (k1Var instanceof com.yandex.passport.internal.ui.bouncer.model.j1) {
            n(m4Var, new com.yandex.passport.internal.report.a(k1Var), new com.yandex.passport.internal.report.f(((com.yandex.passport.internal.ui.bouncer.model.j1) k1Var).c));
        } else {
            b6e.s();
        }
    }

    public final void w(com.yandex.passport.internal.ui.bouncer.model.l1 l1Var) {
        l1Var.getClass();
        com.yandex.passport.internal.properties.l lVar = this.d;
        com.yandex.passport.internal.properties.l lVar2 = l1Var.c;
        boolean d = Intrinsics.d(lVar, lVar2);
        ArrayList j = u75.j(new com.yandex.passport.internal.report.a(l1Var.a), new com.yandex.passport.internal.report.a(l1Var.b), new com.yandex.passport.internal.report.a(l1Var.d), new com.yandex.passport.internal.report.a(l1Var.e));
        if (this.d == null) {
            j.add(new com.yandex.passport.internal.report.c(lVar2, false));
        } else if (!d) {
            j.add(new com.yandex.passport.internal.report.c(lVar2, true));
        }
        m(m4.d, j);
        if (d) {
            return;
        }
        this.d = lVar2;
    }
}
