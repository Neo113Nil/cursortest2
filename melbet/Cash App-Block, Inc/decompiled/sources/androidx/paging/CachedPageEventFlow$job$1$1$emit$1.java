package androidx.paging;

import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CachedPageEventFlow$job$1$1$emit$1 extends ContinuationImpl {
    public IndexedValue L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChannelFlowCollector this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$job$1$1$emit$1(ChannelFlowCollector channelFlowCollector, Continuation continuation) {
        super(continuation);
        this.this$0 = channelFlowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((IndexedValue) null, (Continuation) this);
    }
}
