package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class v11 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ dm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v11(dm dmVar, Continuation continuation) {
        super(continuation);
        this.l = dmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
