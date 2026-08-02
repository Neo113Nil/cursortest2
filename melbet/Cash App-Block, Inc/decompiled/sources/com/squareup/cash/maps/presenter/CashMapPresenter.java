package com.squareup.cash.maps.presenter;

import android.app.Activity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.app.ActivityCompat;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.StableCoroutineScope;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.deposits.physical.backend.api.map.CameraState;
import com.squareup.cash.deposits.physical.backend.real.map.RealMapCameraStateManager;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.backend.api.Location;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.graphics.swampgl.components.Camera$special$$inlined$map$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LatLngBounds;
import com.squareup.cash.maps.viewmodels.LocationSelection;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.maps.viewmodels.MapBoundary;
import com.squareup.cash.maps.viewmodels.SearchLocation;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CashMapPresenter implements MoleculeCallbackPresenter {
    public final Analytics analytics;
    public final LatLngBounds cameraBounds;
    public final RealMapCameraStateManager cameraStateManager;
    public final AndroidPermissionManager$create$1 coarseLocationPermissions;
    public final Function1 generatePermissionAnalyticsEvent;
    public final RealGpsLocationManager gpsLocationManager;
    public final LocationViewModel initialLocationModel;
    public final LocationDeniedScreen locationDeniedScreen;
    public final StateFlowImpl locationOverrideFlow = FlowKt.MutableStateFlow(null);
    public final AndroidLocationProvider locationProvider;
    public final AndroidLocationSettingsChecker locationSettingsChecker;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidPermissionManager permissionManager;
    public final AndroidPermissionManager$create$1 preciseLocationPermissions;
    public final String trigger;

    public CashMapPresenter(AndroidLocationProvider androidLocationProvider, AndroidLocationSettingsChecker androidLocationSettingsChecker, AndroidPermissionManager androidPermissionManager, RealMapCameraStateManager realMapCameraStateManager, Analytics analytics, RealGpsLocationManager realGpsLocationManager, BetterNavigator.ScreenNavigator screenNavigator, LocationDeniedScreen locationDeniedScreen, Function1 function1, String str, LocationViewModel locationViewModel, LatLngBounds latLngBounds) {
        this.locationProvider = androidLocationProvider;
        this.locationSettingsChecker = androidLocationSettingsChecker;
        this.permissionManager = androidPermissionManager;
        this.cameraStateManager = realMapCameraStateManager;
        this.analytics = analytics;
        this.gpsLocationManager = realGpsLocationManager;
        this.navigator = screenNavigator;
        this.locationDeniedScreen = locationDeniedScreen;
        this.generatePermissionAnalyticsEvent = function1;
        this.trigger = str;
        this.initialLocationModel = locationViewModel;
        this.cameraBounds = latLngBounds;
        this.preciseLocationPermissions = androidPermissionManager.create("android.permission.ACCESS_FINE_LOCATION");
        this.coarseLocationPermissions = androidPermissionManager.create("android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r12.requestLocationPermissions(true, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$centerOnUserLocation(CashMapPresenter cashMapPresenter, ContinuationImpl continuationImpl) {
        CashMapPresenter$centerOnUserLocation$1 cashMapPresenter$centerOnUserLocation$1;
        int i;
        Function1 function1;
        if (continuationImpl instanceof CashMapPresenter$centerOnUserLocation$1) {
            cashMapPresenter$centerOnUserLocation$1 = (CashMapPresenter$centerOnUserLocation$1) continuationImpl;
            int i2 = cashMapPresenter$centerOnUserLocation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashMapPresenter$centerOnUserLocation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashMapPresenter$centerOnUserLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashMapPresenter$centerOnUserLocation$1.label;
                int i3 = 2;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CameraState cameraState = (CameraState) cashMapPresenter.cameraStateManager.lastCameraState.getValue();
                    if (cameraState != null) {
                        return new LocationViewModel(cameraState.lat, cameraState.lng, cameraState.zoom);
                    }
                    cashMapPresenter$centerOnUserLocation$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                function1 = cashMapPresenter.generatePermissionAnalyticsEvent;
                if (function1 != null) {
                    cashMapPresenter.analytics.track((Event) function1.invoke(Boolean.valueOf(cashMapPresenter.hasAnyLocationPermission())), null);
                }
                cashMapPresenter$centerOnUserLocation$1.label = 2;
                Object firstOrNull = FlowKt.firstOrNull(new InviteContactsPresenter$special$$inlined$map$1(new Camera$special$$inlined$map$1(FlowKt.merge(cashMapPresenter.preciseLocationPermissions.$readonly.granted(), cashMapPresenter.coarseLocationPermissions.$readonly.granted()), i3), cashMapPresenter, 14), cashMapPresenter$centerOnUserLocation$1);
                return firstOrNull != obj2 ? obj2 : firstOrNull;
            }
        }
        cashMapPresenter$centerOnUserLocation$1 = new CashMapPresenter$centerOnUserLocation$1(cashMapPresenter, continuationImpl);
        Object obj3 = cashMapPresenter$centerOnUserLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashMapPresenter$centerOnUserLocation$1.label;
        int i32 = 2;
        if (i != 0) {
        }
        function1 = cashMapPresenter.generatePermissionAnalyticsEvent;
        if (function1 != null) {
        }
        cashMapPresenter$centerOnUserLocation$1.label = 2;
        Object firstOrNull2 = FlowKt.firstOrNull(new InviteContactsPresenter$special$$inlined$map$1(new Camera$special$$inlined$map$1(FlowKt.merge(cashMapPresenter.preciseLocationPermissions.$readonly.granted(), cashMapPresenter.coarseLocationPermissions.$readonly.granted()), i32), cashMapPresenter, 14), cashMapPresenter$centerOnUserLocation$1);
        if (firstOrNull2 != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getLastLocationViewModel(CashMapPresenter cashMapPresenter, ContinuationImpl continuationImpl) {
        CashMapPresenter$getLastLocationViewModel$1 cashMapPresenter$getLastLocationViewModel$1;
        int i;
        if (continuationImpl instanceof CashMapPresenter$getLastLocationViewModel$1) {
            cashMapPresenter$getLastLocationViewModel$1 = (CashMapPresenter$getLastLocationViewModel$1) continuationImpl;
            int i2 = cashMapPresenter$getLastLocationViewModel$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashMapPresenter$getLastLocationViewModel$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashMapPresenter$getLastLocationViewModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashMapPresenter$getLastLocationViewModel$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidLocationProvider androidLocationProvider = cashMapPresenter.locationProvider;
                    cashMapPresenter$getLastLocationViewModel$1.label = 1;
                    obj = androidLocationProvider.currentLocation(cashMapPresenter$getLastLocationViewModel$1);
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
                Location location = (Location) obj;
                return location == null ? new LocationViewModel(location.latitude, location.longitude, 12.5f) : LocationViewModel.DEFAULT_LOCATION_VIEW_MODEL;
            }
        }
        cashMapPresenter$getLastLocationViewModel$1 = new CashMapPresenter$getLastLocationViewModel$1(cashMapPresenter, continuationImpl);
        Object obj2 = cashMapPresenter$getLastLocationViewModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashMapPresenter$getLastLocationViewModel$1.label;
        if (i != 0) {
        }
        Location location2 = (Location) obj2;
        if (location2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$userLocationInBoundary(CashMapPresenter cashMapPresenter, MapBoundary mapBoundary, ContinuationImpl continuationImpl) {
        CashMapPresenter$userLocationInBoundary$1 cashMapPresenter$userLocationInBoundary$1;
        int i;
        Location location;
        if (continuationImpl instanceof CashMapPresenter$userLocationInBoundary$1) {
            cashMapPresenter$userLocationInBoundary$1 = (CashMapPresenter$userLocationInBoundary$1) continuationImpl;
            int i2 = cashMapPresenter$userLocationInBoundary$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashMapPresenter$userLocationInBoundary$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashMapPresenter$userLocationInBoundary$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashMapPresenter$userLocationInBoundary$1.label;
                boolean z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (cashMapPresenter.coarseLocationPermissions.$readonly.check() || cashMapPresenter.preciseLocationPermissions.$readonly.check()) {
                        AndroidLocationProvider androidLocationProvider = cashMapPresenter.locationProvider;
                        cashMapPresenter$userLocationInBoundary$1.L$0 = mapBoundary;
                        cashMapPresenter$userLocationInBoundary$1.label = 1;
                        obj = androidLocationProvider.currentLocation(cashMapPresenter$userLocationInBoundary$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mapBoundary = cashMapPresenter$userLocationInBoundary$1.L$0;
                SafeTrace.throwOnFailure(obj);
                location = (Location) obj;
                if (location != null) {
                    z = mapBoundary.contains(location.latitude, location.longitude);
                }
                return Boolean.valueOf(z);
            }
        }
        cashMapPresenter$userLocationInBoundary$1 = new CashMapPresenter$userLocationInBoundary$1(cashMapPresenter, continuationImpl);
        Object obj2 = cashMapPresenter$userLocationInBoundary$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashMapPresenter$userLocationInBoundary$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        location = (Location) obj2;
        if (location != null) {
        }
        return Boolean.valueOf(z2);
    }

    public final boolean hasAnyLocationPermission() {
        return this.preciseLocationPermissions.$readonly.check() || this.coarseLocationPermissions.$readonly.check();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.squareup.cash.maps.viewmodels.LocationSelection] */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.squareup.cash.maps.viewmodels.LocationSelection] */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final UiCallbackModel models(Composer composer) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(318931375);
        Object[] objArr = {this.initialLocationModel, this.cameraBounds};
        WorkLauncherImpl workLauncherImpl = CashMapPresenterKt.LocationViewModelSaver;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj2 = rememberedValue;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            RealGooglePayer$$ExternalSyntheticLambda0 realGooglePayer$$ExternalSyntheticLambda0 = new RealGooglePayer$$ExternalSyntheticLambda0(this, 26);
            gapComposer.updateRememberedValue(realGooglePayer$$ExternalSyntheticLambda0);
            obj2 = realGooglePayer$$ExternalSyntheticLambda0;
        }
        int i = 0;
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) obj2, (Composer) gapComposer, 0);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.valueOf(hasAnyLocationPermission()));
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj3 = mutableStateOf$default;
        }
        MutableState mutableState5 = (MutableState) obj3;
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation = null;
        continuation = null;
        Object obj4 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(mutableStateOf$default2);
            obj4 = mutableStateOf$default2;
        }
        MutableState mutableState6 = (MutableState) obj4;
        Object[] objArr2 = new Object[0];
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy) {
            ClusterItemKt$$ExternalSyntheticLambda0 clusterItemKt$$ExternalSyntheticLambda0 = new ClusterItemKt$$ExternalSyntheticLambda0(23);
            gapComposer.updateRememberedValue(clusterItemKt$$ExternalSyntheticLambda0);
            obj5 = clusterItemKt$$ExternalSyntheticLambda0;
        }
        MutableState mutableState7 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) obj5, gapComposer, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue5 = gapComposer.rememberedValue();
        int i2 = 24;
        Object obj6 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy) {
            ClusterItemKt$$ExternalSyntheticLambda0 clusterItemKt$$ExternalSyntheticLambda02 = new ClusterItemKt$$ExternalSyntheticLambda0(i2);
            gapComposer.updateRememberedValue(clusterItemKt$$ExternalSyntheticLambda02);
            obj6 = clusterItemKt$$ExternalSyntheticLambda02;
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) obj6, gapComposer, 48);
        Object[] objArr4 = new Object[0];
        Object rememberedValue6 = gapComposer.rememberedValue();
        Object obj7 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy) {
            ClusterItemKt$$ExternalSyntheticLambda0 clusterItemKt$$ExternalSyntheticLambda03 = new ClusterItemKt$$ExternalSyntheticLambda0(25);
            gapComposer.updateRememberedValue(clusterItemKt$$ExternalSyntheticLambda03);
            obj7 = clusterItemKt$$ExternalSyntheticLambda03;
        }
        MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) obj7, gapComposer, 48);
        Object rememberedValue7 = gapComposer.rememberedValue();
        Object obj8 = rememberedValue7;
        if (rememberedValue7 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(mutableStateOf$default3);
            obj8 = mutableStateOf$default3;
        }
        MutableState mutableState10 = (MutableState) obj8;
        StableCoroutineScope rememberStableCoroutineScope = zzsc.rememberStableCoroutineScope(gapComposer);
        Boolean bool = (Boolean) mutableState5.getValue();
        bool.getClass();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue8 = gapComposer.rememberedValue();
        Object obj9 = rememberedValue8;
        if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
            CashMapPresenter$models$1$1 cashMapPresenter$models$1$1 = new CashMapPresenter$models$1$1(this, mutableState5, continuation, i);
            gapComposer.updateRememberedValue(cashMapPresenter$models$1$1);
            obj9 = cashMapPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, bool, (Function2) obj9);
        StateFlowImpl stateFlowImpl = this.locationOverrideFlow;
        Updater.LaunchedEffect(gapComposer, stateFlowImpl, new CashMapPresenter$models$$inlined$CollectEffect$1(stateFlowImpl, continuation, rememberSaveable, mutableState10, 0));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(rememberSaveable);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue9 == neverEqualPolicy) {
            CashMapPresenter$models$3$1 cashMapPresenter$models$3$1 = new CashMapPresenter$models$3$1(this, rememberSaveable, mutableState5, continuation, 0);
            gapComposer.updateRememberedValue(cashMapPresenter$models$3$1);
            rememberedValue9 = cashMapPresenter$models$3$1;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue9);
        boolean changedInstance4 = gapComposer.changedInstance(this);
        Object rememberedValue10 = gapComposer.rememberedValue();
        Object obj10 = rememberedValue10;
        if (changedInstance4 || rememberedValue10 == neverEqualPolicy) {
            RealKeyStoreProvider$load$2 realKeyStoreProvider$load$2 = new RealKeyStoreProvider$load$2(this, continuation, i2);
            gapComposer.updateRememberedValue(realKeyStoreProvider$load$2);
            obj10 = realKeyStoreProvider$load$2;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj10);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == neverEqualPolicy) {
            mutableState = mutableState6;
            mutableState2 = mutableState7;
            mutableState3 = mutableState8;
            mutableState4 = mutableState9;
            CashMapPresenter$$ExternalSyntheticLambda4 cashMapPresenter$$ExternalSyntheticLambda4 = new CashMapPresenter$$ExternalSyntheticLambda4(this, rememberStableCoroutineScope, mutableState5, rememberSaveable, mutableState, mutableState4, mutableState2, mutableState3, 0);
            gapComposer.updateRememberedValue(cashMapPresenter$$ExternalSyntheticLambda4);
            obj = cashMapPresenter$$ExternalSyntheticLambda4;
        } else {
            mutableState = mutableState6;
            mutableState2 = mutableState7;
            mutableState3 = mutableState8;
            mutableState4 = mutableState9;
            obj = rememberedValue11;
        }
        Function1 function1 = (Function1) obj;
        if (((String) mutableState2.getValue()) != null && ((String) mutableState3.getValue()) != null) {
            String str = (String) mutableState2.getValue();
            UUID fromString = UUID.fromString((String) mutableState3.getValue());
            fromString.getClass();
            continuation = new LocationSelection(str, fromString);
        }
        LocationViewModel locationViewModel = (LocationViewModel) rememberSaveable.getValue();
        boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
        CashMapViewEvent.MapMovementFinished mapMovementFinished = (CashMapViewEvent.MapMovementFinished) mutableState.getValue();
        boolean booleanValue2 = ((Boolean) mutableState4.getValue()).booleanValue();
        SearchLocation searchLocation = (SearchLocation) mutableState10.getValue();
        UiCallbackModel uiCallbackModel = new UiCallbackModel(function1, new CashMapViewModel(locationViewModel, booleanValue, this.cameraBounds, mapMovementFinished, continuation, booleanValue2, searchLocation));
        gapComposer.end(false);
        return uiCallbackModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object requestLocationPermissions(boolean z, ContinuationImpl continuationImpl) {
        CashMapPresenter$requestLocationPermissions$1 cashMapPresenter$requestLocationPermissions$1;
        Object obj;
        int i;
        Activity activity = this.permissionManager.activity;
        if (continuationImpl instanceof CashMapPresenter$requestLocationPermissions$1) {
            cashMapPresenter$requestLocationPermissions$1 = (CashMapPresenter$requestLocationPermissions$1) continuationImpl;
            int i2 = cashMapPresenter$requestLocationPermissions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashMapPresenter$requestLocationPermissions$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = cashMapPresenter$requestLocationPermissions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashMapPresenter$requestLocationPermissions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    cashMapPresenter$requestLocationPermissions$1.Z$0 = z;
                    cashMapPresenter$requestLocationPermissions$1.label = 1;
                    obj = this.locationSettingsChecker.check(cashMapPresenter$requestLocationPermissions$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = cashMapPresenter$requestLocationPermissions$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                boolean check = this.preciseLocationPermissions.$readonly.check();
                boolean check2 = this.coarseLocationPermissions.$readonly.check();
                if (!check) {
                    String[] strArr = AndroidPermissionManager.REQUEST_LOCATION;
                    if (!check2) {
                        ActivityCompat.requestPermissions(activity, strArr, 2);
                    } else if (z) {
                        ActivityCompat.requestPermissions(activity, strArr, 2);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        cashMapPresenter$requestLocationPermissions$1 = new CashMapPresenter$requestLocationPermissions$1(this, continuationImpl);
        obj = cashMapPresenter$requestLocationPermissions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashMapPresenter$requestLocationPermissions$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final void searchLocation(LocationViewModel locationViewModel) {
        StateFlowImpl stateFlowImpl = this.locationOverrideFlow;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, locationViewModel);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider analytics;
        public final DoubleCheck cameraStateManager;
        public final Provider gpsLocationManager;
        public final Provider locationProvider;
        public final Provider locationSettingsChecker;
        public final Provider permissionManager;

        public MetroFactory(RealTrifleService.MetroFactory metroFactory, RealChatManager.MetroFactory metroFactory2, DoubleCheck doubleCheck, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck2, InstanceFactory instanceFactory) {
            this.locationProvider = metroFactory;
            this.locationSettingsChecker = metroFactory2;
            this.cameraStateManager = doubleCheck;
            this.permissionManager = broadwayModule$ProvideBroadwayMetroFactory;
            this.analytics = doubleCheck2;
            this.gpsLocationManager = instanceFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, BrazeInitializer.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealFeatureFlagManager.MetroFactory metroFactory2) {
            this.locationProvider = lambdaProvider;
            this.locationSettingsChecker = metroFactory;
            this.permissionManager = doubleCheck;
            this.cameraStateManager = doubleCheck2;
            this.analytics = doubleCheck3;
            this.gpsLocationManager = metroFactory2;
        }
    }
}
