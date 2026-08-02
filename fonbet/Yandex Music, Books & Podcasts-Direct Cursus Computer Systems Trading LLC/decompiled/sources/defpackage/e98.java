package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e98 extends cg6 {
    public xdr j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t58 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e98(t58 t58Var, Continuation continuation) {
        super(continuation);
        this.l = t58Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
