package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class PagerState$scroll$1 extends ContinuationImpl {
    public PagerState L$0;
    public MutatePriority L$1;
    public SuspendLambda L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scroll$1(PagerState pagerState, Continuation continuation) {
        super(continuation);
        this.this$0 = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return PagerState.scroll$suspendImpl(this.this$0, null, null, this);
    }
}
