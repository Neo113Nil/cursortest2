package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c37 extends cg6 {
    public y27 j;
    public b37 k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ y27 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c37(y27 y27Var, Continuation continuation) {
        super(continuation);
        this.n = y27Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
