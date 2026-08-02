package yads;

import defpackage.cf81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class sd1 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ cf81 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd1(cf81 cf81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = cf81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
