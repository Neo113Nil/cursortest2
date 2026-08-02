package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class c89 extends nt0 implements a0c {
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();

    public final void Y(bk9 bk9Var, xzb xzbVar) {
        Object c = bk9Var.c();
        jz8 jz8Var = c instanceof jz8 ? (jz8) c : null;
        if (jz8Var == null) {
            return;
        }
        szb szbVar = jz8Var.b;
        pzb pzbVar = szbVar instanceof pzb ? (pzb) szbVar : null;
        if (pzbVar == null) {
            return;
        }
        i(pzbVar.c(xzbVar, new lj0(21, this, pzbVar, xzbVar)));
    }

    @Override // defpackage.a0c
    public final List getSubscriptions() {
        return this.v;
    }

    @Override // defpackage.nt0
    public final Unit x(jc8 jc8Var, e23 e23Var, pm9 pm9Var) {
        dp8 d = jc8Var.d();
        xzb xzbVar = e23Var.b;
        Y(d.c(), xzbVar);
        Y(d.a(), xzbVar);
        return Unit.a;
    }
}
