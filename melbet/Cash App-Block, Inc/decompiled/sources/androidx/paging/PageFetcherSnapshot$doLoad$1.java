package androidx.paging;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$doLoad$1 extends ContinuationImpl {
    public LoadType L$0;
    public GenerationalViewportHint L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public MutexImpl L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doLoad$1(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PageFetcherSnapshot.access$doLoad(this.this$0, null, null, this);
    }
}
