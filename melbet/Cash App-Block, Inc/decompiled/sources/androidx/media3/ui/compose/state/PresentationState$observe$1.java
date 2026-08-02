package androidx.media3.ui.compose.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PresentationState$observe$1 extends ContinuationImpl {
    public PresentationState L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PresentationState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentationState$observe$1(PresentationState presentationState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = presentationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.observe(null, this);
    }
}
