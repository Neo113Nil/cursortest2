package coil3.intercept;

import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.fetch.SourceFetchResult;
import coil3.request.ImageRequest;
import coil3.request.Options;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class EngineInterceptor$decode$1 extends ContinuationImpl {
    public int I$0;
    public SourceFetchResult L$0;
    public ComponentRegistry L$1;
    public ImageRequest L$2;
    public Object L$3;
    public Options L$4;
    public EventListener L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$decode$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EngineInterceptor.access$decode(this.this$0, null, null, null, null, null, null, this);
    }
}
