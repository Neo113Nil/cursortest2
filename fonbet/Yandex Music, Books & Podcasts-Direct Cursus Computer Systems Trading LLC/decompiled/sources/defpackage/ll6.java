package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ll6 extends uif implements Function2 {
    public final /* synthetic */ yci A;
    public final /* synthetic */ yci B;
    public final /* synthetic */ yci C;
    public final /* synthetic */ lh3 D;
    public final /* synthetic */ qbs E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ mnj H;
    public final /* synthetic */ jx7 I;
    public final /* synthetic */ pyc r;
    public final /* synthetic */ axf s;
    public final /* synthetic */ ges t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ lbs w;
    public final /* synthetic */ ybs x;
    public final /* synthetic */ tiu y;
    public final /* synthetic */ yci z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll6(pyc pycVar, axf axfVar, ges gesVar, int i, int i2, lbs lbsVar, ybs ybsVar, tiu tiuVar, yci yciVar, yci yciVar2, yci yciVar3, yci yciVar4, lh3 lh3Var, qbs qbsVar, boolean z, Function1 function1, mnj mnjVar, jx7 jx7Var) {
        super(2);
        this.r = pycVar;
        this.s = axfVar;
        this.t = gesVar;
        this.u = i;
        this.v = i2;
        this.w = lbsVar;
        this.x = ybsVar;
        this.y = tiuVar;
        this.z = yciVar;
        this.A = yciVar2;
        this.B = yciVar3;
        this.C = yciVar4;
        this.D = lh3Var;
        this.E = qbsVar;
        this.F = z;
        this.G = function1;
        this.H = mnjVar;
        this.I = jx7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Number) obj2).intValue();
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
            this.r.invoke(ild.C(-1835647873, new kl6(this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I), oq5Var), oq5Var, 6);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
