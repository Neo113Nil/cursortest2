package defpackage;

import defpackage.hmm;

/* loaded from: classes3.dex */
public final class y0f extends cg6 {
    public hmm.a[] j;
    public /* synthetic */ Object k;
    public final /* synthetic */ c1f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0f(c1f c1fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = c1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
