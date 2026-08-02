package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class hxm extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ gxm k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxm(gxm gxmVar, Continuation continuation) {
        super(continuation);
        this.k = gxmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return gxm.N(this.k, null, false, this);
    }
}
