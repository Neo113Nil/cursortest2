package app.cash.local.presenters.brand.profile;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealLocalBrandProfileBannerDismissalTracker;
import app.cash.local.backend.real.RealLocalBrandProfileCheckedInSheetTracker;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.brand.profile.ProfileBottomModalAction;
import app.cash.local.presenters.internal.AnalyticsKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.LocationToken;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.screens.app.LocalMarketingMessageScreen;
import app.cash.local.screens.app.LocalMarketingMessagesScreen;
import app.cash.local.screens.app.LocalMenuComboDetailsScreen;
import app.cash.local.screens.app.LocalMenuItemDetailsScreen;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.screens.app.MenuPickerQuestion;
import app.cash.local.screens.app.SchedulingDayTimeQuestion;
import app.cash.local.viewmodels.BrandFollowViewEvent$Toggled;
import app.cash.local.viewmodels.CartItemCounterViewEvent;
import app.cash.local.viewmodels.FulfillmentOptionsMenuEvent;
import app.cash.local.viewmodels.LocalBottomModalViewEvent;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Clicked;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Dismissed;
import app.cash.local.viewmodels.LocalBrandBannerEvent$Toggled;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.MapDecisionEvent;
import app.cash.local.viewmodels.MoreOptionsMenuEvent;
import app.cash.local.viewmodels.PhoneRowEvent$PhoneClicked;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.cdf.localclient.BannerLocation;
import com.squareup.cash.cdf.localclient.FulfillmentType;
import com.squareup.cash.cdf.localclient.LocalClientBannerInteraction;
import com.squareup.cash.cdf.localclient.LocalClientFulfillmentFlowClickSchedulingType;
import com.squareup.cash.cdf.localclient.SchedulingType;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalPhone;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandProfilePresenter$models$$inlined$CollectEffect$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $bannerDismissed$delegate$inlined;
    public final /* synthetic */ State $brand$delegate$inlined;
    public final /* synthetic */ MutableSharedFlow $brandFollowEvents$inlined;
    public final /* synthetic */ RealCartBuilder $cart$inlined;
    public final /* synthetic */ MutableState $currentBottomModalActions$delegate$inlined;
    public final /* synthetic */ MutableState $currentBrandState$delegate$inlined;
    public final /* synthetic */ MutableState $currentCheckedInSheetSessionId$delegate$inlined;
    public final /* synthetic */ MutableState $currentLocationToken$delegate$inlined;
    public final /* synthetic */ MutableState $currentModel$delegate$inlined;
    public final /* synthetic */ MutableState $currentSelectedFulfillmentConfiguration$delegate$inlined;
    public final /* synthetic */ MutableState $currentSyncTokens$delegate$inlined;
    public final /* synthetic */ State $effectiveBrandSpot$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ MutableState $inStoreOrderingTokenCleared$delegate$inlined;
    public final /* synthetic */ MutableState $invalidCouponToast$delegate$inlined;
    public final /* synthetic */ State $location$delegate$inlined;
    public final /* synthetic */ MutableState $marketingMessages$delegate$inlined;
    public final /* synthetic */ MutableState $realBrandToken$delegate$inlined;
    public final /* synthetic */ State $reorderableSelections$delegate$inlined;
    public final /* synthetic */ MutableState $requiresFulfillmentConfirmation$delegate$inlined;
    public final /* synthetic */ MutableState $selectedHoursFulfillmentType$delegate$inlined;
    public final /* synthetic */ MutableState $selectedMenu$delegate$inlined;
    public final /* synthetic */ MutableState $showMapDecisionSheet$delegate$inlined;
    public final /* synthetic */ MutableState $showOfferToast$delegate$inlined;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ LocalBrandProfilePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandProfilePresenter$models$$inlined$CollectEffect$2(Flow flow, Continuation continuation, LocalBrandProfilePresenter localBrandProfilePresenter, MutableSharedFlow mutableSharedFlow, RealCartBuilder realCartBuilder, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableState mutableState3, State state3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, State state4, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16, MutableState mutableState17) {
        super(2, continuation);
        this.$flow = flow;
        this.this$0 = localBrandProfilePresenter;
        this.$brandFollowEvents$inlined = mutableSharedFlow;
        this.$cart$inlined = realCartBuilder;
        this.$currentBottomModalActions$delegate$inlined = mutableState;
        this.$effectiveBrandSpot$delegate$inlined = state;
        this.$currentSyncTokens$delegate$inlined = mutableState2;
        this.$location$delegate$inlined = state2;
        this.$showMapDecisionSheet$delegate$inlined = mutableState3;
        this.$brand$delegate$inlined = state3;
        this.$requiresFulfillmentConfirmation$delegate$inlined = mutableState4;
        this.$realBrandToken$delegate$inlined = mutableState5;
        this.$currentSelectedFulfillmentConfiguration$delegate$inlined = mutableState6;
        this.$currentCheckedInSheetSessionId$delegate$inlined = mutableState7;
        this.$selectedMenu$delegate$inlined = mutableState8;
        this.$reorderableSelections$delegate$inlined = state4;
        this.$currentLocationToken$delegate$inlined = mutableState9;
        this.$currentModel$delegate$inlined = mutableState10;
        this.$inStoreOrderingTokenCleared$delegate$inlined = mutableState11;
        this.$currentBrandState$delegate$inlined = mutableState12;
        this.$bannerDismissed$delegate$inlined = mutableState13;
        this.$marketingMessages$delegate$inlined = mutableState14;
        this.$showOfferToast$delegate$inlined = mutableState15;
        this.$invalidCouponToast$delegate$inlined = mutableState16;
        this.$selectedHoursFulfillmentType$delegate$inlined = mutableState17;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocalBrandProfilePresenter$models$$inlined$CollectEffect$2 localBrandProfilePresenter$models$$inlined$CollectEffect$2 = new LocalBrandProfilePresenter$models$$inlined$CollectEffect$2(this.$flow, continuation, this.this$0, this.$brandFollowEvents$inlined, this.$cart$inlined, this.$currentBottomModalActions$delegate$inlined, this.$effectiveBrandSpot$delegate$inlined, this.$currentSyncTokens$delegate$inlined, this.$location$delegate$inlined, this.$showMapDecisionSheet$delegate$inlined, this.$brand$delegate$inlined, this.$requiresFulfillmentConfirmation$delegate$inlined, this.$realBrandToken$delegate$inlined, this.$currentSelectedFulfillmentConfiguration$delegate$inlined, this.$currentCheckedInSheetSessionId$delegate$inlined, this.$selectedMenu$delegate$inlined, this.$reorderableSelections$delegate$inlined, this.$currentLocationToken$delegate$inlined, this.$currentModel$delegate$inlined, this.$inStoreOrderingTokenCleared$delegate$inlined, this.$currentBrandState$delegate$inlined, this.$bannerDismissed$delegate$inlined, this.$marketingMessages$delegate$inlined, this.$showOfferToast$delegate$inlined, this.$invalidCouponToast$delegate$inlined, this.$selectedHoursFulfillmentType$delegate$inlined);
        localBrandProfilePresenter$models$$inlined$CollectEffect$2.L$0 = obj;
        return localBrandProfilePresenter$models$$inlined$CollectEffect$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalBrandProfilePresenter$models$$inlined$CollectEffect$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            final MutableState mutableState = this.$invalidCouponToast$delegate$inlined;
            final MutableState mutableState2 = this.$selectedHoursFulfillmentType$delegate$inlined;
            final LocalBrandProfilePresenter localBrandProfilePresenter = this.this$0;
            final MutableSharedFlow mutableSharedFlow = this.$brandFollowEvents$inlined;
            final RealCartBuilder realCartBuilder = this.$cart$inlined;
            final MutableState mutableState3 = this.$currentBottomModalActions$delegate$inlined;
            final State state = this.$effectiveBrandSpot$delegate$inlined;
            final MutableState mutableState4 = this.$currentSyncTokens$delegate$inlined;
            final State state2 = this.$location$delegate$inlined;
            final MutableState mutableState5 = this.$showMapDecisionSheet$delegate$inlined;
            final State state3 = this.$brand$delegate$inlined;
            final MutableState mutableState6 = this.$requiresFulfillmentConfirmation$delegate$inlined;
            final MutableState mutableState7 = this.$realBrandToken$delegate$inlined;
            final MutableState mutableState8 = this.$currentSelectedFulfillmentConfiguration$delegate$inlined;
            final MutableState mutableState9 = this.$currentCheckedInSheetSessionId$delegate$inlined;
            final MutableState mutableState10 = this.$selectedMenu$delegate$inlined;
            final State state4 = this.$reorderableSelections$delegate$inlined;
            final MutableState mutableState11 = this.$currentLocationToken$delegate$inlined;
            final MutableState mutableState12 = this.$currentModel$delegate$inlined;
            final MutableState mutableState13 = this.$inStoreOrderingTokenCleared$delegate$inlined;
            final MutableState mutableState14 = this.$currentBrandState$delegate$inlined;
            final MutableState mutableState15 = this.$bannerDismissed$delegate$inlined;
            final MutableState mutableState16 = this.$marketingMessages$delegate$inlined;
            final MutableState mutableState17 = this.$showOfferToast$delegate$inlined;
            FlowCollector flowCollector = new FlowCollector() { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$models$$inlined$CollectEffect$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Location.LocationDetail locationDetail;
                    String str;
                    String str2;
                    FulfillmentType fulfillmentType;
                    FulfillmentType fulfillmentType2;
                    Object obj3;
                    Screen localMenuItemDetailsScreen;
                    Object value;
                    Object value2;
                    LocalBrandProfilePresenter localBrandProfilePresenter2 = localBrandProfilePresenter;
                    RealLocalBrandProfileCheckedInSheetTracker realLocalBrandProfileCheckedInSheetTracker = localBrandProfilePresenter2.checkedInSheetTracker;
                    Analytics analytics = localBrandProfilePresenter2.analytics;
                    RealLocalLauncher realLocalLauncher = localBrandProfilePresenter2.launcher;
                    LocalBrandProfileScreen localBrandProfileScreen = localBrandProfilePresenter2.screen;
                    BetterNavigator.ScreenNavigator screenNavigator = localBrandProfilePresenter2.navigator;
                    LocalBrandProfileViewEvent localBrandProfileViewEvent = (LocalBrandProfileViewEvent) obj2;
                    if (localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.BackClicked) {
                        screenNavigator.goTo(Back.INSTANCE);
                    } else {
                        boolean z = localBrandProfileViewEvent instanceof LocalBottomModalViewEvent.CtaClicked;
                        MutableState mutableState18 = mutableState4;
                        State state5 = state;
                        Object obj4 = null;
                        if (z) {
                            ProfileBottomModalAction profileBottomModalAction = (ProfileBottomModalAction) CollectionsKt.getOrNull(((LocalBottomModalViewEvent.CtaClicked) localBrandProfileViewEvent).index, (List) mutableState3.getValue());
                            if (profileBottomModalAction instanceof ProfileBottomModalAction.ViewOrder) {
                                screenNavigator.goTo(new LocalOrderStatusScreen((LocalOrderStatusScreen.Type) new LocalOrderStatusScreen.Type.Preloaded(((ProfileBottomModalAction.ViewOrder) profileBottomModalAction).order), false, 6));
                            } else if (Intrinsics.areEqual(profileBottomModalAction, ProfileBottomModalAction.StartOrder.INSTANCE)) {
                                BrandSpot brandSpot = (BrandSpot) state5.getValue();
                                AttributionKey attributionKey = localBrandProfileScreen.attributionKey;
                                boolean z2 = localBrandProfileScreen.isEmbeddedInSheet;
                                screenNavigator.goTo(new LocalBrandLocationMenuScreen(brandSpot, null, null, z2, attributionKey, !z2, (BrandSpotSyncTokens) mutableState18.getValue()));
                            } else {
                                if (!Intrinsics.areEqual(profileBottomModalAction, ProfileBottomModalAction.ViewCart.INSTANCE) && profileBottomModalAction != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                screenNavigator.goTo(new LocalBrandLocationCartScreen((BrandSpot) state5.getValue(), localBrandProfileScreen.attributionKey, localBrandProfileScreen.isEmbeddedInSheet, null, null, (BrandSpotSyncTokens) mutableState18.getValue(), 24));
                            }
                        } else if (!(localBrandProfileViewEvent instanceof LocalBottomModalViewEvent.BottomModalLinkClicked)) {
                            boolean z3 = localBrandProfileViewEvent instanceof PhoneRowEvent$PhoneClicked;
                            State state6 = state2;
                            if (z3) {
                                Location.LocationDetail locationDetail2 = (Location.LocationDetail) state6.getValue();
                                locationDetail2.getClass();
                                LocalPhone localPhone = locationDetail2.summary.phone;
                                localPhone.getClass();
                                String str3 = localPhone.e164;
                                str3.getClass();
                                realLocalLauncher.openTel(str3);
                            } else {
                                boolean z4 = localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.LocationAddressClicked;
                                MutableState mutableState19 = mutableState5;
                                if (!z4 && !(localBrandProfileViewEvent instanceof FulfillmentOptionsMenuEvent.GetDirections)) {
                                    boolean z5 = localBrandProfileViewEvent instanceof MapDecisionEvent;
                                    State state7 = state3;
                                    if (z5) {
                                        MapDecisionEvent mapDecisionEvent = (MapDecisionEvent) localBrandProfileViewEvent;
                                        Location.LocationDetail locationDetail3 = (Location.LocationDetail) state6.getValue();
                                        locationDetail3.getClass();
                                        Location.LocationSummary locationSummary = locationDetail3.summary;
                                        String str4 = ((Brand) state7.getValue()).name;
                                        RealClipboardManager realClipboardManager = localBrandProfilePresenter2.clipboardManager;
                                        AndroidStringManager androidStringManager = localBrandProfilePresenter2.stringManager;
                                        str4.getClass();
                                        if (!mapDecisionEvent.equals(MapDecisionEvent.Cancel.INSTANCE)) {
                                            if (mapDecisionEvent.equals(MapDecisionEvent.CopyAddress.INSTANCE)) {
                                                Resources resources = androidStringManager.resources;
                                                resources.getClass();
                                                String format2 = new MessageFormat(resources.getString(R.string.local_presenters_location_address)).format(new Object[]{str4});
                                                format2.getClass();
                                                LocalAddress localAddress = locationSummary.address;
                                                localAddress.getClass();
                                                realClipboardManager.copy(format2, LocalsKt.formattedFull(localAddress));
                                            } else {
                                                if (!mapDecisionEvent.equals(MapDecisionEvent.OpenGoogleMap.INSTANCE)) {
                                                    if (mapDecisionEvent.equals(MapDecisionEvent.CopyPhone.INSTANCE)) {
                                                        Path$$ExternalSyntheticBUOutline0.m$1(mapDecisionEvent, "Unexpected event ");
                                                        return null;
                                                    }
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                LocalAddress localAddress2 = locationSummary.address;
                                                localAddress2.getClass();
                                                String formattedFull = LocalsKt.formattedFull(localAddress2);
                                                LocalAddress localAddress3 = locationSummary.address;
                                                localAddress3.getClass();
                                                realLocalLauncher.openMap(locationSummary.name + " " + formattedFull, localAddress3.google_place_id);
                                            }
                                        }
                                        mutableState19.setValue(Boolean.FALSE);
                                    } else if (localBrandProfileViewEvent instanceof MoreOptionsMenuEvent.AddBrandClicked) {
                                        StateFlowKt.emitOrThrow(mutableSharedFlow, BrandFollowViewEvent$Toggled.INSTANCE);
                                    } else if (localBrandProfileViewEvent instanceof MoreOptionsMenuEvent.ShareProfile) {
                                        String str5 = ((Brand) state7.getValue()).name;
                                        String str6 = ((Brand) state7.getValue()).shareLinkUrl;
                                        str6.getClass();
                                        realLocalLauncher.shareUri(str5, str6);
                                    } else {
                                        boolean z6 = localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.MenuCategoryClicked;
                                        MutableState mutableState20 = mutableState6;
                                        MutableState mutableState21 = mutableState8;
                                        MutableState mutableState22 = mutableState7;
                                        if (z6) {
                                            LocalBrandProfileViewEvent.MenuCategoryClicked menuCategoryClicked = (LocalBrandProfileViewEvent.MenuCategoryClicked) localBrandProfileViewEvent;
                                            LocalBrandProfilePresenter.m1216access$navigateToMenuWEME8JM(localBrandProfilePresenter2, (BrandSpot) state5.getValue(), menuCategoryClicked.menu, menuCategoryClicked.token, (BrandSpotSyncTokens) mutableState18.getValue(), ((Boolean) mutableState20.getValue()).booleanValue(), LocalBrandProfilePresenter.models$lambda$9(mutableState22), (FulfillmentConfiguration) mutableState21.getValue());
                                        } else {
                                            boolean z7 = localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.StartOrderingClicked;
                                            MutableState mutableState23 = mutableState9;
                                            if (z7) {
                                                String str7 = (String) mutableState23.getValue();
                                                if (str7 != null) {
                                                    StateFlowImpl stateFlowImpl = realLocalBrandProfileCheckedInSheetTracker.mutableHandledSessionIds;
                                                    do {
                                                        value2 = stateFlowImpl.getValue();
                                                    } while (!stateFlowImpl.compareAndSet(value2, SetsKt___SetsKt.plus((Set) value2, str7)));
                                                }
                                                BrandSpot brandSpot2 = (BrandSpot) state5.getValue();
                                                LocationMenu.Menu menu = (LocationMenu.Menu) mutableState10.getValue();
                                                LocalBrandProfilePresenter.m1216access$navigateToMenuWEME8JM(localBrandProfilePresenter2, brandSpot2, menu != null ? menu.token : null, null, (BrandSpotSyncTokens) mutableState18.getValue(), ((Boolean) mutableState20.getValue()).booleanValue(), LocalBrandProfilePresenter.models$lambda$9(mutableState22), (FulfillmentConfiguration) mutableState21.getValue());
                                            } else if (localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.CheckedInSheetDismissed) {
                                                String str8 = (String) mutableState23.getValue();
                                                if (str8 != null) {
                                                    StateFlowImpl stateFlowImpl2 = realLocalBrandProfileCheckedInSheetTracker.mutableHandledSessionIds;
                                                    do {
                                                        value = stateFlowImpl2.getValue();
                                                    } while (!stateFlowImpl2.compareAndSet(value, SetsKt___SetsKt.plus((Set) value, str8)));
                                                }
                                            } else if (localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.MenuSelectorClicked) {
                                                Location.LocationDetail locationDetail4 = (Location.LocationDetail) state6.getValue();
                                                locationDetail4.getClass();
                                                LocationMenu locationMenu = locationDetail4.menu;
                                                if (locationMenu != null) {
                                                    screenNavigator.askQuestion(new MenuPickerQuestion(), new CachedPageEventFlow$$ExternalSyntheticLambda0(locationMenu, 22));
                                                }
                                            } else if (localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.MenuItemClicked) {
                                                Iterator it = ((List) state4.getValue()).iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        obj3 = null;
                                                        break;
                                                    }
                                                    obj3 = it.next();
                                                    if (Intrinsics.areEqual(((LocalCart.Line.Selection) obj3).menu_item_token, ((LocalBrandProfileViewEvent.MenuItemClicked) localBrandProfileViewEvent).token)) {
                                                        break;
                                                    }
                                                }
                                                LocalCart.Line.Selection selection = (LocalCart.Line.Selection) obj3;
                                                if (selection != null) {
                                                    Location.LocationDetail locationDetail5 = (Location.LocationDetail) state6.getValue();
                                                    locationDetail5.getClass();
                                                    LocationMenu locationMenu2 = locationDetail5.menu;
                                                    locationMenu2.getClass();
                                                    BrandSpot brandSpot3 = (BrandSpot) state5.getValue();
                                                    BrandSpotSyncTokens brandSpotSyncTokens = (BrandSpotSyncTokens) mutableState18.getValue();
                                                    Integer num = new Integer(((LocalBrandProfileViewEvent.MenuItemClicked) localBrandProfileViewEvent).index);
                                                    String str9 = selection.menu_item_token;
                                                    str9.getClass();
                                                    boolean isEmpty = selection.combo_slots.isEmpty();
                                                    LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = new LocalClientCartMenuItemAddedContext(brandSpot3.brandToken, brandSpot3.locationToken, !selection.combo_slots.isEmpty() ? new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData(CollectionsKt.joinToString$default(selection.combo_slots, ",", null, null, 0, null, new LocationMenu$$ExternalSyntheticLambda6(4), 30)) : LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.NonComboItemContextData.INSTANCE, null, null, null, Long.valueOf(num.intValue()), LocalClientCartMenuItemAddedContext.ReorderableSelectionSource.BRAND_PROFILE, 56);
                                                    if (isEmpty) {
                                                        boolean z8 = localBrandProfileScreen.isEmbeddedInSheet;
                                                        String str10 = selection.menu_item_variation_token;
                                                        String str11 = str10 != null ? str10 : null;
                                                        List<LocalCart.Line.Selection.Modifier> list = selection.modifiers;
                                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                                        for (LocalCart.Line.Selection.Modifier modifier : list) {
                                                            String str12 = modifier.menu_item_modifier_token;
                                                            str12.getClass();
                                                            arrayList.add(new CartEntry.ModifierSelection(modifier.quantity, locationMenu2.m1247modifierListWithModifierQkZh8Tc(str12).token, str12));
                                                        }
                                                        List<LocalCart.Line.Selection.TextModifier> list2 = selection.text_modifiers;
                                                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                                        for (LocalCart.Line.Selection.TextModifier textModifier : list2) {
                                                            String str13 = textModifier.menu_item_menu_modifier_token;
                                                            str13.getClass();
                                                            String str14 = textModifier.inputted_text;
                                                            if (str14 == null) {
                                                                str14 = "";
                                                            }
                                                            arrayList2.add(new CartEntry.ModifierFreeEntry(str13, str14));
                                                        }
                                                        localMenuItemDetailsScreen = new LocalMenuItemDetailsScreen(brandSpot3, str9, z8, null, null, localClientCartMenuItemAddedContext, new LocalMenuItemDetailsScreen.Mode.Add(str11, arrayList, arrayList2), null, brandSpotSyncTokens, 920);
                                                    } else {
                                                        localMenuItemDetailsScreen = new LocalMenuComboDetailsScreen(brandSpot3, str9, localBrandProfileScreen.isEmbeddedInSheet, null, localClientCartMenuItemAddedContext, new LocalMenuComboDetailsScreen.Mode.Add(selection.combo_slots), brandSpotSyncTokens);
                                                    }
                                                    screenNavigator.goTo(localMenuItemDetailsScreen);
                                                }
                                            } else if (!(localBrandProfileViewEvent instanceof CartItemCounterViewEvent.Decrement) && !(localBrandProfileViewEvent instanceof CartItemCounterViewEvent.Increment) && !(localBrandProfileViewEvent instanceof CartItemCounterViewEvent.Trash)) {
                                                if (localBrandProfileViewEvent instanceof FulfillmentOptionsMenuEvent.ChangeLocation) {
                                                    String models$lambda$9 = LocalBrandProfilePresenter.models$lambda$9(mutableState22);
                                                    models$lambda$9.getClass();
                                                    FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) mutableState21.getValue();
                                                    BrandSpot brandSpot4 = (BrandSpot) state5.getValue();
                                                    BrandSpotSyncTokens brandSpotSyncTokens2 = (BrandSpotSyncTokens) mutableState18.getValue();
                                                    brandSpot4.getClass();
                                                    brandSpotSyncTokens2.getClass();
                                                    screenNavigator.goTo(new LocalFulfillmentPickerScreen(models$lambda$9, FulfillmentConfigurationKt.getType(fulfillmentConfiguration), fulfillmentConfiguration, new LocalBrandProfileScreen(brandSpot4.clearLocation(), (AttributionKey) null, (MarketingMessageOfferDetails) null, (String) null, (String) null, brandSpotSyncTokens2, (String) null, EnumC0170g.SDK_ASSET_ICON_SUBTRACT_VALUE)));
                                                } else if (localBrandProfileViewEvent instanceof FulfillmentOptionsMenuEvent.ChangeTableClicked) {
                                                    RealRouter.route$default(localBrandProfilePresenter2.routerFactory.create$1(screenNavigator), new ClientRoute.ViewNeighborhoodsTableQrCodeScanner(ClientRoute.ViewNeighborhoodsTableQrCodeScanner.spec, ClientRoute.ViewNeighborhoodsTableQrCodeScanner.deepLinkSpecs, null));
                                                } else {
                                                    boolean z9 = localBrandProfileViewEvent instanceof FulfillmentOptionsMenuEvent.ScheduleOrderClicked;
                                                    RealCartBuilder realCartBuilder2 = realCartBuilder;
                                                    if (z9) {
                                                        String models$lambda$92 = LocalBrandProfilePresenter.models$lambda$9(mutableState22);
                                                        if (models$lambda$92 != null && (locationDetail = (Location.LocationDetail) state6.getValue()) != null) {
                                                            String str15 = locationDetail.summary.token;
                                                            FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) mutableState21.getValue();
                                                            if (fulfillmentConfiguration2 != null) {
                                                                BrandSpot brandSpot5 = (BrandSpot) state5.getValue();
                                                                String str16 = realCartBuilder2.checkoutFlowToken;
                                                                SnapshotStateList snapshotStateList = realCartBuilder2.selections;
                                                                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                                                                ListIterator listIterator = snapshotStateList.listIterator();
                                                                while (true) {
                                                                    StateListIterator stateListIterator = (StateListIterator) listIterator;
                                                                    if (!stateListIterator.hasNext()) {
                                                                        break;
                                                                    }
                                                                    arrayList3.add(new MenuItemToken(((CartEntryWithQuantity) stateListIterator.next()).getCartEntry().menuItemToken));
                                                                }
                                                                SessionManager sessionManager = localBrandProfilePresenter2.sessionManager;
                                                                str15.getClass();
                                                                brandSpot5.getClass();
                                                                SchedulingType schedulingType = SchedulingType.LATER;
                                                                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager);
                                                                if (fulfillmentConfiguration2 instanceof FulfillmentConfiguration.Delivery) {
                                                                    fulfillmentType2 = FulfillmentType.DELIVERY;
                                                                } else if (fulfillmentConfiguration2 instanceof FulfillmentConfiguration.Pickup) {
                                                                    fulfillmentType2 = FulfillmentType.PICKUP;
                                                                } else {
                                                                    if (!(fulfillmentConfiguration2 instanceof FulfillmentConfiguration.InStore) && !fulfillmentConfiguration2.equals(FulfillmentConfiguration.Unspecified.INSTANCE)) {
                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                        return null;
                                                                    }
                                                                    str = str15;
                                                                    str2 = str16;
                                                                    fulfillmentType = null;
                                                                    analytics.track(new LocalClientFulfillmentFlowClickSchedulingType(models$lambda$92, str, activeAccountTokenOrNull, str2, fulfillmentType, schedulingType), null);
                                                                    screenNavigator.askQuestion(new SchedulingDayTimeQuestion(), new SliderKt$$ExternalSyntheticLambda3(brandSpot5, str, sessionManager, str2, arrayList3, fulfillmentConfiguration2, 1));
                                                                }
                                                                str = str15;
                                                                fulfillmentType = fulfillmentType2;
                                                                str2 = str16;
                                                                analytics.track(new LocalClientFulfillmentFlowClickSchedulingType(models$lambda$92, str, activeAccountTokenOrNull, str2, fulfillmentType, schedulingType), null);
                                                                screenNavigator.askQuestion(new SchedulingDayTimeQuestion(), new SliderKt$$ExternalSyntheticLambda3(brandSpot5, str, sessionManager, str2, arrayList3, fulfillmentConfiguration2, 1));
                                                            }
                                                        }
                                                    } else if (localBrandProfileViewEvent instanceof FulfillmentOptionsMenuEvent.FulfillAsapClicked) {
                                                        String models$lambda$93 = LocalBrandProfilePresenter.models$lambda$9(mutableState22);
                                                        if (models$lambda$93 != null) {
                                                            LocationToken locationToken = (LocationToken) mutableState11.getValue();
                                                            String str17 = locationToken != null ? locationToken.value : null;
                                                            if (str17 != null) {
                                                                LocalBrandProfileViewModel localBrandProfileViewModel = (LocalBrandProfileViewModel) mutableState12.getValue();
                                                                LocalBrandProfileViewModel.Content content = localBrandProfileViewModel instanceof LocalBrandProfileViewModel.Content ? (LocalBrandProfileViewModel.Content) localBrandProfileViewModel : null;
                                                                boolean z10 = (content != null ? content.fulfillment : null) instanceof LocalBrandProfileViewModel.Fulfillment.InStore;
                                                                if (z10) {
                                                                    mutableState13.setValue(Boolean.TRUE);
                                                                }
                                                                JobKt.launch$default(coroutineScope, null, null, new RealContactSync$syncRequest$2(models$lambda$93, str17, realCartBuilder2, z10, localBrandProfilePresenter2, mutableState21, mutableState14, null, 1), 3);
                                                            }
                                                        }
                                                    } else if (localBrandProfileViewEvent instanceof LocalBrandBannerEvent$Dismissed) {
                                                        LocalBrandBannerEvent$Dismissed localBrandBannerEvent$Dismissed = (LocalBrandBannerEvent$Dismissed) localBrandProfileViewEvent;
                                                        BrandSpot brandSpot6 = (BrandSpot) state5.getValue();
                                                        brandSpot6.getClass();
                                                        String str18 = brandSpot6.brandToken;
                                                        String str19 = brandSpot6.locationToken;
                                                        analytics.track(new LocalClientBannerInteraction(str18, str19 == null ? null : str19, BannerLocation.BRAND_PROFILE, AnalyticsKt.toBannerType(localBrandBannerEvent$Dismissed.f915type), LocalClientBannerInteraction.InteractionType.Dismiss), null);
                                                        RealLocalBrandProfileBannerDismissalTracker realLocalBrandProfileBannerDismissalTracker = localBrandProfilePresenter2.bannerDismissalTracker;
                                                        realLocalBrandProfileBannerDismissalTracker.dismissedAt.set(DimensionKt.now(realLocalBrandProfileBannerDismissalTracker.clock));
                                                        mutableState15.setValue(Boolean.TRUE);
                                                    } else if (localBrandProfileViewEvent instanceof LocalBrandBannerEvent$Clicked) {
                                                        LocalBrandBannerEvent$Clicked localBrandBannerEvent$Clicked = (LocalBrandBannerEvent$Clicked) localBrandProfileViewEvent;
                                                        BrandSpot brandSpot7 = (BrandSpot) state5.getValue();
                                                        brandSpot7.getClass();
                                                        String str20 = brandSpot7.brandToken;
                                                        String str21 = brandSpot7.locationToken;
                                                        analytics.track(new LocalClientBannerInteraction(str20, str21 == null ? null : str21, BannerLocation.BRAND_PROFILE, AnalyticsKt.toBannerType(localBrandBannerEvent$Clicked.f914type), LocalClientBannerInteraction.InteractionType.Action), null);
                                                    } else {
                                                        if (localBrandProfileViewEvent instanceof LocalBrandBannerEvent$Toggled) {
                                                            a$$ExternalSyntheticBUOutline0.m$1("Banner is not toggleable in the cart view");
                                                            return null;
                                                        }
                                                        if (localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.MarketingMessageClicked) {
                                                            String str22 = ((LocalBrandProfileViewEvent.MarketingMessageClicked) localBrandProfileViewEvent).messageToken;
                                                            List list3 = (List) mutableState16.getValue();
                                                            str22.getClass();
                                                            list3.getClass();
                                                            Iterator it2 = list3.iterator();
                                                            while (true) {
                                                                if (!it2.hasNext()) {
                                                                    break;
                                                                }
                                                                Object next = it2.next();
                                                                if (Intrinsics.areEqual(((MarketingMessageData) next).messageToken, str22)) {
                                                                    obj4 = next;
                                                                    break;
                                                                }
                                                            }
                                                            MarketingMessageData marketingMessageData = (MarketingMessageData) obj4;
                                                            if (marketingMessageData != null) {
                                                                screenNavigator.goTo(new LocalMarketingMessageScreen(marketingMessageData));
                                                            }
                                                        } else if (Intrinsics.areEqual(localBrandProfileViewEvent, LocalBrandProfileViewEvent.ShowAllMessagesClicked.INSTANCE)) {
                                                            screenNavigator.goTo(new LocalMarketingMessagesScreen(LocalBrandProfilePresenter.models$lambda$9(mutableState22)));
                                                        } else if (Intrinsics.areEqual(localBrandProfileViewEvent, LocalBrandProfileViewEvent.OfferToastDismissed.INSTANCE)) {
                                                            mutableState17.setValue(Boolean.FALSE);
                                                        } else if (Intrinsics.areEqual(localBrandProfileViewEvent, LocalBrandProfileViewEvent.InvalidCouponToastDismissed.INSTANCE)) {
                                                            mutableState.setValue(null);
                                                        } else {
                                                            if (!(localBrandProfileViewEvent instanceof LocalBrandProfileViewEvent.HoursDropdownOptionClicked)) {
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                return null;
                                                            }
                                                            mutableState2.setValue(((LocalBrandProfileViewEvent.HoursDropdownOptionClicked) localBrandProfileViewEvent).fulfillmentType);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (((Location.LocationDetail) state6.getValue()) != null) {
                                    mutableState19.setValue(Boolean.TRUE);
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
