package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class k3g extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ fgf l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3g(fgf fgfVar, Continuation continuation) {
        super(continuation);
        this.l = fgfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
