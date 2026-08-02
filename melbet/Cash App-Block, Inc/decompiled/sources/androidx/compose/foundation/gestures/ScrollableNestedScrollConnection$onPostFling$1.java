package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = scrollableNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.mo241onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
