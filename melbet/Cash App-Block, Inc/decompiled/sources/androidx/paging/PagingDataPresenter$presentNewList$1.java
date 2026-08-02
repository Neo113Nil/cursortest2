package androidx.paging;

import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PagingDataPresenter$presentNewList$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public List L$0;
    public LoadStates L$1;
    public LoadStates L$2;
    public HintReceiver L$3;
    public PageStore L$4;
    public HintReceiver L$5;
    public PageStore L$6;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LazyPagingItems$pagingDataPresenter$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$presentNewList$1(LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lazyPagingItems$pagingDataPresenter$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return LazyPagingItems$pagingDataPresenter$1.access$presentNewList(this.this$0, null, 0, 0, false, null, null, null, this);
    }
}
