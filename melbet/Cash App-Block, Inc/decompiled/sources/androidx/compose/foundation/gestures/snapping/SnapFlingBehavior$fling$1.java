package androidx.compose.foundation.gestures.snapping;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SnapFlingBehavior$fling$1 extends ContinuationImpl {
    public Function1 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fling(null, RecyclerView.DECELERATION_RATE, null, this);
    }
}
