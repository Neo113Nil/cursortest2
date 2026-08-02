package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class vg5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh5 b;

    public /* synthetic */ vg5(xh5 xh5Var, int i) {
        this.a = i;
        this.b = xh5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set set;
        Set set2;
        tg5 tg5Var = (tg5) obj;
        switch (this.a) {
            case 0:
                tg5Var.getClass();
                boolean z = tg5Var instanceof rg5;
                rg5 rg5Var = z ? (rg5) tg5Var : null;
                if (rg5Var == null || (set = rg5Var.a) == null) {
                    set = q5b.a;
                }
                rg5 rg5Var2 = z ? (rg5) tg5Var : null;
                Set set3 = rg5Var2 != null ? rg5Var2.b : q5b.a;
                xh5 xh5Var = this.b;
                LinkedHashSet g = wop.g(set, xh5Var);
                LinkedHashSet g2 = wop.g(set3, xh5Var);
                return (g.isEmpty() && g2.isEmpty()) ? sg5.a : new rg5(g, g2);
            default:
                tg5Var.getClass();
                boolean z2 = tg5Var instanceof rg5;
                rg5 rg5Var3 = z2 ? (rg5) tg5Var : null;
                if (rg5Var3 == null || (set2 = rg5Var3.a) == null) {
                    set2 = q5b.a;
                }
                rg5 rg5Var4 = z2 ? (rg5) tg5Var : null;
                LinkedHashSet g3 = wop.g(rg5Var4 != null ? rg5Var4.b : q5b.a, this.b);
                return (g3.isEmpty() && set2.isEmpty()) ? sg5.a : new rg5(set2, g3);
        }
    }
}
