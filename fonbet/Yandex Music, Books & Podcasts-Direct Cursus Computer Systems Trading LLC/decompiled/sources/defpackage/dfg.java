package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class dfg {
    public final chm a;
    public final List b;
    public final String c;

    public dfg(Class cls, Class cls2, Class cls3, List list, chm chmVar) {
        this.a = chmVar;
        if (list.isEmpty()) {
            xq0.x("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final k2o a(int i, int i2, oa7 oa7Var, pwj pwjVar, j4x j4xVar) {
        chm chmVar = this.a;
        Object f = chmVar.f();
        w1g.s(f, "Argument must not be null");
        List list = (List) f;
        try {
            List list2 = this.b;
            int size = list2.size();
            k2o k2oVar = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    k2oVar = ((yf7) list2.get(i3)).a(i, i2, oa7Var, pwjVar, j4xVar);
                } catch (lld e) {
                    list.add(e);
                }
                if (k2oVar != null) {
                    break;
                }
            }
            if (k2oVar != null) {
                return k2oVar;
            }
            throw new lld(this.c, new ArrayList(list));
        } finally {
            chmVar.c(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
