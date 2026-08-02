package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class u47 extends cg6 {
    public p47 j;
    public t47 k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ p47 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u47(p47 p47Var, Continuation continuation) {
        super(continuation);
        this.n = p47Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
