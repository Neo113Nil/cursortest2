package yads;

import defpackage.ep61;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class xb2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ ep61 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb2(ep61 ep61Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = ep61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, this);
    }
}
