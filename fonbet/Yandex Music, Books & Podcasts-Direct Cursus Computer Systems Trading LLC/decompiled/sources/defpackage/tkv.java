package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class tkv extends cg6 {
    public rkd j;
    public Integer k;
    public rnv l;
    public ukv m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ukv o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkv(ukv ukvVar, Continuation continuation) {
        super(continuation);
        this.o = ukvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.e(null, null, null, this);
    }
}
