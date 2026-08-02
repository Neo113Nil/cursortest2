package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class lb0 extends uif implements Function2 {
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ wn5 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ dup v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long x;
    public final /* synthetic */ z18 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(Function0 function0, wn5 wn5Var, yci yciVar, Function2 function2, dup dupVar, long j, long j2, z18 z18Var, int i) {
        super(2);
        this.r = function0;
        this.s = wn5Var;
        this.t = yciVar;
        this.u = function2;
        this.v = dupVar;
        this.w = j;
        this.x = j2;
        this.y = z18Var;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        up6.c(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (hq5) obj, rvf.R(this.z | 1));
        return Unit.a;
    }
}
