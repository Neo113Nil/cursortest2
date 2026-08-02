package coil3.intercept;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.oneformapp.ProfileStore_;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealInterceptorChain$proceed$1 extends ContinuationImpl {
    public Interceptor L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ProfileStore_ this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(ProfileStore_ profileStore_, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = profileStore_;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.proceed(this);
    }
}
