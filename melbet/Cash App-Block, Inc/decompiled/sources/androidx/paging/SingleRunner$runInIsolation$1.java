package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SingleRunner$runInIsolation$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HintHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$1(HintHandler hintHandler, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hintHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.runInIsolation(null, this);
    }
}
