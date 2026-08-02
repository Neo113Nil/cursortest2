package yads;

import defpackage.ak61;
import defpackage.tg81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class xx1 extends ContinuationImpl {
    public tg81 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ak61 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx1(ak61 ak61Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = ak61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, null, this);
    }
}
