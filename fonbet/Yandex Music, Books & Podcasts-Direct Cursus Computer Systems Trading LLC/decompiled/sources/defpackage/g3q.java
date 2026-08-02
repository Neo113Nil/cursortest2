package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class g3q extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ o0o l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3q(o0o o0oVar, Continuation continuation) {
        super(continuation);
        this.l = o0oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
