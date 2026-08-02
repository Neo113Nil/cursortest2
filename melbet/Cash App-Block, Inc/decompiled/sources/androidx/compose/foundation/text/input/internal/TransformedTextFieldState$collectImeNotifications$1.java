package androidx.compose.foundation.text.input.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TransformedTextFieldState$collectImeNotifications$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TransformedTextFieldState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$1(TransformedTextFieldState transformedTextFieldState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = transformedTextFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        this.this$0.collectImeNotifications(null, this);
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }
}
