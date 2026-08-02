package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class yrf extends uif implements Function2 {
    public final /* synthetic */ Function1 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ lpd r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ tsf t;
    public final /* synthetic */ o0k u;
    public final /* synthetic */ ox0 v;
    public final /* synthetic */ mx0 w;
    public final /* synthetic */ jic x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ qg0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrf(lpd lpdVar, yci yciVar, tsf tsfVar, o0k o0kVar, ox0 ox0Var, mx0 mx0Var, jic jicVar, boolean z, qg0 qg0Var, Function1 function1, int i, int i2, int i3) {
        super(2);
        this.r = lpdVar;
        this.s = yciVar;
        this.t = tsfVar;
        this.u = o0kVar;
        this.v = ox0Var;
        this.w = mx0Var;
        this.x = jicVar;
        this.y = z;
        this.z = qg0Var;
        this.A = function1;
        this.B = i;
        this.C = i2;
        this.D = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wdp.U(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, rvf.R(this.B | 1), rvf.R(this.C), this.D);
        return Unit.a;
    }
}
