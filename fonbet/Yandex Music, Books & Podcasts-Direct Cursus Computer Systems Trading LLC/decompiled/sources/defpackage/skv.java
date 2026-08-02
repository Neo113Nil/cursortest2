package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class skv extends cg6 {
    public rkd j;
    public ukv k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ukv m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skv(ukv ukvVar, Continuation continuation) {
        super(continuation);
        this.m = ukvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, this);
    }
}
