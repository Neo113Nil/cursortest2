package app.cash.local.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealCartBuilderManager$createCart$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCartBuilderManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCartBuilderManager$createCart$1(RealCartBuilderManager realCartBuilderManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCartBuilderManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createCart(null, null, null, null, this);
    }
}
