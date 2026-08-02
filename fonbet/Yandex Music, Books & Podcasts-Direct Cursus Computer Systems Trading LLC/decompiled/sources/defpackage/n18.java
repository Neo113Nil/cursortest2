package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class n18 {
    public volatile qdc a;

    public final void a(Function1 function1) {
        if (this.a != null) {
            xq0.q("Di already initialized");
            return;
        }
        o18 o18Var = new o18();
        function1.invoke(o18Var);
        this.a = new qdc(new ix6(o18Var.a));
    }

    public final jyr b(bdt bdtVar, boolean z) {
        if (z) {
            qdc qdcVar = this.a;
            qdcVar.getClass();
            qdcVar.q(bdtVar);
        }
        return btf.b(new aw5(15, this, bdtVar));
    }

    public final Object c(bdt bdtVar) {
        qdc qdcVar = this.a;
        qdcVar.getClass();
        return qdcVar.C(bdtVar);
    }
}
