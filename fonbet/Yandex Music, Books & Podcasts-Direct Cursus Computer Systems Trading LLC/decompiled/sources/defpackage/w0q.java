package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class w0q extends cg6 {
    public x0q j;
    public rjc k;
    public z0q l;
    public r2f m;
    public /* synthetic */ Object n;
    public final /* synthetic */ x0q o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0q(x0q x0qVar, Continuation continuation) {
        super(continuation);
        this.o = x0qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        x0q.m(this.o, null, this);
        return nm6.a;
    }
}
