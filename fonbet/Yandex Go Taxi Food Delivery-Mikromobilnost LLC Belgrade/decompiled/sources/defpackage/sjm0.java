package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class sjm0 implements ujm0 {
    public final Map a;
    public final boolean b;
    public final List c;
    public final LinkedHashMap d = new LinkedHashMap();

    public sjm0(Map map, List list, boolean z) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public final pjm0 a(l1o l1oVar, mjm0 mjm0Var, rzl rzlVar) {
        pjm0 pjm0Var;
        boolean z = rzlVar != null;
        Map map = this.a;
        if (z) {
            ujm0 ujm0Var = (ujm0) map.get(qoi0.a(mjm0Var.getClass()));
            if (ujm0Var != null) {
                pjm0Var = ujm0Var.get(l1oVar, mjm0Var, rzlVar);
            }
            pjm0Var = null;
        } else {
            if (z) {
                w511.b();
                return null;
            }
            ujm0 ujm0Var2 = (ujm0) map.get(qoi0.a(mjm0Var.getClass()));
            if (ujm0Var2 != null) {
                pjm0Var = ujm0Var2.get(l1oVar, mjm0Var);
            }
            pjm0Var = null;
        }
        if (pjm0Var == null) {
            ny61.g(g8e.o("Not supported scaffold type ", qoi0.a(mjm0Var.getClass()).d()));
            return null;
        }
        if (this.b) {
            if (!this.c.contains(qoi0.a(mjm0Var.getClass()))) {
                this.d.put(new qjm0(l1oVar, qoi0.a(mjm0Var.getClass())), pjm0Var);
            }
        }
        return pjm0Var;
    }

    @Override // defpackage.ujm0
    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var) {
        sjm0 sjm0Var;
        pjm0 pjm0Var;
        if (mjm0Var instanceof kwg) {
            return null;
        }
        if (this.b) {
            if (!this.c.contains(qoi0.a(mjm0Var.getClass()))) {
                sjm0Var = this;
                return (sjm0Var != null || (pjm0Var = (pjm0) sjm0Var.d.get(new qjm0(l1oVar, qoi0.a(mjm0Var.getClass())))) == null) ? a(l1oVar, mjm0Var, null) : pjm0Var;
            }
        }
        sjm0Var = null;
        if (sjm0Var != null) {
        }
    }

    @Override // defpackage.ujm0
    public final pjm0 get(l1o l1oVar, mjm0 mjm0Var, rzl rzlVar) {
        pjm0 pjm0Var;
        sjm0 sjm0Var = null;
        if (mjm0Var instanceof kwg) {
            return null;
        }
        if (this.b) {
            if (!this.c.contains(qoi0.a(mjm0Var.getClass()))) {
                sjm0Var = this;
            }
        }
        return (sjm0Var == null || (pjm0Var = (pjm0) sjm0Var.d.get(new qjm0(l1oVar, qoi0.a(mjm0Var.getClass())))) == null) ? a(l1oVar, mjm0Var, rzlVar) : pjm0Var;
    }
}
