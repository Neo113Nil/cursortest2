package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class ahl extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ j7l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahl(j7l j7lVar, Continuation continuation) {
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
