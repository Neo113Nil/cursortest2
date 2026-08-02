package app.cash.sqldelight.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.DistinctFlowImpl$collect$2;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1 extends ContinuationImpl {
    public int I$0;
    public FlowCollector L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DistinctFlowImpl$collect$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1(DistinctFlowImpl$collect$2 distinctFlowImpl$collect$2, Continuation continuation) {
        super(continuation);
        this.this$0 = distinctFlowImpl$collect$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
