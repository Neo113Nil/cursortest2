package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class r47 extends cg6 {
    public p47 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p47 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r47(p47 p47Var, Continuation continuation) {
        super(continuation);
        this.l = p47Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
