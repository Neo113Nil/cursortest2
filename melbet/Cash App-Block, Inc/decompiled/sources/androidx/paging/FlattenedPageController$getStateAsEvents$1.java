package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes3.dex */
public final class FlattenedPageController$getStateAsEvents$1 extends ContinuationImpl {
    public MutexImpl L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HuffmanTreeGroup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$getStateAsEvents$1(HuffmanTreeGroup huffmanTreeGroup, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = huffmanTreeGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.getStateAsEvents(this);
    }
}
