package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ma8 implements eun {
    public final Function1 a;
    public na8 b;

    public ma8(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.eun
    public final void b() {
        this.b = (na8) this.a.invoke(gld.f);
    }

    @Override // defpackage.eun
    public final void e() {
        na8 na8Var = this.b;
        if (na8Var != null) {
            na8Var.a();
        }
        this.b = null;
    }

    @Override // defpackage.eun
    public final void d() {
    }
}
