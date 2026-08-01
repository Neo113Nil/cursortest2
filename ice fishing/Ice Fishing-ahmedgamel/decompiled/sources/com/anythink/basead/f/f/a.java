package com.anythink.basead.f.f;

import android.text.TextUtils;
import com.anythink.basead.b.e;
import com.anythink.basead.f.d;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public final class a {
    private static void a(bk bkVar, d dVar, boolean z3) {
        if (bkVar == null || dVar == null) {
            return;
        }
        bkVar.z(dVar.a());
        if (!z3) {
            bkVar.A(dVar.b());
        }
        bkVar.e(dVar.d());
        bkVar.t(dVar.c());
        bkVar.s(dVar.e());
        bkVar.b(dVar.f());
        bkVar.r(dVar.g());
        bkVar.c(dVar.h());
        bkVar.d(dVar.i());
        bkVar.f(dVar.j());
        bkVar.f(dVar.k());
        bkVar.aF(dVar.l());
    }

    public static void a(x xVar, bj bjVar) {
        y yVar;
        if (xVar == null || bjVar == null || (yVar = xVar.f14168o) == null || !(yVar instanceof bk)) {
            return;
        }
        y r9 = bjVar.r();
        if (r9 != null) {
            r9.z(yVar.K());
            if (xVar.f14160f != 66) {
                r9.A(yVar.L());
            }
            r9.t(yVar.E());
            r9.e(yVar.D());
            r9.u(yVar.F());
            r9.s(yVar.C());
            r9.b(yVar.x());
            r9.r(yVar.B());
            r9.d(yVar.l());
            r9.c(yVar.k());
            r9.f(yVar.Q());
            r9.f(yVar.aI());
            r9.aF(yVar.bJ());
            xVar.f14168o = r9;
        } else {
            bjVar.c(xVar.f14168o);
        }
        if (!bjVar.L() && xVar.f14163j == 1) {
            y yVar2 = xVar.f14168o;
            yVar2.a(yVar2.ao());
            xVar.f14168o.aq(1);
        }
        boolean z3 = !(bjVar instanceof r) || TextUtils.isEmpty(((r) bjVar).d());
        if (!e.a(bjVar, xVar)) {
            xVar.f14168o.j(2);
        }
        if (z3 && TextUtils.isEmpty(bjVar.H())) {
            xVar.f14168o.v(0);
            xVar.f14168o.x(0);
            xVar.f14168o.L(2);
            xVar.f14168o.j(2);
            xVar.f14168o.E(1);
            xVar.f14168o.w(-2);
            xVar.f14168o.c(false);
            xVar.f14168o.d(false);
            xVar.f14168o.e(false);
            xVar.f14168o.Y(2);
            if (bjVar.n()) {
                xVar.f14168o.y(1);
            }
            xVar.f14168o.m(0L);
            xVar.f14168o.k(0L);
            xVar.f14168o.ak(1);
            xVar.f14168o.au(1);
        }
        if (xVar.f14163j != 3 || e.a(bjVar, xVar) || bjVar.n()) {
            xVar.f14168o.X(0);
        }
        if (TextUtils.isEmpty(bjVar.H())) {
            xVar.f14168o.W(1);
        }
        if (bjVar.ae()) {
            com.anythink.basead.b.a().updateOfferInfoWithDataInfo(bjVar);
        }
        if (bjVar.n()) {
            xVar.f14168o.k(0L);
        }
        if (xVar.f14168o.aD() > 0) {
            xVar.f14168o.af(2);
        }
        if (xVar.f14168o.bl() == 2) {
            xVar.f14168o.w(0);
            xVar.f14168o.x(-1);
            if (TextUtils.isEmpty(bjVar.x())) {
                int i = xVar.f14163j;
                if (i == 1 || i == 3) {
                    bjVar.m(t.b().g().getString(q.a(t.b().g(), "myoffer_sub_close_default_title", k.f19636g)));
                }
            }
        }
    }
}
