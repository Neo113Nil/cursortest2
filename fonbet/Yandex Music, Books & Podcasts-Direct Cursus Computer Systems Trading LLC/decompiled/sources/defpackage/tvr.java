package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tvr extends uif implements Function2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ ds7 t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ uoi v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvr(boolean z, boolean z2, ds7 ds7Var, Function0 function0, uoi uoiVar, int i) {
        super(2);
        this.r = z;
        this.s = z2;
        this.t = ds7Var;
        this.u = function0;
        this.v = uoiVar;
        this.w = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        uvr.b(this.r, this.s, this.t, this.u, this.v, (hq5) obj, rvf.R(this.w | 1));
        return Unit.a;
    }
}
