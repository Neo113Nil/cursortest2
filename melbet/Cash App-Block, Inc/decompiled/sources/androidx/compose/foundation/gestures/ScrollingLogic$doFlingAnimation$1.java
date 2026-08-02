package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    public Ref$LongRef L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.m243doFlingAnimationQWom1Mo(0L, this);
    }
}
