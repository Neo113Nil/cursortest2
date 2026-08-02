package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class x3s extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ jqp l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3s(jqp jqpVar, Continuation continuation) {
        super(continuation);
        this.l = jqpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
