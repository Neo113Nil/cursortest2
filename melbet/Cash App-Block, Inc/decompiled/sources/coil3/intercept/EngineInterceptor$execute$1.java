package coil3.intercept;

import coil3.request.ImageRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class EngineInterceptor$execute$1 extends ContinuationImpl {
    public ImageRequest L$0;
    public Object L$1;
    public Object L$2;
    public Ref$ObjectRef L$3;
    public Ref$ObjectRef L$4;
    public Ref$ObjectRef L$5;
    public Ref$ObjectRef L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$execute$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return EngineInterceptor.access$execute(this.this$0, null, null, null, null, this);
    }
}
