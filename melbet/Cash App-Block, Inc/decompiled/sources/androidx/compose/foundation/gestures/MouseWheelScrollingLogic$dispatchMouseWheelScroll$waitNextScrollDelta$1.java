package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends ContinuationImpl {
    public MouseWheelScrollingLogic L$0;
    public Ref$ObjectRef L$1;
    public Ref$FloatRef L$2;
    public ScrollingLogic L$3;
    public Ref$ObjectRef L$4;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MouseWheelScrollingLogic.access$dispatchMouseWheelScroll$waitNextScrollDelta(null, null, null, null, null, 0L, this);
    }
}
