package defpackage;

import androidx.compose.ui.input.pointer.b;
import androidx.compose.ui.platform.j;

/* loaded from: classes10.dex */
public final class vvd0 extends b {
    public final String w;

    public vvd0(tb2 tb2Var) {
        super(tb2Var, null);
        this.w = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // androidx.compose.ui.input.pointer.b
    public final void F0(wvd0 wvd0Var) {
        xvd0 xvd0Var = (xvd0) npb1.c(this, j.v);
        if (xvd0Var != null) {
            i82 i82Var = (i82) xvd0Var;
            if (wvd0Var == null) {
                wvd0.a.getClass();
                wvd0Var = y5e.a0;
            }
            t82.a.a(i82Var.b, wvd0Var);
        }
    }

    @Override // androidx.compose.ui.input.pointer.b
    public final boolean H0(int i) {
        return (i == 3 || i == 4) ? false : true;
    }

    @Override // defpackage.dd11
    public final Object V() {
        return this.w;
    }
}
