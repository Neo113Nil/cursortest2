package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.unit.IntRect;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public IntRect L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(ComposeScrollCaptureCallback composeScrollCaptureCallback, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return ComposeScrollCaptureCallback.access$onScrollCaptureImageRequest(this.this$0, null, null, this);
    }
}
