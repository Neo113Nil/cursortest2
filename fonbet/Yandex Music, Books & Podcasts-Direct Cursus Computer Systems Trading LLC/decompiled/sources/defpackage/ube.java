package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ube extends uif implements Function2 {
    public final /* synthetic */ w4k r;
    public final /* synthetic */ String s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ g40 u;
    public final /* synthetic */ jd6 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ m85 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ube(w4k w4kVar, String str, yci yciVar, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, int i2) {
        super(2);
        this.r = w4kVar;
        this.s = str;
        this.t = yciVar;
        this.u = g40Var;
        this.v = jd6Var;
        this.w = f;
        this.x = m85Var;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        irf.r(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1), this.z);
        return Unit.a;
    }
}
