package defpackage;

import com.yandex.go.due.experiment.MulticlassPreorderExperiment;
import com.yandex.go.experiments.zoneinfo.ScheduledOrderExperiment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes12.dex */
public final class ynm0 {
    public final wiq0 a;
    public final axm b;
    public final pp40 c;
    public final b8r d;
    public final qqo e;

    public ynm0(wiq0 wiq0Var, axm axmVar, pp40 pp40Var, b8r b8rVar, rqo rqoVar) {
        this.a = wiq0Var;
        this.b = axmVar;
        this.c = pp40Var;
        this.d = b8rVar;
        ScheduledOrderExperiment.Companion.getClass();
        this.e = ((jbh) rqoVar).c(new ScheduledOrderExperiment(0));
    }

    public final boolean a(pex0 pex0Var) {
        jn40 jn40Var;
        Set set;
        if (pex0Var == null) {
            return false;
        }
        if (!pex0Var.K0) {
            return b(pex0Var.b);
        }
        if (!((MulticlassPreorderExperiment) this.c.a.b()).getB() || (jn40Var = pex0Var.V) == null || (set = jn40Var.f) == null || set.isEmpty()) {
            return false;
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return true;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!b((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean b(String str) {
        List list = ((ScheduledOrderExperiment) this.e.b()).b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(pex0 pex0Var) {
        axm axmVar = this.b;
        return a(pex0Var) && axmVar.a.a.S.d <= 0 && axmVar.c();
    }

    public final boolean d(pex0 pex0Var) {
        axm axmVar = this.b;
        if (axmVar.a.a.S.d > 0) {
            Boolean bool = pex0Var.x;
            return (bool != null ? bool.booleanValue() : pex0Var.z) || pex0Var.z;
        }
        if (!axmVar.c()) {
            return false;
        }
        if (!a(pex0Var)) {
            return true;
        }
        Boolean bool2 = pex0Var.x;
        return bool2 != null ? bool2.booleanValue() : pex0Var.z;
    }
}
