package com.squareup.cash.maps.presenter;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.deposits.physical.backend.real.map.RealMapCameraStateManager;
import com.squareup.cash.deposits.physical.screens.LocationDeniedScreen;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.gps.backend.real.AndroidLocationSettingsChecker;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.presenter.CashMapPresenter;
import com.squareup.cash.maps.viewmodels.LatLngBounds;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.permissions.AndroidPermissionManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class CashMapPresenter$Factory$Impl {
    public final CashMapPresenter.MetroFactory delegateFactory;

    public CashMapPresenter$Factory$Impl(CashMapPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final CashMapPresenter create(BetterNavigator.ScreenNavigator screenNavigator, LocationDeniedScreen locationDeniedScreen, Function1 function1, String str, LocationViewModel locationViewModel, LatLngBounds latLngBounds) {
        CashMapPresenter.MetroFactory metroFactory = this.delegateFactory;
        AndroidLocationProvider androidLocationProvider = (AndroidLocationProvider) metroFactory.locationProvider.invoke();
        AndroidLocationSettingsChecker androidLocationSettingsChecker = (AndroidLocationSettingsChecker) metroFactory.locationSettingsChecker.invoke();
        AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) metroFactory.permissionManager.invoke();
        RealMapCameraStateManager realMapCameraStateManager = (RealMapCameraStateManager) metroFactory.cameraStateManager.getValue();
        Analytics analytics = (Analytics) metroFactory.analytics.invoke();
        RealGpsLocationManager realGpsLocationManager = (RealGpsLocationManager) metroFactory.gpsLocationManager.invoke();
        androidLocationProvider.getClass();
        androidLocationSettingsChecker.getClass();
        androidPermissionManager.getClass();
        realMapCameraStateManager.getClass();
        analytics.getClass();
        realGpsLocationManager.getClass();
        return new CashMapPresenter(androidLocationProvider, androidLocationSettingsChecker, androidPermissionManager, realMapCameraStateManager, analytics, realGpsLocationManager, screenNavigator, locationDeniedScreen, function1, str, locationViewModel, latLngBounds);
    }
}
