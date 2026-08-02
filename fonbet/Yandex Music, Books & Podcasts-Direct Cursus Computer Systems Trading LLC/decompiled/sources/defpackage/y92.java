package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class y92 extends cg6 {
    public ocn j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x92 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y92(x92 x92Var, Continuation continuation) {
        super(continuation);
        this.l = x92Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
