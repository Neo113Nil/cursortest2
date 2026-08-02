package yads;

import defpackage.ms71;
import defpackage.xb81;
import defpackage.xk71;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class qe2 extends ContinuationImpl {
    public ms71 b;
    public xk71 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xb81 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe2(xb81 xb81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = xb81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
