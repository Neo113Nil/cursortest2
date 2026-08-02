package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d7l extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ c7l l;
    public q7q m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7l(c7l c7lVar, Continuation continuation) {
        super(continuation);
        this.l = c7lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
