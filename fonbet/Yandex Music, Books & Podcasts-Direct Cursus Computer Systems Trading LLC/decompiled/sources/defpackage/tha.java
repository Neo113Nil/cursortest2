package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class tha extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ wha k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tha(wha whaVar, Continuation continuation) {
        super(continuation);
        this.k = whaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
