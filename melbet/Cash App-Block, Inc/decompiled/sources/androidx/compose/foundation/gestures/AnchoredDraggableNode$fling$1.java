package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AnchoredDraggableNode$fling$1 extends ContinuationImpl {
    public Ref$FloatRef L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnchoredDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$1(AnchoredDraggableNode anchoredDraggableNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = anchoredDraggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return AnchoredDraggableNode.access$fling(this.this$0, RecyclerView.DECELERATION_RATE, this);
    }
}
