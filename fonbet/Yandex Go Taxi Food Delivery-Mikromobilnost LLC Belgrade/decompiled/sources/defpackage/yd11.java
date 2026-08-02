package defpackage;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.state.ToggleableState;

/* loaded from: classes10.dex */
public final class yd11 extends a2c {
    public ToggleableState S;

    @Override // androidx.compose.foundation.a
    public final void H0(mnq0 mnq0Var) {
        f.u(mnq0Var, this.S);
        w82 w82Var = qtb1.A;
        g gVar = d.s;
        kgx[] kgxVarArr = f.a;
        kgx kgxVar = kgxVarArr[9];
        mnq0Var.a(gVar, w82Var);
        k92 k92Var = new k92(AutofillValue.forToggle(this.S != ToggleableState.Indeterminate));
        g gVar2 = d.t;
        kgx kgxVar2 = kgxVarArr[10];
        mnq0Var.a(gVar2, k92Var);
        f.g(mnq0Var, new spb(mnq0Var, 2));
    }
}
