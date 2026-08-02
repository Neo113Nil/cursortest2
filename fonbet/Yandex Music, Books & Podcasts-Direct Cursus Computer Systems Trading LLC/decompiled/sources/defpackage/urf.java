package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class urf extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ yci r;
    public final /* synthetic */ fvf s;
    public final /* synthetic */ o0k t;
    public final /* synthetic */ ox0 u;
    public final /* synthetic */ gz2 v;
    public final /* synthetic */ jic w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ qg0 y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urf(yci yciVar, fvf fvfVar, o0k o0kVar, ox0 ox0Var, gz2 gz2Var, jic jicVar, boolean z, qg0 qg0Var, Function1 function1, int i, int i2) {
        super(2);
        this.r = yciVar;
        this.s = fvfVar;
        this.t = o0kVar;
        this.u = ox0Var;
        this.v = gz2Var;
        this.w = jicVar;
        this.x = z;
        this.y = qg0Var;
        this.z = function1;
        this.A = i;
        this.B = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        weo.f(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (hq5) obj, rvf.R(this.A | 1), this.B);
        return Unit.a;
    }
}
