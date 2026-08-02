package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pi0 extends uif implements Function2 {
    public final /* synthetic */ aeu r;
    public final /* synthetic */ long s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ yci u;
    public final /* synthetic */ onj v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(aeu aeuVar, long j, boolean z, yci yciVar, onj onjVar) {
        super(2);
        this.r = aeuVar;
        this.s = j;
        this.t = z;
        this.u = yciVar;
        this.v = onjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Number) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            etn.l(es5.s.a(this.r), ild.C(1260045569, new oi0(this.s, this.t, this.u, this.v), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
