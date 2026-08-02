package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class tmf extends cg6 {
    public xxq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xmf l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmf(xmf xmfVar, Continuation continuation) {
        super(continuation);
        this.l = xmfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
