package defpackage;

import androidx.camera.core.impl.Config$OptionPriority;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public interface szd {
    static void k(yy40 yy40Var, szd szdVar, szd szdVar2, x34 x34Var) {
        if (!Objects.equals(x34Var, icv.w2)) {
            yy40Var.t(x34Var, szdVar2.e(x34Var), szdVar2.f(x34Var));
            return;
        }
        bsj0 bsj0Var = (bsj0) szdVar2.g(x34Var, null);
        bsj0 bsj0Var2 = (bsj0) szdVar.g(x34Var, null);
        Config$OptionPriority e = szdVar2.e(x34Var);
        if (bsj0Var == null) {
            bsj0Var = bsj0Var2;
        } else if (bsj0Var2 != null) {
            asj0 b = asj0.b(bsj0Var2);
            s83 s83Var = bsj0Var.a;
            if (s83Var != null) {
                b.a = s83Var;
            }
            csj0 csj0Var = bsj0Var.b;
            if (csj0Var != null) {
                b.b = csj0Var;
            }
            xrj0 xrj0Var = bsj0Var.c;
            if (xrj0Var != null) {
                b.c = xrj0Var;
            }
            bsj0Var = b.a();
        }
        yy40Var.t(x34Var, e, bsj0Var);
    }

    static ug70 q(szd szdVar, szd szdVar2) {
        if (szdVar == null && szdVar2 == null) {
            return ug70.c;
        }
        yy40 p = szdVar2 != null ? yy40.p(szdVar2) : yy40.b();
        if (szdVar != null) {
            Iterator it = szdVar.h().iterator();
            while (it.hasNext()) {
                k(p, szdVar2, szdVar, (x34) it.next());
            }
        }
        return ug70.a(p);
    }

    Object c(x34 x34Var, Config$OptionPriority config$OptionPriority);

    boolean d(x34 x34Var);

    Config$OptionPriority e(x34 x34Var);

    Object f(x34 x34Var);

    Object g(x34 x34Var, Object obj);

    Set h();

    Set i(x34 x34Var);

    void j(lzd lzdVar);
}
