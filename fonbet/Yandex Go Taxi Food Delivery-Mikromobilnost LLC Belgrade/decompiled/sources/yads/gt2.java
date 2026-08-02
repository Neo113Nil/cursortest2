package yads;

import defpackage.fh71;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class gt2 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ fh71 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(fh71 fh71Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = fh71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return fh71.a(this.c, null, this);
    }
}
