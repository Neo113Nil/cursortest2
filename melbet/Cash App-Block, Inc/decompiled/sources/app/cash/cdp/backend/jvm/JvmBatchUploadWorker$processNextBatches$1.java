package app.cash.cdp.backend.jvm;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class JvmBatchUploadWorker$processNextBatches$1 extends ContinuationImpl {
    public long J$0;
    public Ref$ObjectRef L$0;
    public List L$1;
    public ArrayList L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ JvmBatchUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBatchUploadWorker$processNextBatches$1(JvmBatchUploadWorker jvmBatchUploadWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jvmBatchUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processNextBatches(0L, this);
    }
}
