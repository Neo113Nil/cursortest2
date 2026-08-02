package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cf6 extends uif implements Function2 {
    public final /* synthetic */ nf6 r;
    public final /* synthetic */ Function0 s;
    public final /* synthetic */ uif t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Function0 w;
    public final /* synthetic */ wn5 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cf6(nf6 nf6Var, Function0 function0, Function1 function1, yci yciVar, boolean z, Function0 function02, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = nf6Var;
        this.s = function0;
        this.t = (uif) function1;
        this.u = yciVar;
        this.v = z;
        this.w = function02;
        this.x = wn5Var;
        this.y = i;
        this.z = i2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wdp.O(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1), this.z);
        return Unit.a;
    }
}
