package androidx.room;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {
    public TriggerBasedInvalidationTracker$createFlow$1$2 L$0;
    public int[] L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(TriggerBasedInvalidationTracker$createFlow$1$2 triggerBasedInvalidationTracker$createFlow$1$2, Continuation continuation) {
        super(continuation);
        this.this$0 = triggerBasedInvalidationTracker$createFlow$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((int[]) null, (Continuation) this);
    }
}
