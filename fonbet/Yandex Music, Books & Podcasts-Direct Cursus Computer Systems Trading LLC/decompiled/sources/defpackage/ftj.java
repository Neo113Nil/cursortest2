package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes.dex */
public final class ftj extends s17 {
    public static final ftj d = new ftj(0, 2, 1);

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        w80 w80Var = (w80) n8nVar.j(0);
        Object j = n8nVar.j(1);
        if (j instanceof fun) {
            ((eqi) mVar.d).d((fun) j);
        }
        if (oxqVar.n != 0) {
            pq5.c("Can only append a slot if not current inserting");
        }
        int i = oxqVar.i;
        int i2 = oxqVar.j;
        int c = oxqVar.c(w80Var);
        int f = oxqVar.f(oxqVar.b, oxqVar.q(c + 1));
        oxqVar.i = f;
        oxqVar.j = f;
        oxqVar.v(1, c);
        if (i >= f) {
            i++;
            i2++;
        }
        oxqVar.c[f] = j;
        oxqVar.i = i;
        oxqVar.j = i2;
    }
}
