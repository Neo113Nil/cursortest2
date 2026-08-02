package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ur1 extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
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
    public ur1(is1 is1Var, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, int i2, int i3) {
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
        this.B = i2;
        this.C = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h4a.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (hq5) obj, rvf.R(this.B | 1), rvf.R(this.C));
        return Unit.a;
    }
}
