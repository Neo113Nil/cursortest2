package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class NonTouchScrollingLogic$userScroll$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NonTouchScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogic$userScroll$1(NonTouchScrollingLogic nonTouchScrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nonTouchScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.userScroll$foundation(null, this);
    }
}
