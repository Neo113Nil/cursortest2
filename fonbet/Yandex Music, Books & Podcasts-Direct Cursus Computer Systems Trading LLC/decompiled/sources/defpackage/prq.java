package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class prq implements bxq {
    public final orq a;
    public final View b;
    public w40 c;

    public prq(orq orqVar, View view) {
        orqVar.getClass();
        view.getClass();
        this.a = orqVar;
        this.b = view;
    }

    @Override // defpackage.bxq
    public final prq a(orq orqVar) {
        orqVar.getClass();
        orq orqVar2 = this.a;
        if (orqVar == orqVar2) {
            return this;
        }
        orqVar2.getClass();
        if (orqVar2.h().getParent() == null) {
            xq0.q("Required value was null.");
            return null;
        }
        orqVar.n(orqVar2.h());
        prq prqVar = new prq(orqVar, orqVar2.h());
        w40 w40Var = this.c;
        if (w40Var != null) {
            w40Var.invoke(orqVar, orqVar.h(), prqVar);
        }
        this.c = null;
        return prqVar;
    }

    public final void b(w40 w40Var) {
        this.c = w40Var;
    }
}
