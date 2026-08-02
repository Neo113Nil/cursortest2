package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class k0h extends cg6 {
    public xdr j;
    public /* synthetic */ Object k;
    public final /* synthetic */ otd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0h(otd otdVar, Continuation continuation) {
        super(continuation);
        this.l = otdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
