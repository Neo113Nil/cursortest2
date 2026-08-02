package androidx.compose.material;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    public float F$0;
    public Map L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DismissState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$processNewAnchors$1(DismissState dismissState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dismissState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.processNewAnchors$material(null, null, this);
    }
}
