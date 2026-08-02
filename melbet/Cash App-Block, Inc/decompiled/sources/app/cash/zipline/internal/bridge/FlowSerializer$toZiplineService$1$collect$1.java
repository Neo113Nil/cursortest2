package app.cash.zipline.internal.bridge;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlowSerializer$toZiplineService$1$collect$1 extends ContinuationImpl {
    public FlowZiplineCollector L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowSerializer$toZiplineService$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowSerializer$toZiplineService$1$collect$1(FlowSerializer$toZiplineService$1 flowSerializer$toZiplineService$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = flowSerializer$toZiplineService$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collect(null, this);
    }
}
