package androidx.room;

import androidx.room.concurrent.CloseBarrier;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$syncTriggers$1 extends ContinuationImpl {
    public CloseBarrier L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.syncTriggers$room_runtime_release(this);
    }
}
