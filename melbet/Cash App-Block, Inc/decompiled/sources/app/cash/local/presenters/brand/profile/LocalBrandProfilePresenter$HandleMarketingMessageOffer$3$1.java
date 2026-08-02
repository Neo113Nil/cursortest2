package app.cash.local.presenters.brand.profile;

import androidx.compose.runtime.MutableState;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandProfilePresenter$HandleMarketingMessageOffer$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CartBuilder $cart;
    public final /* synthetic */ MutableState $didApplyOffer$delegate;
    public final /* synthetic */ LocationMenu $menu;
    public final /* synthetic */ MarketingMessageOfferDetails $offer;
    public final /* synthetic */ Function0 $showOfferToast;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandProfilePresenter$HandleMarketingMessageOffer$3$1(LocationMenu locationMenu, CartBuilder cartBuilder, MarketingMessageOfferDetails marketingMessageOfferDetails, Function0 function0, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$menu = locationMenu;
        this.$cart = cartBuilder;
        this.$offer = marketingMessageOfferDetails;
        this.$showOfferToast = function0;
        this.$didApplyOffer$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalBrandProfilePresenter$HandleMarketingMessageOffer$3$1(this.$menu, this.$cart, this.$offer, this.$showOfferToast, this.$didApplyOffer$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalBrandProfilePresenter$HandleMarketingMessageOffer$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        LocationMenu locationMenu = this.$menu;
        if (locationMenu != null) {
            MarketingMessageOfferDetails marketingMessageOfferDetails = this.$offer;
            String str = marketingMessageOfferDetails.offerCode;
            List list = marketingMessageOfferDetails.offerLines;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CartBuilderKt.m1203toCartEntryWithQuantityNvqXVjw((LocalCart.Line) it.next(), locationMenu, marketingMessageOfferDetails.offerToken));
            }
            ((RealCartBuilder) this.$cart).applyOffer(new DiscountCode.MarketingOffer(str, marketingMessageOfferDetails, arrayList));
            this.$didApplyOffer$delegate.setValue(Boolean.TRUE);
            this.$showOfferToast.invoke();
        }
        return Unit.INSTANCE;
    }
}
