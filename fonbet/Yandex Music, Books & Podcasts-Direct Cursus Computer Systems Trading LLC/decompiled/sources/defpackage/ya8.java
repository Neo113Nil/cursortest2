package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ya8 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ tl0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya8(tl0 tl0Var, Continuation continuation) {
        super(continuation);
        this.k = tl0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
