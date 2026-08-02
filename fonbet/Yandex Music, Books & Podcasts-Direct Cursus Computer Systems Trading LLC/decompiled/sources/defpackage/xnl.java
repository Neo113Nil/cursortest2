package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class xnl extends cg6 {
    public zgl j;
    public oqi k;
    public uol l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ gfl o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnl(gfl gflVar, Continuation continuation) {
        super(continuation);
        this.o = gflVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
