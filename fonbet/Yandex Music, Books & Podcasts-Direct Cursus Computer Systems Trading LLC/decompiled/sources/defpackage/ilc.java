package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ilc extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ wy1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilc(wy1 wy1Var, Continuation continuation) {
        super(continuation);
        this.k = wy1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
