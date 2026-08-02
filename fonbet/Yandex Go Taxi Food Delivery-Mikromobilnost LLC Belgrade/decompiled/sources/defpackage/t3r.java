package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import core.flex.ui.OrientationAwareRecyclerView;

/* loaded from: classes9.dex */
public final class t3r {
    public final kn2 a;
    public final s3r b = new s3r(this);
    public final r3r c = new r3r(this);
    public Integer d;
    public OrientationAwareRecyclerView e;
    public c0 f;
    public b0 g;

    public t3r(kn2 kn2Var) {
        this.a = kn2Var;
    }

    public final d0 a(RecyclerView.e eVar) {
        if (eVar.I()) {
            b0 b0Var = this.g;
            if (b0Var == null || b0Var.a != eVar) {
                this.g = new b0(eVar);
            }
            b0 b0Var2 = this.g;
            if (b0Var2 != null) {
                return b0Var2;
            }
            ny61.g("Required value was null.");
            return null;
        }
        if (eVar.J()) {
            c0 c0Var = this.f;
            if (c0Var == null || c0Var.a != eVar) {
                this.f = new c0(eVar);
            }
            c0 c0Var2 = this.f;
            if (c0Var2 != null) {
                return c0Var2;
            }
            ny61.g("Required value was null.");
        }
        return null;
    }
}
