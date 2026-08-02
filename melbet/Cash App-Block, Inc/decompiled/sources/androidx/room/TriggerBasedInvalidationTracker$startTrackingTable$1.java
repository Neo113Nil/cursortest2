package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$startTrackingTable$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public int I$2;
    public TriggerBasedInvalidationTracker L$0;
    public PooledConnection L$1;
    public String L$2;
    public String[] L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$startTrackingTable$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return TriggerBasedInvalidationTracker.access$startTrackingTable(this.this$0, null, 0, this);
    }
}
