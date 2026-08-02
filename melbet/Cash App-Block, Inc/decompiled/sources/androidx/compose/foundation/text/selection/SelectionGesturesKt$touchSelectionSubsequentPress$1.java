package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends ContinuationImpl {
    public long J$0;
    public SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine L$0;
    public TextDragObserver L$1;
    public Ref$LongRef L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return SimpleLayoutKt.access$touchSelectionSubsequentPress(null, null, null, 0, this);
    }
}
