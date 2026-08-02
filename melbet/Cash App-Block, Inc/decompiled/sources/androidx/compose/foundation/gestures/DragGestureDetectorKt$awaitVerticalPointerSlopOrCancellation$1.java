package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import okhttp3.internal.http1.HeadersReader;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DragGestureDetectorKt$awaitVerticalPointerSlopOrCancellation$1 extends ContinuationImpl {
    public float F$0;
    public Function2 L$0;
    public SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine L$1;
    public Ref$LongRef L$2;
    public HeadersReader L$3;
    public PointerInputChange L$4;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DragGestureDetectorKt.m209awaitVerticalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
