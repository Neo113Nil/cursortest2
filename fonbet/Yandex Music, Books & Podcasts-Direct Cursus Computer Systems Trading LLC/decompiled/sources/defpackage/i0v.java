package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i0v extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ bnu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0v(bnu bnuVar, Continuation continuation) {
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
