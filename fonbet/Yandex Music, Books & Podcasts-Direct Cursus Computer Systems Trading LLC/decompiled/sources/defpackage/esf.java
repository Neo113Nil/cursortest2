package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class esf extends uif implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ yci r;
    public final /* synthetic */ tsf s;
    public final /* synthetic */ jqd t;
    public final /* synthetic */ o0k u;
    public final /* synthetic */ jic v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ qg0 x;
    public final /* synthetic */ ox0 y;
    public final /* synthetic */ mx0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esf(yci yciVar, tsf tsfVar, jqd jqdVar, o0k o0kVar, jic jicVar, boolean z, qg0 qg0Var, ox0 ox0Var, mx0 mx0Var, Function1 function1, int i, int i2) {
        super(2);
        this.r = yciVar;
        this.s = tsfVar;
        this.t = jqdVar;
        this.u = o0kVar;
        this.v = jicVar;
        this.w = z;
        this.x = qg0Var;
        this.y = ox0Var;
        this.z = mx0Var;
        this.A = function1;
        this.B = i;
        this.C = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bkp.V(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, rvf.R(this.B | 1), rvf.R(this.C));
        return Unit.a;
    }
}
