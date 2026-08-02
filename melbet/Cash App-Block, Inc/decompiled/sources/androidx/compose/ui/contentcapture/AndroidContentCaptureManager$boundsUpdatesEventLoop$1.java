package androidx.compose.ui.contentcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AndroidContentCaptureManager$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    public BufferedChannel.BufferedChannelIterator L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidContentCaptureManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidContentCaptureManager$boundsUpdatesEventLoop$1(AndroidContentCaptureManager androidContentCaptureManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidContentCaptureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.boundsUpdatesEventLoop$ui(this);
    }
}
