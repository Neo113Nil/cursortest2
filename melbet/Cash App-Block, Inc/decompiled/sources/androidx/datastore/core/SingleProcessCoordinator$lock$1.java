package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SingleProcessCoordinator$lock$1 extends ContinuationImpl {
    public Object L$0;
    public MutexImpl L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessCoordinator$lock$1(SingleProcessCoordinator singleProcessCoordinator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = singleProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.lock(null, this);
    }
}
