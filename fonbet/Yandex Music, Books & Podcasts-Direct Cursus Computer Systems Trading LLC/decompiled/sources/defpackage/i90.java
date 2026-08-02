package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class i90 extends cg6 {
    public k90 j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ k90 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i90(k90 k90Var, Continuation continuation) {
        super(continuation);
        this.m = k90Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
