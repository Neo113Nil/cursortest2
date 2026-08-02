package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class qyp extends cg6 {
    public xdr j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ryp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyp(ryp rypVar, Continuation continuation) {
        super(continuation);
        this.l = rypVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
