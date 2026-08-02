package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DragGestureDetectorKt$verticalDrag$1 extends ContinuationImpl {
    public Function1 L$0;
    public SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine L$1;
    public Orientation L$2;
    public SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine L$3;
    public Ref$LongRef L$4;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DragGestureDetectorKt.m213verticalDragjO51t88(null, 0L, null, this);
    }
}
