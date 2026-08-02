package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xuf extends uif implements Function2 {
    public final /* synthetic */ ox0 A;
    public final /* synthetic */ hz2 B;
    public final /* synthetic */ mx0 C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ yci r;
    public final /* synthetic */ fvf s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ jic w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ qg0 y;
    public final /* synthetic */ gz2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuf(yci yciVar, fvf fvfVar, o0k o0kVar, boolean z, boolean z2, jic jicVar, boolean z3, qg0 qg0Var, gz2 gz2Var, ox0 ox0Var, hz2 hz2Var, mx0 mx0Var, Function1 function1, int i, int i2, int i3) {
        super(2);
        this.r = yciVar;
        this.s = fvfVar;
        this.t = o0kVar;
        this.u = z;
        this.v = z2;
        this.w = jicVar;
        this.x = z3;
        this.y = qg0Var;
        this.z = gz2Var;
        this.A = ox0Var;
        this.B = hz2Var;
        this.C = mx0Var;
        this.D = function1;
        this.E = i;
        this.F = i2;
        this.G = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(this.E | 1);
        int R2 = rvf.R(this.F);
        int i = this.G;
        bcx.l(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, (hq5) obj, R, R2, i);
        return Unit.a;
    }
}
