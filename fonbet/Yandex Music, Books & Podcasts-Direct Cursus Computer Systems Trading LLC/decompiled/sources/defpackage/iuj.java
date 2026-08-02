package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes.dex */
public final class iuj extends s17 {
    public static final iuj d = new iuj(1, 0, 2);

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        int i;
        int i2;
        int i3 = n8nVar.i(0);
        int o = oxqVar.o();
        int i4 = oxqVar.v;
        int M = oxqVar.M(oxqVar.b, oxqVar.q(i4));
        int f = oxqVar.f(oxqVar.b, oxqVar.q(i4 + 1));
        for (int max = Math.max(M, f - i3); max < f; max++) {
            Object obj = oxqVar.c[oxqVar.g(max)];
            if (obj instanceof fun) {
                int i5 = o - max;
                fun funVar = (fun) obj;
                w80 w80Var = funVar.b;
                if (w80Var == null || !w80Var.a()) {
                    i = -1;
                    i2 = -1;
                } else {
                    i = oxqVar.c(w80Var);
                    i2 = oxqVar.o() - oxqVar.O(i);
                }
                mVar.D(i5, i, funVar, i2);
            } else if (obj instanceof xmn) {
                ((xmn) obj).c();
            }
        }
        if (i3 <= 0) {
            pq5.c("Check failed");
        }
        int i6 = oxqVar.v;
        int M2 = oxqVar.M(oxqVar.b, oxqVar.q(i6));
        int f2 = oxqVar.f(oxqVar.b, oxqVar.q(i6 + 1)) - i3;
        if (f2 < M2) {
            pq5.c("Check failed");
        }
        oxqVar.J(f2, i3, i6);
        int i7 = oxqVar.i;
        if (i7 >= M2) {
            oxqVar.i = i7 - i3;
        }
    }
}
