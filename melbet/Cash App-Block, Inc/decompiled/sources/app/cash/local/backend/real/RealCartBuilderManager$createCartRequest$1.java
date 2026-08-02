package app.cash.local.backend.real;

import app.cash.local.backend.CartBuilder;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.FulfillmentConfiguration;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class RealCartBuilderManager$createCartRequest$1 extends ContinuationImpl {
    public BrandSpot L$0;
    public AttributionKey L$1;
    public FulfillmentConfiguration L$2;
    public CartBuilder L$3;
    public String L$4;
    public ArrayList L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealCartBuilderManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCartBuilderManager$createCartRequest$1(RealCartBuilderManager realCartBuilderManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realCartBuilderManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createCartRequest(null, null, null, null, this);
    }
}
