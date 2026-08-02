package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class sz1 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ tl0 l;
    public rjc m;
    public uz1 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz1(tl0 tl0Var, Continuation continuation) {
        super(continuation);
        this.l = tl0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
