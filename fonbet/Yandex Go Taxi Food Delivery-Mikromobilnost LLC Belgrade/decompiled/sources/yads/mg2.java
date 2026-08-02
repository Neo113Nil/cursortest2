package yads;

import defpackage.d281;
import defpackage.g050;
import defpackage.sd81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class mg2 extends ContinuationImpl {
    public sd81 b;
    public Object c;
    public g050 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ d281 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mg2(d281 d281Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = d281Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, null, this);
    }
}
