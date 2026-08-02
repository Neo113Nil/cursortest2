package app.cash.local.backend.real;

import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.primitives.FulfillmentConfiguration;
import com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class BuyerIntentSyncManager$performRequest$1 extends ContinuationImpl {
    public long J$0;
    public BuyerIntentScope L$0;
    public UpdateUserIntentRequest L$1;
    public String L$2;
    public FulfillmentConfiguration L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BuyerIntentSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerIntentSyncManager$performRequest$1(BuyerIntentSyncManager buyerIntentSyncManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = buyerIntentSyncManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return BuyerIntentSyncManager.access$performRequest(this.this$0, null, null, 0L, null, null, this);
    }
}
