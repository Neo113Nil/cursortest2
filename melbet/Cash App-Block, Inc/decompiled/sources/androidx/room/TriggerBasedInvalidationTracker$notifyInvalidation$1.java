package androidx.room;

import androidx.room.concurrent.CloseBarrier;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$notifyInvalidation$1 extends ContinuationImpl {
    public TriggerBasedInvalidationTracker L$0;
    public CloseBarrier L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$notifyInvalidation$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TriggerBasedInvalidationTracker.access$notifyInvalidation(this.this$0, this);
    }
}
