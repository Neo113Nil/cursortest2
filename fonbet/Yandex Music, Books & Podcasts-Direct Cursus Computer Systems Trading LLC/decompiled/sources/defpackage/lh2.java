package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class lh2 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ mh2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lh2(mh2 mh2Var, Continuation continuation) {
        super(continuation);
        this.l = mh2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
