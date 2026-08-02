package com.squareup.cash.deposits.physical.presenter.atm;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.address.typeahead.backend.api.Coordinates;
import com.squareup.address.typeahead.backend.api.Location;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationDetailsResult;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.api.SearchLocation;
import com.squareup.address.typeahead.backend.real.RealLocationSearchClient;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter$models$3$1;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.db.AtmWithdrawalAddressSearchQueries;
import com.squareup.cash.deposits.physical.db.BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.deposits.physical.screens.AtmRetailerMapScreen;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.deposits.physical.screens.NoAddressResult;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.screens.SelectedSearchAddressResult;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmWithdrawalMapViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.ViewTextViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$BankingPackagingRelease2cLaunch;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.presenter.CashMapPresenter$Factory$Impl;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.scannerview.SizeMap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AtmWithdrawalMapPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final AtmRetailerMapScreen args;
    public final SizeMap atmLocationManager;
    public final AtmWithdrawalAddressSearchQueries atmWithdrawalUsAddressSearchQueries;
    public final CashMapPresenter cashMapPresenter;
    public final AndroidClock clock;
    public final BooleanPreference explainerViewedCache;
    public final boolean isBankingPackaging2cEnabled;
    public final RealLocationSearchClient locationSearchClient;
    public final RetailerMapBlocker.MapScreen mapScreen;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public AtmWithdrawalMapPresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, RealLocationSearchClient realLocationSearchClient, AndroidStringManager androidStringManager, SizeMap sizeMap, Analytics analytics, FeatureFlagManager featureFlagManager, CashMapPresenter$Factory$Impl cashMapPresenter$Factory$Impl, BooleanPreference booleanPreference, AtmRetailerMapScreen atmRetailerMapScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        atmRetailerMapScreen.getClass();
        this.clock = androidClock;
        this.locationSearchClient = realLocationSearchClient;
        this.stringManager = androidStringManager;
        this.atmLocationManager = sizeMap;
        this.analytics = analytics;
        this.explainerViewedCache = booleanPreference;
        this.args = atmRetailerMapScreen;
        this.navigator = screenNavigator;
        RetailerMapBlocker.MapScreen mapScreen = atmRetailerMapScreen.atmWithdrawalBlocker.map_screen;
        mapScreen.getClass();
        this.mapScreen = mapScreen;
        BlockersData blockersData = atmRetailerMapScreen.blockersData;
        ClientScenario clientScenario = blockersData.clientScenario;
        String name = clientScenario != null ? clientScenario.name() : null;
        String nextBlockerId = blockersData.getNextBlockerId();
        String str = blockersData.flowToken;
        this.atmWithdrawalUsAddressSearchQueries = cashAccountDatabaseImpl.atmWithdrawalAddressSearchQueries;
        String str2 = mapScreen.location_disabled_title_text;
        str2.getClass();
        String str3 = mapScreen.location_disabled_detail_text;
        str3.getClass();
        String str4 = mapScreen.location_disabled_settings_text;
        str4.getClass();
        this.cashMapPresenter = cashMapPresenter$Factory$Impl.create(screenNavigator, new LocationDeniedScreen(str2, str3, str4, mapScreen.location_disabled_ignore_text, nextBlockerId, name, str), new EnumListAdapter$encode$1(1, this, AtmWithdrawalMapPresenter.class, "atmGrantLocationPermissionEvent", "atmGrantLocationPermissionEvent(Z)Lcom/squareup/cash/cdf/atm/AtmWithdrawalGrantLocationPermission;", 0, 2), "ATM_FINDER", null, null);
        this.isBankingPackaging2cEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$BankingPackagingRelease2cLaunch.INSTANCE)).enabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$centerOnSearchAddress(AtmWithdrawalMapPresenter atmWithdrawalMapPresenter, SelectedSearchAddressResult selectedSearchAddressResult, ContinuationImpl continuationImpl) {
        AtmWithdrawalMapPresenter$centerOnSearchAddress$1 atmWithdrawalMapPresenter$centerOnSearchAddress$1;
        int i;
        SelectedSearchAddressResult selectedSearchAddressResult2;
        SearchLocation searchLocation;
        LocationSearchClient$LocationDetailsResult locationSearchClient$LocationDetailsResult;
        AtmWithdrawalAddressSearchQueries atmWithdrawalAddressSearchQueries = atmWithdrawalMapPresenter.atmWithdrawalUsAddressSearchQueries;
        AndroidStringManager androidStringManager = atmWithdrawalMapPresenter.stringManager;
        if (continuationImpl instanceof AtmWithdrawalMapPresenter$centerOnSearchAddress$1) {
            atmWithdrawalMapPresenter$centerOnSearchAddress$1 = (AtmWithdrawalMapPresenter$centerOnSearchAddress$1) continuationImpl;
            int i2 = atmWithdrawalMapPresenter$centerOnSearchAddress$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                atmWithdrawalMapPresenter$centerOnSearchAddress$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = atmWithdrawalMapPresenter$centerOnSearchAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = atmWithdrawalMapPresenter$centerOnSearchAddress$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SearchLocation searchLocation2 = new SearchLocation(selectedSearchAddressResult.identifier, selectedSearchAddressResult.primaryText, selectedSearchAddressResult.secondaryText, selectedSearchAddressResult.fullText);
                    RealLocationSearchClient realLocationSearchClient = atmWithdrawalMapPresenter.locationSearchClient;
                    LocationSearchClient$SessionId$GoogleSessionId locationSearchClient$SessionId$GoogleSessionId = selectedSearchAddressResult.sessionId;
                    atmWithdrawalMapPresenter$centerOnSearchAddress$1.L$0 = selectedSearchAddressResult;
                    atmWithdrawalMapPresenter$centerOnSearchAddress$1.L$1 = searchLocation2;
                    atmWithdrawalMapPresenter$centerOnSearchAddress$1.label = 1;
                    Object details = realLocationSearchClient.getDetails(locationSearchClient$SessionId$GoogleSessionId, searchLocation2, atmWithdrawalMapPresenter$centerOnSearchAddress$1);
                    if (details == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    selectedSearchAddressResult2 = selectedSearchAddressResult;
                    searchLocation = searchLocation2;
                    obj = details;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    searchLocation = atmWithdrawalMapPresenter$centerOnSearchAddress$1.L$1;
                    SelectedSearchAddressResult selectedSearchAddressResult3 = atmWithdrawalMapPresenter$centerOnSearchAddress$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    selectedSearchAddressResult2 = selectedSearchAddressResult3;
                }
                locationSearchClient$LocationDetailsResult = (LocationSearchClient$LocationDetailsResult) obj;
                if (locationSearchClient$LocationDetailsResult instanceof LocationSearchClient$LocationDetailsResult.Success) {
                    if (!Intrinsics.areEqual(locationSearchClient$LocationDetailsResult, LocationSearchClient$LocationDetailsResult.Failure.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    atmWithdrawalMapPresenter.navigator.goTo(new PhysicalDepositErrorScreen(androidStringManager.get(R.string.error_loading_address), androidStringManager.get(R.string.error_loading_address_description), androidStringManager.get(R.string.cancel), androidStringManager.get(R.string.retry), selectedSearchAddressResult2));
                    return null;
                }
                Location location = ((LocationSearchClient$LocationDetailsResult.Success) locationSearchClient$LocationDetailsResult).location;
                String str = location.identifier;
                Coordinates coordinates = location.coordinates;
                long millis = atmWithdrawalMapPresenter.clock.millis();
                String str2 = location.formattedAddress;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                String obj2 = searchLocation.primaryText.toString();
                String valueOf = String.valueOf(searchLocation.secondaryText);
                Double valueOf2 = Double.valueOf(coordinates.latitude);
                Double valueOf3 = Double.valueOf(coordinates.longitude);
                atmWithdrawalAddressSearchQueries.getClass();
                SqlDriver sqlDriver = atmWithdrawalAddressSearchQueries.driver;
                str.getClass();
                obj2.getClass();
                sqlDriver.execute(922733716, "INSERT OR REPLACE INTO atmWithdrawalAddressSearch\nVALUES (?,?,?,?,?,?,?)", new BitcoinMapAddressSearchQueries$$ExternalSyntheticLambda4(str, millis, str3, obj2, valueOf, valueOf2, valueOf3, 1));
                atmWithdrawalAddressSearchQueries.notifyQueries(922733716, new PasswordInfoQueries$$ExternalSyntheticLambda0(13));
                sqlDriver.execute(332079818, "DELETE FROM atmWithdrawalAddressSearch\nWHERE identifier NOT IN (\n  SELECT identifier\n  FROM atmWithdrawalAddressSearch\n  ORDER BY created_at DESC\n  LIMIT ?\n)", new PasswordInfoQueries$$ExternalSyntheticLambda0(11));
                atmWithdrawalAddressSearchQueries.notifyQueries(332079818, new PasswordInfoQueries$$ExternalSyntheticLambda0(12));
                return new LocationViewModel(coordinates.latitude, coordinates.longitude, 12.5f);
            }
        }
        atmWithdrawalMapPresenter$centerOnSearchAddress$1 = new AtmWithdrawalMapPresenter$centerOnSearchAddress$1(atmWithdrawalMapPresenter, continuationImpl);
        Object obj3 = atmWithdrawalMapPresenter$centerOnSearchAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = atmWithdrawalMapPresenter$centerOnSearchAddress$1.label;
        if (i != 0) {
        }
        locationSearchClient$LocationDetailsResult = (LocationSearchClient$LocationDetailsResult) obj3;
        if (locationSearchClient$LocationDetailsResult instanceof LocationSearchClient$LocationDetailsResult.Success) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.squareup.cash.deposits.physical.viewmodels.map.AtmWithdrawalMapViewModel$AtmFeeViewModel] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object atmWithdrawalMapPresenter$models$3$1;
        UiCallbackModel uiCallbackModel;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1812273557);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj = mutableStateOf$default;
        }
        MutableState mutableState5 = (MutableState) obj;
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj2 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(mutableStateOf$default2);
            obj2 = mutableStateOf$default2;
        }
        MutableState mutableState6 = (MutableState) obj2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default("");
            gapComposer.updateRememberedValue(mutableStateOf$default3);
            obj3 = mutableStateOf$default3;
        }
        MutableState mutableState7 = (MutableState) obj3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        AtmWithdrawalMapViewModel.AtmFeeViewModel atmFeeViewModel = 0;
        atmFeeViewModel = 0;
        Object obj4 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(mutableStateOf$default4);
            obj4 = mutableStateOf$default4;
        }
        MutableState mutableState8 = (MutableState) obj4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(mutableStateOf$default5);
            obj5 = mutableStateOf$default5;
        }
        MutableState mutableState9 = (MutableState) obj5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(mutableStateOf$default6);
            obj6 = mutableStateOf$default6;
        }
        MutableState mutableState10 = (MutableState) obj6;
        Object rememberedValue7 = gapComposer.rememberedValue();
        Object obj7 = rememberedValue7;
        if (rememberedValue7 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default7 = Updater.mutableStateOf$default(NoAddressResult.INSTANCE);
            gapComposer.updateRememberedValue(mutableStateOf$default7);
            obj7 = mutableStateOf$default7;
        }
        MutableState mutableState11 = (MutableState) obj7;
        UiCallbackModel models = this.cashMapPresenter.models(gapComposer);
        CashMapViewModel cashMapViewModel = (CashMapViewModel) models.model;
        Updater.LaunchedEffect(gapComposer, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) atmFeeViewModel, this, 23));
        boolean changedInstance = gapComposer.changedInstance(cashMapViewModel);
        Object rememberedValue8 = gapComposer.rememberedValue();
        Object obj8 = rememberedValue8;
        if (changedInstance || rememberedValue8 == neverEqualPolicy) {
            BitcoinMapPresenter$models$3$1 bitcoinMapPresenter$models$3$1 = new BitcoinMapPresenter$models$3$1(cashMapViewModel, mutableState9, mutableState10, atmFeeViewModel, 1);
            gapComposer.updateRememberedValue(bitcoinMapPresenter$models$3$1);
            obj8 = bitcoinMapPresenter$models$3$1;
        }
        Updater.LaunchedEffect(gapComposer, cashMapViewModel, (Function2) obj8);
        CashMapViewEvent.MapMovementFinished mapMovementFinished = (CashMapViewEvent.MapMovementFinished) mutableState9.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
            uiCallbackModel = models;
            mutableState = mutableState11;
            atmWithdrawalMapPresenter$models$3$1 = new AtmWithdrawalMapPresenter$models$3$1(mutableState9, this, mutableState8, mutableState5, null);
            mutableState2 = mutableState5;
            gapComposer.updateRememberedValue(atmWithdrawalMapPresenter$models$3$1);
        } else {
            mutableState2 = mutableState5;
            uiCallbackModel = models;
            atmWithdrawalMapPresenter$models$3$1 = rememberedValue9;
            mutableState = mutableState11;
        }
        Updater.LaunchedEffect(gapComposer, mapMovementFinished, (Function2) atmWithdrawalMapPresenter$models$3$1);
        LocationSelection locationSelection = (LocationSelection) mutableState10.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue10 = gapComposer.rememberedValue();
        Object obj9 = rememberedValue10;
        if (changedInstance3 || rememberedValue10 == neverEqualPolicy) {
            SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(mutableState10, this, mutableState2, (Continuation) null);
            gapComposer.updateRememberedValue(setNameViewKt$SetName$2$1);
            obj9 = setNameViewKt$SetName$2$1;
        }
        Updater.LaunchedEffect(gapComposer, locationSelection, (Function2) obj9);
        Object rememberedValue11 = gapComposer.rememberedValue();
        Object obj10 = rememberedValue11;
        if (rememberedValue11 == neverEqualPolicy) {
            HeroTagViewKt$$ExternalSyntheticLambda12 heroTagViewKt$$ExternalSyntheticLambda12 = new HeroTagViewKt$$ExternalSyntheticLambda12(9, mutableState);
            gapComposer.updateRememberedValue(heroTagViewKt$$ExternalSyntheticLambda12);
            obj10 = heroTagViewKt$$ExternalSyntheticLambda12;
        }
        Function2 function2 = (Function2) obj10;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changedInstance4 = gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue12 = gapComposer.rememberedValue();
        Object obj11 = rememberedValue12;
        if (changedInstance4 || rememberedValue12 == neverEqualPolicy) {
            VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 20);
            gapComposer.updateRememberedValue(verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1);
            obj11 = verifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) obj11, gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance5 = gapComposer.changedInstance(this);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changedInstance5 || rememberedValue13 == neverEqualPolicy) {
            mutableState3 = mutableState6;
            mutableState4 = mutableState7;
            RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1(mutableState, this, mutableState8, mutableState3, mutableState4, null, 17);
            gapComposer.updateRememberedValue(realBlockersHelper$skipBlocker$1);
            rememberedValue13 = realBlockersHelper$skipBlocker$1;
        } else {
            mutableState3 = mutableState6;
            mutableState4 = mutableState7;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue13);
        boolean changedInstance6 = gapComposer.changedInstance(this);
        Object rememberedValue14 = gapComposer.rememberedValue();
        Object obj12 = rememberedValue14;
        if (changedInstance6 || rememberedValue14 == neverEqualPolicy) {
            RealProfileManager$profileOrNull$2 realProfileManager$profileOrNull$2 = new RealProfileManager$profileOrNull$2(this, atmFeeViewModel, 4);
            gapComposer.updateRememberedValue(realProfileManager$profileOrNull$2);
            obj12 = realProfileManager$profileOrNull$2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj12);
        ViewTextViewModel viewTextViewModel = new ViewTextViewModel(this.mapScreen);
        List list = (List) mutableState2.getValue();
        boolean z = this.explainerViewedCache.get();
        boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
        String str = (String) mutableState4.getValue();
        RetailerMapBlocker.BenefitReinforcementMessage benefitReinforcementMessage = this.args.atmWithdrawalBlocker.benefit_reinforcement_message;
        if (benefitReinforcementMessage != null) {
            if (!this.isBankingPackaging2cEnabled) {
                benefitReinforcementMessage = null;
            }
            if (benefitReinforcementMessage != null) {
                Icon icon = benefitReinforcementMessage.icon;
                icon.getClass();
                String str2 = benefitReinforcementMessage.text;
                str2.getClass();
                atmFeeViewModel = new AtmWithdrawalMapViewModel.AtmFeeViewModel(icon, str2);
            }
        }
        AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = new AtmWithdrawalMapViewModel(viewTextViewModel, uiCallbackModel, list, z, booleanValue, str, atmFeeViewModel);
        gapComposer.end(false);
        return atmWithdrawalMapViewModel;
    }
}
