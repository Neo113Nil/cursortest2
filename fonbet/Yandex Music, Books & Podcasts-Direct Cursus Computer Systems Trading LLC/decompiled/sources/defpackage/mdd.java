package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class mdd extends cg6 {
    public ced j;
    public oqi k;
    public v68 l;
    public t1q m;
    public vhd n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ odd u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdd(odd oddVar, Continuation continuation) {
        super(continuation);
        this.u = oddVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.e(null, false, false, false, false, this);
    }
}
