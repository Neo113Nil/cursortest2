package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class mot extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ uzc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mot(uzc uzcVar, Continuation continuation) {
        super(continuation);
        this.k = uzcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return uzc.a(this.k, this);
    }
}
