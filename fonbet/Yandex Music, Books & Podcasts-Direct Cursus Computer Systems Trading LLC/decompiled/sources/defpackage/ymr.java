package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ymr extends uif implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zkn r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ w4k t;
    public final /* synthetic */ String u;
    public final /* synthetic */ g40 v;
    public final /* synthetic */ jd6 w;
    public final /* synthetic */ float x;
    public final /* synthetic */ m85 y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymr(zkn zknVar, yci yciVar, w4k w4kVar, String str, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, boolean z, int i) {
        super(2);
        this.r = zknVar;
        this.s = yciVar;
        this.t = w4kVar;
        this.u = str;
        this.v = g40Var;
        this.w = jd6Var;
        this.x = f;
        this.y = m85Var;
        this.z = z;
        this.A = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bzf.o(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (hq5) obj, rvf.R(this.A | 1));
        return Unit.a;
    }
}
