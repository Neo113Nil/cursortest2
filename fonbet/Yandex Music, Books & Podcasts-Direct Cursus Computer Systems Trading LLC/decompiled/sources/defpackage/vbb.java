package defpackage;

import java.util.Collection;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class vbb {
    public final raa a;
    public final xba b;
    public final z66 c;
    public final qe3 d;

    public vbb(raa raaVar, xba xbaVar, z66 z66Var, qe3 qe3Var) {
        raaVar.getClass();
        xbaVar.getClass();
        z66Var.getClass();
        qe3Var.getClass();
        this.a = raaVar;
        this.b = xbaVar;
        this.c = z66Var;
        this.d = qe3Var;
    }

    public final void a(eca ecaVar, Function0 function0) {
        this.d.a(sjb.Download);
        if (this.c.g()) {
            ((taa) this.a).e(ecaVar);
        } else {
            function0.invoke();
        }
    }

    public final void b(eca ecaVar) {
        Collection collection;
        this.d.a(sjb.DeleteDownload);
        wba a = this.b.a(ecaVar.a(), ecaVar.b);
        if (a instanceof vba) {
            collection = ((vba) a).b;
        } else if (a instanceof tba) {
            collection = ((tba) a).a;
        } else {
            if (!a.equals(sba.a) && !a.equals(uba.a)) {
                b6e.s();
                return;
            }
            collection = c5b.a;
        }
        eca ecaVar2 = eca.d;
        ((taa) this.a).c(d51.j(collection));
    }
}
