package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s7t implements sdr {
    public final z7t a;
    public Function1 b;
    public uif c;
    public final /* synthetic */ t7t d;

    /* JADX WARN: Multi-variable type inference failed */
    public s7t(t7t t7tVar, z7t z7tVar, Function1 function1, Function1 function12) {
        this.d = t7tVar;
        this.a = z7tVar;
        this.b = function1;
        this.c = (uif) function12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, uif] */
    public final void a(x7t x7tVar) {
        Object invoke = this.c.invoke(x7tVar.a());
        boolean g = this.d.c.g();
        z7t z7tVar = this.a;
        if (g) {
            z7tVar.g(this.c.invoke(x7tVar.b()), invoke, (wdc) this.b.invoke(x7tVar));
        } else {
            z7tVar.h(invoke, (wdc) this.b.invoke(x7tVar));
        }
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        a(this.d.c.f());
        return this.a.h.getValue();
    }
}
