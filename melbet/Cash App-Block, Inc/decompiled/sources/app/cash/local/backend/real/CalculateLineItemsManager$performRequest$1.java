package app.cash.local.backend.real;

import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import com.squareup.protos.cash.local.client.v1.CalculateLineItemsResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class CalculateLineItemsManager$performRequest$1 extends ContinuationImpl {
    public BrandSpot L$0;
    public FulfillmentConfiguration L$3;
    public CalculateLineItemsResponse.Success L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CalculateLineItemsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalculateLineItemsManager$performRequest$1(CalculateLineItemsManager calculateLineItemsManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = calculateLineItemsManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CalculateLineItemsManager.access$performRequest(this.this$0, null, null, null, null, this);
    }
}
