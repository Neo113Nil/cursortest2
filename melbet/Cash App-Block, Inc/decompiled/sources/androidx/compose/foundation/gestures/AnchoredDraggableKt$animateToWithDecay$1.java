package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AnchoredDraggableKt$animateToWithDecay$1 extends ContinuationImpl {
    public float F$0;
    public Ref$FloatRef L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return Draggable2DKt.animateToWithDecay(null, null, RecyclerView.DECELERATION_RATE, null, null, this);
    }
}
