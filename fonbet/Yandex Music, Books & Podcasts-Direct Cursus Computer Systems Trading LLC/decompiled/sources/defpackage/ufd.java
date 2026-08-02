package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ufd extends cg6 {
    public t1q j;
    public vhd k;
    public boolean l;
    public boolean m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ vfd p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufd(vfd vfdVar, Continuation continuation) {
        super(continuation);
        this.p = vfdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return vfd.a(this.p, null, null, false, false, false, this);
    }
}
