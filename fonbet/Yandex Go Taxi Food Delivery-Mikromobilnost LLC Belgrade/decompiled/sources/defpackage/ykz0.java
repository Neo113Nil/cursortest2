package defpackage;

import com.yandex.go.taxi.tariffs.interactor.a;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class ykz0 {
    public final c4r0 a;
    public final wiq0 b;
    public final b8r c;
    public final y1s d;
    public final a e;
    public final axm f;

    public ykz0(c4r0 c4r0Var, wiq0 wiq0Var, b8r b8rVar, y1s y1sVar, a aVar, axm axmVar) {
        this.a = c4r0Var;
        this.b = wiq0Var;
        this.c = b8rVar;
        this.d = y1sVar;
        this.e = aVar;
        this.f = axmVar;
    }

    public final boolean a(u051 u051Var, pex0 pex0Var) {
        boolean z;
        is60 is60Var;
        Iterator it = u051Var.a.b.a.iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            ckz0 ckz0Var = (ckz0) it.next();
            if (ckz0Var instanceof gt60) {
                if (pex0Var != null && (is60Var = pex0Var.J0.b) != null) {
                    r4 = is60Var.a();
                }
                z = jl40.l(r4, ((gt60) ckz0Var).b);
            } else if (ckz0Var instanceof slx0) {
                z = jl40.l(((slx0) ckz0Var).a, pex0Var != null ? pex0Var.b : null);
            } else if (ckz0Var instanceof x1s) {
                if (((x1s) ckz0Var).a != this.d.a()) {
                    z = false;
                }
            } else if (!(ckz0Var instanceof x8j0) && !jl40.l(ckz0Var, j121.INSTANCE)) {
                w511.b();
                return false;
            }
        } while (z);
        return false;
    }
}
