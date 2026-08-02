package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class v47 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public rjc l;
    public final /* synthetic */ w47 m;
    public Object n;
    public s47 o;
    public xqn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v47(w47 w47Var, Continuation continuation) {
        super(continuation);
        this.m = w47Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
