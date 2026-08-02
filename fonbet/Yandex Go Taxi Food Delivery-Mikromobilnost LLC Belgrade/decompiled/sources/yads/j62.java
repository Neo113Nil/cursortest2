package yads;

import defpackage.qr71;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class j62 extends ContinuationImpl {
    public /* synthetic */ Object b;
    public final /* synthetic */ qr71 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j62(qr71 qr71Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = qr71Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return qr71.a(this.c, null, this);
    }
}
