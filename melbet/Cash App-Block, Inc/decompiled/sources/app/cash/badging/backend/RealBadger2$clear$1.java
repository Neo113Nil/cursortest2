package app.cash.badging.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealBadger2$clear$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealBadger2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBadger2$clear$1(RealBadger2 realBadger2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realBadger2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.clear(null, this);
    }
}
