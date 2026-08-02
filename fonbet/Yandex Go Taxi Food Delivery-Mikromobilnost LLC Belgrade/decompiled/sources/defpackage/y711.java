package defpackage;

import java.util.Set;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.detailedroute.ui.f;

/* loaded from: classes12.dex */
public final class y711 {
    public final f a;
    public final h3y b;
    public final yvf0 c;

    public y711(f fVar, h3y h3yVar, yvf0 yvf0Var) {
        this.a = fVar;
        this.b = h3yVar;
        this.c = yvf0Var;
    }

    public final void a(s711 s711Var, tls tlsVar) {
        Object value;
        Set set;
        int i;
        if (s711Var instanceof o711) {
            h711 h711Var = ((o711) s711Var).a;
            if (h711Var instanceof w611) {
                u711 u711Var = new u711(((w611) h711Var).b);
                if (tlsVar != null) {
                    tlsVar.invoke(u711Var);
                    return;
                } else {
                    b(u711Var);
                    return;
                }
            }
            if (h711Var instanceof s611) {
                r0 r0Var = this.a.e;
                do {
                    value = r0Var.getValue();
                    set = (Set) value;
                    i = ((s611) h711Var).d;
                } while (!r0Var.k(value, set.contains(Integer.valueOf(i)) ? v4r0.f(set, Integer.valueOf(i)) : v4r0.i(set, Integer.valueOf(i))));
                return;
            }
            return;
        }
        if (s711Var instanceof p711) {
            t711 t711Var = new t711(((p711) s711Var).a);
            if (tlsVar != null) {
                tlsVar.invoke(t711Var);
                return;
            } else {
                b(t711Var);
                return;
            }
        }
        if (s711Var instanceof q711) {
            u711 u711Var2 = new u711(((q711) s711Var).a);
            if (tlsVar != null) {
                tlsVar.invoke(u711Var2);
                return;
            } else {
                b(u711Var2);
                return;
            }
        }
        if (!(s711Var instanceof r711)) {
            w511.b();
            return;
        }
        v711 v711Var = new v711(((r711) s711Var).a);
        if (tlsVar != null) {
            tlsVar.invoke(v711Var);
        } else {
            b(v711Var);
        }
    }

    public final void b(w711 w711Var) {
        ((pep0) ((oep0) this.b.get())).f((m950) this.c.get(), w711Var, hxx.a);
    }
}
