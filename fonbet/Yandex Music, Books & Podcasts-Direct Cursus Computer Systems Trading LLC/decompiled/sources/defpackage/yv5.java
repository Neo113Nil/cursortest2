package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class yv5 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ xv5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv5(xv5 xv5Var, Continuation continuation) {
        super(continuation);
        this.k = xv5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return xv5.x(this.k, null, false, this);
    }
}
