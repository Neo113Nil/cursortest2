package yads;

import defpackage.d281;
import defpackage.g050;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class og2 extends ContinuationImpl {
    public g050 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d281 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og2(d281 d281Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = d281Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
