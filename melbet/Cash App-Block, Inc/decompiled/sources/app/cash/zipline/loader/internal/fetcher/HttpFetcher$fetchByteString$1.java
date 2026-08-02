package app.cash.zipline.loader.internal.fetcher;

import app.cash.zipline.EventListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class HttpFetcher$fetchByteString$1 extends ContinuationImpl {
    public String L$0;
    public EventListener L$1;
    public String L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HttpFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpFetcher$fetchByteString$1(HttpFetcher httpFetcher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = httpFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.fetchByteString(null, null, null, null, null, this);
    }
}
