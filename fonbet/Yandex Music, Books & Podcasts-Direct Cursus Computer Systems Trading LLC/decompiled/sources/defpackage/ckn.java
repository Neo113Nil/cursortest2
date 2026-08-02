package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ckn extends cg6 {
    public jtc j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jtc l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckn(jtc jtcVar, Continuation continuation) {
        super(continuation);
        this.l = jtcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.E(this);
    }
}
