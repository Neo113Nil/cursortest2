package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t90 extends cg6 {
    public ka0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ka0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(ka0 ka0Var, Continuation continuation) {
        super(continuation);
        this.l = ka0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
