package yads;

import defpackage.jn81;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class ux0 extends ContinuationImpl {
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jn81 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(jn81 jn81Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = jn81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
