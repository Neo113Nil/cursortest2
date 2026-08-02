package yads;

import defpackage.e971;
import defpackage.tg81;
import defpackage.v881;
import defpackage.zk61;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class y22 extends ContinuationImpl {
    public v881 b;
    public tg81 c;
    public e971 d;
    public f5 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zk61 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y22(zk61 zk61Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = zk61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, null, this);
    }
}
