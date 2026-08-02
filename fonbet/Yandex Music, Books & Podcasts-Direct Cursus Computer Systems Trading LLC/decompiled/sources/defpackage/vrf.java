package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vrf extends uif implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ yci r;
    public final /* synthetic */ fvf s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ mx0 v;
    public final /* synthetic */ hz2 w;
    public final /* synthetic */ jic x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ qg0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrf(yci yciVar, fvf fvfVar, o0k o0kVar, boolean z, mx0 mx0Var, hz2 hz2Var, jic jicVar, boolean z2, qg0 qg0Var, Function1 function1, int i, int i2) {
        super(2);
        this.r = yciVar;
        this.s = fvfVar;
        this.t = o0kVar;
        this.u = z;
        this.v = mx0Var;
        this.w = hz2Var;
        this.x = jicVar;
        this.y = z2;
        this.z = qg0Var;
        this.A = function1;
        this.B = i;
        this.C = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        weo.i(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, rvf.R(this.B | 1), this.C);
        return Unit.a;
    }
}
