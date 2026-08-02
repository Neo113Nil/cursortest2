package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t7t {
    public final oct a;
    public final x6k b = szf.g0(null);
    public final /* synthetic */ d8t c;

    public t7t(d8t d8tVar, oct octVar, String str) {
        this.c = d8tVar;
        this.a = octVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s7t a(Function1 function1, Function1 function12) {
        x6k x6kVar = this.b;
        s7t s7tVar = (s7t) x6kVar.getValue();
        d8t d8tVar = this.c;
        if (s7tVar == null) {
            Object invoke = function12.invoke(d8tVar.c());
            Object invoke2 = function12.invoke(d8tVar.c());
            oct octVar = this.a;
            cn0 cn0Var = (cn0) octVar.a.invoke(invoke2);
            cn0Var.d();
            z7t z7tVar = new z7t(d8tVar, invoke, cn0Var, octVar);
            s7tVar = new s7t(this, z7tVar, function1, function12);
            x6kVar.setValue(s7tVar);
            d8tVar.i.add(z7tVar);
        }
        s7tVar.c = (uif) function12;
        s7tVar.b = function1;
        s7tVar.a(d8tVar.f());
        return s7tVar;
    }
}
