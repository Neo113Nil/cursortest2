package yads;

import defpackage.mv81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class xl0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ mv81 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl0(mv81 mv81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = mv81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
