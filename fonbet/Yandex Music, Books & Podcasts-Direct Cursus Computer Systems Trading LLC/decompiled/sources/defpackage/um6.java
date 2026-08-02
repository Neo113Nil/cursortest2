package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class um6 implements mm6 {
    public volatile CoroutineContext a;
    public final /* synthetic */ rjq b;
    public final /* synthetic */ CoroutineContext c;

    public um6(rjq rjqVar, CoroutineContext coroutineContext) {
        this.b = rjqVar;
        this.c = coroutineContext;
        rjqVar.getClass();
        wqr n = a4g.n();
        rjqVar.D(new yg6(2, n));
        this.a = coroutineContext.plus(n);
        yg6 yg6Var = new yg6(3, this);
        rjqVar.getClass();
        rjqVar.b.add(yg6Var);
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }
}
