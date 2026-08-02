package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mvr extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ k4q l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvr(k4q k4qVar, Continuation continuation) {
        super(continuation);
        this.l = k4qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
