package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zrf extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ iic r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ tsf t;
    public final /* synthetic */ o0k u;
    public final /* synthetic */ ox0 v;
    public final /* synthetic */ mx0 w;
    public final /* synthetic */ jic x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrf(iic iicVar, yci yciVar, tsf tsfVar, o0k o0kVar, ox0 ox0Var, mx0 mx0Var, jic jicVar, boolean z, Function1 function1, int i) {
        super(2);
        this.r = iicVar;
        this.s = yciVar;
        this.t = tsfVar;
        this.u = o0kVar;
        this.v = ox0Var;
        this.w = mx0Var;
        this.x = jicVar;
        this.y = z;
        this.z = function1;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wdp.T(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (hq5) obj, rvf.R(this.A | 1));
        return Unit.a;
    }
}
