package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class fnu extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ gnu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnu(gnu gnuVar, Continuation continuation) {
        super(continuation);
        this.k = gnuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
