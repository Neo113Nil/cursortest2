package yads;

import defpackage.t881;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class of2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ t881 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of2(t881 t881Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = t881Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return t881.a(this.c, null, null, null, null, 0L, this);
    }
}
