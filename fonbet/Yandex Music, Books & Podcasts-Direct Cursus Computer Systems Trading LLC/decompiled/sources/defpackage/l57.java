package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class l57 extends cg6 {
    public k57 j;
    public u7o k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k57 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l57(k57 k57Var, Continuation continuation) {
        super(continuation);
        this.m = k57Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, this);
    }
}
