package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes8.dex */
public final class t950 implements q {
    public final /* synthetic */ w950 a;

    public t950(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = s950.a[event.ordinal()];
        w950 w950Var = this.a;
        if (i == 1) {
            h55 d = w950Var.d();
            if (d != null) {
                d.M();
                return;
            }
            return;
        }
        if (i == 2) {
            h55 d2 = w950Var.d();
            if (d2 != null) {
                d2.O();
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        w950Var.i.i();
        w950Var.d.clear();
        w950Var.e.clear();
        w950Var.h.clear();
        w950Var.a.d(this);
    }
}
