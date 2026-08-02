package coil3.compose;

import coil3.request.ImageRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1$handle$1 extends ContinuationImpl {
    public ImageRequest L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AsyncImagePreviewHandler$Companion$Default$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncImagePreviewHandler$Companion$Default$1$handle$1(AsyncImagePreviewHandler$Companion$Default$1 asyncImagePreviewHandler$Companion$Default$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = asyncImagePreviewHandler$Companion$Default$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handle(null, null, this);
    }
}
