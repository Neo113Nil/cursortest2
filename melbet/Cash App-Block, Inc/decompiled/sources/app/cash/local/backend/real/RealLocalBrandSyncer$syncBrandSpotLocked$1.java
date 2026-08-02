package app.cash.local.backend.real;

import app.cash.api.ApiResult;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.primitives.BrandSpot;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealLocalBrandSyncer$syncBrandSpotLocked$1 extends ContinuationImpl {
    public RealLocalBrandSyncer.BrandProfileSyncState L$0;
    public BrandSpot L$1;
    public ApiResult.Success L$12;
    public LocalBrand L$14;
    public BrandSpot L$15;
    public LocalFulfillmentType L$16;
    public String L$2;
    public RealLocalBrandSyncer.BrandProfileSyncRequestState L$6;
    public String L$8;
    public String L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLocalBrandSyncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalBrandSyncer$syncBrandSpotLocked$1(RealLocalBrandSyncer realLocalBrandSyncer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realLocalBrandSyncer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.syncBrandSpotLocked(null, null, null, null, null, null, this);
    }
}
