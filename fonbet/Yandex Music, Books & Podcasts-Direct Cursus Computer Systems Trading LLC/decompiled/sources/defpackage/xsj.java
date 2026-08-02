package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class xsj extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ysj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xsj(ysj ysjVar, Continuation continuation) {
        super(continuation);
        this.k = ysjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return ysj.a(this.k, null, this);
    }
}
