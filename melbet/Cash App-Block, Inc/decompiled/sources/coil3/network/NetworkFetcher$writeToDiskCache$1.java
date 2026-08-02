package coil3.network;

import coil3.request.OneShotDisposable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class NetworkFetcher$writeToDiskCache$1 extends ContinuationImpl {
    public Object L$0;
    public NetworkResponse L$1;
    public OneShotDisposable L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NetworkFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkFetcher$writeToDiskCache$1(NetworkFetcher networkFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = networkFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return NetworkFetcher.access$writeToDiskCache(this.this$0, null, null, null, this);
    }
}
