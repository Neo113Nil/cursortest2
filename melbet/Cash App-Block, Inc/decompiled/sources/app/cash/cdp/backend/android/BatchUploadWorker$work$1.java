package app.cash.cdp.backend.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class BatchUploadWorker$work$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BatchUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchUploadWorker$work$1(BatchUploadWorker batchUploadWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = batchUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.work(null, this);
    }
}
