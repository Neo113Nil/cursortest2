package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class xa5 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ya5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa5(ya5 ya5Var, Continuation continuation) {
        super(continuation);
        this.k = ya5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
