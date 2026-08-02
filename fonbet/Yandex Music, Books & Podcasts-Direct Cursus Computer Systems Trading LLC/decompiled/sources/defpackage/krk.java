package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class krk extends cg6 {
    public xdr j;
    public fs7 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fmi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krk(fmi fmiVar, Continuation continuation) {
        super(continuation);
        this.m = fmiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, this);
    }
}
