package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a15 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ fa3 l;
    public rjc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a15(fa3 fa3Var, Continuation continuation) {
        super(continuation);
        this.l = fa3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
