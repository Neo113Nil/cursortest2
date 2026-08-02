package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class n57 extends cg6 {
    public k57 j;
    public mjj k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k57 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n57(k57 k57Var, Continuation continuation) {
        super(continuation);
        this.n = k57Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, this);
    }
}
