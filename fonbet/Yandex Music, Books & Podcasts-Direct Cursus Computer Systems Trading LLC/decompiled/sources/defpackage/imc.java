package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class imc extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ u21 l;
    public u21 m;
    public rjc n;
    public xqn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imc(u21 u21Var, Continuation continuation) {
        super(continuation);
        this.l = u21Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
