package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class fdr extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ tal k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdr(tal talVar, Continuation continuation) {
        super(continuation);
        this.k = talVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(0, this);
    }
}
