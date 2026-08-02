package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class s5l extends cg6 {
    public j5l j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ t5l m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5l(t5l t5lVar, Continuation continuation) {
        super(continuation);
        this.m = t5lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
