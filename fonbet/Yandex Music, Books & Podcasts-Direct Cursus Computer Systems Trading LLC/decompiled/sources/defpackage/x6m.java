package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x6m extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z6m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6m(z6m z6mVar, Continuation continuation) {
        super(continuation);
        this.l = z6mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(false, this);
    }
}
