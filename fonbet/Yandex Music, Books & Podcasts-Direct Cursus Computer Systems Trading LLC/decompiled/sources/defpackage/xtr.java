package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xtr extends uif implements Function1 {
    public final /* synthetic */ xqn r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ cm0 t;
    public final /* synthetic */ cn0 u;
    public final /* synthetic */ vm0 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ Function1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtr(xqn xqnVar, Object obj, cm0 cm0Var, cn0 cn0Var, vm0 vm0Var, float f, Function1 function1) {
        super(1);
        this.r = xqnVar;
        this.s = obj;
        this.t = cm0Var;
        this.u = cn0Var;
        this.v = vm0Var;
        this.w = f;
        this.x = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        cm0 cm0Var = this.t;
        sm0 sm0Var = new sm0(this.s, cm0Var.e(), this.u, longValue, cm0Var.g(), longValue, new wtr(0, this.v));
        v5g.z(sm0Var, longValue, this.w, this.t, this.v, this.x);
        this.r.a = sm0Var;
        return Unit.a;
    }
}
