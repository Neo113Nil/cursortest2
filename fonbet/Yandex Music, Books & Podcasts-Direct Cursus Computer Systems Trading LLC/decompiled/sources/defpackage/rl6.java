package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rl6 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl6(Object obj, boolean z, int i, int i2) {
        super(2);
        this.r = i2;
        this.u = obj;
        this.s = z;
        this.t = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        hq5 hq5Var = (hq5) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                j66.E((qbs) this.u, this.s, hq5Var, rvf.R(this.t | 1));
                break;
            default:
                ((ovn) this.u).e(this.s, hq5Var, rvf.R(this.t | 1));
                break;
        }
        return Unit.a;
    }
}
