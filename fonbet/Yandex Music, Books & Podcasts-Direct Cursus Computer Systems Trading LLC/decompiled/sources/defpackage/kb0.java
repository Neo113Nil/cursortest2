package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kb0 extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ wn5 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ dup w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ z18 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(Function0 function0, wn5 wn5Var, yci yciVar, Function2 function2, Function2 function22, dup dupVar, long j, long j2, z18 z18Var, int i, int i2) {
        super(2);
        this.r = function0;
        this.s = wn5Var;
        this.t = yciVar;
        this.u = function2;
        this.v = function22;
        this.w = dupVar;
        this.x = j;
        this.y = j2;
        this.z = z18Var;
        this.A = i;
        this.B = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        up6.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (hq5) obj, rvf.R(this.A | 1), this.B);
        return Unit.a;
    }
}
