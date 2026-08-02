package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LazyListState$scroll$1 extends ContinuationImpl {
    public MutatePriority L$0;
    public SuspendLambda L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LazyListState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scroll$1(LazyListState lazyListState, Continuation continuation) {
        super(continuation);
        this.this$0 = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.scroll(null, null, this);
    }
}
