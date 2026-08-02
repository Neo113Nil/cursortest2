package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes.dex */
public final class vtj extends s17 {
    public static final vtj d = new vtj(0, 3, 1);

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        fxq fxqVar = (fxq) n8nVar.j(1);
        w80 w80Var = (w80) n8nVar.j(0);
        ngc ngcVar = (ngc) n8nVar.j(2);
        oxq o = fxqVar.o();
        try {
            if (!ngcVar.b.E0()) {
                pq5.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            ngcVar.a.D0(nw0Var, o, mVar);
            o.e(true);
            oxqVar.d();
            w80Var.getClass();
            oxqVar.y(fxqVar, fxqVar.a(w80Var));
            oxqVar.j();
        } catch (Throwable th) {
            o.e(false);
            throw th;
        }
    }
}
