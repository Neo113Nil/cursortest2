package app.cash.redwood.treehouse;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SequentialStateFlow$collect$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SequentialStateFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialStateFlow$collect$1(SequentialStateFlow sequentialStateFlow, Continuation continuation) {
        super(continuation);
        this.this$0 = sequentialStateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.collect(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
