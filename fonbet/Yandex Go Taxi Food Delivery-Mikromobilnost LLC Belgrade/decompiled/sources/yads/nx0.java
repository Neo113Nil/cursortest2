package yads;

import defpackage.h081;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class nx0 extends ContinuationImpl {
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h081 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx0(h081 h081Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = h081Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
