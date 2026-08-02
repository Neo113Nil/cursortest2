package yads;

import defpackage.e971;
import defpackage.fh71;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class et2 extends ContinuationImpl {
    public e971 b;
    public f5 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fh71 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et2(fh71 fh71Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = fh71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
