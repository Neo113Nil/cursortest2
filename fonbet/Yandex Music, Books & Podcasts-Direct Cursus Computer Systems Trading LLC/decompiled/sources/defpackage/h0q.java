package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h0q extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j0q k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0q(j0q j0qVar, Continuation continuation) {
        super(continuation);
        this.k = j0qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.collect(null, this);
        return nm6.a;
    }
}
