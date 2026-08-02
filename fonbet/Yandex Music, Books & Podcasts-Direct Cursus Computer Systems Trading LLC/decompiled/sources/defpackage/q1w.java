package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q1w extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p1w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1w(p1w p1wVar, Continuation continuation) {
        super(continuation);
        this.k = p1wVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
