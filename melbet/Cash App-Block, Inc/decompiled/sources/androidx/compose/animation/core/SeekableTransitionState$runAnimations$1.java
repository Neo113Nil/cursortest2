package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SeekableTransitionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$runAnimations$1(SeekableTransitionState seekableTransitionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = seekableTransitionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SeekableTransitionState.access$runAnimations(this.this$0, this);
    }
}
