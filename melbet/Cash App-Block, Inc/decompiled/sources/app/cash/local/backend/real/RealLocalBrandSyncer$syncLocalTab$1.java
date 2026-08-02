package app.cash.local.backend.real;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealLocalBrandSyncer$syncLocalTab$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public RealLocalBrandSyncer L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLocalBrandSyncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalBrandSyncer$syncLocalTab$1(RealLocalBrandSyncer realLocalBrandSyncer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realLocalBrandSyncer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.syncLocalTab(false, this);
    }
}
