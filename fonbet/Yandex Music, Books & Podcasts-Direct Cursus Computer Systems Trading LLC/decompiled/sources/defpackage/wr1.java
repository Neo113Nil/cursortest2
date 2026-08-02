package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class wr1 extends uif implements Function2 {
    public final /* synthetic */ yci r;
    public final /* synthetic */ fs1 s;
    public final /* synthetic */ String t;
    public final /* synthetic */ g40 u;
    public final /* synthetic */ jd6 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ m85 x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr1(yci yciVar, fs1 fs1Var, String str, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i) {
        super(2);
        this.r = yciVar;
        this.s = fs1Var;
        this.t = str;
        this.u = g40Var;
        this.v = jd6Var;
        this.w = f;
        this.x = m85Var;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        h4a.f(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1));
        return Unit.a;
    }
}
