package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u23 implements bx60 {
    public static final List c = scc.g(1, 2, 4, 8, 16, 32, 64, 128);
    public final LinkedHashMap a;
    public final int b;

    public u23(LinkedHashMap linkedHashMap, int i) {
        this.a = linkedHashMap;
        this.b = i;
    }

    @Override // defpackage.bx60
    public final n751 onApplyWindowInsets(View view, n751 n751Var) {
        y651 y651Var;
        k751 k751Var = n751Var.a;
        for (Map.Entry entry : this.a.entrySet()) {
            ((w23) entry.getKey()).a(k751Var.g(((Number) entry.getValue()).intValue()));
        }
        u1w g = k751Var.g(this.b);
        x651 x651Var = new x651(n751Var);
        Iterator it = c.iterator();
        boolean z = true;
        while (true) {
            boolean hasNext = it.hasNext();
            y651Var = x651Var.a;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            u1w g2 = k751Var.g(intValue);
            u1w c2 = u1w.c(g2.a - g.a, g2.b - g.b, g2.c - g.c, g2.d - g.d);
            u1w u1wVar = u1w.e;
            u1w a = u1w.a(c2, u1wVar);
            if (z && !a.equals(u1wVar)) {
                z = false;
            }
            y651Var.b(intValue, a);
        }
        return z ? n751.b : y651Var.h();
    }
}
