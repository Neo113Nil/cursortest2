package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public final class u1b0 {
    public final dlw0 a;
    public final Set b;

    public u1b0(dlw0 dlw0Var, Set set) {
        this.a = dlw0Var;
        this.b = set;
    }

    public final v1b0 a(clw0 clw0Var, String str) {
        Object obj = null;
        if (clw0Var == null) {
            return null;
        }
        ExperimentSource experimentSource = clw0Var.c;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (experimentSource == ((v1b0) next).getSource()) {
                obj = next;
                break;
            }
        }
        v1b0 v1b0Var = (v1b0) obj;
        if (v1b0Var == null) {
            jst.e.q(String.format("Experiment %s has unsupported source: %s", Arrays.copyOf(new Object[]{str, experimentSource}, 2)));
        }
        return v1b0Var;
    }

    public final v1b0 b(qn11 qn11Var) {
        Class<?> cls = qn11Var.getClass();
        return a((clw0) this.a.b.get(cls), cls.getSimpleName());
    }
}
