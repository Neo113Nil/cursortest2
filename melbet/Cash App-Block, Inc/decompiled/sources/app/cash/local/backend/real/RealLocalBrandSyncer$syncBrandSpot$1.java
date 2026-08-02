package app.cash.local.backend.real;

import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealLocalBrandSyncer$syncBrandSpot$1 extends ContinuationImpl {
    public int I$0;
    public BrandSpot L$0;
    public String L$1;
    public BrandSpotSyncTokens L$2;
    public LocalFulfillmentType L$3;
    public String L$4;
    public Mutex L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealLocalBrandSyncer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealLocalBrandSyncer$syncBrandSpot$1(RealLocalBrandSyncer realLocalBrandSyncer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realLocalBrandSyncer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.syncBrandSpot(null, null, null, null, null, this);
    }
}
