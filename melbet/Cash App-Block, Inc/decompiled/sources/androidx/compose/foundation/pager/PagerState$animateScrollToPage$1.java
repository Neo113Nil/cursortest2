package androidx.compose.foundation.pager;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PagerState$animateScrollToPage$1 extends ContinuationImpl {
    public float F$0;
    public int I$0;
    public FiniteAnimationSpec L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$animateScrollToPage$1(PagerState pagerState, Continuation continuation) {
        super(continuation);
        this.this$0 = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.animateScrollToPage(0, RecyclerView.DECELERATION_RATE, null, this);
    }
}
