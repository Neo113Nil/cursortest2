package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class u4b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ v4b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4b(v4b v4bVar, Continuation continuation) {
        super(continuation);
        this.k = v4bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.collect(null, this);
        return nm6.a;
    }
}
