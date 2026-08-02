package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SingleRunner$Holder$onFinish$1 extends ContinuationImpl {
    public Job L$0;
    public MutexImpl L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleRunner$Holder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$onFinish$1(SingleRunner$Holder singleRunner$Holder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = singleRunner$Holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.onFinish(null, this);
    }
}
