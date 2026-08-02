package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class qjd extends cg6 {
    public x66 j;
    public yxc k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ yjd n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjd(yjd yjdVar, Continuation continuation) {
        super(continuation);
        this.n = yjdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return yjd.a(this.n, null, null, false, this);
    }
}
