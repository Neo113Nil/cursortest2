package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class z5j extends cg6 {
    public fmi j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ fmi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5j(fmi fmiVar, Continuation continuation) {
        super(continuation);
        this.m = fmiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(false, this);
    }
}
