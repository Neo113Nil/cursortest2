package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jl3 extends uif implements Function2 {
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ dup u;
    public final /* synthetic */ zk3 v;
    public final /* synthetic */ o0k w;
    public final /* synthetic */ wn5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl3(Function0 function0, yci yciVar, boolean z, dup dupVar, zk3 zk3Var, o0k o0kVar, wn5 wn5Var, int i) {
        super(2);
        this.r = function0;
        this.s = yciVar;
        this.t = z;
        this.u = dupVar;
        this.v = zk3Var;
        this.w = o0kVar;
        this.x = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(805306369);
        qld.u(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, R);
        return Unit.a;
    }
}
