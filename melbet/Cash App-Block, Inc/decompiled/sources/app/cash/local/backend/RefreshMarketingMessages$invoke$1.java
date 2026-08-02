package app.cash.local.backend;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RefreshMarketingMessages$invoke$1 extends ContinuationImpl {
    public List L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RefreshMarketingMessages this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshMarketingMessages$invoke$1(RefreshMarketingMessages refreshMarketingMessages, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = refreshMarketingMessages;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke(this);
    }
}
