package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class wdr extends cg6 {
    public xdr j;
    public rjc k;
    public zdr l;
    public r2f m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ xdr p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdr(xdr xdrVar, Continuation continuation) {
        super(continuation);
        this.p = xdrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        this.p.collect(null, this);
        return nm6.a;
    }
}
