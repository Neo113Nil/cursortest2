package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class jlc extends cg6 {
    public tl0 j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tl0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlc(tl0 tl0Var, Continuation continuation) {
        super(continuation);
        this.m = tl0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
