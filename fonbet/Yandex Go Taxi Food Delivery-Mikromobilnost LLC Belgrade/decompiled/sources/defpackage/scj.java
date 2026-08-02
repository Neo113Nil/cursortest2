package defpackage;

import androidx.room.util.a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class scj {
    public static final String a = hgz.o("DiagnosticsWrkr");

    public static final String a(v951 v951Var, ka51 ka51Var, d3x0 d3x0Var, List list) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fa51 fa51Var = (fa51) it.next();
            n951 q = udq0.q(fa51Var);
            String str = fa51Var.a;
            b3x0 b3x0Var = (b3x0) a.b(d3x0Var.a, true, false, new c3x0(q.a, q.b));
            Integer valueOf = b3x0Var != null ? Integer.valueOf(b3x0Var.c) : null;
            String X = kotlin.collections.a.X((List) a.b(v951Var.a, true, false, new lv21(str, 5)), ",", null, null, null, 62);
            String X2 = kotlin.collections.a.X((List) a.b(ka51Var.a, true, false, new brd(str, 25)), ",", null, null, null, 62);
            StringBuilder x = unr0.x("\n", str, "\t ");
            vfc.w(valueOf, fa51Var.c, "\t ", "\t ", x);
            x.append(fa51Var.b.name());
            x.append("\t ");
            x.append(X);
            x.append("\t ");
            x.append(X2);
            x.append('\t');
            sb.append(x.toString());
        }
        return sb.toString();
    }
}
