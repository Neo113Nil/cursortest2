package com.yandex.passport.sloth;

import defpackage.b6e;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.nm6;
import defpackage.x0q;
import defpackage.y0q;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class v {
    public final a1 a;
    public final x0q b;
    public final x0q c;
    public final x0q d;
    public final x0q e;

    public v(a1 a1Var) {
        a1Var.getClass();
        this.a = a1Var;
        this.b = y0q.b(1, 0, null, 6);
        this.c = y0q.b(1, 0, null, 6);
        this.d = y0q.b(1, 0, null, 6);
        this.e = y0q.b(1, 0, null, 6);
    }

    public final void a(String str) {
        str.getClass();
        this.a.a(new n0(16, r0.EVENT_SENDER, dfi.n("eventData", str)));
    }

    public final Object b(u uVar, cg6 cg6Var) {
        String str;
        if (uVar instanceof q) {
            str = ((q) uVar).toString();
        } else if (uVar instanceof t) {
            str = "ShowPhoneNumber(...)";
        } else if (uVar instanceof o) {
            str = ((o) uVar).toString();
        } else if (uVar.equals(s.a)) {
            str = "ShowDebugUi";
        } else if (uVar instanceof p) {
            str = ((p) uVar).toString();
        } else if (uVar instanceof r) {
            str = null;
        } else {
            if (!(uVar instanceof n)) {
                b6e.s();
                return null;
            }
            str = "BlockOnLoading value = " + ((n) uVar).a;
        }
        if (str != null) {
            a(str);
        }
        Object emit = this.c.emit(uVar, cg6Var);
        return emit == nm6.a ? emit : Unit.a;
    }

    public final Object c(h0 h0Var, cg6 cg6Var) {
        if (!(h0Var instanceof b0)) {
            a(h0Var.toString());
        }
        Object emit = this.d.emit(h0Var, cg6Var);
        return emit == nm6.a ? emit : Unit.a;
    }

    public final Object d(b1 b1Var, cg6 cg6Var) {
        a(g.a(b1Var));
        Object emit = this.e.emit(b1Var, cg6Var);
        return emit == nm6.a ? emit : Unit.a;
    }
}
