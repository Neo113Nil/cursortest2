package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g9w extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hyl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9w(hyl hylVar, Continuation continuation) {
        super(continuation);
        this.k = hylVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, this);
    }
}
