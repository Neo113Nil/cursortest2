package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ojj extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public rjc l;
    public final /* synthetic */ tl0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojj(tl0 tl0Var, Continuation continuation) {
        super(continuation);
        this.m = tl0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
