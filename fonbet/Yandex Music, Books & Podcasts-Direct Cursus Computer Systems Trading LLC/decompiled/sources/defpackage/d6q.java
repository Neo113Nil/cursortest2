package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d6q extends cg6 {
    public gm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e6q l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6q(e6q e6qVar, Continuation continuation) {
        super(continuation);
        this.l = e6qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
