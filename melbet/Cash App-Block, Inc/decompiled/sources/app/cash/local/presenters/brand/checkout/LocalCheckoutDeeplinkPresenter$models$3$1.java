package app.cash.local.presenters.brand.checkout;

import androidx.compose.runtime.MutableState;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.RealOrderBuilder;
import app.cash.local.presenters.RealOrderBuilder$Factory$Impl;
import app.cash.local.presenters.RealOrderBuilderStore;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenuKt;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$Cart;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;
import sqip.CardEntry;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LocalCheckoutDeeplinkPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $hasError$delegate;
    public final /* synthetic */ MutableState $pendingCheckout$delegate;
    public BrandSpot L$1;
    public CreateCartResponse L$2;
    public AttributionKey L$3;
    public int label;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCheckoutDeeplinkPresenter$models$3$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localEditorialPresenter;
        this.$pendingCheckout$delegate = mutableState;
        this.$hasError$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalCheckoutDeeplinkPresenter$models$3$1(this.this$0, this.$pendingCheckout$delegate, this.$hasError$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalCheckoutDeeplinkPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BrandSpot brandSpot;
        CreateCartResponse createCartResponse;
        Object first;
        AttributionKey attributionKey;
        LocalMenu localMenu;
        LocalEditorialPresenter localEditorialPresenter = this.this$0;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                LocalCheckoutDeeplinkPresenter$PendingCheckout localCheckoutDeeplinkPresenter$PendingCheckout = (LocalCheckoutDeeplinkPresenter$PendingCheckout) this.$pendingCheckout$delegate.getValue();
                if (localCheckoutDeeplinkPresenter$PendingCheckout == null) {
                    return Unit.INSTANCE;
                }
                brandSpot = localCheckoutDeeplinkPresenter$PendingCheckout.brandSpot;
                createCartResponse = localCheckoutDeeplinkPresenter$PendingCheckout.cartResponse;
                AttributionKey attributionKey2 = localCheckoutDeeplinkPresenter$PendingCheckout.attributionKey;
                ChannelFlowTransformLatest brand = ((RealLocalBrandRepository) localEditorialPresenter.installedStore).brand(brandSpot);
                this.L$1 = brandSpot;
                this.L$2 = createCartResponse;
                this.L$3 = attributionKey2;
                this.label = 1;
                first = FlowKt.first(brand, this);
                if (first == coroutineSingletons) {
                    return coroutineSingletons;
                }
                attributionKey = attributionKey2;
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AttributionKey attributionKey3 = this.L$3;
                CreateCartResponse createCartResponse2 = this.L$2;
                brandSpot = this.L$1;
                SafeTrace.throwOnFailure(obj);
                first = obj;
                attributionKey = attributionKey3;
                createCartResponse = createCartResponse2;
            }
            LocalLocationDetail localLocationDetail = ((LocalBrand) first).selected_location;
            LocationMenu locationMenu = (localLocationDetail == null || (localMenu = localLocationDetail.menu) == null) ? null : LocationMenuKt.toLocationMenu(localMenu);
            if (locationMenu != null) {
                RealCartBuilder realCartBuilder = (RealCartBuilder) ((RealCartBuilderManager) ((CartBuilderManager) localEditorialPresenter.clock)).getBuilder(brandSpot);
                realCartBuilder.clearAll();
                zzho zzhoVar = createCartResponse.response;
                zzhoVar.getClass();
                CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
                LocalCart localCart = createCartResponse$Response$Cart != null ? createCartResponse$Response$Cart.value : null;
                localCart.getClass();
                Iterator<LocalCart.Line> it = localCart.lines.iterator();
                while (it.hasNext()) {
                    LocalCart.Line.Selection selection = it.next().selection;
                    selection.getClass();
                    Selection selection2 = SelectionKt.toSelection(selection);
                    realCartBuilder.add(CartBuilderKt.m1202toCartEntryxZOLh24(selection2, locationMenu, null, null), selection2.quantity, locationMenu, null);
                }
            }
            RealOrderBuilderStore realOrderBuilderStore = (RealOrderBuilderStore) localEditorialPresenter.screen;
            RealOrderBuilder create = ((RealOrderBuilder$Factory$Impl) localEditorialPresenter.stringManager).create(brandSpot, createCartResponse, attributionKey, screenNavigator, "", null, false, new BrandSpotSyncTokens((String) null, (String) null, 7), null);
            BrandSpot brandSpot2 = brandSpot;
            LocalTippingConfiguration localTippingConfiguration = createCartResponse.tipping_configuration;
            LocalFulfillment localFulfillment = createCartResponse.fulfillment;
            realOrderBuilderStore.active = create;
            CardEntry.setCardNonceBackgroundHandler(create);
            screenNavigator.goTo(new LocalBrandLocationCartScreen(brandSpot2, attributionKey, false, null, null, null, 56));
            Fulfillment fulfillment = localFulfillment != null ? FulfillmentKt.toFulfillment(localFulfillment) : null;
            boolean z = !(localTippingConfiguration != null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false);
            String str = localTippingConfiguration != null ? localTippingConfiguration.title : null;
            List list = localTippingConfiguration != null ? localTippingConfiguration.suggestions : null;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            List list2 = list;
            String str2 = localTippingConfiguration != null ? localTippingConfiguration.subtitle : null;
            LocalCashEarningsConfiguration localCashEarningsConfiguration = createCartResponse.local_cash_earnings_configuration;
            screenNavigator.goTo(new LocalBrandLocationCheckoutScreen(brandSpot2, attributionKey, false, fulfillment, (OrderWorkflow) null, z, str, list2, str2, localCashEarningsConfiguration != null ? localCashEarningsConfiguration.fine_print_markdown : null, (localFulfillment != null ? localFulfillment.type : null) == LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE ? LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB : LocalBrandLocationCheckoutScreen.ReviewMode.STANDARD, (BrandSpotSyncTokens) null, 4144));
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            Timber.Forest.w("Failed to build deeplink checkout", new Object[0], e);
            this.$hasError$delegate.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
