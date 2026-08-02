package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ggw extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hgw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggw(hgw hgwVar, Continuation continuation) {
        super(continuation);
        this.k = hgwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return hgw.a(this.k, null, false, false, this);
    }
}
