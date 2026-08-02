package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class i7i extends cg6 {
    public l6p j;
    public /* synthetic */ Object k;
    public final /* synthetic */ j7i l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7i(j7i j7iVar, Continuation continuation) {
        super(continuation);
        this.l = j7iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.T(null, null, this);
    }
}
