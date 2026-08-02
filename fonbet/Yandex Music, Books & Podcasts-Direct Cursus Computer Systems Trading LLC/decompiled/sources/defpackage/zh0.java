package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class zh0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wn5 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh0(Object obj, Object obj2, Object obj3, wn5 wn5Var, int i, int i2, int i3) {
        super(2);
        this.r = i3;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
        this.s = wn5Var;
        this.t = i;
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                ohm ohmVar = (ohm) this.v;
                Function0 function0 = (Function0) this.w;
                phm phmVar = (phm) this.x;
                bi0.a(ohmVar, function0, phmVar, this.s, (hq5) obj, rvf.R(this.t | 1), this.u);
                break;
            default:
                ((Number) obj2).intValue();
                i95 i95Var = (i95) this.v;
                hvp hvpVar = (hvp) this.w;
                rdt rdtVar = (rdt) this.x;
                rdh.a(i95Var, hvpVar, rdtVar, this.s, (hq5) obj, rvf.R(this.t | 1), this.u);
                break;
        }
        return Unit.a;
    }
}
