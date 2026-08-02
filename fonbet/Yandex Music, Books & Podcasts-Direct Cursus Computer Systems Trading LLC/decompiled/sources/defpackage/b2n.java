package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b2n extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ c2n l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2n(c2n c2nVar, Continuation continuation) {
        super(continuation);
        this.l = c2nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
