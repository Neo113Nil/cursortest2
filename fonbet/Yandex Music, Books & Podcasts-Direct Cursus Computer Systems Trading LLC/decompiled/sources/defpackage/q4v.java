package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class q4v extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ bnu l;
    public fav m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4v(bnu bnuVar, Continuation continuation) {
        super(continuation);
        this.l = bnuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
