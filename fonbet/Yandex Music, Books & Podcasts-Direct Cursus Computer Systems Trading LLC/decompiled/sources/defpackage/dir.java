package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dir extends cg6 {
    public sa8 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ eir l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dir(eir eirVar, Continuation continuation) {
        super(continuation);
        this.l = eirVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        this.l.collect(null, this);
        return nm6.a;
    }
}
