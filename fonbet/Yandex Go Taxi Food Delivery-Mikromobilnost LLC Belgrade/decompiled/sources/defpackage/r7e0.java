package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class r7e0 implements b70 {
    public static final r7e0 a = new r7e0();
    public static final List b = scc.g("configuration", "darkConfiguration");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        n7e0 n7e0Var = (n7e0) obj;
        bfxVar.A1("configuration");
        p7e0 p7e0Var = p7e0.a;
        foe foeVar = l80.a;
        l7e0 l7e0Var = n7e0Var.a;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            p7e0Var.a(bfxVar, cVar, l7e0Var);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            p7e0Var.a(ek00Var2, cVar, l7e0Var);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("darkConfiguration");
        q7e0 q7e0Var = q7e0.a;
        m7e0 m7e0Var = n7e0Var.b;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            q7e0Var.a(bfxVar, cVar, m7e0Var);
            ek00Var3.y();
            return;
        }
        ek00 ek00Var4 = new ek00();
        ek00Var4.u();
        q7e0Var.a(ek00Var4, cVar, m7e0Var);
        ek00Var4.y();
        uga1.f(bfxVar, ek00Var4.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        l7e0 l7e0Var = null;
        m7e0 m7e0Var = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                p7e0 p7e0Var = p7e0.a;
                foe foeVar = l80.a;
                l7e0Var = (l7e0) new ep60(p7e0Var, true).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new n7e0(l7e0Var, m7e0Var);
                }
                q7e0 q7e0Var = q7e0.a;
                foe foeVar2 = l80.a;
                m7e0Var = (m7e0) new ep60(q7e0Var, true).b(xdxVar, cVar);
            }
        }
    }
}
