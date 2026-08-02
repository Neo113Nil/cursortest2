package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$forceSetHint$1 extends ContinuationImpl {
    public LoadType L$0;
    public PageFetcherSnapshotState.Holder L$1;
    public MutexImpl L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$forceSetHint$1(PageFetcherSnapshot pageFetcherSnapshot, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.forceSetHint(null, this);
    }
}
