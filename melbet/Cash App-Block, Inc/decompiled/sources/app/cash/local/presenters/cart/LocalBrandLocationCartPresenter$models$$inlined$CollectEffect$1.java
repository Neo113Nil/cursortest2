package app.cash.local.presenters.cart;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.OpenTabCartOverride;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.cart.OpenTabAddRoundState;
import app.cash.local.presenters.internal.AnalyticsKt;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Clicked;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Dismissed;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Toggled;
import app.cash.local.viewmodels.LocalBrandLocationCartViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.blockers.presenters.FormBlockerPresenter$models$3$1;
import com.squareup.cash.cdf.localclient.BannerLocation;
import com.squareup.cash.cdf.localclient.LocalClientBannerInteraction;
import com.squareup.cash.cdf.localclient.SchedulingType;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.screens.Back;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$$Lambda$0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCartPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $createCartViewModels$delegate$inlined;
    public final /* synthetic */ MutableState $currentBuyerInfo$delegate$inlined;
    public final /* synthetic */ MutableState $currentBuyerIntentScope$inlined;
    public final /* synthetic */ MutableState $currentCartMode$delegate$inlined;
    public final /* synthetic */ State $currentFulfillmentConfiguration$delegate$inlined;
    public final /* synthetic */ MutableState $currentOpenCart$inlined;
    public final /* synthetic */ MutableState $currentSyncTokens$delegate$inlined;
    public final /* synthetic */ MutableState $dismissedBuyerIntentErrorIds$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ MutableState $isFulfillmentExpanded$delegate$inlined;
    public final /* synthetic */ MutableState $loadingResponse$delegate$inlined;
    public final /* synthetic */ State $location$delegate$inlined;
    public final /* synthetic */ State $menu$delegate$inlined;
    public final /* synthetic */ MutableState $openTabAddRoundState$delegate$inlined;
    public final /* synthetic */ MutableState $orderedOpenTabItemCount$delegate$inlined;
    public final /* synthetic */ MutableState $placeOrderErrors$delegate$inlined;
    public final /* synthetic */ Map $removingJobs$inlined;
    public final /* synthetic */ BrandSpotSyncTokens $syncTokens$inlined;
    public final /* synthetic */ CoroutineScope $updateCoroutineScope$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LocalBrandLocationCartPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandLocationCartPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, MutableState mutableState, MutableState mutableState2, Map map, LocalBrandLocationCartPresenter localBrandLocationCartPresenter, BrandSpotSyncTokens brandSpotSyncTokens, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, State state, MutableState mutableState8, MutableState mutableState9, CoroutineScope coroutineScope, State state2, MutableState mutableState10, MutableState mutableState11, State state3, MutableState mutableState12) {
        super(2, continuation);
        this.$flow = flow;
        this.$currentOpenCart$inlined = mutableState;
        this.$currentBuyerIntentScope$inlined = mutableState2;
        this.$removingJobs$inlined = map;
        this.this$0 = localBrandLocationCartPresenter;
        this.$syncTokens$inlined = brandSpotSyncTokens;
        this.$loadingResponse$delegate$inlined = mutableState3;
        this.$placeOrderErrors$delegate$inlined = mutableState4;
        this.$createCartViewModels$delegate$inlined = mutableState5;
        this.$dismissedBuyerIntentErrorIds$delegate$inlined = mutableState6;
        this.$openTabAddRoundState$delegate$inlined = mutableState7;
        this.$menu$delegate$inlined = state;
        this.$currentCartMode$delegate$inlined = mutableState8;
        this.$currentBuyerInfo$delegate$inlined = mutableState9;
        this.$updateCoroutineScope$inlined = coroutineScope;
        this.$currentFulfillmentConfiguration$delegate$inlined = state2;
        this.$orderedOpenTabItemCount$delegate$inlined = mutableState10;
        this.$currentSyncTokens$delegate$inlined = mutableState11;
        this.$location$delegate$inlined = state3;
        this.$isFulfillmentExpanded$delegate$inlined = mutableState12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocalBrandLocationCartPresenter$models$$inlined$CollectEffect$1 localBrandLocationCartPresenter$models$$inlined$CollectEffect$1 = new LocalBrandLocationCartPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, this.$currentOpenCart$inlined, this.$currentBuyerIntentScope$inlined, this.$removingJobs$inlined, this.this$0, this.$syncTokens$inlined, this.$loadingResponse$delegate$inlined, this.$placeOrderErrors$delegate$inlined, this.$createCartViewModels$delegate$inlined, this.$dismissedBuyerIntentErrorIds$delegate$inlined, this.$openTabAddRoundState$delegate$inlined, this.$menu$delegate$inlined, this.$currentCartMode$delegate$inlined, this.$currentBuyerInfo$delegate$inlined, this.$updateCoroutineScope$inlined, this.$currentFulfillmentConfiguration$delegate$inlined, this.$orderedOpenTabItemCount$delegate$inlined, this.$currentSyncTokens$delegate$inlined, this.$location$delegate$inlined, this.$isFulfillmentExpanded$delegate$inlined);
        localBrandLocationCartPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
        return localBrandLocationCartPresenter$models$$inlined$CollectEffect$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalBrandLocationCartPresenter$models$$inlined$CollectEffect$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            final State state = this.$location$delegate$inlined;
            final MutableState mutableState = this.$isFulfillmentExpanded$delegate$inlined;
            final MutableState mutableState2 = this.$currentOpenCart$inlined;
            final MutableState mutableState3 = this.$currentBuyerIntentScope$inlined;
            final Map map = this.$removingJobs$inlined;
            final LocalBrandLocationCartPresenter localBrandLocationCartPresenter = this.this$0;
            final BrandSpotSyncTokens brandSpotSyncTokens = this.$syncTokens$inlined;
            final MutableState mutableState4 = this.$loadingResponse$delegate$inlined;
            final MutableState mutableState5 = this.$placeOrderErrors$delegate$inlined;
            final MutableState mutableState6 = this.$createCartViewModels$delegate$inlined;
            final MutableState mutableState7 = this.$dismissedBuyerIntentErrorIds$delegate$inlined;
            final MutableState mutableState8 = this.$openTabAddRoundState$delegate$inlined;
            final State state2 = this.$menu$delegate$inlined;
            final MutableState mutableState9 = this.$currentCartMode$delegate$inlined;
            final MutableState mutableState10 = this.$currentBuyerInfo$delegate$inlined;
            final CoroutineScope coroutineScope2 = this.$updateCoroutineScope$inlined;
            final State state3 = this.$currentFulfillmentConfiguration$delegate$inlined;
            final MutableState mutableState11 = this.$orderedOpenTabItemCount$delegate$inlined;
            final MutableState mutableState12 = this.$currentSyncTokens$delegate$inlined;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.cash.local.presenters.cart.LocalBrandLocationCartPresenter$models$$inlined$CollectEffect$1.1
                /* JADX WARN: Code restructure failed: missing block: B:100:0x0331, code lost:
                
                    if (r1.summary.deliveryFulfillmentSchedulingEnabled == true) goto L110;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:101:0x0347, code lost:
                
                    r0 = r20;
                    r0.setValue(java.lang.Boolean.valueOf(((java.lang.Boolean) r0.getValue()).booleanValue() ^ r15));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:108:0x0345, code lost:
                
                    if (r1.summary.pickupFulfillmentSchedulingEnabled == true) goto L110;
                 */
                /* JADX WARN: Removed duplicated region for block: B:54:0x01df  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x01ed  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj2, Continuation continuation) {
                    MarketingMessageOfferDetails marketingMessageOfferDetails;
                    String str;
                    String str2;
                    LocalCart localCart;
                    LocalCart localCart2;
                    LocalBrandLocationCartPresenter localBrandLocationCartPresenter2 = localBrandLocationCartPresenter;
                    LocalBrandLocationCartScreen localBrandLocationCartScreen = localBrandLocationCartPresenter2.screen;
                    BrandSpot brandSpot = localBrandLocationCartPresenter2.brandSpot;
                    BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationCartPresenter2.navigator;
                    LocalBrandLocationCartViewEvent localBrandLocationCartViewEvent = (LocalBrandLocationCartViewEvent) obj2;
                    MutableState mutableState13 = mutableState4;
                    if (!((Boolean) mutableState13.getValue()).booleanValue()) {
                        CartBuilder cartBuilder = (CartBuilder) mutableState2.getValue();
                        BuyerIntentScope buyerIntentScope = (BuyerIntentScope) mutableState3.getValue();
                        boolean z = localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.ItemIncrement;
                        State state4 = state2;
                        Map map2 = map;
                        MutableState mutableState14 = mutableState7;
                        MutableState mutableState15 = mutableState6;
                        MutableState mutableState16 = mutableState5;
                        MutableState mutableState17 = mutableState8;
                        if (z) {
                            LocalBrandLocationCartPresenter.models$clearPlaceOrderErrors(mutableState16, mutableState15, mutableState14, mutableState17, true);
                            CartEntry cartEntry = ((CartEntryWithQuantity) ((RealCartBuilder) cartBuilder).selections.get(((LocalBrandLocationCartViewEvent.ItemIncrement) localBrandLocationCartViewEvent).index)).getCartEntry();
                            Job job = (Job) map2.get(cartEntry);
                            if (job != null) {
                                job.cancel(null);
                            }
                            ((RealCartBuilder) cartBuilder).add(cartEntry, 1, (LocationMenu) state4.getValue(), null);
                        } else {
                            boolean z2 = localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.ItemDecrement;
                            CoroutineScope coroutineScope3 = coroutineScope;
                            if (z2) {
                                LocalBrandLocationCartPresenter.models$clearPlaceOrderErrors(mutableState16, mutableState15, mutableState14, mutableState17, true);
                                CartEntryWithQuantity remove = ((RealCartBuilder) cartBuilder).remove(((CartEntryWithQuantity) ((RealCartBuilder) cartBuilder).selections.get(((LocalBrandLocationCartViewEvent.ItemDecrement) localBrandLocationCartViewEvent).index)).getCartEntry());
                                if (remove != null && remove.getQuantity() == 0) {
                                    StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope3, null, null, new ZiplineLoader$ModuleJob$run$3(cartBuilder, remove, null, 13), 3);
                                    Job job2 = (Job) map2.get(remove.getCartEntry());
                                    if (job2 != null) {
                                        job2.cancel(null);
                                    }
                                    map2.put(remove.getCartEntry(), launch$default);
                                }
                            } else if (localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.ItemEditClicked) {
                                LocalBrandLocationCartPresenter.models$clearPlaceOrderErrors(mutableState16, mutableState15, mutableState14, mutableState17, true);
                                SnapshotStateList snapshotStateList = ((RealCartBuilder) cartBuilder).selections;
                                int i2 = ((LocalBrandLocationCartViewEvent.ItemEditClicked) localBrandLocationCartViewEvent).index;
                                CartEntry cartEntry2 = ((CartEntryWithQuantity) snapshotStateList.get(i2)).getCartEntry();
                                if (((LocationMenu) state4.getValue()) == null) {
                                    Timber.Forest.e("Menu is not loaded yet", new Object[0]);
                                } else {
                                    screenNavigator.goTo(!cartEntry2.comboSlotSelections.isEmpty() ? new LocalMenuComboDetailsScreen(localBrandLocationCartScreen.brandSpot, cartEntry2.menuItemToken, localBrandLocationCartScreen.isProfileSheetInline, null, null, new LocalMenuComboDetailsScreen.Mode.Edit(i2), localBrandLocationCartScreen.syncTokens) : new LocalMenuItemDetailsScreen(localBrandLocationCartScreen.brandSpot, cartEntry2.menuItemToken, localBrandLocationCartScreen.isProfileSheetInline, null, null, null, new LocalMenuItemDetailsScreen.Mode.EditFromCart(i2), null, localBrandLocationCartScreen.syncTokens, 920));
                                }
                            } else {
                                boolean z3 = localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.BackClicked;
                                Back back = Back.INSTANCE;
                                if (z3) {
                                    screenNavigator.goTo(back);
                                } else {
                                    boolean z4 = localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.CheckoutClicked;
                                    MutableState mutableState18 = mutableState10;
                                    State state5 = state3;
                                    if (!z4) {
                                        boolean areEqual = Intrinsics.areEqual(localBrandLocationCartViewEvent, LocalBrandLocationCartViewEvent.FinishAndPayClicked.INSTANCE);
                                        MutableState mutableState19 = mutableState12;
                                        if (areEqual) {
                                            LocalBrandLocationCartPresenter.models$clearPlaceOrderErrors(mutableState16, mutableState15, mutableState14, mutableState17, false);
                                            GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) mutableState18.getValue();
                                            cartBuilder.getClass();
                                            LocalCart localCart3 = OpenTabStateKt.activeOpenTabCartResolution(cartBuilder, buyerInfo).activeCart;
                                            if (OpenTabStateKt.getHasOpenTabRounds(localCart3)) {
                                                mutableState13.setValue(Boolean.TRUE);
                                                JobKt.launch$default(coroutineScope3, null, null, new NetworkFetcher$doFetch$fetchResult$1(11, mutableState5, localBrandLocationCartPresenter2, localCart3, buyerIntentScope, mutableState19, mutableState4, (Continuation) null), 3);
                                            }
                                        } else if (Intrinsics.areEqual(localBrandLocationCartViewEvent, LocalBrandLocationCartViewEvent.AddItemsClicked.INSTANCE)) {
                                            LocalBrandLocationCartPresenter.models$clearPlaceOrderErrors(mutableState16, mutableState15, mutableState14, mutableState17, true);
                                            screenNavigator.goTo(new LocalBrandLocationMenuScreen(localBrandLocationCartPresenter2.brandSpot, localBrandLocationCartScreen.isProfileSheetInline, null, brandSpotSyncTokens, 48));
                                        } else if (Intrinsics.areEqual(localBrandLocationCartViewEvent, LocalBrandLocationCartViewEvent.OpenTabClicked.INSTANCE)) {
                                            screenNavigator.goTo(new LocalBrandLocationOpenTabScreen(brandSpot, localBrandLocationCartScreen.attributionKey, localBrandLocationCartScreen.isProfileSheetInline, (BrandSpotSyncTokens) mutableState19.getValue()));
                                        } else {
                                            boolean z5 = localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.FulfillmentRowClicked;
                                            State state6 = state;
                                            if (z5) {
                                                FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) state5.getValue();
                                                if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Delivery) {
                                                    Location.LocationDetail locationDetail = (Location.LocationDetail) state6.getValue();
                                                    boolean z6 = locationDetail != null ? true : true;
                                                    screenNavigator.goTo(new LocalFulfillmentPickerScreen(brandSpot.brandToken, FulfillmentConfigurationKt.getType((FulfillmentConfiguration) state5.getValue()), (FulfillmentConfiguration) state5.getValue(), new LocalBrandProfileScreen(new BrandSpot(brandSpot.brandToken, null), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, brandSpotSyncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                                                } else {
                                                    if (fulfillmentConfiguration instanceof FulfillmentConfiguration.Pickup) {
                                                        Location.LocationDetail locationDetail2 = (Location.LocationDetail) state6.getValue();
                                                        if (locationDetail2 != null) {
                                                        }
                                                    } else if (!(fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) && !Intrinsics.areEqual(fulfillmentConfiguration, FulfillmentConfiguration.Unspecified.INSTANCE) && fulfillmentConfiguration != null) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    screenNavigator.goTo(new LocalFulfillmentPickerScreen(brandSpot.brandToken, FulfillmentConfigurationKt.getType((FulfillmentConfiguration) state5.getValue()), (FulfillmentConfiguration) state5.getValue(), new LocalBrandProfileScreen(new BrandSpot(brandSpot.brandToken, null), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, brandSpotSyncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                                                }
                                            } else if (localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.FulfillmentRowAsapClicked) {
                                                Location.LocationDetail locationDetail3 = (Location.LocationDetail) state6.getValue();
                                                locationDetail3.getClass();
                                                LocalBrandLocationCartPresenter.m1218access$logClickSchedulingTypehYjS5Xw(localBrandLocationCartPresenter2, locationDetail3.summary.token, ((RealCartBuilder) cartBuilder).checkoutFlowToken, (FulfillmentConfiguration) state5.getValue(), SchedulingType.ASAP);
                                                JobKt.launch$default(coroutineScope3, null, null, new LocalBrandLocationCartPresenter$models$8$4(localBrandLocationCartPresenter2, null, 0), 3);
                                            } else if (localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.FulfillmentRowLaterClicked) {
                                                Location.LocationDetail locationDetail4 = (Location.LocationDetail) state6.getValue();
                                                locationDetail4.getClass();
                                                LocalBrandLocationCartPresenter.m1218access$logClickSchedulingTypehYjS5Xw(localBrandLocationCartPresenter2, locationDetail4.summary.token, ((RealCartBuilder) cartBuilder).checkoutFlowToken, (FulfillmentConfiguration) state5.getValue(), SchedulingType.LATER);
                                                screenNavigator.askQuestion(new SchedulingDayTimeQuestion(), new AbstractTypeChecker$$Lambda$0(localBrandLocationCartPresenter2, cartBuilder, state6, state5, 2));
                                            } else if (localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.FulfillmentRowChangeLocationClicked) {
                                                screenNavigator.goTo(new LocalFulfillmentPickerScreen(brandSpot.brandToken, FulfillmentConfigurationKt.getType((FulfillmentConfiguration) state5.getValue()), (FulfillmentConfiguration) state5.getValue(), new LocalBrandProfileScreen(brandSpot.clearLocation(), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, brandSpotSyncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                                            } else if (localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.FulfillmentRowSwitchType) {
                                                screenNavigator.goTo(new LocalFulfillmentPickerScreen(brandSpot.brandToken, ((LocalBrandLocationCartViewEvent.FulfillmentRowSwitchType) localBrandLocationCartViewEvent).f918type, (FulfillmentConfiguration) state5.getValue(), new LocalBrandProfileScreen(brandSpot.clearLocation(), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, brandSpotSyncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                                            } else {
                                                if (localBrandLocationCartViewEvent instanceof CartItemCounterViewEvent) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("Cart doesn't support CartItemCounterViewEvent's");
                                                    return null;
                                                }
                                                if (localBrandLocationCartViewEvent instanceof LocalBrandBannerEvent$Clicked) {
                                                    Analytics analytics = localBrandLocationCartPresenter2.analytics;
                                                    BrandSpot brandSpot2 = localBrandLocationCartScreen.brandSpot;
                                                    String str3 = brandSpot2.brandToken;
                                                    String str4 = brandSpot2.locationToken;
                                                    LocalBrandBannerEvent$Clicked localBrandBannerEvent$Clicked = (LocalBrandBannerEvent$Clicked) localBrandLocationCartViewEvent;
                                                    analytics.track(new LocalClientBannerInteraction(str3, str4 == null ? null : str4, BannerLocation.CART, AnalyticsKt.toBannerType(localBrandBannerEvent$Clicked.f914type), LocalClientBannerInteraction.InteractionType.Action), null);
                                                    LocalBrandBanner.Action action = localBrandBannerEvent$Clicked.action;
                                                    if (action instanceof LocalBrandBanner.Action.ApplySingleOffer) {
                                                        LocationMenu locationMenu = (LocationMenu) state4.getValue();
                                                        if (locationMenu != null) {
                                                            LocalBrandBanner.Action.ApplySingleOffer applySingleOffer = (LocalBrandBanner.Action.ApplySingleOffer) action;
                                                            String str5 = applySingleOffer.offerToken;
                                                            String str6 = applySingleOffer.discountCode;
                                                            List list = applySingleOffer.cartLines;
                                                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                                            Iterator it = list.iterator();
                                                            while (it.hasNext()) {
                                                                arrayList.add(CartBuilderKt.m1203toCartEntryWithQuantityNvqXVjw((LocalCart.Line) it.next(), locationMenu, str5));
                                                            }
                                                            ((RealCartBuilder) cartBuilder).applyOffer(new DiscountCode.BannerOffer(str6, str5, arrayList));
                                                        }
                                                    } else if (!(action instanceof LocalBrandBanner.Action.ShowLoyaltyRewards)) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                } else {
                                                    if ((localBrandLocationCartViewEvent instanceof LocalBrandBannerEvent$Dismissed) || (localBrandLocationCartViewEvent instanceof LocalBrandBannerEvent$Toggled)) {
                                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Banner cannot be ", Reflection.factory.getOrCreateKotlinClass(localBrandLocationCartViewEvent.getClass()).getSimpleName(), " in the cart view");
                                                        return null;
                                                    }
                                                    if (Intrinsics.areEqual(localBrandLocationCartViewEvent, LocalBrandLocationCartViewEvent.TermsClicked.INSTANCE)) {
                                                        SnapshotStateList snapshotStateList2 = ((RealCartBuilder) cartBuilder).discountCodes;
                                                        ArrayList arrayList2 = new ArrayList();
                                                        ListIterator listIterator = snapshotStateList2.listIterator();
                                                        while (true) {
                                                            StateListIterator stateListIterator = (StateListIterator) listIterator;
                                                            if (!stateListIterator.hasNext()) {
                                                                break;
                                                            }
                                                            Object next = stateListIterator.next();
                                                            if (next instanceof DiscountCode.MarketingOffer) {
                                                                arrayList2.add(next);
                                                            }
                                                        }
                                                        DiscountCode.MarketingOffer marketingOffer = (DiscountCode.MarketingOffer) CollectionsKt.firstOrNull((List) arrayList2);
                                                        if (marketingOffer != null && (marketingMessageOfferDetails = marketingOffer.offerDetails) != null && (str = marketingMessageOfferDetails.termsUrl) != null) {
                                                            localBrandLocationCartPresenter2.launcher.openWeb(screenNavigator, str);
                                                        }
                                                    } else {
                                                        if (!(localBrandLocationCartViewEvent instanceof LocalBrandLocationCartViewEvent.CartErrorBannerDismissed)) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                        }
                                                        List list2 = (List) mutableState16.getValue();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (Object obj3 : list2) {
                                                            if (!((CreateCartErrorViewModel) obj3).id.equals(((LocalBrandLocationCartViewEvent.CartErrorBannerDismissed) localBrandLocationCartViewEvent).id)) {
                                                                arrayList3.add(obj3);
                                                            }
                                                        }
                                                        mutableState16.setValue(arrayList3);
                                                        Map map3 = (Map) mutableState15.getValue();
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map3.size()));
                                                        for (Map.Entry entry : map3.entrySet()) {
                                                            Object key = entry.getKey();
                                                            List list3 = (List) entry.getValue();
                                                            ArrayList arrayList4 = new ArrayList();
                                                            for (Object obj4 : list3) {
                                                                if (!((CreateCartErrorViewModel) obj4).id.equals(((LocalBrandLocationCartViewEvent.CartErrorBannerDismissed) localBrandLocationCartViewEvent).id)) {
                                                                    arrayList4.add(obj4);
                                                                }
                                                            }
                                                            linkedHashMap.put(key, arrayList4);
                                                        }
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                                            if (!((List) entry2.getValue()).isEmpty()) {
                                                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                                            }
                                                        }
                                                        mutableState15.setValue(linkedHashMap2);
                                                        mutableState14.setValue(SetsKt___SetsKt.plus((Set) mutableState14.getValue(), new CreateCartErrorViewModel.ErrorId(((LocalBrandLocationCartViewEvent.CartErrorBannerDismissed) localBrandLocationCartViewEvent).id)));
                                                    }
                                                }
                                            }
                                        }
                                    } else if (((LocalBrandLocationCartViewModel.Mode) mutableState9.getValue()) == LocalBrandLocationCartViewModel.Mode.ADD_TO_OPEN_TAB) {
                                        ListIterator listIterator2 = ((RealCartBuilder) cartBuilder).selections.listIterator();
                                        int i3 = 0;
                                        while (true) {
                                            StateListIterator stateListIterator2 = (StateListIterator) listIterator2;
                                            if (!stateListIterator2.hasNext()) {
                                                break;
                                            }
                                            i3 += ((CartEntryWithQuantity) stateListIterator2.next()).getQuantity();
                                        }
                                        if (i3 != 0) {
                                            int attemptId = ((OpenTabAddRoundState) mutableState17.getValue()).getAttemptId() + 1;
                                            GetBuyerInfoResponse.BuyerInfo buyerInfo2 = (GetBuyerInfoResponse.BuyerInfo) mutableState18.getValue();
                                            LocalCart localCart4 = buyerInfo2 != null ? buyerInfo2.active_cart : null;
                                            OpenTabCartOverride openTabCartOverride = (OpenTabCartOverride) ((RealCartBuilder) cartBuilder).openTabCartOverrideState.getValue();
                                            if (openTabCartOverride != null) {
                                                LocalCart localCart5 = openTabCartOverride.cart;
                                                if (localCart4 == null || (Intrinsics.areEqual(localCart4.token, localCart5.token) && ((str2 = localCart4.version) == null || str2.equals(openTabCartOverride.staleBuyerInfoCartVersion) || str2.equals(openTabCartOverride.submittedCartVersion) || str2.equals(localCart5.version)))) {
                                                    localCart = localCart5;
                                                    GetBuyerInfoResponse.BuyerInfo buyerInfo3 = (GetBuyerInfoResponse.BuyerInfo) mutableState18.getValue();
                                                    String str7 = (buyerInfo3 != null || (localCart2 = buyerInfo3.active_cart) == null) ? null : localCart2.version;
                                                    if (localCart != null) {
                                                        LocalBrandLocationCartPresenter.models$clearPlaceOrderErrors(mutableState16, mutableState15, mutableState14, mutableState17, false);
                                                        mutableState17.setValue(new OpenTabAddRoundState.Failure(attemptId));
                                                    } else {
                                                        mutableState13.setValue(Boolean.TRUE);
                                                        LocalBrandLocationCartPresenter.models$clearPlaceOrderErrors(mutableState16, mutableState15, mutableState14, mutableState17, false);
                                                        mutableState17.setValue(new OpenTabAddRoundState.Ordering(i3, attemptId));
                                                        JobKt.launch$default(coroutineScope3, null, null, new LocalBrandLocationCartPresenter$models$8$1(localBrandLocationCartPresenter2, localCart, cartBuilder, attemptId, str7, i3, coroutineScope2, mutableState6, mutableState17, mutableState4, null), 3);
                                                    }
                                                }
                                            }
                                            localCart = localCart4;
                                            GetBuyerInfoResponse.BuyerInfo buyerInfo32 = (GetBuyerInfoResponse.BuyerInfo) mutableState18.getValue();
                                            if (buyerInfo32 != null) {
                                            }
                                            if (localCart != null) {
                                            }
                                        }
                                    } else {
                                        ListIterator listIterator3 = ((RealCartBuilder) cartBuilder).selections.listIterator();
                                        int i4 = 0;
                                        while (true) {
                                            StateListIterator stateListIterator3 = (StateListIterator) listIterator3;
                                            if (!stateListIterator3.hasNext()) {
                                                break;
                                            }
                                            i4 += ((CartEntryWithQuantity) stateListIterator3.next()).getQuantity();
                                        }
                                        if (i4 == 0) {
                                            screenNavigator.goTo(back);
                                        } else if (((FulfillmentConfiguration) state5.getValue()) == null) {
                                            Timber.Forest.i("Fulfillment isn't ready.", new Object[0]);
                                        } else {
                                            mutableState11.setValue(Integer.valueOf(i4));
                                            mutableState13.setValue(Boolean.TRUE);
                                            JobKt.launch$default(coroutineScope3, null, null, new FormBlockerPresenter$models$3$1(localBrandLocationCartPresenter2, buyerIntentScope, i4, cartBuilder, brandSpotSyncTokens, state5, mutableState4, mutableState11, mutableState6, null), 3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (this.$flow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
