package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class l62 extends cg6 {
    public mqs j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k62 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l62(k62 k62Var, Continuation continuation) {
        super(continuation);
        this.l = k62Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
