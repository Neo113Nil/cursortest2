package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class kwc extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ orc l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwc(orc orcVar, Continuation continuation) {
        super(continuation);
        this.l = orcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
