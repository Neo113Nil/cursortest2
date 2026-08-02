package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class x57 extends cg6 {
    public y57 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y57 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x57(y57 y57Var, Continuation continuation) {
        super(continuation);
        this.m = y57Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return y57.K(this.m, this);
    }
}
