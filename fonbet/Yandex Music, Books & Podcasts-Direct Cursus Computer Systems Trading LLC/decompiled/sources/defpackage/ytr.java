package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ytr extends uif implements Function1 {
    public final /* synthetic */ xqn r;
    public final /* synthetic */ float s;
    public final /* synthetic */ cm0 t;
    public final /* synthetic */ vm0 u;
    public final /* synthetic */ Function1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ytr(xqn xqnVar, float f, cm0 cm0Var, vm0 vm0Var, Function1 function1) {
        super(1);
        this.r = xqnVar;
        this.s = f;
        this.t = cm0Var;
        this.u = vm0Var;
        this.v = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.r.a;
        obj2.getClass();
        v5g.z((sm0) obj2, longValue, this.s, this.t, this.u, this.v);
        return Unit.a;
    }
}
