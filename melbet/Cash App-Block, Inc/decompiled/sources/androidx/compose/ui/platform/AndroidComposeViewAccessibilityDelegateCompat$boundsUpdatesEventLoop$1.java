package androidx.compose.ui.platform;

import androidx.collection.MutableIntSet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {
    public MutableIntSet L$0;
    public BufferedChannel.BufferedChannelIterator L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.boundsUpdatesEventLoop$ui(this);
    }
}
