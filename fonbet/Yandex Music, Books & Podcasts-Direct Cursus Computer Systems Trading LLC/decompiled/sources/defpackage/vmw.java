package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class vmw extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ tmw l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmw(tmw tmwVar, Continuation continuation) {
        super(continuation);
        this.l = tmwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
