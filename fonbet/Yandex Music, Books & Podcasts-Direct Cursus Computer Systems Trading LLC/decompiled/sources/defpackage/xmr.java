package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xmr extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ wn5 B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ is1 r;
    public final /* synthetic */ String s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ g40 w;
    public final /* synthetic */ jd6 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ m85 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmr(is1 is1Var, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, wn5 wn5Var, int i2, int i3) {
        super(2);
        this.r = is1Var;
        this.s = str;
        this.t = yciVar;
        this.u = function1;
        this.v = function12;
        this.w = g40Var;
        this.x = jd6Var;
        this.y = f;
        this.z = m85Var;
        this.A = i;
        this.B = wn5Var;
        this.C = i2;
        this.D = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bzf.m(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, (hq5) obj, rvf.R(this.C | 1), rvf.R(this.D));
        return Unit.a;
    }
}
