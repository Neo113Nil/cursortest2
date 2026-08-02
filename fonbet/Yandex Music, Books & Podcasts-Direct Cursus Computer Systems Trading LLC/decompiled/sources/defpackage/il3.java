package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class il3 extends uif implements Function2 {
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ dup u;
    public final /* synthetic */ zk3 v;
    public final /* synthetic */ fl3 w;
    public final /* synthetic */ o0k x;
    public final /* synthetic */ wn5 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il3(Function0 function0, yci yciVar, boolean z, dup dupVar, zk3 zk3Var, fl3 fl3Var, o0k o0kVar, wn5 wn5Var, int i) {
        super(2);
        this.r = function0;
        this.s = yciVar;
        this.t = z;
        this.u = dupVar;
        this.v = zk3Var;
        this.w = fl3Var;
        this.x = o0kVar;
        this.y = wn5Var;
        this.z = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        qld.n(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, (hq5) obj, rvf.R(this.z | 1));
        return Unit.a;
    }
}
