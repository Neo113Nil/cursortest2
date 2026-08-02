package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.StandaloneCoroutine;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 extends ContinuationImpl {
    public StandaloneCoroutine L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.this$0 = pointerEventHandlerCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.withTimeout(0L, null, this);
    }
}
