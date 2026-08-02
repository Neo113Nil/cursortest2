package app.cash.local.presenters.fulfillment;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.DeliveryQuote;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.GlobalAddressWrapper;
import app.cash.local.primitives.GlobalAddressWrapperKt;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.Location;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.service.LocalService;
import app.cash.local.viewmodels.LocalBrandLocationsBottomSheetModel$Location;
import app.cash.local.viewmodels.fulfillment.FulfillmentPickerViewModel;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.l2$$ExternalSyntheticLambda7;
import coil3.RealImageLoader$execute$result$1;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.views.menu.ExpandableContentKt;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class FulfillmentPickerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BrandSpot brandSpot;
    public final String brandToken;
    public final AndroidClock clock;
    public final RealLocalLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealLocalBrandRepository repository;
    public final LocalFulfillmentPickerScreen screen;
    public final LocalService service;
    public final SessionManager sessionManager;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillmentType.values().length];
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActiveFulfillmentType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                ActiveFulfillmentType activeFulfillmentType = ActiveFulfillmentType.PICKUP;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public FulfillmentPickerPresenter(AndroidStringManager androidStringManager, AndroidClock androidClock, LocalService localService, RealLocalLauncher realLocalLauncher, RealLocalBrandSyncer realLocalBrandSyncer, RealLocalBrandRepository realLocalBrandRepository, LocalInstalledStore localInstalledStore, SessionManager sessionManager, Analytics analytics, LocalFulfillmentPickerScreen localFulfillmentPickerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localFulfillmentPickerScreen.getClass();
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.service = localService;
        this.launcher = realLocalLauncher;
        this.syncer = realLocalBrandSyncer;
        this.repository = realLocalBrandRepository;
        this.store = localInstalledStore;
        this.sessionManager = sessionManager;
        this.analytics = analytics;
        this.screen = localFulfillmentPickerScreen;
        this.navigator = screenNavigator;
        String str = localFulfillmentPickerScreen.brandToken;
        this.brandToken = str;
        this.brandSpot = new BrandSpot(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        State state;
        Continuation continuation;
        int i2;
        MutableState mutableState2;
        MutableState mutableState3;
        Continuation continuation2;
        String str;
        GpsCoordinates gpsCoordinates;
        Object obj;
        FulfillmentConfiguration.Delivery asDelivery;
        LocalFulfillment.DeliveryDetails deliveryDetails;
        LocalAddress localAddress;
        ActiveFulfillmentType activeFulfillmentType;
        FulfillmentConfiguration.Delivery asDelivery2;
        LocalFulfillment.DeliveryDetails deliveryDetails2;
        FulfillmentPickerPresenter fulfillmentPickerPresenter = this;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1760255968);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState4 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        LocalFulfillmentPickerScreen localFulfillmentPickerScreen = fulfillmentPickerPresenter.screen;
        Continuation continuation3 = null;
        if (rememberedValue2 == obj2) {
            FulfillmentConfiguration fulfillmentConfiguration = localFulfillmentPickerScreen.currentConfiguration;
            rememberedValue2 = Updater.mutableStateOf$default((fulfillmentConfiguration == null || (asDelivery2 = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration)) == null || (deliveryDetails2 = asDelivery2.deliveryDetails) == null) ? null : deliveryDetails2.delivery_address);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState5 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState6 = (MutableState) rememberedValue3;
        String str2 = fulfillmentPickerPresenter.brandToken;
        BrandToken brandToken = new BrandToken(str2);
        DeliveryQuote deliveryQuote = (DeliveryQuote) mutableState6.getValue();
        boolean changedInstance = gapComposer.changedInstance(fulfillmentPickerPresenter);
        Object rememberedValue4 = gapComposer.rememberedValue();
        int i3 = 14;
        if (changedInstance || rememberedValue4 == obj2) {
            rememberedValue4 = new ZiplineLoader$ModuleJob$run$3(fulfillmentPickerPresenter, mutableState6, continuation3, i3);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(brandToken, deliveryQuote, (Function2) rememberedValue4, gapComposer);
        boolean changed = gapComposer.changed(str2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        RealLocalBrandRepository realLocalBrandRepository = fulfillmentPickerPresenter.repository;
        if (changed || rememberedValue5 == obj2) {
            rememberedValue5 = realLocalBrandRepository.brand(fulfillmentPickerPresenter.brandSpot);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(collectAsState, 10));
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        State state2 = (State) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj2) {
            rememberedValue7 = Updater.derivedStateOf(new StatusRunnable$$ExternalSyntheticLambda1(14, mutableState6, fulfillmentPickerPresenter));
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        State state3 = (State) rememberedValue7;
        boolean changed2 = gapComposer.changed((BrandSpot) state3.getValue());
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue8 == obj2) {
            BrandSpot brandSpot = (BrandSpot) state3.getValue();
            rememberedValue8 = brandSpot != null ? realLocalBrandRepository.brand(brandSpot) : new AppLockMonitor$special$$inlined$map$2(null, 19);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer, 48, 2);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj2) {
            LocalFulfillmentType localFulfillmentType = localFulfillmentPickerScreen.selectedType;
            switch (WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()]) {
                case 1:
                    activeFulfillmentType = ActiveFulfillmentType.DELIVERY;
                    break;
                case 2:
                    activeFulfillmentType = ActiveFulfillmentType.PICKUP;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    Path$$ExternalSyntheticBUOutline0.m$1(localFulfillmentType, "Unexpected Unspecified fulfillment ");
                    return null;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
            }
            rememberedValue9 = Updater.mutableStateOf$default(activeFulfillmentType);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState7 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj2) {
            rememberedValue10 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state2, 11));
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        State state4 = (State) rememberedValue10;
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj2) {
            rememberedValue11 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state4, 12));
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        State state5 = (State) rememberedValue11;
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == obj2) {
            rememberedValue12 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(collectAsState2, 13));
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        State state6 = (State) rememberedValue12;
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj2) {
            mutableState = collectAsState;
            l2$$ExternalSyntheticLambda7 l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(this, mutableState6, mutableState4, state6, 8);
            mutableState4 = mutableState4;
            fulfillmentPickerPresenter = this;
            rememberedValue13 = Updater.derivedStateOf(l2__externalsyntheticlambda7);
            gapComposer.updateRememberedValue(rememberedValue13);
        } else {
            mutableState = collectAsState;
        }
        State state7 = (State) rememberedValue13;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(fulfillmentPickerPresenter);
        Object rememberedValue14 = gapComposer.rememberedValue();
        int i4 = 1;
        if (changedInstance2 || rememberedValue14 == obj2) {
            rememberedValue14 = new EventBridge$sendEvent$1(fulfillmentPickerPresenter, continuation3, i4);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue14);
        LocalAddress localAddress2 = (LocalAddress) mutableState5.getValue();
        if (localAddress2 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            state = state4;
            continuation = null;
            i2 = -1106436997;
            mutableState2 = mutableState5;
            mutableState3 = mutableState;
            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1(localAddress2, (Continuation) null, fulfillmentPickerPresenter, mutableState2, mutableState6, mutableState4, 12);
            mutableState6 = mutableState6;
            Updater.LaunchedEffect(gapComposer, localAddress2, networkFetcher$doFetch$fetchResult$1);
            gapComposer.end(false);
        } else {
            state = state4;
            continuation = null;
            i2 = -1106436997;
            mutableState2 = mutableState5;
            mutableState3 = mutableState;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (rememberedValue15 == obj2) {
            rememberedValue15 = Updater.mutableStateOf$default(continuation);
            gapComposer.updateRememberedValue(rememberedValue15);
        }
        MutableState mutableState8 = (MutableState) rememberedValue15;
        FulfillmentConfiguration fulfillmentConfiguration2 = (FulfillmentConfiguration) mutableState8.getValue();
        if (fulfillmentConfiguration2 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            continuation2 = continuation;
            Updater.LaunchedEffect(gapComposer, fulfillmentConfiguration2, new RealImageLoader$execute$result$1(fulfillmentConfiguration2, continuation2, fulfillmentPickerPresenter, mutableState8));
            gapComposer.end(false);
        } else {
            continuation2 = continuation;
            gapComposer.startReplaceGroup(i2);
            gapComposer.end(false);
        }
        MutableState mutableState9 = mutableState6;
        MutableState mutableState10 = mutableState2;
        Object obj3 = continuation2;
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, fulfillmentPickerPresenter, mutableState7, state2, mutableState8, mutableState10, mutableState9, 7));
        int ordinal = ((ActiveFulfillmentType) mutableState7.getValue()).ordinal();
        AndroidStringManager androidStringManager = fulfillmentPickerPresenter.stringManager;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 611430327, false);
            }
            gapComposer.startReplaceGroup(1774495476);
            LocalBrand.FulfillmentSelection fulfillmentSelection = (LocalBrand.FulfillmentSelection) state.getValue();
            Object obj4 = fulfillmentSelection != null ? fulfillmentSelection.saved_delivery_addresses : obj3;
            if (obj4 == null) {
                obj4 = EmptyList.INSTANCE;
            }
            Iterable iterable = (Iterable) obj4;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(GlobalAddressWrapperKt.toGlobalAddressWrapper((LocalAddress) it.next()));
            }
            FulfillmentConfiguration fulfillmentConfiguration3 = localFulfillmentPickerScreen.currentConfiguration;
            GlobalAddressWrapper globalAddressWrapper = (fulfillmentConfiguration3 == null || (asDelivery = FulfillmentConfigurationKt.getAsDelivery(fulfillmentConfiguration3)) == null || (deliveryDetails = asDelivery.deliveryDetails) == null || (localAddress = deliveryDetails.delivery_address) == null) ? obj3 : GlobalAddressWrapperKt.toGlobalAddressWrapper(localAddress);
            LocalAddress localAddress3 = (LocalAddress) mutableState10.getValue();
            if (localAddress3 != null) {
                Double d = localAddress3.latitude;
                if (d != null) {
                    double doubleValue = d.doubleValue();
                    Double d2 = localAddress3.longitude;
                    if (d2 != null) {
                        obj = new GpsCoordinates(doubleValue, d2.doubleValue());
                        gpsCoordinates = obj;
                    }
                }
                obj = obj3;
                gpsCoordinates = obj;
            } else {
                gpsCoordinates = obj3;
            }
            Pair pair = (Pair) state7.getValue();
            String str3 = pair != null ? (String) pair.first : obj3;
            Pair pair2 = (Pair) state7.getValue();
            FulfillmentPickerViewModel.Delivery delivery = new FulfillmentPickerViewModel.Delivery(globalAddressWrapper, gpsCoordinates, str3, pair2 != null ? (LocalText) pair2.second : obj3, ((DeliveryQuote) mutableState9.getValue()) != null, (List) state5.getValue(), androidStringManager.get(R.string.local_presenters_start_your_order), arrayList);
            gapComposer.end(false);
            gapComposer.end(false);
            return delivery;
        }
        gapComposer.startReplaceGroup(1775440418);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (rememberedValue16 == obj2) {
            rememberedValue16 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(mutableState3, 14));
            gapComposer.updateRememberedValue(rememberedValue16);
        }
        State state8 = (State) rememberedValue16;
        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Location.LocationDetail) state8.getValue());
        Brand brand = (Brand) state2.getValue();
        Object obj5 = brand != null ? brand.nearbyLocations : obj3;
        if (obj5 == null) {
            obj5 = EmptyList.INSTANCE;
        }
        ArrayList plus = CollectionsKt.plus((Iterable) obj5, (Collection) listOfNotNull);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = plus.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Location) next).getAvailableFulfillmentTypes().contains(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP)) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Location location = (Location) it3.next();
            LocalFulfillmentType localFulfillmentType2 = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
            location.getClass();
            localFulfillmentType2.getClass();
            String mo1225getTokenQsI1X5w = location.mo1225getTokenQsI1X5w();
            String name = location.getName();
            LocalAddress address = location.getAddress();
            address.getClass();
            arrayList3.add(new LocalBrandLocationsBottomSheetModel$Location(mo1225getTokenQsI1X5w, name, LocalsKt.formattedFull(address), ExpandableContentKt.currentStatusForLocationRow(location, androidStringManager, fulfillmentPickerPresenter.clock, localFulfillmentType2)));
        }
        FulfillmentConfiguration fulfillmentConfiguration4 = localFulfillmentPickerScreen.currentConfiguration;
        if (fulfillmentConfiguration4 != null) {
            FulfillmentConfiguration.Pickup pickup = fulfillmentConfiguration4 instanceof FulfillmentConfiguration.Pickup ? (FulfillmentConfiguration.Pickup) fulfillmentConfiguration4 : obj3;
            if (pickup != 0) {
                str = pickup.locationToken;
                FulfillmentPickerViewModel.Pickup pickup2 = new FulfillmentPickerViewModel.Pickup(arrayList3, str, (List) state5.getValue(), androidStringManager.get(R.string.local_presenters_start_your_order));
                gapComposer.end(false);
                gapComposer.end(false);
                return pickup2;
            }
        }
        Location.LocationDetail locationDetail = (Location.LocationDetail) state8.getValue();
        str = locationDetail != null ? locationDetail.summary.token : obj3;
        FulfillmentPickerViewModel.Pickup pickup22 = new FulfillmentPickerViewModel.Pickup(arrayList3, str, (List) state5.getValue(), androidStringManager.get(R.string.local_presenters_start_your_order));
        gapComposer.end(false);
        gapComposer.end(false);
        return pickup22;
    }
}
