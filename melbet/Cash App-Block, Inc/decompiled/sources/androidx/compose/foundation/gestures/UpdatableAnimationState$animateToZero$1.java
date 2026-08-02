package androidx.compose.foundation.gestures;

import kotlin.Function;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class UpdatableAnimationState$animateToZero$1 extends ContinuationImpl {
    public float F$0;
    public Function L$0;
    public Function0 L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UpdatableAnimationState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$1(UpdatableAnimationState updatableAnimationState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = updatableAnimationState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.animateToZero(null, null, this);
    }
}
