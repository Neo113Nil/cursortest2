package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class e6n extends cg6 {
    public xxq j;
    public wb7 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gfl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6n(gfl gflVar, Continuation continuation) {
        super(continuation);
        this.m = gflVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, this);
    }
}
