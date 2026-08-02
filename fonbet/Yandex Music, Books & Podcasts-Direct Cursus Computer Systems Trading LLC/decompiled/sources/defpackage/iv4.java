package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class iv4 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ l34 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv4(l34 l34Var, Continuation continuation) {
        super(continuation);
        this.l = l34Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
