package androidx.paging;

import androidx.compose.material3.ThumbNode$onAttach$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public PageFetcherSnapshot L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ThumbNode$onAttach$1.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(ThumbNode$onAttach$1.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(this);
    }
}
