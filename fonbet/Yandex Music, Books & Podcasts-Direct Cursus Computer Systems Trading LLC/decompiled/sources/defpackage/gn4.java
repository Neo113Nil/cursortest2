package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class gn4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hn4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn4(hn4 hn4Var, Continuation continuation) {
        super(continuation);
        this.k = hn4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
