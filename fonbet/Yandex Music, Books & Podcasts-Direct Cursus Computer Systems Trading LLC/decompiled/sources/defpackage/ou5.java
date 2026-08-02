package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ou5 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i64 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou5(i64 i64Var, Continuation continuation) {
        super(continuation);
        this.k = i64Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
