package yads;

import defpackage.c271;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class cz0 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ c271 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(c271 c271Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c271Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
