package app.cash.local.backend.real;

import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealLocalBrandSyncer$syncLocationStatuses$1 extends ContinuationImpl {
    public Set L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLocalBrandSyncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalBrandSyncer$syncLocationStatuses$1(RealLocalBrandSyncer realLocalBrandSyncer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realLocalBrandSyncer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.syncLocationStatuses(null, this);
    }
}
