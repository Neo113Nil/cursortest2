package com.squareup.cash.bitcoin.presenters.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.address.typeahead.backend.api.Coordinates;
import com.squareup.address.typeahead.backend.api.Location;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationDetailsResult;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.address.typeahead.backend.real.RealLocationSearchClient;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorQuestion;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationFilter;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModelKt;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinSellerMarkerLocation;
import com.squareup.cash.bitcoin.viewmodels.map.FilteredLocations;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.card.onboarding.CardStudioViewKt$ThemedCard$1$4$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.deposits.physical.screens.AddressResult;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.presenter.CashMapPresenter$Factory$Impl;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.protos.cash.btcnetwork.external.BitcoinSellerLocation;
import com.squareup.protos.cash.btcnetwork.external.GetBitcoinSellerLocationsRequest;
import com.squareup.protos.cash.btcnetwork.external.GetBitcoinSellerLocationsResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinMapPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BitcoinMapAddressSearchQueries bitcoinMapAddressSearchQueries;
    public final RealBitcoinMapEligibilityManager bitcoinMapEligibilityManager;
    public final CashMapPresenter cashMapPresenter;
    public final AndroidClock clock;
    public final CryptoService cryptoService;
    public final RealLocationSearchClient locationSearchClient;
    public final BetterNavigator.ScreenNavigator navigator;
    public final BitcoinMapScreen screen;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BitcoinMapScreen.Source.values().length];
            try {
                BitcoinMapScreen.Source source = BitcoinMapScreen.Source.BITCOIN_APPLET_CARD;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BitcoinMapScreen.Source source2 = BitcoinMapScreen.Source.BITCOIN_APPLET_CARD;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BitcoinMapScreen.Source source3 = BitcoinMapScreen.Source.BITCOIN_APPLET_CARD;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BitcoinMapScreen.Source source4 = BitcoinMapScreen.Source.BITCOIN_APPLET_CARD;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BitcoinMapPresenter(CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl, CashAccountDatabaseImpl cashAccountDatabaseImpl, CryptoService cryptoService, RealBitcoinMapEligibilityManager realBitcoinMapEligibilityManager, RealLocationSearchClient realLocationSearchClient, AndroidClock androidClock, AndroidStringManager androidStringManager, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator, BitcoinMapScreen bitcoinMapScreen) {
        bitcoinMapScreen.getClass();
        this.cryptoService = cryptoService;
        this.bitcoinMapEligibilityManager = realBitcoinMapEligibilityManager;
        this.locationSearchClient = realLocationSearchClient;
        this.clock = androidClock;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.screen = bitcoinMapScreen;
        this.bitcoinMapAddressSearchQueries = cashAccountDatabaseImpl.bitcoinMapAddressSearchQueries;
        this.cashMapPresenter = cashMapPresenter$Factory$Impl.create(screenNavigator, new LocationDeniedScreen(androidStringManager.get(R.string.bitcoin_map_location_permission_title), androidStringManager.get(R.string.bitcoin_map_location_permission_details), androidStringManager.get(R.string.bitcoin_map_location_permission_settings), androidStringManager.get(R.string.bitcoin_map_location_permission_ignore), null, null, null), new CardStudioViewKt$ThemedCard$1$4$1(1, this, BitcoinMapPresenter.class, "bitcoinGrantLocationPermissionEvent", "bitcoinGrantLocationPermissionEvent(Z)Lcom/squareup/cash/cdf/Event;", 0, 5), "BITCOIN_MAP", null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$centerOnSearchAddress(BitcoinMapPresenter bitcoinMapPresenter, SelectedSearchAddressResult selectedSearchAddressResult, ContinuationImpl continuationImpl) {
        BitcoinMapPresenter$centerOnSearchAddress$1 bitcoinMapPresenter$centerOnSearchAddress$1;
        int i;
        SearchLocation searchLocation;
        LocationSearchClient$LocationDetailsResult locationSearchClient$LocationDetailsResult;
        if (continuationImpl instanceof BitcoinMapPresenter$centerOnSearchAddress$1) {
            bitcoinMapPresenter$centerOnSearchAddress$1 = (BitcoinMapPresenter$centerOnSearchAddress$1) continuationImpl;
            int i2 = bitcoinMapPresenter$centerOnSearchAddress$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinMapPresenter$centerOnSearchAddress$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinMapPresenter$centerOnSearchAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinMapPresenter$centerOnSearchAddress$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SearchLocation searchLocation2 = new SearchLocation(selectedSearchAddressResult.identifier, selectedSearchAddressResult.primaryText, selectedSearchAddressResult.secondaryText, selectedSearchAddressResult.fullText);
                    RealLocationSearchClient realLocationSearchClient = bitcoinMapPresenter.locationSearchClient;
                    LocationSearchClient$SessionId$GoogleSessionId locationSearchClient$SessionId$GoogleSessionId = selectedSearchAddressResult.sessionId;
                    bitcoinMapPresenter$centerOnSearchAddress$1.L$1 = searchLocation2;
                    bitcoinMapPresenter$centerOnSearchAddress$1.label = 1;
                    Object details = realLocationSearchClient.getDetails(locationSearchClient$SessionId$GoogleSessionId, searchLocation2, bitcoinMapPresenter$centerOnSearchAddress$1);
                    if (details == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = details;
                    searchLocation = searchLocation2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    searchLocation = bitcoinMapPresenter$centerOnSearchAddress$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                locationSearchClient$LocationDetailsResult = (LocationSearchClient$LocationDetailsResult) obj;
                if (locationSearchClient$LocationDetailsResult instanceof LocationSearchClient$LocationDetailsResult.Success) {
                    if (!Intrinsics.areEqual(locationSearchClient$LocationDetailsResult, LocationSearchClient$LocationDetailsResult.Failure.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    bitcoinMapPresenter.navigator.askQuestion(BitcoinMapErrorQuestion.INSTANCE, new BadgeQueries$$ExternalSyntheticLambda5(bitcoinMapPresenter, 11));
                    return null;
                }
                Location location = ((LocationSearchClient$LocationDetailsResult.Success) locationSearchClient$LocationDetailsResult).location;
                BitcoinMapAddressSearchQueries bitcoinMapAddressSearchQueries = bitcoinMapPresenter.bitcoinMapAddressSearchQueries;
                String str = location.identifier;
                Coordinates coordinates = location.coordinates;
                long millis = bitcoinMapPresenter.clock.millis();
                String str2 = location.formattedAddress;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                String obj2 = searchLocation.primaryText.toString();
                String valueOf = String.valueOf(searchLocation.secondaryText);
                Double valueOf2 = Double.valueOf(coordinates.latitude);
                Double valueOf3 = Double.valueOf(coordinates.longitude);
                bitcoinMapAddressSearchQueries.getClass();
                SqlDriver sqlDriver = bitcoinMapAddressSearchQueries.driver;
                str.getClass();
                obj2.getClass();
                sqlDriver.execute(10645851, "INSERT OR REPLACE INTO bitcoinMapAddressSearch\nVALUES (?,?,?,?,?,?,?)", new BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4(str, millis, str3, obj2, valueOf, valueOf2, valueOf3, 0));
                bitcoinMapAddressSearchQueries.notifyQueries(10645851, new PasswordInfoQueries$$ExternalSyntheticLambda0(18));
                sqlDriver.execute(1099844945, "DELETE FROM bitcoinMapAddressSearch\nWHERE identifier NOT IN (\n  SELECT identifier\n  FROM bitcoinMapAddressSearch\n  ORDER BY created_at DESC\n  LIMIT ?\n)", new PasswordInfoQueries$$ExternalSyntheticLambda0(16));
                bitcoinMapAddressSearchQueries.notifyQueries(1099844945, new PasswordInfoQueries$$ExternalSyntheticLambda0(17));
                return new LocationViewModel(coordinates.latitude, coordinates.longitude, 12.5f);
            }
        }
        bitcoinMapPresenter$centerOnSearchAddress$1 = new BitcoinMapPresenter$centerOnSearchAddress$1(bitcoinMapPresenter, continuationImpl);
        Object obj3 = bitcoinMapPresenter$centerOnSearchAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinMapPresenter$centerOnSearchAddress$1.label;
        if (i != 0) {
        }
        locationSearchClient$LocationDetailsResult = (LocationSearchClient$LocationDetailsResult) obj3;
        if (locationSearchClient$LocationDetailsResult instanceof LocationSearchClient$LocationDetailsResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$loadLocations(BitcoinMapPresenter bitcoinMapPresenter, CashMapViewEvent.MapMovementFinished mapMovementFinished, ContinuationImpl continuationImpl) {
        BitcoinMapPresenter$loadLocations$1 bitcoinMapPresenter$loadLocations$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = bitcoinMapPresenter.stringManager;
        if (continuationImpl instanceof BitcoinMapPresenter$loadLocations$1) {
            bitcoinMapPresenter$loadLocations$1 = (BitcoinMapPresenter$loadLocations$1) continuationImpl;
            int i2 = bitcoinMapPresenter$loadLocations$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinMapPresenter$loadLocations$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinMapPresenter$loadLocations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinMapPresenter$loadLocations$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    double d = mapMovementFinished.zoomRadiusInMeters * 6.21371E-4d;
                    CryptoService cryptoService = bitcoinMapPresenter.cryptoService;
                    GetBitcoinSellerLocationsRequest getBitcoinSellerLocationsRequest = new GetBitcoinSellerLocationsRequest(new Double(mapMovementFinished.lat), new Double(mapMovementFinished.lng), new Double(RangesKt___RangesKt.coerceIn(d, 0.1d, 25.0d)), ByteString.EMPTY);
                    bitcoinMapPresenter$loadLocations$1.label = 1;
                    obj = cryptoService.getBitcoinSellerLocations(getBitcoinSellerLocationsRequest, bitcoinMapPresenter$loadLocations$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        bitcoinMapPresenter.navigator.goTo(new BitcoinMapErrorScreen(androidStringManager.get(R.string.bitcoin_map_error_loading_sellers_title), androidStringManager.get(R.string.bitcoin_map_error_loading_sellers_description), androidStringManager.get(R.string.bitcoin_map_error_loading_sellers_button), null, null));
                        return EmptyList.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list = ((GetBitcoinSellerLocationsResponse) ((ApiResult.Success) apiResult).response).locations;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BitcoinSellerMarkerLocation((BitcoinSellerLocation) it.next()));
                }
                return arrayList;
            }
        }
        bitcoinMapPresenter$loadLocations$1 = new BitcoinMapPresenter$loadLocations$1(bitcoinMapPresenter, continuationImpl);
        Object obj2 = bitcoinMapPresenter$loadLocations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinMapPresenter$loadLocations$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        Continuation continuation;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Iterator it;
        Continuation continuation2;
        MutableState mutableState5;
        MutableState mutableState6;
        boolean z;
        Continuation continuation3;
        Object bitcoinMapPresenter$models$3$1;
        CashMapViewModel cashMapViewModel;
        BitcoinMapPresenter bitcoinMapPresenter;
        FilteredLocations filteredLocations;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1600976857);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation4 = null;
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState7 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState8 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState9 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(BitcoinMapViewModelKt.DefaultLocationFilter);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState10 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = this.bitcoinMapEligibilityManager.isLightningWithdrawEligible();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue5, Boolean.FALSE, null, gapComposer, 48, 2);
        boolean changed = gapComposer.changed((List) mutableState9.getValue()) | gapComposer.changed((BitcoinLocationFilter) mutableState10.getValue());
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == obj) {
            List list = (List) mutableState9.getValue();
            CashMapViewEvent.MapMovementFinished mapMovementFinished = (CashMapViewEvent.MapMovementFinished) mutableState7.getValue();
            BitcoinLocationFilter bitcoinLocationFilter = (BitcoinLocationFilter) mutableState10.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                BitcoinSellerMarkerLocation bitcoinSellerMarkerLocation = (BitcoinSellerMarkerLocation) next;
                if (mapMovementFinished != null) {
                    continuation2 = continuation4;
                    mutableState4 = mutableState10;
                    it = it2;
                    mutableState5 = mutableState7;
                    mutableState6 = mutableState8;
                    z = mapMovementFinished.boundary.contains(bitcoinSellerMarkerLocation.latitude, bitcoinSellerMarkerLocation.longitude);
                } else {
                    mutableState4 = mutableState10;
                    it = it2;
                    continuation2 = continuation4;
                    mutableState5 = mutableState7;
                    mutableState6 = mutableState8;
                    z = true;
                }
                boolean z2 = bitcoinLocationFilter.squareSellersOnly ? bitcoinSellerMarkerLocation.viewModel.isSquareSeller : true;
                if (z && z2) {
                    arrayList.add(next);
                }
                continuation4 = continuation2;
                mutableState10 = mutableState4;
                it2 = it;
                mutableState7 = mutableState5;
                mutableState8 = mutableState6;
            }
            mutableState = mutableState10;
            continuation = continuation4;
            mutableState2 = mutableState7;
            mutableState3 = mutableState8;
            rememberedValue6 = new FilteredLocations(arrayList, (BitcoinLocationFilter) mutableState.getValue());
            gapComposer.updateRememberedValue(rememberedValue6);
        } else {
            mutableState = mutableState10;
            continuation = null;
            mutableState2 = mutableState7;
            mutableState3 = mutableState8;
        }
        FilteredLocations filteredLocations2 = (FilteredLocations) rememberedValue6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Updater.mutableStateOf$default(continuation);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState11 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue8;
        UiCallbackModel models = this.cashMapPresenter.models(gapComposer);
        CashMapViewModel cashMapViewModel2 = (CashMapViewModel) models.model;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue9 == obj) {
            continuation3 = continuation;
            rememberedValue9 = new MLKitTitleGenerator$1(this, continuation3, 20);
            gapComposer.updateRememberedValue(rememberedValue9);
        } else {
            continuation3 = continuation;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue9);
        Updater.LaunchedEffect(gapComposer, flow, new SetNamePresenter$models$1$1$1(3, mutableState, this, flow, continuation3));
        boolean changedInstance2 = gapComposer.changedInstance(cashMapViewModel2);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue10 == obj) {
            cashMapViewModel = cashMapViewModel2;
            bitcoinMapPresenter$models$3$1 = new BitcoinMapPresenter$models$3$1(cashMapViewModel, mutableState2, mutableState3, continuation3, 0);
            gapComposer.updateRememberedValue(bitcoinMapPresenter$models$3$1);
        } else {
            bitcoinMapPresenter$models$3$1 = rememberedValue10;
            cashMapViewModel = cashMapViewModel2;
        }
        Updater.LaunchedEffect(gapComposer, cashMapViewModel, (Function2) bitcoinMapPresenter$models$3$1);
        CashMapViewEvent.MapMovementFinished mapMovementFinished2 = (CashMapViewEvent.MapMovementFinished) mutableState2.getValue();
        if (mapMovementFinished2 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, mapMovementFinished2, new AndroidSecureStore$read$2(mapMovementFinished2, continuation3, this, mutableState9));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        LocationSelection locationSelection = (LocationSelection) mutableState3.getValue();
        if (locationSelection != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Continuation continuation5 = continuation3;
            filteredLocations = filteredLocations2;
            bitcoinMapPresenter = this;
            continuation3 = continuation5;
            Updater.LaunchedEffect(gapComposer, locationSelection, new zzmh(locationSelection, continuation5, filteredLocations2, this, 21));
            gapComposer.end(false);
        } else {
            bitcoinMapPresenter = this;
            filteredLocations = filteredLocations2;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj) {
            rememberedValue11 = new HeroTagViewKt$$ExternalSyntheticLambda12(6, mutableState11);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Function2 function2 = (Function2) rememberedValue11;
        ProvidableCompositionLocal providableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(providableCompositionLocal);
        boolean changedInstance3 = gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue12 == obj) {
            rememberedValue12 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 14);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue12, gapComposer);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == obj) {
            rememberedValue13 = new WalletHomeViewKt$$ExternalSyntheticLambda8(1, parcelableSnapshotMutableIntState);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        Function2 function22 = (Function2) rememberedValue13;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer.consume(providableCompositionLocal);
        boolean changedInstance4 = gapComposer.changedInstance(answerDispatcher2);
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue14 == obj) {
            rememberedValue14 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 15);
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue14, gapComposer);
        AddressResult addressResult = (AddressResult) mutableState11.getValue();
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        if (addressResult != null) {
            gapComposer.startReplaceGroup(-1383927846);
            Updater.LaunchedEffect(addressResult, valueOf, new zzmh(addressResult, valueOf, continuation3, bitcoinMapPresenter), gapComposer);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1383879796);
            gapComposer.end(false);
        }
        BitcoinMapViewModel bitcoinMapViewModel = new BitcoinMapViewModel(((Boolean) collectAsState.getValue()).booleanValue(), filteredLocations, models, ((Boolean) collectAsState.getValue()).booleanValue());
        gapComposer.end(false);
        return bitcoinMapViewModel;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider bitcoinMapEligibilityManager;
        public final DoubleCheck cashDatabase;
        public final Provider cashMapPresenterFactory;
        public final LambdaProvider clock;
        public final DoubleCheck cryptoService;
        public final DoubleCheck locationSearchClient;
        public final LambdaProvider stringManager;

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, RealPasscodeFlowStarter.MetroFactory metroFactory, LambdaProvider lambdaProvider2, RealSessionFlags.MetroFactory metroFactory2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4) {
            this.cashDatabase = doubleCheck;
            this.clock = lambdaProvider;
            this.cryptoService = doubleCheck2;
            this.cashMapPresenterFactory = metroFactory;
            this.stringManager = lambdaProvider2;
            this.bitcoinMapEligibilityManager = metroFactory2;
            this.locationSearchClient = doubleCheck3;
            this.analytics = doubleCheck4;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck4) {
            this.cashDatabase = doubleCheck;
            this.cryptoService = doubleCheck2;
            this.locationSearchClient = doubleCheck3;
            this.cashMapPresenterFactory = instanceFactory;
            this.clock = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.bitcoinMapEligibilityManager = musicViewFactory$MetroFactory;
            this.analytics = doubleCheck4;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealFileDownloader.MetroFactory metroFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4) {
            this.cashMapPresenterFactory = instanceFactory;
            this.cashDatabase = doubleCheck;
            this.cryptoService = doubleCheck2;
            this.bitcoinMapEligibilityManager = metroFactory;
            this.locationSearchClient = doubleCheck3;
            this.clock = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.analytics = doubleCheck4;
        }
    }
}
