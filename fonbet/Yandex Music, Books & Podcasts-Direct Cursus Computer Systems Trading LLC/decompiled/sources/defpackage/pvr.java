package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pvr extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ ds7 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvr(boolean z, Function1 function1, yci yciVar, boolean z2, ds7 ds7Var, int i, int i2) {
        super(2);
        this.r = z;
        this.s = function1;
        this.t = yciVar;
        this.u = z2;
        this.v = ds7Var;
        this.w = i;
        this.x = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        uvr.a(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1), this.x);
        return Unit.a;
    }
}
