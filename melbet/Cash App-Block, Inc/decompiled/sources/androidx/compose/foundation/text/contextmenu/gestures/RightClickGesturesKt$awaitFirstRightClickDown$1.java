package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import com.google.android.gms.internal.mlkit_genai_prompt.zzade;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RightClickGesturesKt$awaitFirstRightClickDown$1 extends ContinuationImpl {
    public SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return zzade.access$awaitFirstRightClickDown(null, this);
    }
}
