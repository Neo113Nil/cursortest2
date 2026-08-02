package yads;

import defpackage.n191;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class ye2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ n191 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye2(n191 n191Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = n191Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
