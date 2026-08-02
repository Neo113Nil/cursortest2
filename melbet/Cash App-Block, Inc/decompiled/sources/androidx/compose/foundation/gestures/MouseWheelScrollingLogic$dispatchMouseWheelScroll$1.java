package androidx.compose.foundation.gestures;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends ContinuationImpl {
    public float F$0;
    public ScrollingLogic L$0;
    public Ref$FloatRef L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return MouseWheelScrollingLogic.access$dispatchMouseWheelScroll(this.this$0, null, null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, this);
    }
}
