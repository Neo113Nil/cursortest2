package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class pc4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ qc4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc4(qc4 qc4Var, Continuation continuation) {
        super(continuation);
        this.k = qc4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.collect(null, this);
        return nm6.a;
    }
}
