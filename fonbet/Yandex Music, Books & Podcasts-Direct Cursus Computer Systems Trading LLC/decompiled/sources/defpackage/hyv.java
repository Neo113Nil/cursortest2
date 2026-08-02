package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class hyv extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ iyv k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hyv(iyv iyvVar, Continuation continuation) {
        super(continuation);
        this.k = iyvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(0L, this);
    }
}
