package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class dfl extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ fmi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfl(fmi fmiVar, Continuation continuation) {
        super(continuation);
        this.k = fmiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
