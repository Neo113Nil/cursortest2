package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class d2u extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ e2u l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2u(e2u e2uVar, Continuation continuation) {
        super(continuation);
        this.l = e2uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
