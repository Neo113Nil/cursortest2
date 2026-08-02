package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class g6m extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ tek l;
    public Object m;
    public rjc n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6m(tek tekVar, Continuation continuation) {
        super(continuation);
        this.l = tekVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
