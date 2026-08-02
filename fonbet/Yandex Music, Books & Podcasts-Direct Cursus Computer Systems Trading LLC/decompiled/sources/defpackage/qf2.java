package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qf2 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ rf2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf2(rf2 rf2Var, Continuation continuation) {
        super(continuation);
        this.k = rf2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
