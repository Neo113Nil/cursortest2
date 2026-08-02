package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class x47 extends cg6 {
    public e57 j;
    public jst k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e57 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x47(e57 e57Var, Continuation continuation) {
        super(continuation);
        this.m = e57Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.C(null, this);
    }
}
