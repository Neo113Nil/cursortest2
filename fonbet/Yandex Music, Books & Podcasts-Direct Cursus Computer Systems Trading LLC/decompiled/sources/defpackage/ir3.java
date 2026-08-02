package defpackage;

import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ir3 extends cg6 {
    public ri j;
    public IndexedValue k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ri m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir3(ri riVar, Continuation continuation) {
        super(continuation);
        this.m = riVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, this);
    }
}
