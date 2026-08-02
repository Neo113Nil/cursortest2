package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a4k extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public rjc l;
    public final /* synthetic */ qlc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4k(qlc qlcVar, Continuation continuation) {
        super(continuation);
        this.m = qlcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
