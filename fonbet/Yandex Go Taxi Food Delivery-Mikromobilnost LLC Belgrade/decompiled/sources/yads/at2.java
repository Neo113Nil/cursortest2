package yads;

import defpackage.e971;
import defpackage.fh71;
import defpackage.l8x;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class at2 extends ContinuationImpl {
    public Object b;
    public e971 c;
    public f5 d;
    public l8x e;
    public /* synthetic */ Object f;
    public final /* synthetic */ fh71 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at2(fh71 fh71Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = fh71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
