package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DragGestureNode$processDragStop$1 extends ContinuationImpl {
    public DragEvent.DragStopped L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DragGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$processDragStop$1(DragGestureNode dragGestureNode, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DragGestureNode.access$processDragStop(this.this$0, null, this);
    }
}
