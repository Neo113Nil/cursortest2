package app.cash.zipline.internal.bridge;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class FlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowZiplineService$Companion$Adapter$GeneratedOutboundService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowZiplineService$Companion$Adapter$GeneratedOutboundService$collect$1(FlowZiplineService$Companion$Adapter$GeneratedOutboundService flowZiplineService$Companion$Adapter$GeneratedOutboundService, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = flowZiplineService$Companion$Adapter$GeneratedOutboundService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.collect(null, this);
    }
}
