package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ay7 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ by7 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay7(by7 by7Var, Continuation continuation) {
        super(continuation);
        this.k = by7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.collect(null, this);
        return nm6.a;
    }
}
