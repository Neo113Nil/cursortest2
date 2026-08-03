package i0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.p0;
import bc.a0;
import java.util.LinkedHashMap;
import x1.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends p implements m {
    public l E;
    public n F;

    @Override // i0.m
    public final void S() {
        this.F = null;
        x1.f.m(this);
    }

    @Override // y0.m
    public final void k0() {
        l lVar = this.E;
        if (lVar != null) {
            S();
            x4.c cVar = lVar.f2977j;
            n nVar = (n) ((LinkedHashMap) cVar.f8290g).get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f8290g;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                lVar.f2976i.add(nVar);
            }
        }
    }

    @Override // i0.p
    public final void r0(y.k kVar, long j3, float f10) {
        l lVar = this.E;
        if (lVar == null) {
            lVar = t.a(t.b((View) x1.f.i(this, AndroidCompositionLocals_androidKt.f607f)));
            this.E = lVar;
        }
        n a6 = lVar.a(this);
        int I = a0.I(f10);
        long q10 = this.f2990x.q();
        this.f2991y.invoke();
        a6.b(kVar, this.f2988v, j3, I, q10, 0.1f, new p0(6, this));
        this.F = a6;
        x1.f.m(this);
    }

    @Override // i0.p
    public final void s0(i0 i0Var) {
        f1.o t3 = i0Var.f8081g.f2596h.t();
        n nVar = this.F;
        if (nVar != null) {
            long j3 = this.B;
            long q10 = this.f2990x.q();
            this.f2991y.invoke();
            nVar.e(j3, q10, 0.1f);
            nVar.draw(f1.c.a(t3));
        }
    }

    @Override // i0.p
    public final void u0(y.k kVar) {
        n nVar = this.F;
        if (nVar != null) {
            nVar.d();
        }
    }
}
