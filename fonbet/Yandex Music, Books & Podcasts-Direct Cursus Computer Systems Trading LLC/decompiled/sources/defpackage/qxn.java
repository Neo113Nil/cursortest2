package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class qxn extends uif implements Function2 {
    public final /* synthetic */ ayn r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ yci t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ wn5 w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn(ayn aynVar, Object obj, yci yciVar, boolean z, boolean z2, wn5 wn5Var, int i) {
        super(2);
        this.r = aynVar;
        this.s = obj;
        this.t = yciVar;
        this.u = z;
        this.v = z2;
        this.w = wn5Var;
        this.x = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        q7g.h(this.r, this.s, this.t, this.u, this.v, this.w, (hq5) obj, rvf.R(this.x | 1));
        return Unit.a;
    }
}
