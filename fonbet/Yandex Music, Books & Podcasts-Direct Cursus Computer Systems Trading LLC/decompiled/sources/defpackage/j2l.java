package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class j2l extends cg6 {
    public d6l j;
    public v0l k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tl0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2l(tl0 tl0Var, Continuation continuation) {
        super(continuation);
        this.m = tl0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
