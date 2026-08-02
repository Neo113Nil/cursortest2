package yads;

import defpackage.g050;
import defpackage.wg81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class sz2 extends ContinuationImpl {
    public g050 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wg81 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz2(wg81 wg81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = wg81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
