package coil3.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.oneformapp.ProfileStore_;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class EngineInterceptor$intercept$1 extends ContinuationImpl {
    public ProfileStore_ L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.intercept(null, this);
    }
}
