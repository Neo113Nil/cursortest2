package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class jbn extends cg6 {
    public String j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kbn m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbn(kbn kbnVar, Continuation continuation) {
        super(continuation);
        this.m = kbnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(null, false, this);
    }
}
