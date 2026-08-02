package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class cso extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wn5 s;
    public final /* synthetic */ wn5 t;
    public final /* synthetic */ wn5 u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ opv w;
    public final /* synthetic */ Function2 x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cso(int i, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, Function2 function2, opv opvVar, Function2 function22, int i2) {
        super(2);
        this.r = i;
        this.s = wn5Var;
        this.t = wn5Var2;
        this.u = wn5Var3;
        this.v = function2;
        this.w = opvVar;
        this.x = function22;
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        eso.c(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1));
        return Unit.a;
    }
}
