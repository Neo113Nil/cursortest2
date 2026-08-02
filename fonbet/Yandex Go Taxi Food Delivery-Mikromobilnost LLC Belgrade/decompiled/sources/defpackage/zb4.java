package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.spatial.a;

/* loaded from: classes10.dex */
public final class zb4 extends e530 {
    public a0z0 a;
    public final /* synthetic */ ac4 b;

    public zb4(ac4 ac4Var) {
        this.b = ac4Var;
    }

    public final void E0() {
        w04 w04Var = new w04(1, this, this.b);
        LayoutNode P = qje.P(this);
        int i = P.b;
        a rectManager = d1y.a(P).getRectManager();
        b0z0 b0z0Var = rectManager.c;
        b0z0Var.getClass();
        wx40 wx40Var = b0z0Var.a;
        a0z0 a0z0Var = new a0z0(b0z0Var, i, this, w04Var);
        Object b = wx40Var.b(i);
        if (b == null) {
            wx40Var.i(i, a0z0Var);
            b = a0z0Var;
        }
        a0z0 a0z0Var2 = (a0z0) b;
        if (a0z0Var2 != a0z0Var) {
            while (true) {
                a0z0 a0z0Var3 = a0z0Var2.d;
                if (a0z0Var3 == null) {
                    break;
                } else {
                    a0z0Var2 = a0z0Var3;
                }
            }
            a0z0Var2.d = a0z0Var;
        }
        if (qje.P(getNode()).z) {
            rectManager.b.c(i, true);
        }
        rectManager.e = true;
        rectManager.h();
        this.a = a0z0Var;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        ac4 ac4Var = this.b;
        ac4Var.a = this;
        if (ac4Var.b != null) {
            E0();
        }
    }

    @Override // defpackage.e530
    public final void onDetach() {
        ac4 ac4Var = this.b;
        if (ac4Var.a == this) {
            ac4Var.a = null;
        }
        a0z0 a0z0Var = this.a;
        if (a0z0Var != null) {
            a0z0Var.b();
        }
        this.a = null;
    }
}
