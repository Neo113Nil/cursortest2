package app.cash.badging.backend;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class BadgeClearingWorker$work$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BadgeClearingWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeClearingWorker$work$1(BadgeClearingWorker badgeClearingWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = badgeClearingWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.work(null, this);
    }
}
