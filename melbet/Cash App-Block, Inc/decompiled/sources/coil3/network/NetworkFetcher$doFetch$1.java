package coil3.network;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class NetworkFetcher$doFetch$1 extends ContinuationImpl {
    public Ref$ObjectRef L$0;
    public Ref$ObjectRef L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$doFetch$1(NetworkFetcher networkFetcher, Continuation continuation) {
        super(continuation);
        this.this$0 = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return NetworkFetcher.access$doFetch(this.this$0, this);
    }
}
