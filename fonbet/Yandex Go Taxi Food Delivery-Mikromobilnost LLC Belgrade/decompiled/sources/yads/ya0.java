package yads;

import defpackage.nx81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class ya0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ nx81 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(nx81 nx81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = nx81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, null, this);
    }
}
