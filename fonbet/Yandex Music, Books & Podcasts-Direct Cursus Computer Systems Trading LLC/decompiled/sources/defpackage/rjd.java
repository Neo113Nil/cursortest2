package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class rjd extends cg6 {
    public drc j;
    public x66 k;
    public yxc l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ yjd o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjd(yjd yjdVar, Continuation continuation) {
        super(continuation);
        this.o = yjdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return yjd.b(this.o, null, null, null, false, this);
    }
}
