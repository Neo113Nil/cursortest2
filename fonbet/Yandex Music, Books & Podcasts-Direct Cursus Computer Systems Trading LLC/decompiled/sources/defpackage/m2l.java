package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class m2l extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ n2l l;
    public rjc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2l(n2l n2lVar, Continuation continuation) {
        super(continuation);
        this.l = n2lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
