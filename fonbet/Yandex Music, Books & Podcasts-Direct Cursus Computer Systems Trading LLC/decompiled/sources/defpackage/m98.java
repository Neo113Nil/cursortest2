package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class m98 extends cg6 {
    public xdr j;
    public /* synthetic */ Object k;
    public final /* synthetic */ u58 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m98(u58 u58Var, Continuation continuation) {
        super(continuation);
        this.l = u58Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
