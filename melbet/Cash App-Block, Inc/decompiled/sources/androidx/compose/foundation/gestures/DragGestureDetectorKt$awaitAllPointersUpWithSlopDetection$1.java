package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import okhttp3.internal.http1.HeadersReader;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DragGestureDetectorKt$awaitAllPointersUpWithSlopDetection$1 extends ContinuationImpl {
    public float F$0;
    public int I$0;
    public SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine L$0;
    public PointerEventPass L$1;
    public Ref$LongRef L$2;
    public HeadersReader L$3;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(null, null, null, this);
    }
}
