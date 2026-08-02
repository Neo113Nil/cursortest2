package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v0n extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ long s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0n(int i, long j, ymq ymqVar, Function2 function2) {
        super(2);
        this.s = j;
        this.u = ymqVar;
        this.v = function2;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                z0n.b((d1n) this.u, this.s, (yci) this.v, hq5Var, rvf.R(this.t | 1));
                break;
            default:
                y1g.m(this.t | 1, this.s, hq5Var, (ymq) this.u, (Function2) this.v);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0n(d1n d1nVar, long j, yci yciVar, int i) {
        super(2);
        this.u = d1nVar;
        this.s = j;
        this.v = yciVar;
        this.t = i;
    }
}
