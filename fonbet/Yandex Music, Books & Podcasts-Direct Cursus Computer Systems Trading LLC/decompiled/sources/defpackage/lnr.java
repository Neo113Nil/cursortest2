package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class lnr extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ mnr k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnr(mnr mnrVar, Continuation continuation) {
        super(continuation);
        this.k = mnrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.collect(null, this);
        return nm6.a;
    }
}
