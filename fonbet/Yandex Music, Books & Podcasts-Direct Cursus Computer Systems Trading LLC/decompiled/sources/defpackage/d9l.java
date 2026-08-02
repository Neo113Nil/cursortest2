package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d9l extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ j7l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9l(j7l j7lVar, Continuation continuation) {
        super(continuation);
        this.l = j7lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
