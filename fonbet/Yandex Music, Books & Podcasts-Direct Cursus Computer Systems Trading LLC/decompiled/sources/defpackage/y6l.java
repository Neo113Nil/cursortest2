package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class y6l extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ z6l l;
    public kal m;
    public int n;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6l(z6l z6lVar, Continuation continuation) {
        super(continuation);
        this.l = z6lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
