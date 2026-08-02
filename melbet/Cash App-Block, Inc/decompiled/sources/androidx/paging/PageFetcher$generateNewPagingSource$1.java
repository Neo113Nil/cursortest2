package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PageFetcher$generateNewPagingSource$1 extends ContinuationImpl {
    public PagingSource L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$generateNewPagingSource$1(PageFetcher pageFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PageFetcher.access$generateNewPagingSource(this.this$0, null, this);
    }
}
