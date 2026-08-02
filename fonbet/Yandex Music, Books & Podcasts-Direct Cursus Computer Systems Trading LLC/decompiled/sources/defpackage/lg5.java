package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class lg5 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ gl l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg5(gl glVar, Continuation continuation) {
        super(continuation);
        this.l = glVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
