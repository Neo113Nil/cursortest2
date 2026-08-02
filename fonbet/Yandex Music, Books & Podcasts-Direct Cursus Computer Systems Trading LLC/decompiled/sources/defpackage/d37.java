package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d37 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public rjc l;
    public final /* synthetic */ e37 m;
    public Object n;
    public z27 o;
    public xqn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d37(e37 e37Var, Continuation continuation) {
        super(continuation);
        this.m = e37Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
