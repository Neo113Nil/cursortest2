package defpackage;

import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gr3 extends cg6 {
    public hr3 j;
    public IndexedValue k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hr3 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr3(hr3 hr3Var, Continuation continuation) {
        super(continuation);
        this.m = hr3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
