package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class s7m extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ uql l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7m(uql uqlVar, Continuation continuation) {
        super(continuation);
        this.l = uqlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
