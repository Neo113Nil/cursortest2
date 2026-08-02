package androidx.glance.state;

import app.cash.badging.backend.RealBadger2$clear$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class GlanceState$updateValue$1 extends ContinuationImpl {
    public RealBadger2$clear$2 L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GlanceState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$updateValue$1(GlanceState glanceState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = glanceState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateValue(null, null, null, null, this);
    }
}
