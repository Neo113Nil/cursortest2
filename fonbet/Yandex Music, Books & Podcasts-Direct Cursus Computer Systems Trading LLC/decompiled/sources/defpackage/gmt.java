package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class gmt extends cg6 {
    public jp0 j;
    public byte[] k;
    public qqi l;
    public /* synthetic */ Object m;
    public final /* synthetic */ jp0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmt(jp0 jp0Var, Continuation continuation) {
        super(continuation);
        this.n = jp0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(null, this);
    }
}
