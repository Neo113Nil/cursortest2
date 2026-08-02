package app.cash.local.presenters.cart;

import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.presenters.OrderBuilder$Payload;
import app.cash.local.presenters.brand.checkout.OpenTabCheckoutRouting;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class LocalCartCheckoutNavigator$createCheckoutResult$1 extends ContinuationImpl {
    public LocalCart L$0;
    public BrandSpot L$1;
    public AttributionKey L$2;
    public BrandSpotSyncTokens L$3;
    public BetterNavigator.ScreenNavigator L$4;
    public OrderBuilder$Payload L$5;
    public OpenTabCheckoutRouting L$6;
    public BuyerIntentScope L$7;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LocalCartCheckoutNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCartCheckoutNavigator$createCheckoutResult$1(LocalCartCheckoutNavigator localCartCheckoutNavigator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = localCartCheckoutNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.createCheckoutResult(null, null, null, false, null, null, null, null, null, this);
    }
}
