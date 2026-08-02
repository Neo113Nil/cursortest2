package defpackage;

import androidx.compose.ui.platform.j;

/* loaded from: classes10.dex */
public abstract class w9y implements gwc0 {
    public v9y a;

    @Override // defpackage.gwc0
    public final void e() {
        u5t0 u5t0Var;
        v9y v9yVar = this.a;
        if (v9yVar == null || (u5t0Var = (u5t0) npb1.c((g9y) v9yVar, j.q)) == null) {
            return;
        }
        ((wqh) u5t0Var).a();
    }

    @Override // defpackage.gwc0
    public final void g() {
        u5t0 u5t0Var;
        v9y v9yVar = this.a;
        if (v9yVar == null || (u5t0Var = (u5t0) npb1.c((g9y) v9yVar, j.q)) == null) {
            return;
        }
        ((wqh) u5t0Var).b();
    }

    public abstract void i();

    public final void j(g9y g9yVar) {
        if (this.a != g9yVar) {
            lxv.c("Expected textInputModifierNode to be " + g9yVar + " but was " + this.a);
        }
        this.a = null;
    }
}
